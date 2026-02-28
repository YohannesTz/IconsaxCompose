package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Element: ImageVector
    get() {
        val current = _element
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Element",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.0f, y = 19.9f)
                verticalLineTo(y = 4.1f)
                curveTo(x1 = 11.0f, y1 = 2.6f, x2 = 10.36f, y2 = 2.0f, x3 = 8.77f, y3 = 2.0f)
                horizontalLineTo(x = 4.73f)
                curveTo(x1 = 3.14f, y1 = 2.0f, x2 = 2.5f, y2 = 2.6f, x3 = 2.5f, y3 = 4.1f)
                verticalLineToRelative(dy = 15.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = 0.64f, dy2 = 2.1f, dx3 = 2.23f, dy3 = 2.1f)
                horizontalLineToRelative(dx = 4.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = -0.6f, dx3 = 2.23f, dy3 = -2.1f)
                moveToRelative(dx = 10.5f, dy = -9.0f)
                verticalLineTo(y = 4.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = -0.64f, dy2 = -2.1f, dx3 = -2.23f, dy3 = -2.1f)
                horizontalLineToRelative(dx = -4.04f)
                curveTo(x1 = 13.64f, y1 = 2.0f, x2 = 13.0f, y2 = 2.6f, x3 = 13.0f, y3 = 4.1f)
                verticalLineToRelative(dy = 6.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = 0.64f, dy2 = 2.1f, dx3 = 2.23f, dy3 = 2.1f)
                horizontalLineToRelative(dx = 4.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = -0.6f, dx3 = 2.23f, dy3 = -2.1f)
                moveToRelative(dx = 0.0f, dy = 9.0f)
                verticalLineToRelative(dy = -2.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = -0.64f, dy2 = -2.1f, dx3 = -2.23f, dy3 = -2.1f)
                horizontalLineToRelative(dx = -4.04f)
                curveTo(x1 = 13.64f, y1 = 15.0f, x2 = 13.0f, y2 = 15.6f, x3 = 13.0f, y3 = 17.1f)
                verticalLineToRelative(dy = 2.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = 0.64f, dy2 = 2.1f, dx3 = 2.23f, dy3 = 2.1f)
                horizontalLineToRelative(dx = 4.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = -0.6f, dx3 = 2.23f, dy3 = -2.1f)
            }
        }.build().also { _element = it }
    }

@Suppress("ObjectPropertyName")
private var _element: ImageVector? = null
