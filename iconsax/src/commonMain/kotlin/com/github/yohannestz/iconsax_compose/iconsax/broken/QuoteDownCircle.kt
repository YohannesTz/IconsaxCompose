package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuoteDownCircle: ImageVector
    get() {
        val current = _quoteDownCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.QuoteDownCircle",
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
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _quoteDownCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _quoteDownCircle: ImageVector? = null
