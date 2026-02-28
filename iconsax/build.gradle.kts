import javax.inject.Inject
import org.gradle.process.ExecOperations

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kotlin.compose)
    id("maven-publish")
}

group = "com.github.YohannesTz"
version = "1.0.0"

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/YohannesTz/IconsaxCompose")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: "YohannesTz"
                password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

abstract class IconsaxExec @Inject constructor(
    private val execOps: ExecOperations
) {
    fun run(vararg args: String) {
        execOps.exec {
            commandLine(*args)
        }
    }
}

kotlin {
    androidTarget {
        publishLibraryVariants("release")
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
        }
    }
    jvm()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.ui)
        }
        androidMain.dependencies {
            implementation(libs.androidx.core.ktx)
        }
    }
}

android {
    namespace = "com.github.yohannestz.iconsax_compose.iconsax"
    compileSdk = 36

    defaultConfig { minSdk = 21 }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

val modes = listOf(
    "Bold" to "bold",
    "Linear" to "linear",
    "Outline" to "outline",
    "Bulk" to "bulk",
    "Broken" to "broken",
    "TwoTone" to "twotone"
)

val modulePackage = "com.github.yohannestz.iconsax_compose.iconsax"
val outputRoot = file("src/commonMain/kotlin/${modulePackage.replace(".", "/")}")

fun sanitizeIconName(name: String): String {
    val safe = name.replace(Regex("[^A-Za-z0-9_]"), "_")
    return if (safe.firstOrNull()?.isDigit() == true) "_$safe" else safe
}

tasks.register("generateIconsax") {
    group = "iconsax"
    description = "Generate Iconsax Compose icons using s2c CLI"

    doLast {
        val repoRoot = layout.buildDirectory.dir("iconsax-temp").get().asFile

        if (!repoRoot.exists()) {
            println("Cloning Iconsax repo...")
            exec { commandLine("git", "clone", "--depth=1", "https://github.com/iconsax/iconsax.git", repoRoot.absolutePath) }
        }

        modes.forEach { (modeName, folder) ->
            val svgRootDir = File(repoRoot, "icons/$modeName")
            val outDir = File(outputRoot, folder)
            outDir.deleteRecursively()
            outDir.mkdirs()

            // Count total icons for progress
            val subDirs = svgRootDir.listFiles { f -> f.isDirectory } ?: emptyArray()
            var totalIcons = 0
            subDirs.forEach { subDir -> totalIcons += subDir.listFiles { f -> f.extension == "svg" }?.size ?: 0 }
            var current = 0

            subDirs.forEach { subDir ->
                val icons = subDir.listFiles { f -> f.extension == "svg" } ?: emptyArray()
                icons.forEach { iconFile ->
                    val safeName = sanitizeIconName(iconFile.nameWithoutExtension)
                    current++
                    println("[$modeName] Generating $safeName ($current / $totalIcons)")

                    exec {
                        commandLine(
                            "./.s2c/bin/s2c.kexe",
                            iconFile.absolutePath,
                            "-o", outDir.absolutePath,
                            "-p", "$modulePackage.$folder",
                            "--theme", "$modulePackage.IconsaxTheme",
                            "--no-preview",
                            "--minified",
                            "--optimize", "true"
                        )
                    }
                }
            }

            println("✓ Generated all $modeName icons")
        }

        println("Generating Iconsax API classes...")
        generateApi(outputRoot, modulePackage)
        println("✓ Iconsax API classes generated")
    }
}

fun generateApi(root: File, pkg: String) {
    // Root Iconsax.kt
    File(root, "Iconsax.kt").writeText(
        """
        package $pkg

        object Iconsax {
            val Bold = IconsaxBold
            val Linear = IconsaxLinear
            val Outline = IconsaxOutline
            val Bulk = IconsaxBulk
            val Broken = IconsaxBroken
            val TwoTone = IconsaxTwoTone
        }
        """.trimIndent()
    )

    // Iconsax<Mode>.kt for each mode
    val modes = listOf(
        "Bold" to "bold",
        "Linear" to "linear",
        "Outline" to "outline",
        "Bulk" to "bulk",
        "Broken" to "broken",
        "TwoTone" to "twotone"
    )

    modes.forEach { (mode, folder) ->
        val dir = File(root, folder)
        val icons = dir.listFiles()
            ?.filter { it.extension == "kt" }
            ?.map { sanitizeIconName(it.nameWithoutExtension) }
            ?.sorted()
            ?: emptyList()

        File(root, "Iconsax$mode.kt").writeText(
            buildString {
                appendLine("package $pkg")
                appendLine("import $pkg.$folder.*")
                appendLine("object Iconsax$mode {")
                icons.forEach { appendLine("    val $it = $it") }
                appendLine("}")
            }
        )
    }
}
