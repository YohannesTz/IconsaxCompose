package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 6.0f, y = 7.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 3.0f, dy2 = 3.0f)
                lineToRelative(dx = 2.0f, dy = -2.0f)
                verticalLineToRelative(dy = -1.0f)
                horizontalLineToRelative(dx = 1.0f)
                lineToRelative(dx = 8.0f, dy = -8.0f)
                close()
                moveToRelative(dx = 1.0f, dy = 4.75f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 10.25f, x2 = 7.0f, y2 = 10.25f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.41f, y1 = 11.75f, x2 = 9.0f, y2 = 11.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.0f, y = 15.0f)
                lineToRelative(dx = -1.0f, dy = 1.0f)
                verticalLineToRelative(dy = -1.0f)
                close()
                moveToRelative(dx = 8.0f, dy = -10.0f)
                verticalLineToRelative(dy = 2.0f)
                horizontalLineTo(x = 7.0f)
                verticalLineTo(y = 5.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = -3.0f)
                horizontalLineToRelative(dx = 4.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = 3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 22.53f, y = 1.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -20.0f, dy = 20.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -1.06f)
                lineToRelative(dx = 20.0f, dy = -20.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.75f, y = 11.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 11.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 10.25f, x2 = 7.0f, y2 = 10.25f)
                horizontalLineToRelative(dx = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.75f, y1 = 11.0f)
                moveToRelative(dx = 8.0f, dy = 4.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 15.75f)
                horizontalLineToRelative(dx = -5.75f)
                lineToRelative(dx = 1.5f, dy = -1.5f)
                horizontalLineTo(x = 17.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.75f, y1 = 15.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 15.0f)
                verticalLineToRelative(dy = 4.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 3.0f)
                horizontalLineToRelative(dx = -2.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = -3.0f)
                lineToRelative(dx = 4.0f, dy = -4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.0f, y = 10.0f)
                verticalLineToRelative(dy = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -3.0f, dy2 = 3.0f)
                horizontalLineToRelative(dx = -2.0f)
                verticalLineToRelative(dy = -3.0f)
                horizontalLineToRelative(dx = -4.0f)
                lineToRelative(dx = 7.67f, dy = -7.67f)
                quadTo(x1 = 21.0f, y1 = 8.0f, x2 = 21.0f, y2 = 10.0f)
            }
        }.build().also { _printerSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _printerSlash: ImageVector? = null
