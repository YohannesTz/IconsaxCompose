package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Trontron: ImageVector
    get() {
        val current = _trontron
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Trontron",
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
                moveTo(x = 2.64f, y = 3.59f)
                lineToRelative(dx = 6.72f, dy = 16.8f)
                curveToRelative(dx1 = 0.35f, dy1 = 0.89f, dx2 = 1.13f, dy2 = 1.0f, dx3 = 1.71f, dy3 = 0.25f)
                lineTo(x = 20.45f, y = 8.7f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.08f, dy1 = -1.32f)
                lineToRelative(dx = -3.13f, dy = -3.13f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.57f, dy1 = -0.28f)
                lineTo(x = 3.7f, y = 2.23f)
                curveTo(x1 = 2.76f, y1 = 2.1f, x2 = 2.29f, y2 = 2.7f, x3 = 2.64f, y3 = 3.59f)
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
                moveTo(x = 10.0f, y = 21.0f)
                lineToRelative(dx = 1.0f, dy = -11.0f)
                lineToRelative(dx = -7.99f, dy = -7.1f)
                moveTo(x = 17.0f, y = 4.0f)
                lineToRelative(dx = -6.0f, dy = 6.0f)
                lineToRelative(dx = 9.04f, dy = -1.81f)
            }
        }.build().also { _trontron = it }
    }

@Suppress("ObjectPropertyName")
private var _trontron: ImageVector? = null
