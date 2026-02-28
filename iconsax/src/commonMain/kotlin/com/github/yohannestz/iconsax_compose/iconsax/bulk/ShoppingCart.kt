package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShoppingCart: ImageVector
    get() {
        val current = _shoppingCart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ShoppingCart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.25f, y = 22.5f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.5f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.5f)
                moveToRelative(dx = -8.0f, dy = 0.0f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.5f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 4.84f, y = 3.94f)
                lineToRelative(dx = -0.2f, dy = 2.45f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.8f, dy1 = 0.86f)
                horizontalLineToRelative(dx = 15.31f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.8f, dy1 = -0.74f)
                arcToRelative(a = 2.96f, b = 2.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.99f, dy1 = -3.21f)
                horizontalLineTo(x = 6.29f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.61f, dy1 = -1.21f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.91f, dy1 = -0.84f)
                horizontalLineTo(x = 2.0f)
                curveTo(x1 = 1.59f, y1 = 1.25f, x2 = 1.25f, y2 = 1.59f, x3 = 1.25f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 2.75f, x2 = 2.0f, y2 = 2.75f)
                horizontalLineToRelative(dx = 1.74f)
                quadTo(x1 = 4.22f, y1 = 2.76f, x2 = 4.55f, y2 = 3.1f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = 0.84f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.51f, y = 8.75f)
                horizontalLineTo(x = 5.17f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = 0.73f)
                lineToRelative(dx = -0.36f, dy = 4.35f)
                arcTo(horizontalEllipseRadius = 2.93f, verticalEllipseRadius = 2.93f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.92f, y1 = 17.0f)
                horizontalLineToRelative(dx = 11.12f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.93f, dy1 = -2.73f)
                lineTo(x = 21.3f, y = 9.6f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.79f, dy1 = -0.85f)
            }
        }.build().also { _shoppingCart = it }
    }

@Suppress("ObjectPropertyName")
private var _shoppingCart: ImageVector? = null
