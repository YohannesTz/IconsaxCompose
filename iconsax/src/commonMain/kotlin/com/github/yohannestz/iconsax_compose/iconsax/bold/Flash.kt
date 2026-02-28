package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Flash: ImageVector
    get() {
        val current = _flash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Flash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.91f, y = 10.72f)
                horizontalLineToRelative(dx = -3.09f)
                verticalLineToRelative(dy = -7.2f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.68f, dx2 = -0.91f, dy2 = -2.02f, dx3 = -2.02f, dy3 = -0.76f)
                lineTo(x = 12.0f, y = 3.67f)
                lineToRelative(dx = -6.77f, dy = 7.7f)
                curveToRelative(dx1 = -0.93f, dy1 = 1.05f, dx2 = -0.54f, dy2 = 1.91f, dx3 = 0.86f, dy3 = 1.91f)
                horizontalLineToRelative(dx = 3.09f)
                verticalLineToRelative(dy = 7.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.68f, dx2 = 0.91f, dy2 = 2.02f, dx3 = 2.02f, dy3 = 0.76f)
                lineToRelative(dx = 0.8f, dy = -0.91f)
                lineToRelative(dx = 6.77f, dy = -7.7f)
                curveToRelative(dx1 = 0.93f, dy1 = -1.05f, dx2 = 0.54f, dy2 = -1.91f, dx3 = -0.86f, dy3 = -1.91f)
            }
        }.build().also { _flash = it }
    }

@Suppress("ObjectPropertyName")
private var _flash: ImageVector? = null
