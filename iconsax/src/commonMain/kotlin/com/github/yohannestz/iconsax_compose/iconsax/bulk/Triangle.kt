package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Triangle: ImageVector
    get() {
        val current = _triangle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Triangle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.59f)
                verticalLineToRelative(dy = 11.02f)
                lineToRelative(dx = -9.35f, dy = 6.54f)
                curveToRelative(dx1 = -0.85f, dy1 = -1.01f, dx2 = -0.9f, dy2 = -2.54f, dx3 = 0.05f, dy3 = -4.25f)
                lineToRelative(dx = 3.12f, dy = -5.61f)
                lineTo(x = 8.76f, y = 5.0f)
                curveTo(x1 = 9.65f, y1 = 3.4f, x2 = 10.82f, y2 = 2.59f, x3 = 12.0f, y3 = 2.59f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.6f,
                strokeAlpha = 0.6f,
            ) {
                moveTo(x = 21.35f, y = 20.15f)
                curveToRelative(dx1 = -0.65f, dy1 = 0.79f, dx2 = -1.78f, dy2 = 1.26f, dx3 = -3.29f, dy3 = 1.26f)
                horizontalLineTo(x = 5.94f)
                curveToRelative(dx1 = -1.51f, dy1 = 0.0f, dx2 = -2.64f, dy2 = -0.47f, dx3 = -3.29f, dy3 = -1.26f)
                lineTo(x = 12.0f, y = 13.61f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.35f, y = 20.15f)
                lineTo(x = 12.0f, y = 13.61f)
                verticalLineTo(y = 2.59f)
                curveToRelative(dx1 = 1.18f, dy1 = 0.0f, dx2 = 2.35f, dy2 = 0.81f, dx3 = 3.24f, dy3 = 2.41f)
                lineToRelative(dx = 2.94f, dy = 5.29f)
                lineToRelative(dx = 3.12f, dy = 5.61f)
                curveToRelative(dx1 = 0.95f, dy1 = 1.71f, dx2 = 0.9f, dy2 = 3.24f, dx3 = 0.05f, dy3 = 4.25f)
            }
        }.build().also { _triangle = it }
    }

@Suppress("ObjectPropertyName")
private var _triangle: ImageVector? = null
