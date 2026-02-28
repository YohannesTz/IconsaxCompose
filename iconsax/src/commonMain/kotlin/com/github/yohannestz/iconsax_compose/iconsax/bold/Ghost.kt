package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ghost: ImageVector
    get() {
        val current = _ghost
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ghost",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                curveTo(x1 = 6.5f, y1 = 2.0f, x2 = 2.0f, y2 = 6.58f, x3 = 2.0f, y3 = 12.18f)
                verticalLineToRelative(dy = 7.89f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.26f, dx2 = 0.75f, dy2 = 1.6f, dx3 = 1.67f, dy3 = 0.76f)
                lineToRelative(dx = 1.0f, dy = -0.91f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.34f, dy1 = 0.0f)
                lineToRelative(dx = 2.0f, dy = 1.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.34f, dy1 = 0.0f)
                lineToRelative(dx = 2.0f, dy = -1.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.34f, dy1 = 0.0f)
                lineToRelative(dx = 2.0f, dy = 1.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.34f, dy1 = 0.0f)
                lineToRelative(dx = 2.0f, dy = -1.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.34f, dy1 = 0.0f)
                lineToRelative(dx = 1.0f, dy = 0.91f)
                curveToRelative(dx1 = 0.92f, dy1 = 0.84f, dx2 = 1.67f, dy2 = 0.5f, dx3 = 1.67f, dy3 = -0.76f)
                verticalLineToRelative(dy = -7.89f)
                arcTo(horizontalEllipseRadius = 10.2f, verticalEllipseRadius = 10.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.0f)
                moveToRelative(dx = 0.0f, dy = 4.62f)
                arcToRelative(a = 2.39f, b = 2.39f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.76f)
                arcToRelative(a = 2.39f, b = 2.39f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.76f)
                moveToRelative(dx = 4.45f, dy = 7.98f)
                arcTo(horizontalEllipseRadius = 7.4f, verticalEllipseRadius = 7.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 16.07f)
                arcToRelative(a = 7.4f, b = 7.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.45f, dy1 = -1.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.9f, dy1 = -1.2f)
                arcToRelative(a = 5.9f, b = 5.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.1f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.9f, dy1 = 1.2f)
            }
        }.build().also { _ghost = it }
    }

@Suppress("ObjectPropertyName")
private var _ghost: ImageVector? = null
