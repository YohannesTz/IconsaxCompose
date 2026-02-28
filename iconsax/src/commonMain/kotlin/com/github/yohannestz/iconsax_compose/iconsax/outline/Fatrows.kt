package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fatrows: ImageVector
    get() {
        val current = _fatrows
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Fatrows",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.9f, y = 22.75f)
                horizontalLineTo(x = 4.1f)
                quadToRelative(dx1 = -2.86f, dy1 = 0.01f, dx2 = -2.85f, dy2 = -2.98f)
                verticalLineToRelative(dy = -4.04f)
                quadToRelative(dx1 = -0.01f, dy1 = -3.0f, dx2 = 2.85f, dy2 = -2.98f)
                horizontalLineToRelative(dx = 15.8f)
                quadToRelative(dx1 = 2.87f, dy1 = -0.01f, dx2 = 2.85f, dy2 = 2.98f)
                verticalLineToRelative(dy = 4.04f)
                quadToRelative(dx1 = 0.02f, dy1 = 2.99f, dx2 = -2.85f, dy2 = 2.98f)
                moveToRelative(dx = -15.8f, dy = -8.5f)
                curveToRelative(dx1 = -1.01f, dy1 = 0.0f, dx2 = -1.35f, dy2 = 0.21f, dx3 = -1.35f, dy3 = 1.48f)
                verticalLineToRelative(dy = 4.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.27f, dx2 = 0.34f, dy2 = 1.48f, dx3 = 1.35f, dy3 = 1.48f)
                horizontalLineToRelative(dx = 15.8f)
                curveToRelative(dx1 = 1.01f, dy1 = 0.0f, dx2 = 1.35f, dy2 = -0.21f, dx3 = 1.35f, dy3 = -1.48f)
                verticalLineToRelative(dy = -4.04f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.27f, dx2 = -0.34f, dy2 = -1.48f, dx3 = -1.35f, dy3 = -1.48f)
                close()
                moveToRelative(dx = 8.8f, dy = -3.0f)
                horizontalLineTo(x = 4.1f)
                quadToRelative(dx1 = -2.86f, dy1 = 0.01f, dx2 = -2.85f, dy2 = -2.98f)
                verticalLineTo(y = 4.23f)
                quadToRelative(dx1 = -0.01f, dy1 = -3.0f, dx2 = 2.85f, dy2 = -2.98f)
                horizontalLineToRelative(dx = 8.8f)
                quadToRelative(dx1 = 2.87f, dy1 = -0.01f, dx2 = 2.85f, dy2 = 2.98f)
                verticalLineToRelative(dy = 4.04f)
                quadToRelative(dx1 = 0.02f, dy1 = 2.99f, dx2 = -2.85f, dy2 = 2.98f)
                moveToRelative(dx = -8.8f, dy = -8.5f)
                curveToRelative(dx1 = -1.01f, dy1 = 0.0f, dx2 = -1.35f, dy2 = 0.21f, dx3 = -1.35f, dy3 = 1.48f)
                verticalLineToRelative(dy = 4.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.27f, dx2 = 0.34f, dy2 = 1.48f, dx3 = 1.35f, dy3 = 1.48f)
                horizontalLineToRelative(dx = 8.8f)
                curveToRelative(dx1 = 1.01f, dy1 = 0.0f, dx2 = 1.35f, dy2 = -0.21f, dx3 = 1.35f, dy3 = -1.48f)
                verticalLineTo(y = 4.23f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.27f, dx2 = -0.34f, dy2 = -1.48f, dx3 = -1.35f, dy3 = -1.48f)
                close()
            }
        }.build().also { _fatrows = it }
    }

@Suppress("ObjectPropertyName")
private var _fatrows: ImageVector? = null
