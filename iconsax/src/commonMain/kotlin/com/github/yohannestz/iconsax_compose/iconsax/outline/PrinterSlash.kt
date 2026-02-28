package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PrinterSlash: ImageVector
    get() {
        val current = _printerSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PrinterSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.75f, y = 7.75f)
                horizontalLineToRelative(dx = -9.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.5f, y1 = 7.0f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.56f, dx2 = 1.19f, dy2 = -3.75f, dx3 = 3.75f, dy3 = -3.75f)
                horizontalLineToRelative(dx = 3.5f)
                curveToRelative(dx1 = 2.56f, dy1 = 0.0f, dx2 = 3.75f, dy2 = 1.19f, dx3 = 3.75f, dy3 = 3.75f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveTo(x = 8.0f, y = 6.25f)
                horizontalLineToRelative(dx = 8.0f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.7f, dx2 = -0.55f, dy2 = -2.25f, dx3 = -2.25f, dy3 = -2.25f)
                horizontalLineToRelative(dx = -3.5f)
                curveTo(x1 = 8.55f, y1 = 2.75f, x2 = 8.0f, y2 = 3.3f, x3 = 8.0f, y3 = 5.0f)
                close()
                moveToRelative(dx = 5.0f, dy = 16.5f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -2.04f, dy1 = 0.0f, dx2 = -3.34f, dy2 = -0.98f, dx3 = -3.67f, dy3 = -2.76f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.6f, dy1 = -0.87f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.87f, dy1 = 0.6f)
                curveToRelative(dx1 = 0.13f, dy1 = 0.71f, dx2 = 0.5f, dy2 = 1.53f, dx3 = 2.19f, dy3 = 1.53f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 1.58f, dy1 = 0.0f, dx2 = 2.25f, dy2 = -0.67f, dx3 = 2.25f, dy3 = -2.25f)
                verticalLineToRelative(dy = -3.25f)
                horizontalLineToRelative(dx = -2.28f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineTo(x = 16.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.75f, y1 = 15.0f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.42f, dx2 = -1.33f, dy2 = 3.75f, dx3 = -3.75f, dy3 = 3.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 6.0f, y = 18.75f)
                curveToRelative(dx1 = -2.42f, dy1 = 0.0f, dx2 = -3.75f, dy2 = -1.33f, dx3 = -3.75f, dy3 = -3.75f)
                verticalLineToRelative(dy = -5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.42f, dx2 = 1.33f, dy2 = -3.75f, dx3 = 3.75f, dy3 = -3.75f)
                horizontalLineToRelative(dx = 10.59f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 17.0f, y1 = 7.75f, x2 = 16.59f, y2 = 7.75f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -1.58f, dy1 = 0.0f, dx2 = -2.25f, dy2 = 0.67f, dx3 = -2.25f, dy3 = 2.25f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.58f, dx2 = 0.67f, dy2 = 2.25f, dx3 = 2.25f, dy3 = 2.25f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 6.41f, y1 = 18.75f, x2 = 6.0f, y2 = 18.75f)
                moveToRelative(dx = 12.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.25f, y1 = 18.0f)
                verticalLineToRelative(dy = -2.25f)
                horizontalLineTo(x = 13.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.75f, y1 = 15.0f)
                verticalLineToRelative(dy = 2.25f)
                horizontalLineTo(x = 18.0f)
                curveToRelative(dx1 = 1.58f, dy1 = 0.0f, dx2 = 2.25f, dy2 = -0.67f, dx3 = 2.25f, dy3 = -2.25f)
                verticalLineToRelative(dy = -5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -1.37f, dx2 = -0.71f, dy2 = -1.87f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.18f, dy1 = -1.04f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = -0.18f)
                quadToRelative(dx1 = 1.34f, dy1 = 0.95f, dx2 = 1.34f, dy2 = 3.1f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.41f, dx2 = -1.33f, dy2 = 3.74f, dx3 = -3.75f, dy3 = 3.74f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 15.75f)
                horizontalLineToRelative(dx = -1.21f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineTo(x = 17.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -8.0f, dy = -4.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 10.25f, x2 = 7.0f, y2 = 10.25f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.41f, y1 = 11.75f, x2 = 9.0f, y2 = 11.75f)
                moveToRelative(dx = -7.0f, dy = 11.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 20.0f, dy = -20.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -20.0f, dy = 20.0f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 22.75f)
            }
        }.build().also { _printerSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _printerSlash: ImageVector? = null
