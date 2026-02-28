package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bank: ImageVector
    get() {
        val current = _bank
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bank",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.0f, y = 11.75f)
                horizontalLineTo(x = 3.0f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.25f, y1 = 10.0f)
                verticalLineTo(y = 6.68f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.1f, dy1 = -1.62f)
                lineToRelative(dx = 9.0f, dy = -3.6f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.3f, dy1 = 0.0f)
                lineToRelative(dx = 9.0f, dy = 3.6f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.1f, dy1 = 1.62f)
                verticalLineTo(y = 10.0f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.0f, y1 = 11.75f)
                moveToRelative(dx = -9.0f, dy = -8.91f)
                lineToRelative(dx = -0.1f, dy = 0.01f)
                lineToRelative(dx = -8.99f, dy = 3.6f)
                curveTo(x1 = 2.85f, y1 = 6.48f, x2 = 2.75f, y2 = 6.61f, x3 = 2.75f, y3 = 6.68f)
                verticalLineTo(y = 10.0f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.0f, y1 = 10.25f)
                horizontalLineToRelative(dx = 18.0f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 21.25f, y1 = 10.0f)
                verticalLineTo(y = 6.68f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.07f, dx2 = -0.09f, dy2 = -0.2f, dx3 = -0.16f, dy3 = -0.23f)
                lineToRelative(dx = -9.0f, dy = -3.6f)
                close()
                moveToRelative(dx = 10.0f, dy = 19.91f)
                horizontalLineTo(x = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.25f, y1 = 22.0f)
                verticalLineToRelative(dy = -3.0f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.0f, y1 = 17.25f)
                horizontalLineToRelative(dx = 18.0f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.75f, y1 = 19.0f)
                verticalLineToRelative(dy = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 22.75f)
                moveToRelative(dx = -19.25f, dy = -1.5f)
                horizontalLineToRelative(dx = 18.5f)
                verticalLineTo(y = 19.0f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 21.0f, y1 = 18.75f)
                horizontalLineTo(x = 3.0f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.75f, y1 = 19.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 4.0f, y = 18.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.25f, y1 = 18.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 4.75f, y1 = 10.59f, x2 = 4.75f, y2 = 11.0f)
                verticalLineToRelative(dy = 7.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.0f, y1 = 18.75f)
                moveToRelative(dx = 4.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.25f, y1 = 18.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.75f, y1 = 10.59f, x2 = 8.75f, y2 = 11.0f)
                verticalLineToRelative(dy = 7.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.0f, y1 = 18.75f)
                moveToRelative(dx = 4.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 18.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 7.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.75f)
                moveToRelative(dx = 4.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.25f, y1 = 18.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 7.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 18.75f)
                moveToRelative(dx = 4.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.25f, y1 = 18.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 7.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.0f, y1 = 18.75f)
                moveToRelative(dx = 3.0f, dy = 4.0f)
                horizontalLineTo(x = 1.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 0.59f, y1 = 21.25f, x2 = 1.0f, y2 = 21.25f)
                horizontalLineToRelative(dx = 22.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveTo(x = 12.0f, y = 9.25f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.5f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 11.59f, y1 = 7.75f, x2 = 12.0f, y2 = 7.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 7.41f, x2 = 12.75f, y2 = 7.0f)
                reflectiveCurveTo(x1 = 12.41f, y1 = 6.25f, x2 = 12.0f, y2 = 6.25f)
            }
        }.build().also { _bank = it }
    }

@Suppress("ObjectPropertyName")
private var _bank: ImageVector? = null
