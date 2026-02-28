package com.github.yohannestz.iconsax_compose.sample.util

import androidx.compose.ui.graphics.vector.ImageVector
import com.github.yohannestz.iconsax_compose.iconsax.Iconsax

data class IconsaxEntry(
    val name: String,
    val icon: ImageVector,
    val mode: String
)



object IconCollector {

    fun collectAllIcons(): List<IconsaxEntry> {
        // Return a representative sample of icons for the preview app
        // Since reflection is limited in KMP commonMain, we use a static list
        // of common icons to demonstrate the library.
        return listOf(
            IconsaxEntry("Home", Iconsax.Linear.Home, "Linear"),
            IconsaxEntry("Home", Iconsax.Bold.Home, "Bold"),
            IconsaxEntry("Search", Iconsax.Outline.SearchNormal, "Outline"),
            IconsaxEntry("Search", Iconsax.Bold.SearchNormal, "Bold"),
            IconsaxEntry("Heart", Iconsax.Linear.Heart, "Linear"),
            IconsaxEntry("Heart", Iconsax.Bold.Heart, "Bold"),
            IconsaxEntry("Notification", Iconsax.Outline.Notification, "Outline"),
            IconsaxEntry("Notification", Iconsax.Bold.Notification, "Bold"),
            IconsaxEntry("Settings", Iconsax.Linear.Setting, "Linear"),
            IconsaxEntry("Settings", Iconsax.Bold.Setting, "Bold"),
            IconsaxEntry("User", Iconsax.Outline.User, "Outline"),
            IconsaxEntry("User", Iconsax.Bold.User, "Bold"),
        )
    }
}
