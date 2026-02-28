package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Box: ImageVector
    get() {
        val current = _box
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Box",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.2f, y = 7.82f)
                lineToRelative(dx = -7.7f, dy = 4.46f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = 0.0f)
                lineToRelative(dx = -7.7f, dy = -4.46f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.27f, dy1 = -1.54f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.49f, y1 = 5.5f)
                lineToRelative(dx = 5.42f, dy = -3.0f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.2f, dy1 = 0.0f)
                lineToRelative(dx = 5.42f, dy = 3.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.97f, dy1 = 0.8f)
                arcToRelative(a = 1.03f, b = 1.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = 1.53f)
                moveToRelative(dx = -8.77f, dy = 6.32f)
                verticalLineToRelative(dy = 6.82f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.45f, dy1 = 0.93f)
                curveToRelative(dx1 = -2.06f, dy1 = -1.01f, dx2 = -5.53f, dy2 = -2.9f, dx3 = -5.53f, dy3 = -2.9f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.22f, dy1 = -3.86f)
                verticalLineTo(y = 9.97f)
                arcToRelative(a = 1.01f, b = 1.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.51f, dy1 = -0.9f)
                lineToRelative(dx = 7.19f, dy = 4.17f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = 0.9f)
                moveToRelative(dx = 1.14f, dy = 0.0f)
                verticalLineToRelative(dy = 6.82f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.45f, dy1 = 0.93f)
                curveToRelative(dx1 = 2.06f, dy1 = -1.01f, dx2 = 5.53f, dy2 = -2.9f, dx3 = 5.53f, dy3 = -2.9f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.22f, dy1 = -3.86f)
                verticalLineTo(y = 9.97f)
                arcToRelative(a = 1.01f, b = 1.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.51f, dy1 = -0.9f)
                lineToRelative(dx = -7.19f, dy = 4.17f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = 0.9f)
            }
        }.build().also { _box = it }
    }

@Suppress("ObjectPropertyName")
private var _box: ImageVector? = null
