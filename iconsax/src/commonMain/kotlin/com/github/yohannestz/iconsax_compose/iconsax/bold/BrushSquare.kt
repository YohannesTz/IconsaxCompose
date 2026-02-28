package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BrushSquare: ImageVector
    get() {
        val current = _brushSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BrushSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
                moveToRelative(dx = -5.7f, dy = 14.72f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.34f, dy1 = 0.64f)
                lineTo(x = 7.8f, y = 17.51f)
                arcToRelative(a = 1.18f, b = 1.18f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.29f, dy1 = -1.3f)
                lineToRelative(dx = 0.15f, dy = -1.36f)
                arcToRelative(a = 2.24f, b = 2.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.21f, dy1 = -2.0f)
                quadToRelative(dx1 = 0.16f, dy1 = -0.01f, dx2 = 0.33f, dy2 = 0.01f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.94f, dy1 = 1.91f)
                lineToRelative(dx = 0.02f, dy = 0.32f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.67f, dy1 = 1.63f)
                moveToRelative(dx = 6.95f, dy = -9.17f)
                arcToRelative(a = 19.0f, b = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.94f, dy1 = 5.7f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.8f, dy1 = -2.74f)
                arcToRelative(a = 19.0f, b = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.73f, dy1 = -3.98f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.84f, dy1 = 0.17f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.17f, dy1 = 0.85f)
            }
        }.build().also { _brushSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _brushSquare: ImageVector? = null
