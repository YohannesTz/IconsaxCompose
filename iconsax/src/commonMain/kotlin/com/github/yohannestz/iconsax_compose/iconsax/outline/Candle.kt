package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Candle: ImageVector
    get() {
        val current = _candle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Candle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 6.5f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.75f, y1 = 22.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.25f, y1 = 14.59f, x2 = 7.25f, y2 = 15.0f)
                verticalLineToRelative(dy = 7.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = 0.0f, dy = -17.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.75f, y1 = 5.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.25f, y1 = 1.59f, x2 = 7.25f, y2 = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.5f, y1 = 5.75f)
                moveToRelative(dx = 11.0f, dy = 17.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.75f, y1 = 22.0f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = 0.0f, dy = -13.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.75f, y1 = 9.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 18.25f, y1 = 1.59f, x2 = 18.25f, y2 = 2.0f)
                verticalLineToRelative(dy = 7.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.5f, y = 15.75f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -1.72f, dy1 = 0.0f, dx2 = -2.75f, dy2 = -1.03f, dx3 = -2.75f, dy3 = -2.75f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.72f, dx2 = 1.03f, dy2 = -2.75f, dx3 = 2.75f, dy3 = -2.75f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 1.72f, dy1 = 0.0f, dx2 = 2.75f, dy2 = 1.03f, dx3 = 2.75f, dy3 = 2.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.72f, dx2 = -1.03f, dy2 = 2.75f, dx3 = -2.75f, dy3 = 2.75f)
                moveToRelative(dx = -2.0f, dy = -10.0f)
                curveTo(x1 = 4.61f, y1 = 5.75f, x2 = 4.25f, y2 = 6.11f, x3 = 4.25f, y3 = 7.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.89f, dx2 = 0.36f, dy2 = 1.25f, dx3 = 1.25f, dy3 = 1.25f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.89f, dy1 = 0.0f, dx2 = 1.25f, dy2 = -0.36f, dx3 = 1.25f, dy3 = -1.25f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.89f, dx2 = -0.36f, dy2 = -1.25f, dx3 = -1.25f, dy3 = -1.25f)
                close()
                moveToRelative(dx = 13.0f, dy = 14.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -1.72f, dy1 = 0.0f, dx2 = -2.75f, dy2 = -1.03f, dx3 = -2.75f, dy3 = -2.75f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.72f, dx2 = 1.03f, dy2 = -2.75f, dx3 = 2.75f, dy3 = -2.75f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 1.72f, dy1 = 0.0f, dx2 = 2.75f, dy2 = 1.03f, dx3 = 2.75f, dy3 = 2.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.72f, dx2 = -1.03f, dy2 = 2.75f, dx3 = -2.75f, dy3 = 2.75f)
                moveToRelative(dx = -2.0f, dy = -10.0f)
                curveToRelative(dx1 = -0.89f, dy1 = 0.0f, dx2 = -1.25f, dy2 = 0.36f, dx3 = -1.25f, dy3 = 1.25f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.89f, dx2 = 0.36f, dy2 = 1.25f, dx3 = 1.25f, dy3 = 1.25f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.89f, dy1 = 0.0f, dx2 = 1.25f, dy2 = -0.36f, dx3 = 1.25f, dy3 = -1.25f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.89f, dx2 = -0.36f, dy2 = -1.25f, dx3 = -1.25f, dy3 = -1.25f)
                close()
            }
        }.build().also { _candle = it }
    }

@Suppress("ObjectPropertyName")
private var _candle: ImageVector? = null
