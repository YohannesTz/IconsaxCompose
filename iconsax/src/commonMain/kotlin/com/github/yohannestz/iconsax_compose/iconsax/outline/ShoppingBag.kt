package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 16.49f, y = 22.75f)
                horizontalLineTo(x = 7.5f)
                quadToRelative(dx1 = -2.6f, dy1 = 0.0f, dx2 = -3.81f, dy2 = -1.37f)
                quadToRelative(dx1 = -1.2f, dy1 = -1.37f, dx2 = -0.9f, dy2 = -3.94f)
                lineToRelative(dx = 0.9f, dy = -7.5f)
                curveToRelative(dx1 = 0.26f, dy1 = -2.21f, dx2 = 0.82f, dy2 = -4.19f, dx3 = 4.72f, dy3 = -4.19f)
                horizontalLineToRelative(dx = 7.2f)
                curveToRelative(dx1 = 3.89f, dy1 = 0.0f, dx2 = 4.45f, dy2 = 1.98f, dx3 = 4.72f, dy3 = 4.19f)
                lineToRelative(dx = 0.9f, dy = 7.5f)
                quadToRelative(dx1 = 0.3f, dy1 = 2.58f, dx2 = -0.9f, dy2 = 3.94f)
                quadToRelative(dx1 = -1.24f, dy1 = 1.37f, dx2 = -3.84f, dy2 = 1.37f)
                moveTo(x = 8.4f, y = 7.25f)
                curveToRelative(dx1 = -2.88f, dy1 = 0.0f, dx2 = -3.02f, dy2 = 1.14f, dx3 = -3.23f, dy3 = 2.86f)
                lineToRelative(dx = -0.9f, dy = 7.5f)
                quadToRelative(dx1 = -0.22f, dy1 = 1.91f, dx2 = 0.54f, dy2 = 2.77f)
                quadToRelative(dx1 = 0.77f, dy1 = 0.86f, dx2 = 2.69f, dy2 = 0.86f)
                horizontalLineToRelative(dx = 8.99f)
                quadToRelative(dx1 = 1.92f, dy1 = 0.0f, dx2 = 2.69f, dy2 = -0.86f)
                reflectiveQuadToRelative(dx1 = 0.54f, dy1 = -2.77f)
                lineToRelative(dx = -0.9f, dy = -7.5f)
                curveToRelative(dx1 = -0.21f, dy1 = -1.73f, dx2 = -0.34f, dy2 = -2.86f, dx3 = -3.23f, dy3 = -2.86f)
                close()
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
                moveToRelative(dx = 4.41f, dy = 9.03f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 16.28f, x2 = 8.0f, y2 = 16.28f)
                horizontalLineToRelative(dx = 12.41f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _shoppingBag = it }
    }

@Suppress("ObjectPropertyName")
private var _shoppingBag: ImageVector? = null
