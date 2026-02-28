package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToggleOffCircle: ImageVector
    get() {
        val current = _toggleOffCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ToggleOffCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.86f, y = 3.86f)
                horizontalLineToRelative(dx = -3.72f)
                arcToRelative(a = 8.15f, b = 8.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 16.28f)
                horizontalLineToRelative(dx = 3.72f)
                arcToRelative(a = 8.15f, b = 8.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -16.28f)
                moveToRelative(dx = -3.72f, dy = 12.56f)
                arcToRelative(a = 4.42f, b = 4.42f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -8.84f)
                arcToRelative(a = 4.42f, b = 4.42f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 8.84f)
            }
        }.build().also { _toggleOffCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _toggleOffCircle: ImageVector? = null
