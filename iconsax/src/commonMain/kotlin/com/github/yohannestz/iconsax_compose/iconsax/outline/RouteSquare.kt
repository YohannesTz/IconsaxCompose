package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 13.18f, y = 18.7f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.53f, dy1 = -1.83f)
                lineToRelative(dx = -0.7f, dy = -2.07f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.73f, dy1 = -0.74f)
                lineToRelative(dx = -2.08f, dy = -0.7f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.82f, dy1 = -2.57f)
                arcToRelative(a = 2.65f, b = 2.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.89f, dy1 = -2.52f)
                lineToRelative(dx = 7.53f, dy = -2.34f)
                arcToRelative(a = 2.68f, b = 2.68f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.34f, dy1 = 3.35f)
                lineToRelative(dx = -2.34f, dy = 7.54f)
                arcToRelative(a = 2.65f, b = 2.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.53f, dy1 = 1.89f)
                close()
                moveToRelative(dx = 2.34f, dy = -11.4f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.35f, dy1 = 0.05f)
                lineTo(x = 7.63f, y = 9.7f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.83f, dy1 = 1.11f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.8f, dy1 = 1.13f)
                lineToRelative(dx = 2.08f, dy = 0.69f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.69f, dy1 = 1.7f)
                lineToRelative(dx = 0.69f, dy = 2.06f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.6f, dx2 = 0.67f, dy2 = 0.79f, dx3 = 1.13f, dy3 = 0.81f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.11f, dy1 = -0.83f)
                lineToRelative(dx = 2.34f, dy = -7.54f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.29f, dy1 = -1.17f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.83f, dy1 = -0.36f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.43f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -2.32f, dx3 = -7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.43f, dx2 = 2.32f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.43f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 2.32f, dx3 = 7.75f, dy3 = 7.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.32f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 4.39f, y1 = 2.75f, x2 = 2.75f, y2 = 4.39f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.61f, dx2 = -1.64f, dy2 = -6.25f, dx3 = -6.25f, dy3 = -6.25f)
                close()
            }
        }.build().also { _routeSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _routeSquare: ImageVector? = null
