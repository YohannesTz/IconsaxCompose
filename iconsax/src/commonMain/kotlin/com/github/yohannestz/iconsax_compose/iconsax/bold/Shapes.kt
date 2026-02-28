package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shapes: ImageVector
    get() {
        val current = _shapes
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Shapes",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.43f, y = 15.0f)
                horizontalLineTo(x = 4.4f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.1f, dy1 = -3.55f)
                lineToRelative(dx = 2.33f, dy = -4.24f)
                lineToRelative(dx = 2.18f, dy = -3.97f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.2f, dy1 = 0.0f)
                lineToRelative(dx = 2.19f, dy = 3.97f)
                lineToRelative(dx = 1.05f, dy = 1.91f)
                lineToRelative(dx = 1.28f, dy = 2.33f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.1f, dy1 = 3.55f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.65f, y = 16.0f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.5f, dy1 = 6.5f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.31f, dy1 = -4.93f)
                arcToRelative(a = 0.47f, b = 0.47f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.47f, dy1 = -0.57f)
                horizontalLineToRelative(dx = 3.77f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.41f, dy1 = -5.77f)
                lineToRelative(dx = -0.5f, dy = -0.92f)
                curveToRelative(dx1 = -0.19f, dy1 = -0.34f, dx2 = 0.08f, dy2 = -0.75f, dx3 = 0.46f, dy3 = -0.68f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.2f, dy1 = 6.37f)
            }
        }.build().also { _shapes = it }
    }

@Suppress("ObjectPropertyName")
private var _shapes: ImageVector? = null
