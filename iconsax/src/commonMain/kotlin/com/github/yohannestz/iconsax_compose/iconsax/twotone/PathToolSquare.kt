package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PathToolSquare: ImageVector
    get() {
        val current = _pathToolSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PathToolSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.75f, y = 9.12f)
                lineTo(x = 14.9f, y = 7.27f)
                curveToRelative(dx1 = -0.7f, dy1 = -0.7f, dx2 = -1.66f, dy2 = -0.66f, dx3 = -2.13f, dy3 = 0.08f)
                lineToRelative(dx = -1.03f, dy = 1.63f)
                lineToRelative(dx = 3.29f, dy = 3.29f)
                lineToRelative(dx = 1.63f, dy = -1.03f)
                curveToRelative(dx1 = 0.71f, dy1 = -0.44f, dx2 = 0.75f, dy2 = -1.47f, dx3 = 0.09f, dy3 = -2.12f)
                moveToRelative(dx = -5.01f, dy = -0.14f)
                lineTo(x = 9.35f, y = 8.84f)
                curveToRelative(dx1 = -1.34f, dy1 = -0.08f, dx2 = -1.8f, dy2 = 0.33f, dx3 = -1.95f, dy3 = 1.6f)
                lineToRelative(dx = -0.6f, dy = 5.07f)
                curveToRelative(dx1 = -0.13f, dy1 = 1.07f, dx2 = 0.64f, dy2 = 1.83f, dx3 = 1.71f, dy3 = 1.71f)
                lineToRelative(dx = 5.07f, dy = -0.6f)
                curveToRelative(dx1 = 1.27f, dy1 = -0.15f, dx2 = 1.73f, dy2 = -0.6f, dx3 = 1.6f, dy3 = -1.95f)
                lineToRelative(dx = -0.14f, dy = -2.39f)
                moveToRelative(dx = -7.55f, dy = 4.24f)
                lineToRelative(dx = 1.85f, dy = -1.85f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
            }
        }.build().also { _pathToolSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _pathToolSquare: ImageVector? = null
