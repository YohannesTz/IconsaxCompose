package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RouteSquare: ImageVector
    get() {
        val current = _routeSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RouteSquare",
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
                moveToRelative(dx = 1.16f, dy = 7.05f)
                lineToRelative(dx = -2.34f, dy = 7.54f)
                arcToRelative(a = 1.92f, b = 1.92f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.66f, dy1 = 0.04f)
                lineToRelative(dx = -0.7f, dy = -2.07f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.21f, dy1 = -1.21f)
                lineToRelative(dx = -2.08f, dy = -0.7f)
                curveTo(x1 = 5.6f, y1 = 12.06f, x2 = 5.62f, y2 = 9.53f, x3 = 7.41f, y3 = 8.99f)
                lineToRelative(dx = 7.54f, dy = -2.35f)
                arcToRelative(a = 1.92f, b = 1.92f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.4f, dy1 = 2.41f)
            }
        }.build().also { _routeSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _routeSquare: ImageVector? = null
