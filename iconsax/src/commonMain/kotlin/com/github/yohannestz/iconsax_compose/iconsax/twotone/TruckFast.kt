package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TruckFast: ImageVector
    get() {
        val current = _truckFast
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TruckFast",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 14.0f)
                horizontalLineToRelative(dx = 1.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.0f, dy1 = -2.0f)
                verticalLineTo(y = 2.0f)
                horizontalLineTo(x = 6.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.49f, dy1 = 2.05f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 17.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 3.0f)
                horizontalLineToRelative(dx = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.1f, dx2 = 0.9f, dy2 = -2.0f, dx3 = 2.0f, dy3 = -2.0f)
                reflectiveCurveToRelative(dx1 = 2.0f, dy1 = 0.9f, dx2 = 2.0f, dy2 = 2.0f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.1f, dx2 = 0.9f, dy2 = -2.0f, dx3 = 2.0f, dy3 = -2.0f)
                reflectiveCurveToRelative(dx1 = 2.0f, dy1 = 0.9f, dx2 = 2.0f, dy2 = 2.0f)
                horizontalLineToRelative(dx = 1.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = -3.0f)
                verticalLineToRelative(dy = -3.0f)
                horizontalLineToRelative(dx = -3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -1.0f)
                verticalLineToRelative(dy = -3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = -1.0f)
                horizontalLineToRelative(dx = 1.29f)
                lineToRelative(dx = -1.71f, dy = -2.99f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.84f, y1 = 5.0f)
                horizontalLineTo(x = 15.0f)
                verticalLineToRelative(dy = 7.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = 2.0f)
                horizontalLineToRelative(dx = -1.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 22.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.0f)
                moveToRelative(dx = 8.0f, dy = 0.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.0f)
                moveToRelative(dx = 6.0f, dy = -10.0f)
                verticalLineToRelative(dy = 2.0f)
                horizontalLineToRelative(dx = -3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -1.0f)
                verticalLineToRelative(dy = -3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = -1.0f)
                horizontalLineToRelative(dx = 1.29f)
                close()
                moveTo(x = 2.0f, y = 8.0f)
                horizontalLineToRelative(dx = 6.0f)
                moveToRelative(dx = -6.0f, dy = 3.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = -4.0f, dy = 3.0f)
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _truckFast = it }
    }

@Suppress("ObjectPropertyName")
private var _truckFast: ImageVector? = null
