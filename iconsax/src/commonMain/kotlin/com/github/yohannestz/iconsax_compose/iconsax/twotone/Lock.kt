package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lock: ImageVector
    get() {
        val current = _lock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Lock",
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
                moveTo(x = 6.0f, y = 10.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.31f, dx2 = 1.0f, dy2 = -6.0f, dx3 = 6.0f, dy3 = -6.0f)
                reflectiveCurveToRelative(dx1 = 6.0f, dy1 = 2.69f, dx2 = 6.0f, dy2 = 6.0f)
                verticalLineToRelative(dy = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 22.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -4.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -1.0f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.0f, dx2 = 1.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 4.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 1.0f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.0f, dx2 = -1.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 16.0f, y = 16.0f)
                close()
                moveToRelative(dx = -4.0f, dy = 0.0f)
                close()
                moveToRelative(dx = -4.0f, dy = 0.0f)
                close()
            }
        }.build().also { _lock = it }
    }

@Suppress("ObjectPropertyName")
private var _lock: ImageVector? = null
