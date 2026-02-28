package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PauseCircle: ImageVector
    get() {
        val current = _pauseCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PauseCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.97f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = -1.25f, dy = 13.03f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.48f, dx2 = -0.2f, dy2 = 0.67f, dx3 = -0.71f, dy3 = 0.67f)
                horizontalLineTo(x = 8.7f)
                curveTo(x1 = 8.2f, y1 = 15.7f, x2 = 8.0f, y2 = 15.51f, x3 = 8.0f, y3 = 15.03f)
                verticalLineTo(y = 8.97f)
                curveTo(x1 = 8.0f, y1 = 8.49f, x2 = 8.2f, y2 = 8.3f, x3 = 8.7f, y3 = 8.3f)
                horizontalLineTo(x = 10.0f)
                curveToRelative(dx1 = 0.5f, dy1 = 0.0f, dx2 = 0.7f, dy2 = 0.19f, dx3 = 0.7f, dy3 = 0.67f)
                verticalLineToRelative(dy = 6.06f)
                close()
                moveToRelative(dx = 5.28f, dy = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.48f, dx2 = -0.2f, dy2 = 0.67f, dx3 = -0.71f, dy3 = 0.67f)
                horizontalLineToRelative(dx = -1.3f)
                curveToRelative(dx1 = -0.5f, dy1 = 0.0f, dx2 = -0.7f, dy2 = -0.19f, dx3 = -0.7f, dy3 = -0.67f)
                verticalLineTo(y = 8.97f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.48f, dx2 = 0.2f, dy2 = -0.67f, dx3 = 0.7f, dy3 = -0.67f)
                horizontalLineToRelative(dx = 1.3f)
                curveToRelative(dx1 = 0.5f, dy1 = 0.0f, dx2 = 0.7f, dy2 = 0.19f, dx3 = 0.7f, dy3 = 0.67f)
                close()
            }
        }.build().also { _pauseCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _pauseCircle: ImageVector? = null
