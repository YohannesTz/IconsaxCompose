package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Paintbucket: ImageVector
    get() {
        val current = _paintbucket
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Paintbucket",
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
                moveTo(x = 3.77f, y = 15.56f)
                lineToRelative(dx = 3.46f, dy = 3.46f)
                curveToRelative(dx1 = 2.43f, dy1 = 2.43f, dx2 = 3.26f, dy2 = 2.39f, dx3 = 5.66f, dy3 = 0.0f)
                lineToRelative(dx = 5.57f, dy = -5.57f)
                curveToRelative(dx1 = 1.94f, dy1 = -1.94f, dx2 = 2.43f, dy2 = -3.23f, dx3 = 0.0f, dy3 = -5.66f)
                lineTo(x = 15.0f, y = 4.33f)
                curveToRelative(dx1 = -2.59f, dy1 = -2.6f, dx2 = -3.72f, dy2 = -1.94f, dx3 = -5.66f, dy3 = 0.0f)
                lineTo(x = 3.77f, y = 9.9f)
                curveToRelative(dx1 = -2.39f, dy1 = 2.4f, dx2 = -2.59f, dy2 = 3.07f, dx3 = 0.0f, dy3 = 5.66f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.2f, y = 16.79f)
                lineToRelative(dx = -0.66f, dy = 1.09f)
                curveToRelative(dx1 = -0.93f, dy1 = 1.55f, dx2 = -0.21f, dy2 = 2.82f, dx3 = 1.6f, dy3 = 2.82f)
                reflectiveCurveToRelative(dx1 = 2.53f, dy1 = -1.27f, dx2 = 1.6f, dy2 = -2.82f)
                lineToRelative(dx = -0.66f, dy = -1.09f)
                curveToRelative(dx1 = -0.52f, dy1 = -0.86f, dx2 = -1.37f, dy2 = -0.86f, dx3 = -1.88f, dy3 = 0.0f)
                moveTo(x = 2.0f, y = 12.24f)
                arcToRelative(a = 33.3f, b = 33.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 17.0f, dy1 = -0.13f)
                lineToRelative(dx = 0.5f, dy = 0.13f)
            }
        }.build().also { _paintbucket = it }
    }

@Suppress("ObjectPropertyName")
private var _paintbucket: ImageVector? = null
