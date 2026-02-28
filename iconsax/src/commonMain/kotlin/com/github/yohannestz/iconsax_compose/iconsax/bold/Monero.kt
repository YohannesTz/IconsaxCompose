package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Monero: ImageVector
    get() {
        val current = _monero
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Monero",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 3.18f, y = 15.03f)
                curveToRelative(dx1 = -0.35f, dy1 = 0.0f, dx2 = -0.6f, dy2 = 0.35f, dx3 = -0.47f, dy3 = 0.67f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 18.59f, dy1 = -0.03f)
                curveToRelative(dx1 = 0.13f, dy1 = -0.32f, dx2 = -0.13f, dy2 = -0.67f, dx3 = -0.47f, dy3 = -0.67f)
                horizontalLineTo(x = 17.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = -0.5f)
                verticalLineToRelative(dy = -2.74f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.75f, dy1 = -0.65f)
                lineToRelative(dx = -2.87f, dy = 3.43f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.77f, dy1 = 0.0f)
                lineTo(x = 8.74f, y = 11.1f)
                curveTo(x1 = 8.15f, y1 = 10.4f, x2 = 7.0f, y2 = 10.84f, x3 = 7.0f, y3 = 11.76f)
                verticalLineToRelative(dy = 2.74f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.5f, y1 = 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 22.0f, y = 12.14f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.06f, dy1 = 0.92f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = 0.44f)
                horizontalLineTo(x = 19.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = -0.5f)
                verticalLineToRelative(dy = -1.1f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.46f, dy1 = -2.41f)
                arcToRelative(a = 2.46f, b = 2.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.94f, dy1 = 0.66f)
                lineToRelative(dx = -1.72f, dy = 2.05f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.77f, dy1 = 0.0f)
                lineToRelative(dx = -1.73f, dy = -2.07f)
                arcToRelative(a = 2.45f, b = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.92f, dy1 = -0.64f)
                arcTo(horizontalEllipseRadius = 2.6f, verticalEllipseRadius = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.5f, y1 = 11.9f)
                verticalLineToRelative(dy = 0.98f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.42f, dx2 = -0.22f, dy2 = 0.64f, dx3 = -0.5f, dy3 = 0.64f)
                lineToRelative(dx = -2.44f, dy = 0.01f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = -0.44f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 22.0f, y1 = 12.14f)
            }
        }.build().also { _monero = it }
    }

@Suppress("ObjectPropertyName")
private var _monero: ImageVector? = null
