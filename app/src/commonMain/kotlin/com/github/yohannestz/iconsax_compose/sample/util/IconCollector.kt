package com.github.yohannestz.iconsax_compose.sample.util

import androidx.compose.ui.graphics.vector.ImageVector
import com.github.yohannestz.iconsax_compose.iconsax.Iconsax
import kotlin.reflect.full.memberProperties

data class IconsaxEntry(
    val name: String,
    val icon: ImageVector,
    val mode: String
)



object IconCollector {

    private fun collectFromObject(
        holder: Any
    ): List<Pair<String, ImageVector>> =
        holder::class.memberProperties
            .mapNotNull { prop ->
                val value = runCatching { prop.getter.call(holder) }.getOrNull()
                if (value is ImageVector) prop.name to value else null
            }

    fun collectBoldIcons() =
        collectFromObject(Iconsax.Bold).map {
            IconsaxEntry(it.first, it.second, "Bold")
        }

    fun collectLinearIcons() =
        collectFromObject(Iconsax.Linear).map {
            IconsaxEntry(it.first, it.second, "Linear")
        }

    fun collectOutlineIcons() =
        collectFromObject(Iconsax.Outline).map {
            IconsaxEntry(it.first, it.second, "Outline")
        }

    fun collectBulkIcons() =
        collectFromObject(Iconsax.Bulk).map {
            IconsaxEntry(it.first, it.second, "Bulk")
        }

    fun collectBrokenIcons() =
        collectFromObject(Iconsax.Broken).map {
            IconsaxEntry(it.first, it.second, "Broken")
        }

    fun collectTwoToneIcons() =
        collectFromObject(Iconsax.TwoTone).map {
            IconsaxEntry(it.first, it.second, "TwoTone")
        }
}
