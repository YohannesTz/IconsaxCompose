package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlayCircle: ImageVector
    get() {
        val current = _playCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PlayCircle",
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
                moveTo(x = 14.9f, y = 14.12f)
                curveToRelative(dx1 = 1.8f, dy1 = -1.04f, dx2 = 1.8f, dy2 = -2.74f, dx3 = 0.0f, dy3 = -3.78f)
                lineTo(x = 13.47f, y = 9.5f)
                lineTo(x = 12.0f, y = 8.66f)
                curveToRelative(dx1 = -1.8f, dy1 = -1.04f, dx2 = -3.27f, dy2 = -0.2f, dx3 = -3.27f, dy3 = 1.89f)
                verticalLineToRelative(dy = 3.34f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.66f, dx2 = 0.94f, dy2 = 2.54f, dx3 = 2.24f, dy3 = 2.29f)
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
        }.build().also { _playCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _playCircle: ImageVector? = null
