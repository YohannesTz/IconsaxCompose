package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Speedometer: ImageVector
    get() {
        val current = _speedometer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Speedometer",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.84f, y = 19.48f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 12.5f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.94f, dy1 = -9.14f)
                moveToRelative(dx = 11.2f, dy = 16.15f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.86f, dy1 = -7.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -10.0f, dy1 = -10.0f)
                moveTo(x = 8.62f, y = 18.12f)
                arcTo(horizontalEllipseRadius = 3.38f, verticalEllipseRadius = 3.38f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 12.0f, y1 = 14.74f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.38f, dy1 = 3.38f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.25f, y = 12.0f)
                horizontalLineTo(x = 16.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.5f, dy1 = -1.5f)
                curveTo(x1 = 17.5f, y1 = 9.68f, x2 = 16.82f, y2 = 9.0f, x3 = 16.0f, y3 = 9.0f)
                reflectiveCurveToRelative(dx1 = -1.5f, dy1 = 0.67f, dx2 = -1.5f, dy2 = 1.5f)
                verticalLineToRelative(dy = 0.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.25f, y1 = 12.0f)
            }
        }.build().also { _speedometer = it }
    }

@Suppress("ObjectPropertyName")
private var _speedometer: ImageVector? = null
