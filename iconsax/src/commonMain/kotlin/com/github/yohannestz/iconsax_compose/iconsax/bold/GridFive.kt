package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GridFive: ImageVector
    get() {
        val current = _gridFive
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GridFive",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.25f, y = 2.0f)
                verticalLineToRelative(dy = 20.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 22.0f, x2 = 2.0f, y2 = 19.83f, x3 = 2.0f, y3 = 16.19f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 2.0f, y1 = 4.17f, x2 = 4.17f, y2 = 2.0f, x3 = 7.81f, y3 = 2.0f)
                close()
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineToRelative(dy = 3.44f)
                horizontalLineTo(x = 9.75f)
                verticalLineTo(y = 2.0f)
                horizontalLineToRelative(dx = 6.44f)
                curveTo(x1 = 19.83f, y1 = 2.0f, x2 = 22.0f, y2 = 4.17f, x3 = 22.0f, y3 = 7.81f)
                moveToRelative(dx = 0.0f, dy = 4.94f)
                verticalLineToRelative(dy = 3.44f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = -2.17f, dy2 = 5.81f, dx3 = -5.81f, dy3 = 5.81f)
                horizontalLineTo(x = 9.75f)
                verticalLineToRelative(dy = -9.25f)
                close()
            }
        }.build().also { _gridFive = it }
    }

@Suppress("ObjectPropertyName")
private var _gridFive: ImageVector? = null
