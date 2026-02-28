package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignHorizontally: ImageVector
    get() {
        val current = _alignHorizontally
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignHorizontally",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 4.75f, y = 17.4f)
                verticalLineTo(y = 6.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = 0.64f, dy2 = -2.1f, dx3 = 2.23f, dy3 = -2.1f)
                horizontalLineToRelative(dx = 1.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = 0.6f, dx3 = 2.23f, dy3 = 2.1f)
                verticalLineToRelative(dy = 10.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = -0.64f, dy2 = 2.1f, dx3 = -2.23f, dy3 = 2.1f)
                horizontalLineTo(x = 6.98f)
                curveToRelative(dx1 = -1.59f, dy1 = 0.0f, dx2 = -2.23f, dy2 = -0.6f, dx3 = -2.23f, dy3 = -2.1f)
                moveToRelative(dx = 0.0f, dy = -4.65f)
                horizontalLineToRelative(dx = -2.0f)
                curveTo(x1 = 2.34f, y1 = 12.75f, x2 = 2.0f, y2 = 12.41f, x3 = 2.0f, y3 = 12.0f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 2.0f)
                close()
                moveToRelative(dx = 8.5f, dy = -1.5f)
                horizontalLineToRelative(dx = -3.0f)
                verticalLineToRelative(dy = 1.5f)
                horizontalLineToRelative(dx = 3.0f)
                close()
                moveToRelative(dx = 8.0f, dy = 1.5f)
                horizontalLineToRelative(dx = -2.5f)
                verticalLineToRelative(dy = -1.5f)
                horizontalLineToRelative(dx = 2.5f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -8.0f, dy = 2.65f)
                verticalLineTo(y = 8.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = 0.64f, dy2 = -2.1f, dx3 = 2.23f, dy3 = -2.1f)
                horizontalLineToRelative(dx = 1.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = 0.6f, dx3 = 2.23f, dy3 = 2.1f)
                verticalLineToRelative(dy = 6.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = -0.64f, dy2 = 2.1f, dx3 = -2.23f, dy3 = 2.1f)
                horizontalLineToRelative(dx = -1.04f)
                curveToRelative(dx1 = -1.59f, dy1 = 0.0f, dx2 = -2.23f, dy2 = -0.6f, dx3 = -2.23f, dy3 = -2.1f)
            }
        }.build().also { _alignHorizontally = it }
    }

@Suppress("ObjectPropertyName")
private var _alignHorizontally: ImageVector? = null
