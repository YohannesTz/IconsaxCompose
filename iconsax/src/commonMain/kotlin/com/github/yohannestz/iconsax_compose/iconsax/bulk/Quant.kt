package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
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
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.6f,
                strokeAlpha = 0.6f,
            ) {
                moveTo(x = 21.0f, y = 7.0f)
                verticalLineToRelative(dy = 5.0f)
                lineToRelative(dx = -4.0f, dy = 2.78f)
                verticalLineTo(y = 9.23f)
                close()
                moveToRelative(dx = -9.0f, dy = 10.56f)
                verticalLineTo(y = 22.0f)
                lineToRelative(dx = -9.0f, dy = -5.0f)
                lineToRelative(dx = 4.0f, dy = -2.23f)
                verticalLineToRelative(dy = 0.01f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.0f, y = 9.23f)
                verticalLineToRelative(dy = 5.54f)
                lineTo(x = 3.0f, y = 17.0f)
                verticalLineTo(y = 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.6f,
                strokeAlpha = 0.6f,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                verticalLineToRelative(dy = 4.44f)
                lineTo(x = 7.0f, y = 9.22f)
                verticalLineToRelative(dy = 0.01f)
                lineTo(x = 3.0f, y = 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 9.23f)
                close()
                lineToRelative(dx = -5.0f, dy = -2.78f)
                verticalLineTo(y = 2.0f)
                lineToRelative(dx = 9.0f, dy = 5.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 5.55f)
                verticalLineToRelative(dy = 4.72f)
                lineTo(x = 12.0f, y = 22.0f)
                verticalLineToRelative(dy = -4.44f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.0f, y = 17.0f)
                verticalLineToRelative(dy = 5.0f)
                lineToRelative(dx = -4.0f, dy = -2.5f)
                verticalLineToRelative(dy = -4.72f)
                close()
                moveToRelative(dx = -4.0f, dy = -7.78f)
                verticalLineToRelative(dy = 5.56f)
                lineToRelative(dx = -5.0f, dy = 2.78f)
                lineToRelative(dx = -5.0f, dy = -2.78f)
                verticalLineTo(y = 9.22f)
                lineToRelative(dx = 5.0f, dy = -2.78f)
                close()
            }
        }.build().also { _quant = it }
    }

@Suppress("ObjectPropertyName")
private var _quant: ImageVector? = null
