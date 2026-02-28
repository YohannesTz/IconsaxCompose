package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Screenmirroring: ImageVector
    get() {
        val current = _screenmirroring
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Screenmirroring",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.43f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -2.32f, dx3 = -7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.43f, dx2 = 2.32f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.43f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 2.32f, dx3 = 7.75f, dy3 = 7.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.32f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 4.39f, y1 = 2.75f, x2 = 2.75f, y2 = 4.39f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.61f, dx2 = -1.64f, dy2 = -6.25f, dx3 = -6.25f, dy3 = -6.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.4f, y = 19.25f)
                horizontalLineToRelative(dx = -3.8f)
                quadToRelative(dx1 = -2.87f, dy1 = 0.02f, dx2 = -2.85f, dy2 = -2.85f)
                verticalLineToRelative(dy = -1.8f)
                quadToRelative(dx1 = -0.02f, dy1 = -2.87f, dx2 = 2.85f, dy2 = -2.85f)
                horizontalLineToRelative(dx = 3.8f)
                quadToRelative(dx1 = 2.87f, dy1 = -0.02f, dx2 = 2.85f, dy2 = 2.85f)
                verticalLineToRelative(dy = 1.8f)
                quadToRelative(dx1 = 0.02f, dy1 = 2.87f, dx2 = -2.85f, dy2 = 2.85f)
                moveToRelative(dx = -3.8f, dy = -6.0f)
                curveToRelative(dx1 = -1.08f, dy1 = 0.0f, dx2 = -1.35f, dy2 = 0.27f, dx3 = -1.35f, dy3 = 1.35f)
                verticalLineToRelative(dy = 1.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.08f, dx2 = 0.27f, dy2 = 1.35f, dx3 = 1.35f, dy3 = 1.35f)
                horizontalLineToRelative(dx = 3.8f)
                curveToRelative(dx1 = 1.08f, dy1 = 0.0f, dx2 = 1.35f, dy2 = -0.27f, dx3 = 1.35f, dy3 = -1.35f)
                verticalLineToRelative(dy = -1.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.08f, dx2 = -0.27f, dy2 = -1.35f, dx3 = -1.35f, dy3 = -1.35f)
                close()
            }
        }.build().also { _screenmirroring = it }
    }

@Suppress("ObjectPropertyName")
private var _screenmirroring: ImageVector? = null
