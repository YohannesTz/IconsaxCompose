package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToggleOnCircle: ImageVector
    get() {
        val current = _toggleOnCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ToggleOnCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 10.14f, y = 3.86f)
                horizontalLineToRelative(dx = 3.72f)
                arcToRelative(a = 8.15f, b = 8.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 16.28f)
                horizontalLineToRelative(dx = -3.72f)
                arcToRelative(a = 8.15f, b = 8.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -16.28f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.86f, y = 16.42f)
                arcToRelative(a = 4.42f, b = 4.42f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -8.84f)
                arcToRelative(a = 4.42f, b = 4.42f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 8.84f)
            }
        }.build().also { _toggleOnCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _toggleOnCircle: ImageVector? = null
