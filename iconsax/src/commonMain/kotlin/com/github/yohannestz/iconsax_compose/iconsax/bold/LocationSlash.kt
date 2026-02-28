package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationSlash: ImageVector
    get() {
        val current = _locationSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LocationSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.78f, y = 20.98f)
                arcTo(horizontalEllipseRadius = 5.4f, verticalEllipseRadius = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.51f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.78f, dy1 = -1.54f)
                arcToRelative(a = 23.0f, b = 23.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.08f, dy1 = -1.11f)
                lineToRelative(dx = 12.9f, dy = -12.9f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.58f, dy1 = 1.74f)
                curveToRelative(dx1 = 1.17f, dy1 = 5.16f, dx2 = -1.99f, dy2 = 9.52f, dx3 = -4.84f, dy3 = 12.28f)
                moveToRelative(dx = 5.99f, dy = -18.75f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.1f, dy1 = 0.0f)
                lineTo(x = 2.24f, y = 20.69f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -0.01f)
                lineTo(x = 21.77f, y = 3.3f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.08f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.85f, y = 10.31f)
                arcTo(horizontalEllipseRadius = 3.15f, verticalEllipseRadius = 3.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.9f, y1 = 9.1f)
                lineToRelative(dx = 3.98f, dy = -3.98f)
                arcTo(horizontalEllipseRadius = 9.0f, verticalEllipseRadius = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 11.99f, y1 = 2.0f)
                arcToRelative(a = 9.3f, b = 9.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.23f, dy1 = 1.61f)
                arcToRelative(a = 8.3f, b = 8.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.38f, dy1 = 5.08f)
                curveToRelative(dx1 = -0.84f, dy1 = 3.67f, dx2 = 0.52f, dy2 = 6.95f, dx3 = 2.4f, dy3 = 9.52f)
                lineToRelative(dx = 5.0f, dy = -5.0f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.93f, dy1 = -2.9f)
            }
        }.build().also { _locationSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _locationSlash: ImageVector? = null
