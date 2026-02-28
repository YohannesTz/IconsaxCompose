package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StopCircle: ImageVector
    get() {
        val current = _stopCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.StopCircle",
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
                moveTo(x = 13.27f, y = 16.98f)
                horizontalLineToRelative(dx = -2.54f)
                curveToRelative(dx1 = -2.53f, dy1 = 0.0f, dx2 = -3.71f, dy2 = -1.18f, dx3 = -3.71f, dy3 = -3.71f)
                verticalLineToRelative(dy = -2.54f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.53f, dx2 = 1.18f, dy2 = -3.71f, dx3 = 3.71f, dy3 = -3.71f)
                horizontalLineToRelative(dx = 2.54f)
                curveToRelative(dx1 = 2.53f, dy1 = 0.0f, dx2 = 3.71f, dy2 = 1.18f, dx3 = 3.71f, dy3 = 3.71f)
                verticalLineToRelative(dy = 2.54f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.53f, dx2 = -1.18f, dy2 = 3.71f, dx3 = -3.71f, dy3 = 3.71f)
                moveToRelative(dx = -2.54f, dy = -8.46f)
                curveToRelative(dx1 = -1.69f, dy1 = 0.0f, dx2 = -2.21f, dy2 = 0.52f, dx3 = -2.21f, dy3 = 2.21f)
                verticalLineToRelative(dy = 2.54f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.69f, dx2 = 0.52f, dy2 = 2.21f, dx3 = 2.21f, dy3 = 2.21f)
                horizontalLineToRelative(dx = 2.54f)
                curveToRelative(dx1 = 1.69f, dy1 = 0.0f, dx2 = 2.21f, dy2 = -0.52f, dx3 = 2.21f, dy3 = -2.21f)
                verticalLineToRelative(dy = -2.54f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.69f, dx2 = -0.52f, dy2 = -2.21f, dx3 = -2.21f, dy3 = -2.21f)
                close()
            }
        }.build().also { _stopCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _stopCircle: ImageVector? = null
