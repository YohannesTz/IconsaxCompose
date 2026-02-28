package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ForwardTenSeconds: ImageVector
    get() {
        val current = _forwardTenSeconds
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ForwardTenSeconds",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.98f, y = 4.47f)
                lineTo(x = 12.0f, y = 2.0f)
                moveToRelative(dx = 7.09f, dy = 5.8f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.8f, dy1 = 5.3f)
                arcTo(horizontalEllipseRadius = 8.9f, verticalEllipseRadius = 8.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 8.9f, b = 8.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -8.89f, dy1 = -8.9f)
                arcTo(horizontalEllipseRadius = 8.9f, verticalEllipseRadius = 8.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 4.23f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.98f, dy1 = 0.24f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.54f, y = 15.92f)
                verticalLineToRelative(dy = -5.34f)
                lineToRelative(dx = -1.5f, dy = 1.67f)
                moveTo(x = 14.0f, y = 10.58f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = 2.0f)
                verticalLineToRelative(dy = 1.35f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.1f, dx2 = -0.9f, dy2 = 2.0f, dx3 = -2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = -2.0f, dy1 = -0.9f, dx2 = -2.0f, dy2 = -2.0f)
                verticalLineToRelative(dy = -1.35f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = -2.0f)
            }
        }.build().also { _forwardTenSeconds = it }
    }

@Suppress("ObjectPropertyName")
private var _forwardTenSeconds: ImageVector? = null
