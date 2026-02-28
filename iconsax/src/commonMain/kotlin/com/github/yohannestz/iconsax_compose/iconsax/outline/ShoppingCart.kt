package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 18.19f, y = 17.75f)
                horizontalLineTo(x = 7.54f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.61f, dy1 = -1.15f)
                arcTo(horizontalEllipseRadius = 3.6f, verticalEllipseRadius = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.0f, y1 = 13.9f)
                lineToRelative(dx = 0.83f, dy = -9.96f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.54f, y1 = 3.1f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.81f, dy1 = -0.35f)
                horizontalLineTo(x = 2.0f)
                curveTo(x1 = 1.59f, y1 = 2.75f, x2 = 1.25f, y2 = 2.41f, x3 = 1.25f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 1.25f, x2 = 2.0f, y2 = 1.25f)
                horizontalLineToRelative(dx = 1.74f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.49f, dy1 = 1.88f)
                horizontalLineToRelative(dx = 12.49f)
                arcToRelative(a = 3.52f, b = 3.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.55f, dy1 = 3.81f)
                lineToRelative(dx = -0.54f, dy = 7.5f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.54f, dy1 = 3.31f)
                moveTo(x = 6.28f, y = 4.62f)
                lineToRelative(dx = -0.78f, dy = 9.4f)
                arcToRelative(a = 2.03f, b = 2.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.04f, dy1 = 2.22f)
                horizontalLineToRelative(dx = 10.65f)
                arcToRelative(a = 2.13f, b = 2.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.06f, dy1 = -1.92f)
                lineToRelative(dx = 0.54f, dy = -7.5f)
                arcToRelative(a = 2.04f, b = 2.04f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.06f, dy1 = -2.21f)
                close()
                moveToRelative(dx = 9.97f, dy = 18.13f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.9f, dx3 = -2.0f, dy3 = -2.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = -2.0f, dx2 = 2.0f, dy2 = -2.0f)
                reflectiveCurveToRelative(dx1 = 2.0f, dy1 = 0.9f, dx2 = 2.0f, dy2 = 2.0f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = 2.0f, dx2 = -2.0f, dy2 = 2.0f)
                moveToRelative(dx = 0.0f, dy = -2.5f)
                curveToRelative(dx1 = -0.28f, dy1 = 0.0f, dx2 = -0.5f, dy2 = 0.22f, dx3 = -0.5f, dy3 = 0.5f)
                reflectiveCurveToRelative(dx1 = 0.22f, dy1 = 0.5f, dx2 = 0.5f, dy2 = 0.5f)
                reflectiveCurveToRelative(dx1 = 0.5f, dy1 = -0.22f, dx2 = 0.5f, dy2 = -0.5f)
                reflectiveCurveToRelative(dx1 = -0.22f, dy1 = -0.5f, dx2 = -0.5f, dy2 = -0.5f)
                moveToRelative(dx = -8.0f, dy = 2.5f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.9f, dx3 = -2.0f, dy3 = -2.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = -2.0f, dx2 = 2.0f, dy2 = -2.0f)
                reflectiveCurveToRelative(dx1 = 2.0f, dy1 = 0.9f, dx2 = 2.0f, dy2 = 2.0f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = 2.0f, dx2 = -2.0f, dy2 = 2.0f)
                moveToRelative(dx = 0.0f, dy = -2.5f)
                curveToRelative(dx1 = -0.28f, dy1 = 0.0f, dx2 = -0.5f, dy2 = 0.22f, dx3 = -0.5f, dy3 = 0.5f)
                reflectiveCurveToRelative(dx1 = 0.22f, dy1 = 0.5f, dx2 = 0.5f, dy2 = 0.5f)
                reflectiveCurveToRelative(dx1 = 0.5f, dy1 = -0.22f, dx2 = 0.5f, dy2 = -0.5f)
                reflectiveCurveToRelative(dx1 = -0.22f, dy1 = -0.5f, dx2 = -0.5f, dy2 = -0.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.0f, y = 8.75f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 8.59f, y1 = 8.75f, x2 = 8.25f, y2 = 8.41f, x3 = 8.25f, y3 = 8.0f)
                reflectiveCurveTo(x1 = 8.59f, y1 = 7.25f, x2 = 9.0f, y2 = 7.25f)
                horizontalLineToRelative(dx = 12.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 21.41f, y1 = 8.75f, x2 = 21.0f, y2 = 8.75f)
            }
        }.build().also { _shoppingCart = it }
    }

@Suppress("ObjectPropertyName")
private var _shoppingCart: ImageVector? = null
