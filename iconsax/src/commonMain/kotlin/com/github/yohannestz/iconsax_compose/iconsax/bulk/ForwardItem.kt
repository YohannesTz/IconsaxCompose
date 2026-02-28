package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ForwardItem: ImageVector
    get() {
        val current = _forwardItem
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ForwardItem",
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
                moveTo(x = 21.25f, y = 5.77f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.29f, dx2 = -0.73f, dy2 = 3.02f, dx3 = -3.02f, dy3 = 3.02f)
                horizontalLineToRelative(dx = -0.1f)
                verticalLineToRelative(dy = -1.64f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.12f, dx2 = -1.39f, dy2 = -4.51f, dx3 = -4.51f, dy3 = -4.51f)
                horizontalLineToRelative(dx = -1.64f)
                verticalLineToRelative(dy = -0.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.29f, dx2 = 0.73f, dy2 = -3.02f, dx3 = 3.02f, dy3 = -3.02f)
                horizontalLineToRelative(dx = 3.23f)
                curveToRelative(dx1 = 2.29f, dy1 = 0.0f, dx2 = 3.02f, dy2 = 0.73f, dx3 = 3.02f, dy3 = 3.02f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.63f, y = 10.38f)
                verticalLineToRelative(dy = 3.24f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.28f, dx2 = -0.73f, dy2 = 3.01f, dx3 = -3.01f, dy3 = 3.01f)
                horizontalLineToRelative(dx = -3.24f)
                curveToRelative(dx1 = -2.28f, dy1 = 0.0f, dx2 = -3.01f, dy2 = -0.73f, dx3 = -3.01f, dy3 = -3.0f)
                verticalLineToRelative(dy = -3.25f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.28f, dx2 = 0.73f, dy2 = -3.0f, dx3 = 3.01f, dy3 = -3.0f)
                horizontalLineToRelative(dx = 3.24f)
                curveToRelative(dx1 = 2.28f, dy1 = 0.0f, dx2 = 3.01f, dy2 = 0.72f, dx3 = 3.01f, dy3 = 3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.02f, y = 18.13f)
                verticalLineToRelative(dy = 0.1f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.29f, dx2 = -0.73f, dy2 = 3.02f, dx3 = -3.02f, dy3 = 3.02f)
                horizontalLineTo(x = 5.77f)
                curveToRelative(dx1 = -2.29f, dy1 = 0.0f, dx2 = -3.02f, dy2 = -0.73f, dx3 = -3.02f, dy3 = -3.02f)
                verticalLineTo(y = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.29f, dx2 = 0.73f, dy2 = -3.02f, dx3 = 3.02f, dy3 = -3.02f)
                horizontalLineToRelative(dx = 0.1f)
                verticalLineToRelative(dy = 1.64f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.12f, dx2 = 1.39f, dy2 = 4.51f, dx3 = 4.51f, dy3 = 4.51f)
                close()
            }
        }.build().also { _forwardItem = it }
    }

@Suppress("ObjectPropertyName")
private var _forwardItem: ImageVector? = null
