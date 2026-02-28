package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Copy: ImageVector
    get() {
        val current = _copy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Copy",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 12.9f)
                verticalLineToRelative(dy = 4.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.5f, dx2 = -1.4f, dy2 = 4.9f, dx3 = -4.9f, dy3 = 4.9f)
                horizontalLineTo(x = 6.9f)
                curveTo(x1 = 3.4f, y1 = 22.0f, x2 = 2.0f, y2 = 20.6f, x3 = 2.0f, y3 = 17.1f)
                verticalLineToRelative(dy = -4.2f)
                curveTo(x1 = 2.0f, y1 = 9.4f, x2 = 3.4f, y2 = 8.0f, x3 = 6.9f, y3 = 8.0f)
                horizontalLineToRelative(dx = 4.2f)
                curveToRelative(dx1 = 3.5f, dy1 = 0.0f, dx2 = 4.9f, dy2 = 1.4f, dx3 = 4.9f, dy3 = 4.9f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.1f, y = 2.0f)
                horizontalLineToRelative(dx = -4.2f)
                curveTo(x1 = 9.82f, y1 = 2.0f, x2 = 8.37f, y2 = 3.1f, x3 = 8.07f, y3 = 5.74f)
                curveToRelative(dx1 = -0.06f, dy1 = 0.55f, dx2 = 0.4f, dy2 = 1.01f, dx3 = 0.95f, dy3 = 1.01f)
                horizontalLineToRelative(dx = 2.08f)
                curveToRelative(dx1 = 4.2f, dy1 = 0.0f, dx2 = 6.15f, dy2 = 1.95f, dx3 = 6.15f, dy3 = 6.15f)
                verticalLineToRelative(dy = 2.08f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.55f, dx2 = 0.46f, dy2 = 1.01f, dx3 = 1.01f, dy3 = 0.95f)
                curveToRelative(dx1 = 2.65f, dy1 = -0.3f, dx2 = 3.74f, dy2 = -1.75f, dx3 = 3.74f, dy3 = -4.83f)
                verticalLineTo(y = 6.9f)
                curveTo(x1 = 22.0f, y1 = 3.4f, x2 = 20.6f, y2 = 2.0f, x3 = 17.1f, y3 = 2.0f)
            }
        }.build().also { _copy = it }
    }

@Suppress("ObjectPropertyName")
private var _copy: ImageVector? = null
