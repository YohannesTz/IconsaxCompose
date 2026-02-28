package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShoppingBag: ImageVector
    get() {
        val current = _shoppingBag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ShoppingBag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 8.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.25f, y1 = 8.0f)
                verticalLineTo(y = 4.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.08f, dx2 = -0.67f, dy2 = -1.75f, dx3 = -1.75f, dy3 = -1.75f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -1.08f, dy1 = 0.0f, dx2 = -1.75f, dy2 = 0.67f, dx3 = -1.75f, dy3 = 1.75f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 7.25f, y1 = 8.41f, x2 = 7.25f, y2 = 8.0f)
                verticalLineTo(y = 4.5f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.25f, dy1 = -3.25f)
                horizontalLineToRelative(dx = 3.0f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.25f, dy1 = 3.25f)
                verticalLineTo(y = 8.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 8.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.0f, y = 17.78f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 11.76f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = -0.56f)
                lineToRelative(dx = -0.68f, dy = -5.69f)
                curveTo(x1 = 19.34f, y1 = 8.09f, x2 = 19.0f, y2 = 6.5f, x3 = 15.6f, y3 = 6.5f)
                horizontalLineTo(x = 8.4f)
                curveToRelative(dx1 = -3.4f, dy1 = 0.0f, dx2 = -3.74f, dy2 = 1.59f, dx3 = -3.97f, dy3 = 3.53f)
                lineToRelative(dx = -0.9f, dy = 7.5f)
                curveTo(x1 = 3.24f, y1 = 19.99f, x2 = 4.0f, y2 = 22.0f, x3 = 7.51f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.98f)
                curveToRelative(dx1 = 3.16f, dy1 = 0.0f, dx2 = 4.09f, dy2 = -1.63f, dx3 = 4.04f, dy3 = -3.75f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = -0.47f)
                close()
            }
        }.build().also { _shoppingBag = it }
    }

@Suppress("ObjectPropertyName")
private var _shoppingBag: ImageVector? = null
