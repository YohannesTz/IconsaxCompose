package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Printer: ImageVector
    get() {
        val current = _printer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Printer",
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
                moveTo(x = 16.0f, y = 15.0f)
                verticalLineToRelative(dy = 4.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -3.0f, dy2 = 3.0f)
                horizontalLineToRelative(dx = -2.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -3.0f)
                verticalLineToRelative(dy = -4.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.0f, y = 10.0f)
                verticalLineToRelative(dy = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -3.0f, dy2 = 3.0f)
                horizontalLineToRelative(dx = -2.0f)
                verticalLineToRelative(dy = -3.0f)
                horizontalLineTo(x = 8.0f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineTo(x = 6.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -3.0f)
                verticalLineToRelative(dy = -5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 3.0f, dy2 = -3.0f)
                horizontalLineToRelative(dx = 12.0f)
                quadToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 3.0f)
                moveToRelative(dx = -4.0f, dy = 5.0f)
                horizontalLineTo(x = 7.0f)
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
                horizontalLineToRelative(dx = 3.0f)
            }
        }.build().also { _printer = it }
    }

@Suppress("ObjectPropertyName")
private var _printer: ImageVector? = null
