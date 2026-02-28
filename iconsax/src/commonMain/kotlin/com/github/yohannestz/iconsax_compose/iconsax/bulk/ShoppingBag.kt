package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.49f, y = 22.0f)
                horizontalLineTo(x = 7.51f)
                curveTo(x1 = 4.0f, y1 = 22.0f, x2 = 3.24f, y2 = 19.99f, x3 = 3.53f, y3 = 17.53f)
                lineToRelative(dx = 0.9f, dy = -7.5f)
                curveTo(x1 = 4.66f, y1 = 8.09f, x2 = 5.0f, y2 = 6.5f, x3 = 8.4f, y3 = 6.5f)
                horizontalLineToRelative(dx = 7.2f)
                curveToRelative(dx1 = 3.4f, dy1 = 0.0f, dx2 = 3.74f, dy2 = 1.59f, dx3 = 3.97f, dy3 = 3.53f)
                lineToRelative(dx = 0.75f, dy = 6.25f)
                lineToRelative(dx = 0.15f, dy = 1.25f)
                lineToRelative(dx = 0.03f, dy = 0.24f)
                curveToRelative(dx1 = 0.21f, dy1 = 2.35f, dx2 = -0.61f, dy2 = 4.23f, dx3 = -4.01f, dy3 = 4.23f)
            }
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
                moveToRelative(dx = 4.5f, dy = 9.02f)
                lineToRelative(dx = -0.09f, dy = 0.01f)
                horizontalLineTo(x = 8.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 12.32f)
                lineToRelative(dx = 0.15f, dy = 1.25f)
                close()
            }
        }.build().also { _shoppingBag = it }
    }

@Suppress("ObjectPropertyName")
private var _shoppingBag: ImageVector? = null
