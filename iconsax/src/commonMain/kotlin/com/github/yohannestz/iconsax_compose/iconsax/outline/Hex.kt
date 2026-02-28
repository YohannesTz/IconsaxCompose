package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.43f, y = 21.41f)
                horizontalLineTo(x = 6.56f)
                lineTo(x = 1.13f, y = 12.0f)
                lineToRelative(dx = 5.43f, dy = -9.41f)
                horizontalLineToRelative(dx = 10.87f)
                lineTo(x = 22.86f, y = 12.0f)
                close()
                moveToRelative(dx = -10.0f, dy = -1.5f)
                horizontalLineToRelative(dx = 9.13f)
                lineTo(x = 21.13f, y = 12.0f)
                lineToRelative(dx = -4.57f, dy = -7.91f)
                horizontalLineTo(x = 7.43f)
                lineTo(x = 2.87f, y = 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 11.31f, y = 21.41f)
                horizontalLineTo(x = 6.6f)
                lineToRelative(dx = -2.36f, dy = -4.08f)
                lineToRelative(dx = 2.36f, dy = -4.08f)
                horizontalLineToRelative(dx = 4.71f)
                lineToRelative(dx = 2.36f, dy = 4.08f)
                close()
                moveToRelative(dx = -3.85f, dy = -1.5f)
                horizontalLineToRelative(dx = 2.98f)
                lineToRelative(dx = 1.49f, dy = -2.58f)
                lineToRelative(dx = -1.49f, dy = -2.58f)
                horizontalLineTo(x = 7.46f)
                lineToRelative(dx = -1.49f, dy = 2.58f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 14.78f, y = 21.41f)
                horizontalLineTo(x = 6.6f)
                lineToRelative(dx = -4.09f, dy = -7.08f)
                lineTo(x = 6.6f, y = 7.25f)
                horizontalLineToRelative(dx = 8.18f)
                lineToRelative(dx = 4.09f, dy = 7.08f)
                close()
                moveToRelative(dx = -7.31f, dy = -1.5f)
                horizontalLineToRelative(dx = 6.44f)
                lineToRelative(dx = 3.22f, dy = -5.58f)
                lineToRelative(dx = -3.22f, dy = -5.58f)
                horizontalLineTo(x = 7.47f)
                lineToRelative(dx = -3.22f, dy = 5.58f)
                close()
            }
        }.build().also { _hex = it }
    }

@Suppress("ObjectPropertyName")
private var _hex: ImageVector? = null
