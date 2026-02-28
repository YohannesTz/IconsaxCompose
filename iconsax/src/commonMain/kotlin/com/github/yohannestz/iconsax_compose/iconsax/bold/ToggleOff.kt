package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToggleOff: ImageVector
    get() {
        val current = _toggleOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ToggleOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.65f, y = 3.86f)
                horizontalLineToRelative(dx = -9.3f)
                curveTo(x1 = 3.25f, y1 = 3.86f, x2 = 2.0f, y2 = 5.11f, x3 = 2.0f, y3 = 9.21f)
                verticalLineToRelative(dy = 5.58f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.1f, dx2 = 1.25f, dy2 = 5.35f, dx3 = 5.35f, dy3 = 5.35f)
                horizontalLineToRelative(dx = 9.3f)
                curveToRelative(dx1 = 4.1f, dy1 = 0.0f, dx2 = 5.35f, dy2 = -1.25f, dx3 = 5.35f, dy3 = -5.35f)
                verticalLineTo(y = 9.21f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.1f, dx2 = -1.25f, dy2 = -5.35f, dx3 = -5.35f, dy3 = -5.35f)
                moveToRelative(dx = -2.56f, dy = 9.26f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.25f, dx2 = -1.05f, dy2 = 3.3f, dx3 = -3.3f, dy3 = 3.3f)
                horizontalLineTo(x = 8.56f)
                curveToRelative(dx1 = -2.25f, dy1 = 0.0f, dx2 = -3.3f, dy2 = -1.05f, dx3 = -3.3f, dy3 = -3.3f)
                verticalLineToRelative(dy = -2.23f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.25f, dx2 = 1.05f, dy2 = -3.3f, dx3 = 3.3f, dy3 = -3.3f)
                horizontalLineToRelative(dx = 2.23f)
                curveToRelative(dx1 = 2.25f, dy1 = 0.0f, dx2 = 3.3f, dy2 = 1.05f, dx3 = 3.3f, dy3 = 3.3f)
                close()
            }
        }.build().also { _toggleOff = it }
    }

@Suppress("ObjectPropertyName")
private var _toggleOff: ImageVector? = null
