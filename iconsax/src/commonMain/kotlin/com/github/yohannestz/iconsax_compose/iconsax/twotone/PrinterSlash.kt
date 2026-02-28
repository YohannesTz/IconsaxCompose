package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PrinterSlash: ImageVector
    get() {
        val current = _printerSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PrinterSlash",
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
                moveTo(x = 7.25f, y = 7.0f)
                horizontalLineToRelative(dx = 9.5f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.0f, dx2 = -0.75f, dy2 = -3.0f, dx3 = -3.0f, dy3 = -3.0f)
                horizontalLineToRelative(dx = -3.5f)
                curveToRelative(dx1 = -2.25f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 1.0f, dx3 = -3.0f, dy3 = 3.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.97f, y = 15.0f)
                horizontalLineTo(x = 16.0f)
                verticalLineToRelative(dy = 4.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -3.0f, dy2 = 3.0f)
                horizontalLineToRelative(dx = -2.0f)
                quadToRelative(dx1 = -2.54f, dy1 = 0.0f, dx2 = -2.93f, dy2 = -2.14f)
                moveTo(x = 6.0f, y = 18.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -3.0f)
                verticalLineToRelative(dy = -5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 3.0f, dy2 = -3.0f)
                horizontalLineToRelative(dx = 10.59f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.97f, y = 7.52f)
                quadTo(x1 = 21.0f, y1 = 8.24f, x2 = 21.0f, y2 = 10.0f)
                verticalLineToRelative(dy = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -3.0f, dy2 = 3.0f)
                horizontalLineToRelative(dx = -2.0f)
                verticalLineToRelative(dy = -3.0f)
                horizontalLineToRelative(dx = -3.0f)
                moveToRelative(dx = 4.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -1.21f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.0f, y = 11.0f)
                horizontalLineToRelative(dx = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 2.0f)
                lineTo(x = 2.0f, y = 22.0f)
            }
        }.build().also { _printerSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _printerSlash: ImageVector? = null
