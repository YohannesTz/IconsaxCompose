package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClipboardClose: ImageVector
    get() {
        val current = _clipboardClose
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ClipboardClose",
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
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.0f, y = 16.16f)
                lineToRelative(dx = -3.96f, dy = -3.96f)
                moveToRelative(dx = 3.92f, dy = 0.04f)
                lineTo(x = 10.0f, y = 16.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.0f, y = 6.0f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 2.0f, dy1 = 0.0f, dx2 = 2.0f, dy2 = -1.0f, dx3 = 2.0f, dy3 = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.0f, dx2 = -1.0f, dy2 = -2.0f, dx3 = -2.0f, dy3 = -2.0f)
                horizontalLineToRelative(dx = -4.0f)
                curveTo(x1 = 9.0f, y1 = 2.0f, x2 = 8.0f, y2 = 2.0f, x3 = 8.0f, y3 = 4.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 2.0f, dx2 = 2.0f, dy2 = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.0f, y = 4.02f)
                curveToRelative(dx1 = 3.33f, dy1 = 0.18f, dx2 = 5.0f, dy2 = 1.41f, dx3 = 5.0f, dy3 = 5.98f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.0f, dx2 = -1.0f, dy2 = 6.0f, dx3 = -6.0f, dy3 = 6.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -6.0f, dy2 = -2.0f, dx3 = -6.0f, dy3 = -6.0f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.56f, dx2 = 1.67f, dy2 = -5.8f, dx3 = 5.0f, dy3 = -5.98f)
            }
        }.build().also { _clipboardClose = it }
    }

@Suppress("ObjectPropertyName")
private var _clipboardClose: ImageVector? = null
