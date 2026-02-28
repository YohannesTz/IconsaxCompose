package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuoteUp: ImageVector
    get() {
        val current = _quoteUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.QuoteUp",
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
                moveTo(x = 2.0f, y = 12.35f)
                horizontalLineToRelative(dx = 5.8f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.58f, dy1 = 2.58f)
                verticalLineToRelative(dy = 3.22f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.58f, dy1 = 2.58f)
                horizontalLineTo(x = 4.58f)
                arcTo(horizontalEllipseRadius = 2.6f, verticalEllipseRadius = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 18.15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 12.35f)
                curveTo(x1 = 2.0f, y1 = 6.3f, x2 = 3.13f, y2 = 5.3f, x3 = 6.53f, y3 = 3.28f)
                moveToRelative(dx = 7.1f, dy = 9.07f)
                horizontalLineToRelative(dx = 5.8f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.58f, dy1 = 2.58f)
                verticalLineToRelative(dy = 3.22f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.58f, dy1 = 2.58f)
                horizontalLineToRelative(dx = -3.22f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.58f, dy1 = -2.58f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.63f, y = 12.35f)
                curveToRelative(dx1 = 0.0f, dy1 = -6.05f, dx2 = 1.13f, dy2 = -7.05f, dx3 = 4.53f, dy3 = -9.07f)
            }
        }.build().also { _quoteUp = it }
    }

@Suppress("ObjectPropertyName")
private var _quoteUp: ImageVector? = null
