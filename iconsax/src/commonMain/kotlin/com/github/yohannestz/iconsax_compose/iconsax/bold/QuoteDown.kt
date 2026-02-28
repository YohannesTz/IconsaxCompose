package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuoteDown: ImageVector
    get() {
        val current = _quoteDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.QuoteDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.9f, y = 12.37f)
                horizontalLineToRelative(dx = 4.7f)
                curveToRelative(dx1 = -0.08f, dy1 = 4.67f, dx2 = -1.0f, dy2 = 5.44f, dx3 = -3.87f, dy3 = 7.14f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.72f, dy1 = 1.2f)
                curveToRelative(dx1 = 3.38f, dy1 = -2.0f, dx2 = 4.56f, dy2 = -3.22f, dx3 = 4.56f, dy3 = -9.04f)
                verticalLineTo(y = 6.28f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.1f, dy1 = -3.09f)
                horizontalLineToRelative(dx = -3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.08f, dy1 = 3.1f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.08f, dy1 = 3.08f)
                moveToRelative(dx = -10.81f, dy = 0.0f)
                horizontalLineToRelative(dx = 4.69f)
                curveToRelative(dx1 = -0.08f, dy1 = 4.67f, dx2 = -1.0f, dy2 = 5.44f, dx3 = -3.87f, dy3 = 7.14f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.72f, dy1 = 1.2f)
                curveToRelative(dx1 = 3.38f, dy1 = -2.0f, dx2 = 4.56f, dy2 = -3.22f, dx3 = 4.56f, dy3 = -9.04f)
                verticalLineTo(y = 6.28f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.1f, y1 = 3.2f)
                horizontalLineToRelative(dx = -3.0f)
                arcTo(horizontalEllipseRadius = 3.03f, verticalEllipseRadius = 3.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 6.3f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.09f, dy1 = 3.08f)
            }
        }.build().also { _quoteDown = it }
    }

@Suppress("ObjectPropertyName")
private var _quoteDown: ImageVector? = null
