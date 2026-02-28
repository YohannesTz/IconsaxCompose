package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 11.97f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.72f, y = 15.03f)
                verticalLineTo(y = 8.97f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.48f, dx2 = -0.2f, dy2 = -0.67f, dx3 = -0.71f, dy3 = -0.67f)
                horizontalLineToRelative(dx = -1.3f)
                curveTo(x1 = 8.2f, y1 = 8.3f, x2 = 8.0f, y2 = 8.49f, x3 = 8.0f, y3 = 8.97f)
                verticalLineToRelative(dy = 6.06f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.48f, dx2 = 0.2f, dy2 = 0.67f, dx3 = 0.71f, dy3 = 0.67f)
                horizontalLineTo(x = 10.0f)
                curveToRelative(dx1 = 0.52f, dy1 = 0.0f, dx2 = 0.72f, dy2 = -0.19f, dx3 = 0.72f, dy3 = -0.67f)
                moveToRelative(dx = 5.28f, dy = 0.0f)
                verticalLineTo(y = 8.97f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.48f, dx2 = -0.2f, dy2 = -0.67f, dx3 = -0.71f, dy3 = -0.67f)
                horizontalLineTo(x = 14.0f)
                curveToRelative(dx1 = -0.51f, dy1 = 0.0f, dx2 = -0.71f, dy2 = 0.19f, dx3 = -0.71f, dy3 = 0.67f)
                verticalLineToRelative(dy = 6.06f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.48f, dx2 = 0.2f, dy2 = 0.67f, dx3 = 0.71f, dy3 = 0.67f)
                horizontalLineToRelative(dx = 1.29f)
                curveToRelative(dx1 = 0.51f, dy1 = 0.0f, dx2 = 0.71f, dy2 = -0.19f, dx3 = 0.71f, dy3 = -0.67f)
            }
        }.build().also { _pauseCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _pauseCircle: ImageVector? = null
