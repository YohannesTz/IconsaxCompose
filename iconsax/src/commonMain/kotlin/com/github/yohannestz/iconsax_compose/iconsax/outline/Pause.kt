package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pause: ImageVector
    get() {
        val current = _pause
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Pause",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.64f, y = 21.75f)
                horizontalLineTo(x = 5.01f)
                quadToRelative(dx1 = -2.77f, dy1 = 0.02f, dx2 = -2.76f, dy2 = -2.64f)
                verticalLineTo(y = 4.89f)
                quadTo(x1 = 2.23f, y1 = 2.24f, x2 = 5.01f, y2 = 2.25f)
                horizontalLineToRelative(dx = 3.63f)
                quadToRelative(dx1 = 2.78f, dy1 = -0.01f, dx2 = 2.76f, dy2 = 2.64f)
                verticalLineToRelative(dy = 14.22f)
                quadToRelative(dx1 = 0.02f, dy1 = 2.66f, dx2 = -2.76f, dy2 = 2.64f)
                moveToRelative(dx = -3.63f, dy = -18.0f)
                curveToRelative(dx1 = -1.08f, dy1 = 0.0f, dx2 = -1.26f, dy2 = 0.27f, dx3 = -1.26f, dy3 = 1.14f)
                verticalLineToRelative(dy = 14.22f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.87f, dx2 = 0.17f, dy2 = 1.14f, dx3 = 1.26f, dy3 = 1.14f)
                horizontalLineToRelative(dx = 3.63f)
                curveToRelative(dx1 = 1.08f, dy1 = 0.0f, dx2 = 1.26f, dy2 = -0.27f, dx3 = 1.26f, dy3 = -1.14f)
                verticalLineTo(y = 4.89f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.87f, dx2 = -0.17f, dy2 = -1.14f, dx3 = -1.26f, dy3 = -1.14f)
                close()
                moveToRelative(dx = 13.98f, dy = 18.0f)
                horizontalLineToRelative(dx = -3.63f)
                quadToRelative(dx1 = -2.78f, dy1 = 0.02f, dx2 = -2.76f, dy2 = -2.64f)
                verticalLineTo(y = 4.89f)
                quadToRelative(dx1 = -0.02f, dy1 = -2.65f, dx2 = 2.76f, dy2 = -2.64f)
                horizontalLineTo(x = 19.0f)
                quadToRelative(dx1 = 2.77f, dy1 = -0.01f, dx2 = 2.76f, dy2 = 2.64f)
                verticalLineToRelative(dy = 14.22f)
                quadToRelative(dx1 = 0.02f, dy1 = 2.66f, dx2 = -2.76f, dy2 = 2.64f)
                moveToRelative(dx = -3.63f, dy = -18.0f)
                curveToRelative(dx1 = -1.08f, dy1 = 0.0f, dx2 = -1.26f, dy2 = 0.27f, dx3 = -1.26f, dy3 = 1.14f)
                verticalLineToRelative(dy = 14.22f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.87f, dx2 = 0.17f, dy2 = 1.14f, dx3 = 1.26f, dy3 = 1.14f)
                horizontalLineTo(x = 19.0f)
                curveToRelative(dx1 = 1.08f, dy1 = 0.0f, dx2 = 1.26f, dy2 = -0.27f, dx3 = 1.26f, dy3 = -1.14f)
                verticalLineTo(y = 4.89f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.87f, dx2 = -0.17f, dy2 = -1.14f, dx3 = -1.26f, dy3 = -1.14f)
                close()
            }
        }.build().also { _pause = it }
    }

@Suppress("ObjectPropertyName")
private var _pause: ImageVector? = null
