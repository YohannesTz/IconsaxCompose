package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EraserSquare: ImageVector
    get() {
        val current = _eraserSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.EraserSquare",
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
                moveToRelative(dx = -3.67f, dy = 13.75f)
                lineToRelative(dx = -1.26f, dy = 1.26f)
                arcToRelative(a = 1.65f, b = 1.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.34f, dy1 = 0.0f)
                lineToRelative(dx = -1.93f, dy = -1.93f)
                arcToRelative(a = 1.66f, b = 1.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -2.34f)
                lineToRelative(dx = 1.27f, dy = -1.26f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.71f, dy1 = 0.0f)
                lineToRelative(dx = 3.56f, dy = 3.56f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.01f, dy1 = 0.71f)
                moveToRelative(dx = 4.49f, dy = -4.49f)
                lineToRelative(dx = -3.08f, dy = 3.08f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = 0.0f)
                lineToRelative(dx = -3.56f, dy = -3.56f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.71f)
                lineToRelative(dx = 3.08f, dy = -3.08f)
                arcToRelative(a = 1.65f, b = 1.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.34f, dy1 = 0.0f)
                lineToRelative(dx = 1.93f, dy = 1.93f)
                arcToRelative(a = 1.65f, b = 1.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.34f)
            }
        }.build().also { _eraserSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _eraserSquare: ImageVector? = null
