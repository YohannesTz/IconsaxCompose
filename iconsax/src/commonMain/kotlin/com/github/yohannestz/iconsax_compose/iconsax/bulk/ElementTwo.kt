package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ElementTwo: ImageVector
    get() {
        val current = _elementTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ElementTwo",
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
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.5f, y = 19.64f)
                verticalLineToRelative(dy = -4.28f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.3f, dx2 = -1.0f, dy2 = -2.36f, dx3 = -2.23f, dy3 = -2.36f)
                horizontalLineToRelative(dx = -4.04f)
                curveTo(x1 = 14.0f, y1 = 13.0f, x2 = 13.0f, y2 = 14.06f, x3 = 13.0f, y3 = 15.36f)
                verticalLineToRelative(dy = 4.28f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.3f, dx2 = 1.0f, dy2 = 2.36f, dx3 = 2.23f, dy3 = 2.36f)
                horizontalLineToRelative(dx = 4.04f)
                curveToRelative(dx1 = 1.23f, dy1 = 0.0f, dx2 = 2.23f, dy2 = -1.06f, dx3 = 2.23f, dy3 = -2.36f)
                moveToRelative(dx = 0.0f, dy = -11.0f)
                verticalLineTo(y = 4.36f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.3f, dx2 = -1.0f, dy2 = -2.36f, dx3 = -2.23f, dy3 = -2.36f)
                horizontalLineToRelative(dx = -4.04f)
                curveTo(x1 = 14.0f, y1 = 2.0f, x2 = 13.0f, y2 = 3.06f, x3 = 13.0f, y3 = 4.36f)
                verticalLineToRelative(dy = 4.28f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.3f, dx2 = 1.0f, dy2 = 2.36f, dx3 = 2.23f, dy3 = 2.36f)
                horizontalLineToRelative(dx = 4.04f)
                curveToRelative(dx1 = 1.23f, dy1 = 0.0f, dx2 = 2.23f, dy2 = -1.06f, dx3 = 2.23f, dy3 = -2.36f)
            }
        }.build().also { _elementTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _elementTwo: ImageVector? = null
