package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Medal: ImageVector
    get() {
        val current = _medal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Medal",
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
                moveTo(x = 16.5f, y = 3.66f)
                arcToRelative(a = 6.4f, b = 6.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.25f, dy1 = 4.84f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.59f, dx2 = -3.02f, dy2 = 6.5f, dx3 = -6.75f, dy3 = 6.5f)
                reflectiveCurveToRelative(dx1 = -6.75f, dy1 = -2.91f, dx2 = -6.75f, dy2 = -6.5f)
                reflectiveCurveTo(x1 = 8.27f, y1 = 2.0f, x2 = 12.0f, y2 = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.52f, y = 13.52f)
                lineTo(x = 7.51f, y = 20.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.9f, dx2 = 0.63f, dy2 = 1.34f, dx3 = 1.41f, dy3 = 0.97f)
                lineToRelative(dx = 2.68f, dy = -1.27f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.81f, dy1 = 0.0f)
                lineToRelative(dx = 2.69f, dy = 1.27f)
                curveToRelative(dx1 = 0.77f, dy1 = 0.36f, dx2 = 1.41f, dy2 = -0.07f, dx3 = 1.41f, dy3 = -0.97f)
                verticalLineToRelative(dy = -7.56f)
            }
        }.build().also { _medal = it }
    }

@Suppress("ObjectPropertyName")
private var _medal: ImageVector? = null
