package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Quant: ImageVector
    get() {
        val current = _quant
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Quant",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 6.44f)
                lineTo(x = 7.0f, y = 9.22f)
                verticalLineToRelative(dy = 5.56f)
                lineToRelative(dx = 5.0f, dy = 2.78f)
                lineToRelative(dx = 5.0f, dy = -2.78f)
                verticalLineTo(y = 9.22f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                lineTo(x = 3.0f, y = 7.0f)
                verticalLineToRelative(dy = 10.0f)
                lineToRelative(dx = 9.0f, dy = 5.0f)
                lineToRelative(dx = 5.0f, dy = -2.5f)
                lineToRelative(dx = 4.0f, dy = 2.5f)
                verticalLineToRelative(dy = -5.0f)
                lineToRelative(dx = -4.0f, dy = -2.22f)
                lineTo(x = 21.0f, y = 12.0f)
                verticalLineTo(y = 7.0f)
                close()
                moveTo(x = 3.0f, y = 7.0f)
                lineToRelative(dx = 4.0f, dy = 2.23f)
                moveTo(x = 3.0f, y = 17.0f)
                lineToRelative(dx = 4.0f, dy = -2.23f)
                moveTo(x = 21.0f, y = 7.0f)
                lineToRelative(dx = -4.0f, dy = 2.23f)
                moveTo(x = 12.0f, y = 6.0f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = 0.0f, dy = 20.0f)
                verticalLineToRelative(dy = -4.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 20.0f)
                verticalLineToRelative(dy = -5.0f)
            }
        }.build().also { _quant = it }
    }

@Suppress("ObjectPropertyName")
private var _quant: ImageVector? = null
