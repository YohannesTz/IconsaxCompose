package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Microscope: ImageVector
    get() {
        val current = _microscope
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Microscope",
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
                moveTo(x = 15.03f, y = 10.77f)
                lineToRelative(dx = 5.66f, dy = -3.79f)
                arcToRelative(a = 1.24f, b = 1.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.34f, dy1 = -1.72f)
                lineToRelative(dx = -1.82f, dy = -2.71f)
                arcToRelative(a = 1.24f, b = 1.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.72f, dy1 = -0.34f)
                lineTo(x = 11.83f, y = 6.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.17f, y = 6.48f)
                lineTo(x = 7.4f, y = 9.68f)
                lineToRelative(dx = 2.56f, dy = 3.82f)
                lineToRelative(dx = 4.77f, dy = -3.2f)
                close()
                moveTo(x = 5.83f, y = 15.9f)
                lineToRelative(dx = 3.95f, dy = -2.64f)
                lineToRelative(dx = -2.24f, dy = -3.34f)
                lineToRelative(dx = -3.95f, dy = 2.64f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.27f, dy1 = 1.39f)
                lineToRelative(dx = 1.13f, dy = 1.68f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.38f, dy1 = 0.27f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.05f, y = 12.2f)
                lineTo(x = 7.56f, y = 22.0f)
                moveTo(x = 12.0f, y = 12.2f)
                lineToRelative(dx = 4.44f, dy = 9.8f)
            }
        }.build().also { _microscope = it }
    }

@Suppress("ObjectPropertyName")
private var _microscope: ImageVector? = null
