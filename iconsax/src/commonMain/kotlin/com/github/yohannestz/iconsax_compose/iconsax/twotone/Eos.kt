package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Eos: ImageVector
    get() {
        val current = _eos
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Eos",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.85f, y = 3.38f)
                lineTo(x = 7.25f, y = 7.7f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.32f, dy1 = 0.67f)
                lineToRelative(dx = -1.71f, dy = 8.57f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.73f, dy1 = 1.6f)
                lineToRelative(dx = 5.32f, dy = 3.04f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.49f, dy1 = 0.0f)
                lineToRelative(dx = 5.32f, dy = -3.04f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.73f, dy1 = -1.6f)
                lineTo(x = 17.1f, y = 8.37f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.32f, dy1 = -0.67f)
                lineToRelative(dx = -3.6f, dy = -4.32f)
                curveToRelative(dx1 = -0.66f, dy1 = -0.76f, dx2 = -1.7f, dy2 = -0.76f, dx3 = -2.33f, dy3 = 0.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.81f, y = 8.52f)
                lineToRelative(dx = -4.34f, dy = 12.16f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.94f, dy1 = 0.0f)
                lineTo(x = 7.18f, y = 8.5f)
            }
        }.build().also { _eos = it }
    }

@Suppress("ObjectPropertyName")
private var _eos: ImageVector? = null
