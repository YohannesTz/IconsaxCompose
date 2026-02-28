package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DiscountShape: ImageVector
    get() {
        val current = _discountShape
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DiscountShape",
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
                moveTo(x = 3.99f, y = 14.66f)
                lineToRelative(dx = -1.52f, dy = -1.52f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -2.26f)
                lineToRelative(dx = 1.52f, dy = -1.52f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.47f, dy1 = -1.13f)
                verticalLineTo(y = 6.08f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.6f, dy1 = -1.6f)
                horizontalLineTo(x = 8.2f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.34f, y1 = 4.0f)
                lineToRelative(dx = 1.52f, dy = -1.52f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.26f, dy1 = 0.0f)
                lineTo(x = 14.64f, y = 4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.13f, dy1 = 0.47f)
                horizontalLineToRelative(dx = 2.15f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.6f, dy1 = 1.6f)
                verticalLineToRelative(dy = 2.15f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.47f, dy1 = 1.13f)
                lineToRelative(dx = 1.52f, dy = 1.52f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.26f)
                lineToRelative(dx = -1.52f, dy = 1.52f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.47f, dy1 = 1.13f)
                verticalLineToRelative(dy = 2.15f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.6f, dy1 = 1.6f)
                horizontalLineToRelative(dx = -2.15f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.64f, y1 = 20.0f)
                lineToRelative(dx = -1.52f, dy = 1.52f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.26f, dy1 = 0.0f)
                lineTo(x = 9.34f, y = 20.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.13f, dy1 = -0.47f)
                horizontalLineTo(x = 6.06f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.6f, dy1 = -1.6f)
                verticalLineToRelative(dy = -2.15f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.47f, dy1 = -1.13f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 15.0f)
                lineToRelative(dx = 6.0f, dy = -6.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 14.5f, y = 14.5f)
                close()
                moveToRelative(dx = -5.0f, dy = -5.0f)
                close()
            }
        }.build().also { _discountShape = it }
    }

@Suppress("ObjectPropertyName")
private var _discountShape: ImageVector? = null
