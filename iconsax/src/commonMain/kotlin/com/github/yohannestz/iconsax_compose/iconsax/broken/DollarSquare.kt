package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DollarSquare: ImageVector
    get() {
        val current = _dollarSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DollarSquare",
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
                moveTo(x = 8.67f, y = 14.33f)
                arcToRelative(a = 2.27f, b = 2.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.22f, dy1 = 2.33f)
                horizontalLineToRelative(dx = 2.51f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.94f, dy1 = -2.03f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.22f, dx2 = -0.53f, dy2 = -1.65f, dx3 = -1.32f, dy3 = -1.93f)
                lineTo(x = 10.0f, y = 11.3f)
                curveToRelative(dx1 = -0.79f, dy1 = -0.28f, dx2 = -1.32f, dy2 = -0.71f, dx3 = -1.32f, dy3 = -1.93f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.94f, dy1 = -2.03f)
                horizontalLineToRelative(dx = 2.51f)
                arcToRelative(a = 2.27f, b = 2.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.22f, dy1 = 2.33f)
                moveTo(x = 12.0f, y = 6.0f)
                verticalLineToRelative(dy = 12.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = 2.0f, dy2 = -7.0f, dx3 = 7.0f, dy3 = -7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = 2.0f, dx3 = 7.0f, dy3 = 7.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = -2.0f, dy2 = 7.0f, dx3 = -7.0f, dy3 = 7.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -7.0f, dy2 = -2.0f, dx3 = -7.0f, dy3 = -7.0f)
                verticalLineToRelative(dy = -1.97f)
            }
        }.build().also { _dollarSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _dollarSquare: ImageVector? = null
