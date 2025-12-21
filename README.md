# Iconsax Compose

[![JitPack](https://jitpack.io/v/yohannestz/iconsax-compose.svg)](https://jitpack.io/#yohannestz/iconsax-compose)

A lightweight **Jetpack Compose icon library** providing the complete **Iconsax** icon set as strongly-typed, composable-friendly icons.

Designed to feel native to Compose while staying simple, fast, and dependency-light.


## Preview 

https://github.com/user-attachments/assets/e8fe0bf7-3df9-4a61-bb9f-f5508ef134e7



## Features

* **Full Iconsax icon set**
* **Compose-first API**
* Strongly typed icons (no string lookups)
* Zero runtime parsing (icons resolved at compile time)
* Minimal overhead — pure Kotlin + Compose
* Works with **Material 3** (and Material 2–style themes)


## Module Scope

This repository contains:

* **`iconsaxcompose`** → the reusable icon library
* A sample app exists only for preview and testing

This README documents the **library**, not the sample application.


## Installation (JitPack)

This library is distributed via **JitPack**.

### 1. Add the JitPack repository

In your **root** `settings.gradle` or `build.gradle`:

```gradle
repositories {
    maven { url = uri("https://jitpack.io") }
}
```

### 2. Add the dependency

```gradle
dependencies {
    implementation("com.github.yohannestz:iconsax-compose:<version>")
}
```

Replace `<version>` with:

* A **tag** (recommended), or
* A **commit hash**, or
* A **branch name**

Latest version is shown in the badge above.


## Icon Styles

Iconsax icons are grouped by style:

* **Linear**
* **Bold**
* **Outline**
* **TwoTone**
* **Bulk**
* **Broken**

Each style is exposed as a dedicated icon group for type safety and IDE discoverability.

---

## Usage

### Basic Icon

```kotlin
Icon(
    imageVector = Iconsax.Linear.Home,
    contentDescription = "Home"
)
```

### With tint and size

```kotlin
Icon(
    imageVector = Iconsax.Bold.Notification,
    contentDescription = "Notifications",
    tint = Color(0xFF3DDC84),
    modifier = Modifier.size(24.dp)
)
```

### Inside Compose layouts

```kotlin
Row(
    verticalAlignment = Alignment.CenterVertically
) {
    Icon(
        imageVector = Iconsax.Outline.SearchNormal,
        contentDescription = null
    )
    Spacer(Modifier.width(8.dp))
    Text("Search")
}
```

---

## Theming

Iconsax Compose icons are standard `ImageVector`s and fully respect:

* `LocalContentColor`
* `MaterialTheme.colorScheme`
* Alpha and tint modifiers

Example:

```kotlin
CompositionLocalProvider(
    LocalContentColor provides MaterialTheme.colorScheme.primary
) {
    Icon(
        imageVector = Iconsax.Linear.Heart,
        contentDescription = null
    )
}
```


## Icon Generation

All icons in this library are **generated automatically** using a custom **Gradle task**, ensuring consistency and eliminating manual maintenance.

### Source of Icons

* SVG files are sourced from the official **Iconsax repository**
* Icons originate from the Iconsax React icon set
* Each icon style maps directly to its SVG directory

### Generation Pipeline

1. The Gradle task clones the Iconsax repository (shallow clone)
2. SVGs are grouped by style (Bold, Linear, Outline, etc.)
3. Each SVG is converted into a Compose `ImageVector` using
   **`svg-to-compose (s2c)`**
4. Generated icons are written into structured Kotlin packages
5. Aggregated API objects (`Iconsax`, `IconsaxBold`, etc.) are generated automatically

### Gradle Task

```bash
./gradlew generateIconsax
```

This task:

* Uses the `s2c` CLI to convert SVGs
* Produces optimized, minified Compose vectors
* Generates strongly typed accessors
* Requires no runtime SVG parsing

All generated code lives under `src/main/java` and is committed to the repository.

---

## Package Structure (Simplified)

```text
iconsaxcompose/
├── Iconsax.kt
├── IconsaxBold.kt
├── IconsaxLinear.kt
├── IconsaxOutline.kt
├── IconsaxTwoTone.kt
├── IconsaxBulk.kt
├── IconsaxBroken.kt
├── linear/
├── bold/
├── outline/
├── twotone/
├── bulk/
└── broken/
```

Each icon is generated as an `ImageVector` and grouped by style.

## Design Goals

* **Predictable API** — no magic strings
* **Fast previews** — works perfectly in Compose Preview
* **IDE discoverability** — autocomplete-friendly icon browsing
* **Library-first** — no app assumptions, no UI coupling
* **Generated, not handwritten** — reproducible and auditable output

## Notes

* This library bundles **icons only**, not UI components
* No runtime loading, reflection, or resource parsing
* Safe for production use
* Generated code should not be edited manually

## License

Iconsax icons are subject to the **Iconsax license**.

This project provides a Jetpack Compose wrapper and generated bindings only and does not claim ownership of the underlying icon designs.

## Contributing

Contributions are welcome, especially in the areas of:

* Icon generation improvements
* Gradle task enhancements
* API ergonomics
* Documentation
* Performance optimizations
* CMP port 

Please open an issue or pull request.
