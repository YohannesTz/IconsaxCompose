package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.89f, y = 5.11f)
                lineToRelative(dx = -13.1f, dy = 13.1f)
                curveToRelative(dx1 = -1.9f, dy1 = -2.57f, dx2 = -3.25f, dy2 = -5.85f, dx3 = -2.41f, dy3 = -9.52f)
                arcToRelative(a = 8.3f, b = 8.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.38f, dy1 = -5.08f)
                arcTo(horizontalEllipseRadius = 9.3f, verticalEllipseRadius = 9.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 2.0f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.89f, dy1 = 3.11f)
                moveToRelative(dx = -3.11f, dy = 15.87f)
                arcTo(horizontalEllipseRadius = 5.4f, verticalEllipseRadius = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.51f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.78f, dy1 = -1.54f)
                arcToRelative(a = 23.0f, b = 23.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.08f, dy1 = -1.11f)
                lineToRelative(dx = 12.9f, dy = -12.9f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.58f, dy1 = 1.74f)
                curveToRelative(dx1 = 1.17f, dy1 = 5.16f, dx2 = -1.99f, dy2 = 9.52f, dx3 = -4.84f, dy3 = 12.28f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.77f, y = 2.23f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.08f, dy1 = 0.0f)
                lineTo(x = 15.02f, y = 7.9f)
                lineTo(x = 14.3f, y = 8.62f)
                arcTo(horizontalEllipseRadius = 2.9f, verticalEllipseRadius = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 7.44f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.87f, dy1 = 2.87f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.9f, dx2 = 0.44f, dy2 = 1.75f, dx3 = 1.18f, dy3 = 2.3f)
                lineToRelative(dx = -8.08f, dy = 8.08f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.08f)
                quadTo(x1 = 2.46f, y1 = 22.0f, x2 = 2.77f, y2 = 22.0f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.39f, dy2 = -0.08f, dx3 = 0.54f, dy3 = -0.23f)
                lineTo(x = 21.77f, y = 3.3f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.08f)
            }
        }.build().also { _locationSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _locationSlash: ImageVector? = null
