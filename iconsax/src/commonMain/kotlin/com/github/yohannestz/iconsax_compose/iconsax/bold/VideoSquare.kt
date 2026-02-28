package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoSquare: ImageVector
    get() {
        val current = _videoSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoSquare",
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
                moveToRelative(dx = -1.53f, dy = 11.73f)
                lineToRelative(dx = -1.28f, dy = 0.74f)
                lineToRelative(dx = -1.28f, dy = 0.74f)
                curveToRelative(dx1 = -1.65f, dy1 = 0.95f, dx2 = -3.0f, dy2 = 0.17f, dx3 = -3.0f, dy3 = -1.73f)
                verticalLineToRelative(dy = -2.96f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.91f, dx2 = 1.35f, dy2 = -2.68f, dx3 = 3.0f, dy3 = -1.73f)
                lineToRelative(dx = 1.28f, dy = 0.74f)
                lineToRelative(dx = 1.28f, dy = 0.74f)
                curveToRelative(dx1 = 1.65f, dy1 = 0.95f, dx2 = 1.65f, dy2 = 2.51f, dx3 = 0.0f, dy3 = 3.46f)
            }
        }.build().also { _videoSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _videoSquare: ImageVector? = null
