package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuoteDownSquare: ImageVector
    get() {
        val current = _quoteDownSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.QuoteDownSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
                moveToRelative(dx = -4.58f, dy = 12.84f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.94f, dy1 = 1.94f)
                horizontalLineTo(x = 8.19f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.94f, dy1 = -1.94f)
                verticalLineToRelative(dy = -2.67f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.08f, dx2 = 0.67f, dy2 = -3.77f, dx3 = 2.46f, dy3 = -4.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.38f, dy1 = -0.1f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.65f, dy1 = 0.37f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.26f, dy1 = 1.03f)
                curveToRelative(dx1 = -1.21f, dy1 = 0.7f, dx2 = -1.63f, dy2 = 0.96f, dx3 = -1.71f, dy3 = 2.77f)
                horizontalLineToRelative(dx = 1.91f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.94f, dy1 = 1.94f)
                verticalLineToRelative(dy = 1.49f)
                close()
                moveToRelative(dx = 6.14f, dy = 0.0f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.94f, dy1 = 1.94f)
                horizontalLineToRelative(dx = -1.49f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.94f, dy1 = -1.94f)
                verticalLineToRelative(dy = -2.67f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.08f, dx2 = 0.67f, dy2 = -3.77f, dx3 = 2.46f, dy3 = -4.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.38f, dy1 = -0.1f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.65f, dy1 = 0.37f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.26f, dy1 = 1.03f)
                curveToRelative(dx1 = -1.21f, dy1 = 0.72f, dx2 = -1.63f, dy2 = 0.98f, dx3 = -1.71f, dy3 = 2.79f)
                horizontalLineToRelative(dx = 1.91f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.94f, dy1 = 1.94f)
                close()
            }
        }.build().also { _quoteDownSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _quoteDownSquare: ImageVector? = null
