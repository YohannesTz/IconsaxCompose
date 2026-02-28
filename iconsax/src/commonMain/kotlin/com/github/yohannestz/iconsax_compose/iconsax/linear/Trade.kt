package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Trade: ImageVector
    get() {
        val current = _trade
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Trade",
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
                moveTo(x = 22.0f, y = 8.5f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.02f, dy1 = 6.48f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.96f, dy1 = -5.96f)
                arcTo(horizontalEllipseRadius = 6.5f, verticalEllipseRadius = 6.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 22.0f, y1 = 8.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.0f, y = 15.5f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -13.0f, dy1 = 0.0f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 13.0f, dy1 = 0.0f)
                moveTo(x = 5.59f, y = 2.0f)
                horizontalLineTo(x = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = 1.0f)
                verticalLineToRelative(dy = 2.59f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.71f, y1 = 6.3f)
                lineTo(x = 6.3f, y = 3.71f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.59f, y1 = 2.0f)
                moveToRelative(dx = 12.82f, dy = 20.0f)
                horizontalLineTo(x = 21.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.0f)
                verticalLineToRelative(dy = -2.59f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.71f, dy1 = -0.71f)
                lineToRelative(dx = -2.59f, dy = 2.59f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.41f, y1 = 22.0f)
            }
        }.build().also { _trade = it }
    }

@Suppress("ObjectPropertyName")
private var _trade: ImageVector? = null
