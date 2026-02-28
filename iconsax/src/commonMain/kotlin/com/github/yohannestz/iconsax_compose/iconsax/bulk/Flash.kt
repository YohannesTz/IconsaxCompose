package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Flash: ImageVector
    get() {
        val current = _flash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Flash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 3.67f)
                verticalLineToRelative(dy = 16.66f)
                lineToRelative(dx = -0.8f, dy = 0.91f)
                curveToRelative(dx1 = -1.11f, dy1 = 1.26f, dx2 = -2.02f, dy2 = 0.92f, dx3 = -2.02f, dy3 = -0.76f)
                verticalLineToRelative(dy = -7.2f)
                horizontalLineTo(x = 6.09f)
                curveToRelative(dx1 = -1.4f, dy1 = 0.0f, dx2 = -1.79f, dy2 = -0.86f, dx3 = -0.86f, dy3 = -1.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.77f, y = 12.63f)
                lineTo(x = 12.0f, y = 20.33f)
                verticalLineTo(y = 3.67f)
                lineToRelative(dx = 0.8f, dy = -0.91f)
                curveToRelative(dx1 = 1.11f, dy1 = -1.26f, dx2 = 2.02f, dy2 = -0.92f, dx3 = 2.02f, dy3 = 0.76f)
                verticalLineToRelative(dy = 7.2f)
                horizontalLineToRelative(dx = 3.09f)
                curveToRelative(dx1 = 1.4f, dy1 = 0.0f, dx2 = 1.79f, dy2 = 0.86f, dx3 = 0.86f, dy3 = 1.91f)
            }
        }.build().also { _flash = it }
    }

@Suppress("ObjectPropertyName")
private var _flash: ImageVector? = null
