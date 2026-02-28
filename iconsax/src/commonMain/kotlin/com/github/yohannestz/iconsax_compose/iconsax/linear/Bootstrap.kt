package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap: ImageVector
    get() {
        val current = _bootstrap
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bootstrap",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 3.0f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 5.3f, y1 = 3.0f, x2 = 4.0f, y2 = 4.3f, x3 = 4.0f, y3 = 6.0f)
                verticalLineToRelative(dy = 0.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.8f, dx2 = -0.1f, dy2 = 1.5f, dx3 = -0.4f, dy3 = 2.3f)
                arcTo(horizontalEllipseRadius = 2.7f, verticalEllipseRadius = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.0f, y1 = 11.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 1.2f, dy1 = 0.0f, dx2 = 2.3f, dy2 = 0.8f, dx3 = 2.6f, dy3 = 1.9f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.7f, dx2 = 0.4f, dy2 = 1.5f, dx3 = 0.4f, dy3 = 2.3f)
                verticalLineTo(y = 18.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.7f, dx2 = 1.3f, dy2 = 3.0f, dx3 = 3.0f, dy3 = 3.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 1.7f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -1.3f, dx3 = 3.0f, dy3 = -3.0f)
                verticalLineToRelative(dy = -0.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.8f, dx2 = 0.1f, dy2 = -1.5f, dx3 = 0.4f, dy3 = -2.3f)
                arcTo(horizontalEllipseRadius = 2.8f, verticalEllipseRadius = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 23.0f, y1 = 13.0f)
                verticalLineToRelative(dy = -2.0f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.6f, dy1 = -1.9f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.0f, y1 = 6.8f)
                verticalLineTo(y = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.7f, dx2 = -1.3f, dy2 = -3.0f, dx3 = -3.0f, dy3 = -3.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.8f, y = 12.0f)
                horizontalLineToRelative(dx = 2.9f)
                curveToRelative(dx1 = 1.2f, dy1 = 0.0f, dx2 = 2.1f, dy2 = 0.9f, dx3 = 2.1f, dy3 = 2.1f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = 2.1f, dx2 = -2.1f, dy2 = 2.1f)
                horizontalLineTo(x = 9.8f)
                verticalLineTo(y = 7.8f)
                horizontalLineToRelative(dx = 2.9f)
                curveToRelative(dx1 = 1.2f, dy1 = 0.0f, dx2 = 2.1f, dy2 = 0.9f, dx3 = 2.1f, dy3 = 2.1f)
                reflectiveCurveTo(x1 = 13.9f, y1 = 12.0f, x2 = 12.7f, y2 = 12.0f)
                close()
            }
        }.build().also { _bootstrap = it }
    }

@Suppress("ObjectPropertyName")
private var _bootstrap: ImageVector? = null
