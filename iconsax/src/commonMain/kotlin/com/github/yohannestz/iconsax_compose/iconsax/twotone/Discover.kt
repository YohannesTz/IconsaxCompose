package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Discover: ImageVector
    get() {
        val current = _discover
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Discover",
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
                moveTo(x = 17.8f, y = 2.1f)
                lineTo(x = 7.87f, y = 4.59f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.28f, dy1 = 3.28f)
                lineTo(x = 2.1f, y = 17.8f)
                curveToRelative(dx1 = -0.75f, dy1 = 3.0f, dx2 = 1.09f, dy2 = 4.85f, dx3 = 4.1f, dy3 = 4.1f)
                lineToRelative(dx = 9.93f, dy = -2.48f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.28f, dy1 = -3.28f)
                lineTo(x = 21.9f, y = 6.2f)
                curveToRelative(dx1 = 0.75f, dy1 = -3.0f, dx2 = -1.1f, dy2 = -4.85f, dx3 = -4.1f, dy3 = -4.1f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 15.5f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -7.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 7.0f)
            }
        }.build().also { _discover = it }
    }

@Suppress("ObjectPropertyName")
private var _discover: ImageVector? = null
