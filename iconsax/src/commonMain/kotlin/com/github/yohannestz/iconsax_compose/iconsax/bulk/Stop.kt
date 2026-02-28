package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stop: ImageVector
    get() {
        val current = _stop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Stop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.9f, y = 7.66f)
                lineToRelative(dx = -0.78f, dy = 0.47f)
                lineToRelative(dx = -0.49f, dy = 0.3f)
                lineToRelative(dx = -0.93f, dy = 0.55f)
                lineToRelative(dx = -13.94f, dy = 8.36f)
                lineToRelative(dx = -0.09f, dy = 0.05f)
                lineToRelative(dx = -0.53f, dy = 0.32f)
                lineToRelative(dx = -0.61f, dy = 0.37f)
                arcTo(horizontalEllipseRadius = 9.0f, verticalEllipseRadius = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.0f, y1 = 14.7f)
                verticalLineTo(y = 9.3f)
                curveTo(x1 = 3.0f, y1 = 4.8f, x2 = 4.8f, y2 = 3.0f, x3 = 9.3f, y3 = 3.0f)
                horizontalLineToRelative(dx = 5.4f)
                curveToRelative(dx1 = 3.91f, dy1 = 0.0f, dx2 = 5.78f, dy2 = 1.36f, dx3 = 6.2f, dy3 = 4.66f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.0f, y = 9.2f)
                verticalLineToRelative(dy = 5.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.5f, dx2 = -1.8f, dy2 = 6.3f, dx3 = -6.3f, dy3 = 6.3f)
                horizontalLineTo(x = 9.3f)
                curveToRelative(dx1 = -2.44f, dy1 = 0.0f, dx2 = -4.09f, dy2 = -0.53f, dx3 = -5.07f, dy3 = -1.74f)
                lineToRelative(dx = 0.3f, dy = -0.18f)
                lineToRelative(dx = 0.61f, dy = -0.37f)
                lineToRelative(dx = 0.53f, dy = -0.32f)
                lineToRelative(dx = 0.09f, dy = -0.05f)
                lineTo(x = 19.7f, y = 9.98f)
                lineToRelative(dx = 0.93f, dy = -0.55f)
                close()
            }
        }.build().also { _stop = it }
    }

@Suppress("ObjectPropertyName")
private var _stop: ImageVector? = null
