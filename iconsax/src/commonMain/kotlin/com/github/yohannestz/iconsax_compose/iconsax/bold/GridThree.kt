package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GridThree: ImageVector
    get() {
        val current = _gridThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GridThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineToRelative(dx = -3.44f)
                verticalLineToRelative(dy = 11.75f)
                horizontalLineTo(x = 22.0f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
                moveTo(x = 2.0f, y = 10.25f)
                verticalLineToRelative(dy = 5.94f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 3.44f)
                verticalLineTo(y = 10.25f)
                close()
                moveTo(x = 11.25f, y = 2.0f)
                verticalLineToRelative(dy = 6.75f)
                horizontalLineTo(x = 2.0f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 2.0f, y1 = 4.17f, x2 = 4.17f, y2 = 2.0f, x3 = 7.81f, y3 = 2.0f)
                close()
                moveTo(x = 22.0f, y = 15.25f)
                verticalLineToRelative(dy = 0.94f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = -2.17f, dy2 = 5.81f, dx3 = -5.81f, dy3 = 5.81f)
                horizontalLineToRelative(dx = -3.44f)
                verticalLineToRelative(dy = -6.75f)
                close()
            }
        }.build().also { _gridThree = it }
    }

@Suppress("ObjectPropertyName")
private var _gridThree: ImageVector? = null
