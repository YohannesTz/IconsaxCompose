package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Windows: ImageVector
    get() {
        val current = _windows
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Windows",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 2.0f)
                lineTo(x = 12.0f, y = 4.0f)
                verticalLineToRelative(dy = 7.0f)
                horizontalLineToRelative(dx = 10.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 22.0f)
                lineToRelative(dx = -10.0f, dy = -2.0f)
                verticalLineToRelative(dy = -7.0f)
                horizontalLineToRelative(dx = 10.0f)
                close()
                moveTo(x = 10.0f, y = 4.3f)
                lineTo(x = 2.0f, y = 6.0f)
                verticalLineToRelative(dy = 5.0f)
                horizontalLineToRelative(dx = 8.0f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.0f, y = 19.7f)
                lineTo(x = 2.0f, y = 18.0f)
                verticalLineToRelative(dy = -5.0f)
                horizontalLineToRelative(dx = 8.0f)
                close()
            }
        }.build().also { _windows = it }
    }

@Suppress("ObjectPropertyName")
private var _windows: ImageVector? = null
