package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Candle: ImageVector
    get() {
        val current = _candle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Candle",
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
                moveTo(x = 6.5f, y = 22.0f)
                verticalLineToRelative(dy = -7.0f)
                moveToRelative(dx = 0.0f, dy = -10.0f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = 11.0f, dy = 20.0f)
                verticalLineToRelative(dy = -3.0f)
                moveToRelative(dx = 0.0f, dy = -10.0f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = -8.0f, dy = 9.02f)
                verticalLineTo(y = 13.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.1f, dx2 = -0.5f, dy2 = 2.0f, dx3 = -2.0f, dy3 = 2.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -1.5f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.9f, dx3 = -2.0f, dy3 = -2.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.1f, dx2 = 0.5f, dy2 = -2.0f, dx3 = 2.0f, dy3 = -2.0f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.9f, dx3 = 2.0f, dy3 = 2.0f)
                moveToRelative(dx = 11.0f, dy = 4.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.1f, dx2 = -0.5f, dy2 = 2.0f, dx3 = -2.0f, dy3 = 2.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -1.5f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.9f, dx3 = -2.0f, dy3 = -2.0f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.1f, dx2 = 0.5f, dy2 = -2.0f, dx3 = 2.0f, dy3 = -2.0f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.9f, dx3 = 2.0f, dy3 = 2.0f)
            }
        }.build().also { _candle = it }
    }

@Suppress("ObjectPropertyName")
private var _candle: ImageVector? = null
