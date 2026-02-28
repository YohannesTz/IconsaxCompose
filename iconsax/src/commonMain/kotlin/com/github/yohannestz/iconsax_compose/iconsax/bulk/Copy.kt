package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 17.1f, y = 2.0f)
                horizontalLineToRelative(dx = -4.2f)
                curveTo(x1 = 9.45f, y1 = 2.0f, x2 = 8.05f, y2 = 3.37f, x3 = 8.01f, y3 = 6.75f)
                horizontalLineToRelative(dx = 3.09f)
                curveToRelative(dx1 = 4.2f, dy1 = 0.0f, dx2 = 6.15f, dy2 = 1.95f, dx3 = 6.15f, dy3 = 6.15f)
                verticalLineToRelative(dy = 3.09f)
                curveTo(x1 = 20.63f, y1 = 15.95f, x2 = 22.0f, y2 = 14.55f, x3 = 22.0f, y3 = 11.1f)
                verticalLineTo(y = 6.9f)
                curveTo(x1 = 22.0f, y1 = 3.4f, x2 = 20.6f, y2 = 2.0f, x3 = 17.1f, y3 = 2.0f)
            }
        }.build().also { _copy = it }
    }

@Suppress("ObjectPropertyName")
private var _copy: ImageVector? = null
