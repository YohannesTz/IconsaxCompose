package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 3.3f)
                horizontalLineTo(x = 7.0f)
                lineTo(x = 2.0f, y = 12.0f)
                lineToRelative(dx = 5.0f, dy = 8.7f)
                horizontalLineToRelative(dx = 10.0f)
                lineToRelative(dx = 5.0f, dy = -8.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.9f, y = 14.0f)
                horizontalLineTo(x = 7.0f)
                lineToRelative(dx = -1.9f, dy = 3.3f)
                lineTo(x = 7.0f, y = 20.7f)
                horizontalLineToRelative(dx = 3.9f)
                lineToRelative(dx = 1.9f, dy = -3.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.3f, y = 8.0f)
                horizontalLineTo(x = 7.0f)
                lineToRelative(dx = -3.6f, dy = 6.3f)
                lineTo(x = 7.0f, y = 20.7f)
                horizontalLineToRelative(dx = 7.3f)
                lineToRelative(dx = 3.7f, dy = -6.4f)
                close()
            }
        }.build().also { _hex = it }
    }

@Suppress("ObjectPropertyName")
private var _hex: ImageVector? = null
