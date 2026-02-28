package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuoteDownSquare: ImageVector
    get() {
        val current = _quoteDownSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.QuoteDownSquare",
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
                moveTo(x = 9.0f, y = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.0f, y = 12.16f)
                horizontalLineToRelative(dx = 2.68f)
                arcToRelative(a = 1.16f, b = 1.16f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.19f, dy1 = 1.19f)
                verticalLineToRelative(dy = 1.49f)
                arcToRelative(a = 1.16f, b = 1.16f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.19f, dy1 = 1.19f)
                horizontalLineTo(x = 8.19f)
                arcTo(horizontalEllipseRadius = 1.2f, verticalEllipseRadius = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 14.84f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.8f, dx2 = 0.52f, dy2 = -3.26f, dx3 = 2.09f, dy3 = -4.2f)
                moveToRelative(dx = 4.05f, dy = 4.2f)
                horizontalLineToRelative(dx = 2.68f)
                arcToRelative(a = 1.16f, b = 1.16f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.19f, dy1 = 1.19f)
                verticalLineToRelative(dy = 1.49f)
                arcToRelative(a = 1.16f, b = 1.16f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.19f, dy1 = 1.19f)
                horizontalLineToRelative(dx = -1.49f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.19f, dy1 = -1.19f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.8f, dx2 = 0.52f, dy2 = -3.26f, dx3 = 2.09f, dy3 = -4.2f)
            }
        }.build().also { _quoteDownSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _quoteDownSquare: ImageVector? = null
