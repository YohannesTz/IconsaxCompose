package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CandleTwo: ImageVector
    get() {
        val current = _candleTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CandleTwo",
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
                moveTo(x = 22.0f, y = 17.5f)
                horizontalLineToRelative(dx = -7.0f)
                moveToRelative(dx = -10.0f, dy = 0.0f)
                horizontalLineTo(x = 2.0f)
                moveToRelative(dx = 20.0f, dy = -11.0f)
                horizontalLineToRelative(dx = -3.0f)
                moveToRelative(dx = -10.0f, dy = 0.0f)
                horizontalLineTo(x = 2.0f)
                moveToRelative(dx = 5.0f, dy = 8.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.5f, dx3 = 2.0f, dy3 = 2.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = -0.9f, dy2 = 2.0f, dx3 = -2.0f, dy3 = 2.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.5f, dx3 = -2.0f, dy3 = -2.0f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = 0.9f, dy2 = -2.0f, dx3 = 2.0f, dy3 = -2.0f)
                moveToRelative(dx = 4.0f, dy = -11.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.5f, dx3 = 2.0f, dy3 = 2.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = -0.9f, dy2 = 2.0f, dx3 = -2.0f, dy3 = 2.0f)
                horizontalLineToRelative(dx = -6.0f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.5f, dx3 = -2.0f, dy3 = -2.0f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = 0.9f, dy2 = -2.0f, dx3 = 2.0f, dy3 = -2.0f)
            }
        }.build().also { _candleTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _candleTwo: ImageVector? = null
