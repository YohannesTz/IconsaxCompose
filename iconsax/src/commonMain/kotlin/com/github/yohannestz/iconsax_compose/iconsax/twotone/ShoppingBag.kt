package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.4f, y = 6.5f)
                horizontalLineToRelative(dx = 7.2f)
                curveToRelative(dx1 = 3.4f, dy1 = 0.0f, dx2 = 3.74f, dy2 = 1.59f, dx3 = 3.97f, dy3 = 3.53f)
                lineToRelative(dx = 0.9f, dy = 7.5f)
                curveTo(x1 = 20.76f, y1 = 19.99f, x2 = 20.0f, y2 = 22.0f, x3 = 16.5f, y3 = 22.0f)
                horizontalLineTo(x = 7.51f)
                curveTo(x1 = 4.0f, y1 = 22.0f, x2 = 3.24f, y2 = 19.99f, x3 = 3.54f, y3 = 17.53f)
                lineToRelative(dx = 0.9f, dy = -7.5f)
                curveTo(x1 = 4.66f, y1 = 8.09f, x2 = 5.0f, y2 = 6.5f, x3 = 8.4f, y3 = 6.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 8.0f)
                verticalLineTo(y = 4.5f)
                curveTo(x1 = 8.0f, y1 = 3.0f, x2 = 9.0f, y2 = 2.0f, x3 = 10.5f, y3 = 2.0f)
                horizontalLineToRelative(dx = 3.0f)
                curveTo(x1 = 15.0f, y1 = 2.0f, x2 = 16.0f, y2 = 3.0f, x3 = 16.0f, y3 = 4.5f)
                verticalLineTo(y = 8.0f)
                moveToRelative(dx = 4.41f, dy = 9.03f)
                horizontalLineTo(x = 8.0f)
            }
        }.build().also { _shoppingBag = it }
    }

@Suppress("ObjectPropertyName")
private var _shoppingBag: ImageVector? = null
