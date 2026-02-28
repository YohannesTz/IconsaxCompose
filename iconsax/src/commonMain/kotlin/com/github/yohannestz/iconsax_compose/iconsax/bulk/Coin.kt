package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Coin: ImageVector
    get() {
        val current = _coin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Coin",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.5f, y = 12.65f)
                verticalLineToRelative(dy = 3.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.12f, dx2 = -2.91f, dy2 = 5.65f, dx3 = -6.5f, dy3 = 5.65f)
                reflectiveCurveToRelative(dx1 = -6.5f, dy1 = -2.53f, dx2 = -6.5f, dy2 = -5.65f)
                verticalLineToRelative(dy = -3.7f)
                curveTo(x1 = 5.5f, y1 = 15.77f, x2 = 8.41f, y2 = 18.0f, x3 = 12.0f, y3 = 18.0f)
                reflectiveCurveToRelative(dx1 = 6.5f, dy1 = -2.23f, dx2 = 6.5f, dy2 = -5.35f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.5f, y = 7.65f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.12f, dx2 = -2.91f, dy2 = 5.35f, dx3 = -6.5f, dy3 = 5.35f)
                reflectiveCurveToRelative(dx1 = -6.5f, dy1 = -2.23f, dx2 = -6.5f, dy2 = -5.35f)
                verticalLineToRelative(dy = -5.0f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.69f, dy1 = 2.47f)
                curveTo(x1 = 7.26f, y1 = 11.88f, x2 = 9.46f, y2 = 13.0f, x3 = 12.0f, y3 = 13.0f)
                reflectiveCurveToRelative(dx1 = 4.74f, dy1 = -1.12f, dx2 = 5.81f, dy2 = -2.88f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.69f, dy1 = -2.47f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.5f, y = 7.65f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.69f, dy1 = 2.47f)
                curveTo(x1 = 16.74f, y1 = 11.88f, x2 = 14.54f, y2 = 13.0f, x3 = 12.0f, y3 = 13.0f)
                reflectiveCurveToRelative(dx1 = -4.74f, dy1 = -1.12f, dx2 = -5.81f, dy2 = -2.88f)
                arcTo(horizontalEllipseRadius = 4.7f, verticalEllipseRadius = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.5f, y1 = 7.65f)
                curveTo(x1 = 5.5f, y1 = 4.53f, x2 = 8.41f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                curveToRelative(dx1 = 1.8f, dy1 = 0.0f, dx2 = 3.42f, dy2 = 0.63f, dx3 = 4.6f, dy3 = 1.65f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.9f, dy1 = 4.0f)
            }
        }.build().also { _coin = it }
    }

@Suppress("ObjectPropertyName")
private var _coin: ImageVector? = null
