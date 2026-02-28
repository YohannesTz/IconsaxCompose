package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BackwardItem: ImageVector
    get() {
        val current = _backwardItem
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BackwardItem",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.25f, y = 5.15f)
                verticalLineToRelative(dy = 2.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.84f, dx2 = -0.56f, dy2 = 2.4f, dx3 = -2.4f, dy3 = 2.4f)
                horizontalLineToRelative(dx = -2.7f)
                curveToRelative(dx1 = -1.84f, dy1 = 0.0f, dx2 = -2.4f, dy2 = -0.56f, dx3 = -2.4f, dy3 = -2.4f)
                verticalLineToRelative(dy = -2.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.84f, dx2 = 0.56f, dy2 = -2.4f, dx3 = 2.4f, dy3 = -2.4f)
                horizontalLineToRelative(dx = 2.7f)
                curveToRelative(dx1 = 1.84f, dy1 = 0.0f, dx2 = 2.4f, dy2 = 0.56f, dx3 = 2.4f, dy3 = 2.4f)
                moveToRelative(dx = -11.0f, dy = 11.0f)
                verticalLineToRelative(dy = 2.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.84f, dx2 = -0.56f, dy2 = 2.4f, dx3 = -2.4f, dy3 = 2.4f)
                horizontalLineToRelative(dx = -2.7f)
                curveToRelative(dx1 = -1.84f, dy1 = 0.0f, dx2 = -2.4f, dy2 = -0.56f, dx3 = -2.4f, dy3 = -2.4f)
                verticalLineToRelative(dy = -2.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.84f, dx2 = 0.56f, dy2 = -2.4f, dx3 = 2.4f, dy3 = -2.4f)
                horizontalLineToRelative(dx = 2.7f)
                curveToRelative(dx1 = 1.84f, dy1 = 0.0f, dx2 = 2.4f, dy2 = 0.56f, dx3 = 2.4f, dy3 = 2.4f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.63f, y = 11.75f)
                verticalLineToRelative(dy = 1.87f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.28f, dx2 = -0.73f, dy2 = 3.01f, dx3 = -3.01f, dy3 = 3.01f)
                horizontalLineToRelative(dx = -1.87f)
                verticalLineToRelative(dy = -0.48f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.66f, dx2 = -1.24f, dy2 = -3.9f, dx3 = -3.9f, dy3 = -3.9f)
                horizontalLineTo(x = 7.37f)
                verticalLineToRelative(dy = -1.87f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.28f, dx2 = 0.73f, dy2 = -3.0f, dx3 = 3.01f, dy3 = -3.0f)
                horizontalLineToRelative(dx = 1.87f)
                verticalLineToRelative(dy = 0.47f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.66f, dx2 = 1.24f, dy2 = 3.9f, dx3 = 3.9f, dy3 = 3.9f)
                close()
            }
        }.build().also { _backwardItem = it }
    }

@Suppress("ObjectPropertyName")
private var _backwardItem: ImageVector? = null
