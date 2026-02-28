package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                moveTo(x = 20.41f, y = 17.03f)
                horizontalLineTo(x = 3.62f)
                lineToRelative(dx = -0.09f, dy = 0.5f)
                curveTo(x1 = 3.24f, y1 = 19.99f, x2 = 4.0f, y2 = 22.0f, x3 = 7.5f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.99f)
                curveToRelative(dx1 = 3.51f, dy1 = 0.0f, dx2 = 4.27f, dy2 = -2.01f, dx3 = 3.97f, dy3 = -4.47f)
                lineToRelative(dx = -0.9f, dy = -7.5f)
                curveToRelative(dx1 = -0.23f, dy1 = -1.94f, dx2 = -0.57f, dy2 = -3.53f, dx3 = -3.97f, dy3 = -3.53f)
                horizontalLineToRelative(dx = -7.2f)
                curveToRelative(dx1 = -3.4f, dy1 = 0.0f, dx2 = -3.74f, dy2 = 1.59f, dx3 = -3.97f, dy3 = 3.53f)
                lineTo(x = 4.1f, y = 12.7f)
                lineToRelative(dx = -0.09f, dy = 0.73f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
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
            }
        }.build().also { _shoppingBag = it }
    }

@Suppress("ObjectPropertyName")
private var _shoppingBag: ImageVector? = null
