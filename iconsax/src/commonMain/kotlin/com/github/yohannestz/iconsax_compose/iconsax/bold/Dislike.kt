package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dislike: ImageVector
    get() {
        val current = _dislike
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dislike",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.6f, y = 5.5f)
                verticalLineToRelative(dy = 10.16f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.61f, dx2 = -0.33f, dy2 = 1.12f)
                lineToRelative(dx = -2.73f, dy = 4.06f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.41f, dy1 = 0.77f)
                arcTo(horizontalEllipseRadius = 2.2f, verticalEllipseRadius = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.7f, y1 = 19.2f)
                lineToRelative(dx = 0.52f, dy = -3.27f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.21f, dy1 = -0.78f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = -0.31f)
                horizontalLineToRelative(dx = -4.1f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.87f, dy1 = -0.88f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.2f, dy1 = -1.95f)
                lineTo(x = 4.6f, y = 4.52f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = -2.25f)
                horizontalLineToRelative(dx = 3.9f)
                curveToRelative(dx1 = 0.67f, dy1 = 0.0f, dx2 = 1.6f, dy2 = 0.23f, dx3 = 2.04f, dy3 = 0.66f)
                lineToRelative(dx = 1.28f, dy = 0.99f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.6f, y1 = 5.5f)
                moveToRelative(dx = 3.19f, dy = 12.1f)
                horizontalLineToRelative(dx = 1.03f)
                curveToRelative(dx1 = 1.55f, dy1 = 0.0f, dx2 = 2.18f, dy2 = -0.6f, dx3 = 2.18f, dy3 = -2.07f)
                verticalLineTo(y = 5.48f)
                curveTo(x1 = 22.0f, y1 = 4.0f, x2 = 21.37f, y2 = 3.4f, x3 = 19.82f, y3 = 3.4f)
                horizontalLineToRelative(dx = -1.03f)
                curveToRelative(dx1 = -1.55f, dy1 = 0.0f, dx2 = -2.18f, dy2 = 0.6f, dx3 = -2.18f, dy3 = 2.08f)
                verticalLineToRelative(dy = 10.06f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.47f, dx2 = 0.63f, dy2 = 2.07f, dx3 = 2.18f, dy3 = 2.07f)
            }
        }.build().also { _dislike = it }
    }

@Suppress("ObjectPropertyName")
private var _dislike: ImageVector? = null
