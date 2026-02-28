package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignVertically: ImageVector
    get() {
        val current = _alignVertically
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignVertically",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.4f, y = 19.25f)
                horizontalLineTo(x = 6.6f)
                curveToRelative(dx1 = -1.5f, dy1 = 0.0f, dx2 = -2.1f, dy2 = -0.64f, dx3 = -2.1f, dy3 = -2.23f)
                verticalLineToRelative(dy = -1.04f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.59f, dx2 = 0.6f, dy2 = -2.23f, dx3 = 2.1f, dy3 = -2.23f)
                horizontalLineToRelative(dx = 10.8f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 2.1f, dy2 = 0.64f, dx3 = 2.1f, dy3 = 2.23f)
                verticalLineToRelative(dy = 1.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.59f, dx2 = -0.6f, dy2 = 2.23f, dx3 = -2.1f, dy3 = 2.23f)
                moveToRelative(dx = -4.65f, dy = 0.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -2.0f)
                close()
                moveToRelative(dx = 0.0f, dy = -8.5f)
                horizontalLineToRelative(dx = -1.5f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineToRelative(dx = 1.5f)
                close()
                moveToRelative(dx = 0.0f, dy = -8.0f)
                verticalLineToRelative(dy = 2.5f)
                horizontalLineToRelative(dx = -1.5f)
                verticalLineToRelative(dy = -2.5f)
                curveTo(x1 = 11.25f, y1 = 2.34f, x2 = 11.59f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                moveToRelative(dx = 2.65f, dy = 8.0f)
                horizontalLineTo(x = 8.6f)
                curveToRelative(dx1 = -1.5f, dy1 = 0.0f, dx2 = -2.1f, dy2 = -0.64f, dx3 = -2.1f, dy3 = -2.23f)
                verticalLineTo(y = 7.48f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.59f, dx2 = 0.6f, dy2 = -2.23f, dx3 = 2.1f, dy3 = -2.23f)
                horizontalLineToRelative(dx = 6.8f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 2.1f, dy2 = 0.64f, dx3 = 2.1f, dy3 = 2.23f)
                verticalLineToRelative(dy = 1.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.59f, dx2 = -0.6f, dy2 = 2.23f, dx3 = -2.1f, dy3 = 2.23f)
            }
        }.build().also { _alignVertically = it }
    }

@Suppress("ObjectPropertyName")
private var _alignVertically: ImageVector? = null
