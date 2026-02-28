package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
                moveToRelative(dx = 2.31f, dy = 14.4f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = -0.6f, dy2 = 2.1f, dx3 = -2.1f, dy3 = 2.1f)
                horizontalLineToRelative(dx = -3.8f)
                curveToRelative(dx1 = -1.5f, dy1 = 0.0f, dx2 = -2.1f, dy2 = -0.6f, dx3 = -2.1f, dy3 = -2.1f)
                verticalLineToRelative(dy = -1.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = 0.6f, dy2 = -2.1f, dx3 = 2.1f, dy3 = -2.1f)
                horizontalLineToRelative(dx = 3.8f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 2.1f, dy2 = 0.6f, dx3 = 2.1f, dy3 = 2.1f)
                close()
            }
        }.build().also { _screenmirroring = it }
    }

@Suppress("ObjectPropertyName")
private var _screenmirroring: ImageVector? = null
