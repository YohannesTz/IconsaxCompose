package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuoteUp: ImageVector
    get() {
        val current = _quoteUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.QuoteUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.09f, y = 11.63f)
                horizontalLineTo(x = 3.4f)
                curveToRelative(dx1 = 0.08f, dy1 = -4.67f, dx2 = 1.0f, dy2 = -5.44f, dx3 = 3.87f, dy3 = -7.14f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.24f, dy1 = -0.96f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.95f, dy1 = -0.24f)
                curveTo(x1 = 3.18f, y1 = 5.3f, x2 = 2.0f, y2 = 6.51f, x3 = 2.0f, y3 = 12.32f)
                verticalLineToRelative(dy = 5.4f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.09f, dy1 = 3.08f)
                horizontalLineToRelative(dx = 3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.09f, dy1 = -3.09f)
                verticalLineToRelative(dy = -3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.09f, dy1 = -3.08f)
                moveToRelative(dx = 10.82f, dy = 0.0f)
                horizontalLineToRelative(dx = -4.7f)
                curveToRelative(dx1 = 0.09f, dy1 = -4.67f, dx2 = 1.0f, dy2 = -5.44f, dx3 = 3.88f, dy3 = -7.14f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.24f, dy1 = -0.96f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.96f, dy1 = -0.24f)
                curveToRelative(dx1 = -3.38f, dy1 = 2.0f, dx2 = -4.56f, dy2 = 3.22f, dx3 = -4.56f, dy3 = 9.04f)
                verticalLineToRelative(dy = 5.4f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.09f, dy1 = 3.08f)
                horizontalLineToRelative(dx = 3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.09f, dy1 = -3.09f)
                verticalLineToRelative(dy = -3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.08f, dy1 = -3.09f)
            }
        }.build().also { _quoteUp = it }
    }

@Suppress("ObjectPropertyName")
private var _quoteUp: ImageVector? = null
