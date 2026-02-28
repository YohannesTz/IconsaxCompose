package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GridSix: ImageVector
    get() {
        val current = _gridSix
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GridSix",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 7.75f)
                horizontalLineTo(x = 9.75f)
                verticalLineToRelative(dy = -5.8f)
                horizontalLineToRelative(dx = 6.44f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = 2.17f, dx3 = 5.81f, dy3 = 5.8f)
                moveToRelative(dx = 0.0f, dy = 8.5f)
                curveToRelative(dx1 = -0.05f, dy1 = 3.57f, dx2 = -2.21f, dy2 = 5.7f, dx3 = -5.81f, dy3 = 5.7f)
                horizontalLineTo(x = 9.75f)
                verticalLineToRelative(dy = -5.7f)
                close()
                moveTo(x = 8.25f, y = 1.95f)
                verticalLineToRelative(dy = 20.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 21.95f, x2 = 2.0f, y2 = 19.78f, x3 = 2.0f, y3 = 16.14f)
                verticalLineTo(y = 7.76f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.64f, dx2 = 2.17f, dy2 = -5.81f, dx3 = 5.81f, dy3 = -5.81f)
                close()
                moveTo(x = 22.0f, y = 9.25f)
                horizontalLineTo(x = 9.75f)
                verticalLineToRelative(dy = 5.5f)
                horizontalLineTo(x = 22.0f)
                close()
            }
        }.build().also { _gridSix = it }
    }

@Suppress("ObjectPropertyName")
private var _gridSix: ImageVector? = null
