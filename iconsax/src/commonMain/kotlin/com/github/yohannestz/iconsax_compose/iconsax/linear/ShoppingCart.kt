package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 2.0f)
                horizontalLineToRelative(dx = 1.74f)
                arcToRelative(a = 1.85f, b = 1.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = 2.0f)
                lineToRelative(dx = -0.83f, dy = 9.96f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.79f, dy1 = 3.03f)
                horizontalLineToRelative(dx = 10.65f)
                curveToRelative(dx1 = 1.44f, dy1 = 0.0f, dx2 = 2.7f, dy2 = -1.18f, dx3 = 2.81f, dy3 = -2.61f)
                lineToRelative(dx = 0.54f, dy = -7.5f)
                arcToRelative(a = 2.77f, b = 2.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.81f, dy1 = -3.01f)
                horizontalLineTo(x = 5.82f)
                moveTo(x = 16.25f, y = 22.0f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.5f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.5f)
                moveToRelative(dx = -8.0f, dy = 0.0f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.5f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.5f)
                moveTo(x = 9.0f, y = 8.0f)
                horizontalLineToRelative(dx = 12.0f)
            }
        }.build().also { _shoppingCart = it }
    }

@Suppress("ObjectPropertyName")
private var _shoppingCart: ImageVector? = null
