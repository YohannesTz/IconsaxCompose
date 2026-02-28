package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrushSquare: ImageVector
    get() {
        val current = _trushSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TrushSquare",
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
                moveToRelative(dx = -0.43f, dy = 13.76f)
                curveToRelative(dx1 = -0.06f, dy1 = 0.85f, dx2 = -0.13f, dy2 = 1.91f, dx3 = -2.05f, dy3 = 1.91f)
                horizontalLineToRelative(dx = -3.42f)
                curveToRelative(dx1 = -1.91f, dy1 = 0.0f, dx2 = -1.99f, dy2 = -1.06f, dx3 = -2.05f, dy3 = -1.91f)
                lineTo(x = 7.93f, y = 11.8f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.24f, dy1 = -0.7f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.67f, dy1 = -0.29f)
                horizontalLineToRelative(dx = 6.32f)
                curveToRelative(dx1 = 0.25f, dy1 = 0.0f, dx2 = 0.5f, dy2 = 0.11f, dx3 = 0.67f, dy3 = 0.29f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.24f, dy1 = 0.69f)
                close()
                moveToRelative(dx = 1.04f, dy = -5.94f)
                horizontalLineToRelative(dx = -0.06f)
                arcToRelative(a = 56.0f, b = 56.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.9f, dy1 = -0.21f)
                arcToRelative(a = 41.0f, b = 41.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.67f, dy1 = -0.03f)
                arcToRelative(a = 37.0f, b = 37.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.81f, dy1 = 0.13f)
                lineTo(x = 7.27f, y = 9.82f)
                horizontalLineTo(x = 7.2f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.52f, y1 = 9.2f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.61f, dy1 = -0.74f)
                lineToRelative(dx = 1.09f, dy = -0.11f)
                lineTo(x = 9.5f, y = 8.26f)
                lineToRelative(dx = 0.08f, dy = -0.47f)
                curveToRelative(dx1 = 0.08f, dy1 = -0.5f, dx2 = 0.23f, dy2 = -1.46f, dx3 = 1.73f, dy3 = -1.46f)
                horizontalLineToRelative(dx = 1.39f)
                curveToRelative(dx1 = 1.51f, dy1 = 0.0f, dx2 = 1.66f, dy2 = 0.99f, dx3 = 1.73f, dy3 = 1.47f)
                lineToRelative(dx = 0.08f, dy = 0.48f)
                arcToRelative(a = 57.0f, b = 57.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.36f, dy1 = 0.18f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.62f, dy1 = 0.75f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.69f, dy1 = 0.61f)
            }
        }.build().also { _trushSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _trushSquare: ImageVector? = null
