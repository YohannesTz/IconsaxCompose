package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserSquare: ImageVector
    get() {
        val current = _userSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.UserSquare",
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
                verticalLineToRelative(dy = 8.38f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.81f, dx2 = 1.29f, dy2 = 4.74f, dx3 = 3.56f, dy3 = 5.47f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.81f, y1 = 22.0f)
                horizontalLineToRelative(dx = 8.38f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.25f, dy1 = -0.34f)
                curveTo(x1 = 20.71f, y1 = 20.93f, x2 = 22.0f, y2 = 19.0f, x3 = 22.0f, y3 = 16.19f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
                moveToRelative(dx = 4.31f, dy = 14.19f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.21f, dx2 = -2.53f, dy2 = 4.05f)
                curveTo(x1 = 17.0f, y1 = 18.33f, x2 = 14.7f, y2 = 16.97f, x3 = 12.0f, y3 = 16.97f)
                reflectiveCurveToRelative(dx1 = -4.99f, dy1 = 1.35f, dx2 = -5.97f, dy2 = 3.27f)
                horizontalLineTo(x = 6.02f)
                quadTo(x1 = 3.51f, y1 = 19.42f, x2 = 3.5f, y2 = 16.2f)
                verticalLineTo(y = 7.81f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.82f, dx2 = 1.49f, dy2 = -4.31f, dx3 = 4.31f, dy3 = -4.31f)
                horizontalLineToRelative(dx = 8.38f)
                curveToRelative(dx1 = 2.82f, dy1 = 0.0f, dx2 = 4.31f, dy2 = 1.49f, dx3 = 4.31f, dy3 = 4.31f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 8.0f)
                arcToRelative(a = 3.58f, b = 3.58f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 7.15f)
                arcTo(horizontalEllipseRadius = 3.58f, verticalEllipseRadius = 3.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 8.0f)
            }
        }.build().also { _userSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _userSquare: ImageVector? = null
