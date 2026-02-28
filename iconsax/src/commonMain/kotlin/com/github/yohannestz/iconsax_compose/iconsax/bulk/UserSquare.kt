package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineToRelative(dy = 8.38f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.81f, dx2 = -1.29f, dy2 = 4.74f, dx3 = -3.56f, dy3 = 5.47f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.19f, y1 = 22.0f)
                horizontalLineTo(x = 7.81f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.25f, dy1 = -0.34f)
                curveTo(x1 = 3.29f, y1 = 20.93f, x2 = 2.0f, y2 = 19.0f, x3 = 2.0f, y3 = 16.19f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 2.0f, y1 = 4.17f, x2 = 4.17f, y2 = 2.0f, x3 = 7.81f, y3 = 2.0f)
                horizontalLineToRelative(dx = 8.38f)
                curveTo(x1 = 19.83f, y1 = 2.0f, x2 = 22.0f, y2 = 4.17f, x3 = 22.0f, y3 = 7.81f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.44f, y = 21.66f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.19f, y1 = 22.0f)
                horizontalLineTo(x = 7.8f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.25f, dy1 = -0.34f)
                curveToRelative(dx1 = 0.35f, dy1 = -2.64f, dx2 = 3.1f, dy2 = -4.7f, dx3 = 6.44f, dy3 = -4.7f)
                curveToRelative(dx1 = 3.33f, dy1 = 0.0f, dx2 = 6.09f, dy2 = 2.06f, dx3 = 6.44f, dy3 = 4.7f)
                moveToRelative(dx = -2.86f, dy = -10.08f)
                arcToRelative(a = 3.58f, b = 3.58f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -7.17f, dy1 = 0.01f)
                arcToRelative(a = 3.58f, b = 3.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.17f, dy1 = -0.01f)
            }
        }.build().also { _userSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _userSquare: ImageVector? = null
