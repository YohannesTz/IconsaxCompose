package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CoinOne: ImageVector
    get() {
        val current = _coinOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CoinOne",
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
                moveTo(x = 8.0f, y = 11.4f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.77f, dx2 = 0.6f, dy2 = 1.4f, dx3 = 1.33f, dy3 = 1.4f)
                horizontalLineToRelative(dx = 1.5f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.16f, dy1 = -1.22f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.73f, dx2 = -0.32f, dy2 = -0.99f, dx3 = -0.79f, dy3 = -1.16f)
                lineTo(x = 8.8f, y = 9.58f)
                curveTo(x1 = 8.32f, y1 = 9.41f, x2 = 8.0f, y2 = 9.15f, x3 = 8.0f, y3 = 8.42f)
                arcTo(horizontalEllipseRadius = 1.2f, verticalEllipseRadius = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.16f, y1 = 7.2f)
                horizontalLineToRelative(dx = 1.5f)
                arcTo(horizontalEllipseRadius = 1.4f, verticalEllipseRadius = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 8.6f)
                moveToRelative(dx = -2.0f, dy = 4.25f)
                verticalLineToRelative(dy = 0.74f)
                moveToRelative(dx = 0.0f, dy = -7.18f)
                verticalLineToRelative(dy = 0.78f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.99f, y = 17.98f)
                arcTo(horizontalEllipseRadius = 7.99f, verticalEllipseRadius = 7.99f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 9.99f, y1 = 2.0f)
                arcToRelative(a = 7.99f, b = 7.99f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 15.98f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.98f, y = 19.88f)
                arcTo(horizontalEllipseRadius = 4.94f, verticalEllipseRadius = 4.94f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 19.91f, y1 = 13.0f)
            }
        }.build().also { _coinOne = it }
    }

@Suppress("ObjectPropertyName")
private var _coinOne: ImageVector? = null
