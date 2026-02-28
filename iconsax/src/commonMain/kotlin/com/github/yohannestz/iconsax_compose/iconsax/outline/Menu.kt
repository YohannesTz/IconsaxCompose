package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Menu: ImageVector
    get() {
        val current = _menu
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Menu",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.54f, y = 9.06f)
                arcToRelative(a = 3.21f, b = 3.21f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.43f)
                arcToRelative(a = 3.21f, b = 3.21f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.43f)
                moveToRelative(dx = 0.0f, dy = -4.93f)
                curveToRelative(dx1 = -0.94f, dy1 = 0.0f, dx2 = -1.71f, dy2 = 0.77f, dx3 = -1.71f, dy3 = 1.71f)
                reflectiveCurveToRelative(dx1 = 0.77f, dy1 = 1.71f, dx2 = 1.71f, dy2 = 1.71f)
                reflectiveCurveToRelative(dx1 = 1.71f, dy1 = -0.77f, dx2 = 1.71f, dy2 = -1.71f)
                reflectiveCurveToRelative(dx1 = -0.77f, dy1 = -1.71f, dx2 = -1.71f, dy2 = -1.71f)
                moveTo(x = 6.46f, y = 9.06f)
                arcToRelative(a = 3.21f, b = 3.21f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.43f)
                arcToRelative(a = 3.21f, b = 3.21f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.43f)
                moveToRelative(dx = 0.0f, dy = -4.93f)
                curveToRelative(dx1 = -0.94f, dy1 = 0.0f, dx2 = -1.71f, dy2 = 0.77f, dx3 = -1.71f, dy3 = 1.71f)
                reflectiveCurveToRelative(dx1 = 0.77f, dy1 = 1.71f, dx2 = 1.71f, dy2 = 1.71f)
                reflectiveCurveToRelative(dx1 = 1.71f, dy1 = -0.77f, dx2 = 1.71f, dy2 = -1.71f)
                reflectiveCurveToRelative(dx1 = -0.76f, dy1 = -1.71f, dx2 = -1.71f, dy2 = -1.71f)
                moveToRelative(dx = 11.08f, dy = 17.24f)
                arcToRelative(a = 3.21f, b = 3.21f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.43f)
                arcToRelative(a = 3.21f, b = 3.21f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.43f)
                moveToRelative(dx = 0.0f, dy = -4.93f)
                curveToRelative(dx1 = -0.94f, dy1 = 0.0f, dx2 = -1.71f, dy2 = 0.77f, dx3 = -1.71f, dy3 = 1.71f)
                reflectiveCurveToRelative(dx1 = 0.77f, dy1 = 1.71f, dx2 = 1.71f, dy2 = 1.71f)
                reflectiveCurveToRelative(dx1 = 1.71f, dy1 = -0.77f, dx2 = 1.71f, dy2 = -1.71f)
                reflectiveCurveToRelative(dx1 = -0.77f, dy1 = -1.71f, dx2 = -1.71f, dy2 = -1.71f)
                moveTo(x = 6.46f, y = 21.37f)
                arcToRelative(a = 3.21f, b = 3.21f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.43f)
                arcToRelative(a = 3.21f, b = 3.21f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.43f)
                moveToRelative(dx = 0.0f, dy = -4.93f)
                curveToRelative(dx1 = -0.94f, dy1 = 0.0f, dx2 = -1.71f, dy2 = 0.77f, dx3 = -1.71f, dy3 = 1.71f)
                reflectiveCurveToRelative(dx1 = 0.77f, dy1 = 1.71f, dx2 = 1.71f, dy2 = 1.71f)
                reflectiveCurveToRelative(dx1 = 1.71f, dy1 = -0.77f, dx2 = 1.71f, dy2 = -1.71f)
                reflectiveCurveToRelative(dx1 = -0.76f, dy1 = -1.71f, dx2 = -1.71f, dy2 = -1.71f)
            }
        }.build().also { _menu = it }
    }

@Suppress("ObjectPropertyName")
private var _menu: ImageVector? = null
