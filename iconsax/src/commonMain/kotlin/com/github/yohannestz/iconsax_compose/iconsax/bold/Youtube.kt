package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Youtube: ImageVector
    get() {
        val current = _youtube
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Youtube",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.0f, y = 4.0f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 4.0f, y1 = 4.0f, x2 = 2.0f, y2 = 6.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 2.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -2.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                moveToRelative(dx = -3.11f, dy = 9.03f)
                lineToRelative(dx = -2.47f, dy = 1.48f)
                curveToRelative(dx1 = -1.0f, dy1 = 0.6f, dx2 = -1.82f, dy2 = 0.14f, dx3 = -1.82f, dy3 = -1.03f)
                verticalLineToRelative(dy = -2.97f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.17f, dx2 = 0.82f, dy2 = -1.63f, dx3 = 1.82f, dy3 = -1.03f)
                lineToRelative(dx = 2.47f, dy = 1.48f)
                curveToRelative(dx1 = 0.95f, dy1 = 0.58f, dx2 = 0.95f, dy2 = 1.5f, dx3 = 0.0f, dy3 = 2.07f)
            }
        }.build().also { _youtube = it }
    }

@Suppress("ObjectPropertyName")
private var _youtube: ImageVector? = null
