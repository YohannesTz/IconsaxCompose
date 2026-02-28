package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hex: ImageVector
    get() {
        val current = _hex
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Hex",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 17.0f, y = 3.34f)
                horizontalLineTo(x = 7.0f)
                lineTo(x = 2.0f, y = 12.0f)
                lineToRelative(dx = 5.0f, dy = 8.66f)
                horizontalLineToRelative(dx = 10.0f)
                lineTo(x = 22.0f, y = 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.87f, y = 14.0f)
                horizontalLineTo(x = 7.03f)
                lineTo(x = 5.1f, y = 17.33f)
                lineToRelative(dx = 1.93f, dy = 3.33f)
                horizontalLineToRelative(dx = 3.84f)
                lineToRelative(dx = 1.93f, dy = -3.33f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.6f,
                strokeAlpha = 0.6f,
            ) {
                moveTo(x = 14.34f, y = 8.0f)
                horizontalLineTo(x = 7.03f)
                lineToRelative(dx = -3.65f, dy = 6.33f)
                lineToRelative(dx = 3.65f, dy = 6.33f)
                horizontalLineToRelative(dx = 7.31f)
                lineTo(x = 18.0f, y = 14.33f)
                close()
            }
        }.build().also { _hex = it }
    }

@Suppress("ObjectPropertyName")
private var _hex: ImageVector? = null
