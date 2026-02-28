package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuoteUpCircle: ImageVector
    get() {
        val current = _quoteUpCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.QuoteUpCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = -0.39f, dy = 9.84f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.08f, dx2 = -0.67f, dy2 = 3.77f, dx3 = -2.46f, dy3 = 4.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = 0.1f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.37f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.26f, dy1 = -1.03f)
                curveToRelative(dx1 = 1.21f, dy1 = -0.72f, dx2 = 1.63f, dy2 = -0.98f, dx3 = 1.71f, dy3 = -2.79f)
                horizontalLineToRelative(dx = -1.9f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.94f, dy1 = -1.94f)
                verticalLineTo(y = 9.16f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.94f, dy1 = -1.94f)
                horizontalLineToRelative(dx = 1.49f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.94f, dy1 = 1.94f)
                close()
                moveToRelative(dx = 6.14f, dy = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.08f, dx2 = -0.67f, dy2 = 3.77f, dx3 = -2.46f, dy3 = 4.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = 0.1f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.37f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.26f, dy1 = -1.03f)
                curveToRelative(dx1 = 1.21f, dy1 = -0.72f, dx2 = 1.63f, dy2 = -0.98f, dx3 = 1.71f, dy3 = -2.79f)
                horizontalLineToRelative(dx = -1.91f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.94f, dy1 = -1.94f)
                verticalLineTo(y = 9.16f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.94f, dy1 = -1.94f)
                horizontalLineToRelative(dx = 1.49f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.94f, dy1 = 1.94f)
                close()
            }
        }.build().also { _quoteUpCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _quoteUpCircle: ImageVector? = null
