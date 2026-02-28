package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BinanceCoin: ImageVector
    get() {
        val current = _binanceCoin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BinanceCoin",
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
                moveTo(x = 9.05f, y = 4.95f)
                lineTo(x = 6.0f, y = 8.0f)
                lineToRelative(dx = 2.0f, dy = 2.0f)
                lineToRelative(dx = 4.0f, dy = -4.0f)
                lineToRelative(dx = 4.0f, dy = 4.0f)
                lineToRelative(dx = 2.0f, dy = -2.0f)
                lineToRelative(dx = -6.0f, dy = -6.0f)
                moveToRelative(dx = 0.0f, dy = 20.0f)
                lineToRelative(dx = -6.0f, dy = -6.0f)
                lineToRelative(dx = 2.0f, dy = -2.0f)
                lineToRelative(dx = 4.0f, dy = 4.0f)
                lineToRelative(dx = 4.0f, dy = -4.0f)
                lineToRelative(dx = 2.0f, dy = 2.0f)
                close()
                moveToRelative(dx = 7.75f, dy = -12.25f)
                lineTo(x = 17.5f, y = 12.0f)
                lineToRelative(dx = 2.25f, dy = 2.25f)
                lineTo(x = 22.0f, y = 12.0f)
                close()
                moveToRelative(dx = -15.5f, dy = 0.0f)
                lineTo(x = 2.0f, y = 12.0f)
                lineToRelative(dx = 2.25f, dy = 2.25f)
                lineTo(x = 6.5f, y = 12.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 9.53f)
                lineTo(x = 9.52f, y = 12.0f)
                lineTo(x = 12.0f, y = 14.48f)
                lineTo(x = 14.47f, y = 12.0f)
                close()
            }
        }.build().also { _binanceCoin = it }
    }

@Suppress("ObjectPropertyName")
private var _binanceCoin: ImageVector? = null
