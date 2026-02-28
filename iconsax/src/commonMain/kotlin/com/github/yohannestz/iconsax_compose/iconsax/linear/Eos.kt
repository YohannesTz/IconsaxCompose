package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.8f, y = 3.4f)
                lineTo(x = 7.2f, y = 7.7f)
                curveTo(x1 = 7.1f, y1 = 7.9f, x2 = 7.0f, y2 = 8.2f, x3 = 6.9f, y3 = 8.4f)
                lineTo(x = 5.2f, y = 17.0f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = 1.6f)
                lineToRelative(dx = 5.3f, dy = 3.0f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.2f, dx2 = 1.1f, dy2 = 0.2f, dx3 = 1.5f, dy3 = 0.0f)
                lineToRelative(dx = 5.3f, dy = -3.0f)
                curveToRelative(dx1 = 0.5f, dy1 = -0.3f, dx2 = 0.8f, dy2 = -1.0f, dx3 = 0.7f, dy3 = -1.6f)
                lineTo(x = 17.0f, y = 8.4f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.2f, dx2 = -0.2f, dy2 = -0.5f, dx3 = -0.3f, dy3 = -0.7f)
                lineToRelative(dx = -3.6f, dy = -4.3f)
                curveToRelative(dx1 = -0.6f, dy1 = -0.8f, dx2 = -1.6f, dy2 = -0.8f, dx3 = -2.3f, dy3 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.8f, y = 8.5f)
                lineToRelative(dx = -4.3f, dy = 12.2f)
                curveToRelative(dx1 = -0.2f, dy1 = 0.4f, dx2 = -0.8f, dy2 = 0.4f, dx3 = -0.9f, dy3 = 0.0f)
                lineTo(x = 7.2f, y = 8.5f)
            }
        }.build().also { _eos = it }
    }

@Suppress("ObjectPropertyName")
private var _eos: ImageVector? = null
