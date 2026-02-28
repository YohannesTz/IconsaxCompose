package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClipboardTick: ImageVector
    get() {
        val current = _clipboardTick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ClipboardTick",
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
                moveTo(x = 9.31f, y = 14.7f)
                lineToRelative(dx = 1.5f, dy = 1.5f)
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.96f, y = 2.0f)
                horizontalLineTo(x = 10.0f)
                curveTo(x1 = 9.0f, y1 = 2.0f, x2 = 8.0f, y2 = 2.0f, x3 = 8.0f, y3 = 4.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 2.0f, dx2 = 2.0f, dy2 = 2.0f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 2.0f, dy1 = 0.0f, dx2 = 2.0f, dy2 = -1.0f, dx3 = 2.0f, dy3 = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.0f, dx2 = -1.0f, dy2 = -2.0f, dx3 = -2.0f, dy3 = -2.0f)
                moveTo(x = 3.0f, y = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.56f, dx2 = 1.67f, dy2 = -5.8f, dx3 = 5.0f, dy3 = -5.98f)
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
                verticalLineToRelative(dy = -2.09f)
            }
        }.build().also { _clipboardTick = it }
    }

@Suppress("ObjectPropertyName")
private var _clipboardTick: ImageVector? = null
