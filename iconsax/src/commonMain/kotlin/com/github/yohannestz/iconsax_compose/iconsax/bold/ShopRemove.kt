package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShopRemove: ImageVector
    get() {
        val current = _shopRemove
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ShopRemove",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.8f, y = 22.15f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.81f, dy1 = -4.81f)
                verticalLineTo(y = 14.5f)
                arcToRelative(a = 0.96f, b = 0.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.29f, dy1 = -0.9f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.15f, dy1 = 0.23f)
                lineToRelative(dx = 0.46f, dy = 0.03f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.08f, dy1 = -1.12f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.07f, dy1 = 0.0f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.72f, dy1 = 0.84f)
                arcToRelative(a = 0.96f, b = 0.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.27f, dy1 = 0.9f)
                verticalLineToRelative(dy = 2.86f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.81f, dy1 = 4.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.98f, y = 8.6f)
                lineTo(x = 21.7f, y = 5.92f)
                curveToRelative(dx1 = -0.4f, dy1 = -2.9f, dx2 = -1.72f, dy2 = -4.08f, dx3 = -4.53f, dy3 = -4.08f)
                horizontalLineTo(x = 6.82f)
                curveTo(x1 = 4.0f, y1 = 1.85f, x2 = 2.69f, y2 = 3.03f, x3 = 2.28f, y3 = 5.96f)
                lineTo(x = 2.02f, y = 8.6f)
                arcToRelative(a = 3.85f, b = 3.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.89f, dy1 = 4.3f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.11f, dy1 = -1.58f)
                curveToRelative(dx1 = 0.65f, dy1 = 0.97f, dx2 = 1.76f, dy2 = 1.58f, dx3 = 3.0f, dy3 = 1.58f)
                reflectiveCurveToRelative(dx1 = 2.33f, dy1 = -0.58f, dx2 = 2.99f, dy2 = -1.54f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.08f, dy1 = 1.54f)
                arcToRelative(a = 3.88f, b = 3.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.89f, dy1 = -4.31f)
                moveTo(x = 13.5f, y = 7.72f)
                horizontalLineToRelative(dx = -3.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 3.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _shopRemove = it }
    }

@Suppress("ObjectPropertyName")
private var _shopRemove: ImageVector? = null
