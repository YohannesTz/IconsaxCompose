package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Chrome: ImageVector
    get() {
        val current = _chrome
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Chrome",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.82f, y = 6.9f)
                arcToRelative(a = 23.0f, b = 23.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.63f, dy1 = -0.24f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.73f, dy1 = 3.65f)
                quadTo(x1 = 4.93f, y1 = 7.6f, x2 = 5.94f, y2 = 9.37f)
                curveToRelative(dx1 = 0.38f, dy1 = 0.68f, dx2 = 1.35f, dy2 = 0.65f, dx3 = 1.74f, dy3 = -0.02f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.14f, dy1 = -2.45f)
                moveToRelative(dx = -4.1f, dy = 7.82f)
                quadTo(x1 = 4.71f, y1 = 11.5f, x2 = 3.09f, y2 = 7.44f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.34f, dy1 = 9.64f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.1f, dy1 = 4.76f)
                arcToRelative(a = 22.0f, b = 22.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.34f, dy1 = -3.34f)
                curveToRelative(dx1 = 0.39f, dy1 = -0.68f, dx2 = -0.14f, dy2 = -1.49f, dx3 = -0.92f, dy3 = -1.49f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.23f, dy1 = -2.29f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.57f, y = 12.0f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.46f, dy1 = 1.72f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.96f, dy1 = 1.7f)
                arcTo(horizontalEllipseRadius = 3.42f, verticalEllipseRadius = 3.42f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 8.57f, y1 = 12.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.34f, y = 8.42f)
                arcToRelative(a = 22.0f, b = 22.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.14f, dy1 = -0.47f)
                curveToRelative(dx1 = -0.79f, dy1 = -0.01f, dx2 = -1.24f, dy2 = 0.85f, dx3 = -0.85f, dy3 = 1.54f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.81f)
                arcToRelative(a = 24.0f, b = 24.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.19f, dy1 = 7.7f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 9.18f, dy1 = -13.58f)
            }
        }.build().also { _chrome = it }
    }

@Suppress("ObjectPropertyName")
private var _chrome: ImageVector? = null
