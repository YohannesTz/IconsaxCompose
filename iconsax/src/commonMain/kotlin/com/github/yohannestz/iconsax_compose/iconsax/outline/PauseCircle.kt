package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 11.97f, y = 22.75f)
                curveTo(x1 = 6.05f, y1 = 22.75f, x2 = 1.22f, y2 = 17.93f, x3 = 1.22f, y3 = 12.0f)
                reflectiveCurveTo(x1 = 6.05f, y1 = 1.25f, x2 = 11.97f, y2 = 1.25f)
                reflectiveCurveTo(x1 = 22.72f, y1 = 6.07f, x2 = 22.72f, y2 = 12.0f)
                reflectiveCurveTo(x1 = 17.9f, y1 = 22.75f, x2 = 11.97f, y2 = 22.75f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.01f, y = 15.95f)
                horizontalLineToRelative(dx = -1.3f)
                curveToRelative(dx1 = -0.92f, dy1 = 0.0f, dx2 = -1.46f, dy2 = -0.53f, dx3 = -1.46f, dy3 = -1.42f)
                verticalLineTo(y = 9.47f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.89f, dx2 = 0.55f, dy2 = -1.42f, dx3 = 1.46f, dy3 = -1.42f)
                horizontalLineTo(x = 10.0f)
                curveToRelative(dx1 = 0.92f, dy1 = 0.0f, dx2 = 1.46f, dy2 = 0.53f, dx3 = 1.46f, dy3 = 1.42f)
                verticalLineToRelative(dy = 5.06f)
                curveToRelative(dx1 = 0.01f, dy1 = 0.89f, dx2 = -0.54f, dy2 = 1.42f, dx3 = -1.45f, dy3 = 1.42f)
                moveToRelative(dx = -1.26f, dy = -1.5f)
                horizontalLineToRelative(dx = 1.22f)
                verticalLineToRelative(dy = -4.9f)
                horizontalLineTo(x = 8.76f)
                close()
                moveToRelative(dx = 6.54f, dy = 1.5f)
                horizontalLineTo(x = 14.0f)
                curveToRelative(dx1 = -0.92f, dy1 = 0.0f, dx2 = -1.46f, dy2 = -0.53f, dx3 = -1.46f, dy3 = -1.42f)
                verticalLineTo(y = 9.47f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.89f, dx2 = 0.55f, dy2 = -1.42f, dx3 = 1.46f, dy3 = -1.42f)
                horizontalLineToRelative(dx = 1.29f)
                curveToRelative(dx1 = 0.92f, dy1 = 0.0f, dx2 = 1.46f, dy2 = 0.53f, dx3 = 1.46f, dy3 = 1.42f)
                verticalLineToRelative(dy = 5.06f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.89f, dx2 = -0.55f, dy2 = 1.42f, dx3 = -1.46f, dy3 = 1.42f)
                moveToRelative(dx = -1.26f, dy = -1.5f)
                horizontalLineToRelative(dx = 1.22f)
                verticalLineToRelative(dy = -4.9f)
                horizontalLineToRelative(dx = -1.21f)
                close()
            }
        }.build().also { _pauseCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _pauseCircle: ImageVector? = null
