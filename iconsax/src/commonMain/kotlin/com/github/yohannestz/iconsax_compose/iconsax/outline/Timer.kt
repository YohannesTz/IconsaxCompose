package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Timer: ImageVector
    get() {
        val current = _timer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Timer",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.24f, y = 22.75f)
                horizontalLineTo(x = 8.76f)
                curveToRelative(dx1 = -1.89f, dy1 = 0.0f, dx2 = -3.27f, dy2 = -0.79f, dx3 = -3.8f, dy3 = -2.15f)
                curveToRelative(dx1 = -0.55f, dy1 = -1.42f, dx2 = -0.04f, dy2 = -3.18f, dx3 = 1.28f, dy3 = -4.37f)
                lineTo(x = 10.88f, y = 12.0f)
                lineTo(x = 6.24f, y = 7.77f)
                curveTo(x1 = 4.92f, y1 = 6.58f, x2 = 4.41f, y2 = 4.82f, x3 = 4.96f, y3 = 3.4f)
                curveToRelative(dx1 = 0.53f, dy1 = -1.37f, dx2 = 1.91f, dy2 = -2.15f, dx3 = 3.8f, dy3 = -2.15f)
                horizontalLineToRelative(dx = 6.48f)
                curveToRelative(dx1 = 1.89f, dy1 = 0.0f, dx2 = 3.27f, dy2 = 0.79f, dx3 = 3.8f, dy3 = 2.15f)
                curveToRelative(dx1 = 0.55f, dy1 = 1.42f, dx2 = 0.04f, dy2 = 3.18f, dx3 = -1.28f, dy3 = 4.37f)
                lineTo(x = 13.12f, y = 12.0f)
                lineToRelative(dx = 4.65f, dy = 4.23f)
                curveToRelative(dx1 = 1.31f, dy1 = 1.19f, dx2 = 1.83f, dy2 = 2.95f, dx3 = 1.28f, dy3 = 4.37f)
                curveToRelative(dx1 = -0.54f, dy1 = 1.36f, dx2 = -1.92f, dy2 = 2.15f, dx3 = -3.81f, dy3 = 2.15f)
                moveTo(x = 12.0f, y = 13.01f)
                lineToRelative(dx = -4.75f, dy = 4.32f)
                curveToRelative(dx1 = -0.84f, dy1 = 0.77f, dx2 = -1.21f, dy2 = 1.89f, dx3 = -0.89f, dy3 = 2.72f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.77f, dx2 = 1.15f, dy2 = 1.2f, dx3 = 2.4f, dy3 = 1.2f)
                horizontalLineToRelative(dx = 6.48f)
                curveToRelative(dx1 = 1.25f, dy1 = 0.0f, dx2 = 2.1f, dy2 = -0.42f, dx3 = 2.4f, dy3 = -1.2f)
                curveToRelative(dx1 = 0.32f, dy1 = -0.83f, dx2 = -0.04f, dy2 = -1.95f, dx3 = -0.89f, dy3 = -2.72f)
                close()
                moveTo(x = 8.76f, y = 2.75f)
                curveToRelative(dx1 = -1.25f, dy1 = 0.0f, dx2 = -2.1f, dy2 = 0.42f, dx3 = -2.4f, dy3 = 1.2f)
                curveTo(x1 = 6.04f, y1 = 4.78f, x2 = 6.4f, y2 = 5.9f, x3 = 7.25f, y3 = 6.67f)
                lineTo(x = 12.0f, y = 10.99f)
                lineToRelative(dx = 4.75f, dy = -4.32f)
                curveToRelative(dx1 = 0.84f, dy1 = -0.77f, dx2 = 1.21f, dy2 = -1.89f, dx3 = 0.89f, dy3 = -2.72f)
                curveToRelative(dx1 = -0.3f, dy1 = -0.77f, dx2 = -1.15f, dy2 = -1.2f, dx3 = -2.4f, dy3 = -1.2f)
                close()
            }
        }.build().also { _timer = it }
    }

@Suppress("ObjectPropertyName")
private var _timer: ImageVector? = null
