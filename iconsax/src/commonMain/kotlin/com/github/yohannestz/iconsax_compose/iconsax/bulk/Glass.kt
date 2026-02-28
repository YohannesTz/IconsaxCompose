package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Glass: ImageVector
    get() {
        val current = _glass
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Glass",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.19f, y = 16.29f)
                horizontalLineToRelative(dx = -2.38f)
                verticalLineToRelative(dy = 1.42f)
                horizontalLineToRelative(dx = 2.38f)
                close()
                moveTo(x = 7.95f, y = 2.71f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.32f, dy2 = 0.72f, dx3 = -0.71f, dy3 = 0.72f)
                horizontalLineTo(x = 6.29f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.1f, dy1 = 3.09f)
                verticalLineToRelative(dy = 5.88f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.43f, dy1 = 2.33f)
                verticalLineTo(y = 6.52f)
                arcTo(horizontalEllipseRadius = 4.53f, verticalEllipseRadius = 4.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.29f, y1 = 2.0f)
                horizontalLineToRelative(dx = 0.95f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.71f, dy1 = 0.71f)
                moveToRelative(dx = 14.29f, dy = 3.81f)
                verticalLineToRelative(dy = 8.21f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.43f, dy1 = -2.33f)
                verticalLineTo(y = 6.52f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.1f, dy1 = -3.09f)
                horizontalLineToRelative(dx = -0.95f)
                arcToRelative(a = 0.72f, b = 0.72f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.43f)
                horizontalLineToRelative(dx = 0.95f)
                curveToRelative(dx1 = 2.5f, dy1 = 0.0f, dx2 = 4.53f, dy2 = 2.03f, dx3 = 4.53f, dy3 = 4.52f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 10.81f, y = 14.73f)
                verticalLineToRelative(dy = 4.65f)
                arcTo(horizontalEllipseRadius = 2.6f, verticalEllipseRadius = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.19f, y1 = 22.0f)
                horizontalLineTo(x = 4.38f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.62f, dy1 = -2.62f)
                verticalLineToRelative(dy = -4.65f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.62f, dy1 = -2.62f)
                horizontalLineToRelative(dx = 3.81f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.62f, dy1 = 2.62f)
                moveToRelative(dx = 11.43f, dy = 0.0f)
                verticalLineToRelative(dy = 4.65f)
                arcTo(horizontalEllipseRadius = 2.6f, verticalEllipseRadius = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.62f, y1 = 22.0f)
                horizontalLineToRelative(dx = -3.81f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.62f, dy1 = -2.62f)
                verticalLineToRelative(dy = -4.65f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.62f, dy1 = -2.62f)
                horizontalLineToRelative(dx = 3.81f)
                quadToRelative(dx1 = 0.65f, dy1 = 0.0f, dx2 = 1.19f, dy2 = 0.29f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.43f, dy1 = 2.33f)
            }
        }.build().also { _glass = it }
    }

@Suppress("ObjectPropertyName")
private var _glass: ImageVector? = null
