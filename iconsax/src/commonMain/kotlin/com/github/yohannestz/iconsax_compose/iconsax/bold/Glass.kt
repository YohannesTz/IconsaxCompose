package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 17.71f, y = 2.0f)
                horizontalLineToRelative(dx = -0.95f)
                arcToRelative(a = 0.72f, b = 0.72f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.43f)
                horizontalLineToRelative(dx = 0.95f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.1f, dy1 = 3.09f)
                verticalLineToRelative(dy = 5.88f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.19f, dy1 = -0.29f)
                horizontalLineToRelative(dx = -3.81f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.62f, dy1 = 2.62f)
                verticalLineToRelative(dy = 1.56f)
                horizontalLineToRelative(dx = -2.38f)
                verticalLineToRelative(dy = -1.56f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.62f, dy1 = -2.62f)
                horizontalLineTo(x = 4.38f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.19f, dy1 = 0.29f)
                verticalLineTo(y = 6.52f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.1f, dy1 = -3.09f)
                horizontalLineToRelative(dx = 0.95f)
                arcToRelative(a = 0.72f, b = 0.72f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.43f)
                horizontalLineTo(x = 6.29f)
                arcToRelative(a = 4.53f, b = 4.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.53f, dy1 = 4.52f)
                verticalLineToRelative(dy = 12.86f)
                arcTo(horizontalEllipseRadius = 2.6f, verticalEllipseRadius = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.38f, y1 = 22.0f)
                horizontalLineToRelative(dx = 3.81f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.62f, dy1 = -2.62f)
                verticalLineToRelative(dy = -1.67f)
                horizontalLineToRelative(dx = 2.38f)
                verticalLineToRelative(dy = 1.67f)
                arcTo(horizontalEllipseRadius = 2.6f, verticalEllipseRadius = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.81f, y1 = 22.0f)
                horizontalLineToRelative(dx = 3.81f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.62f, dy1 = -2.62f)
                verticalLineTo(y = 6.52f)
                arcTo(horizontalEllipseRadius = 4.53f, verticalEllipseRadius = 4.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.71f, y1 = 2.0f)
            }
        }.build().also { _glass = it }
    }

@Suppress("ObjectPropertyName")
private var _glass: ImageVector? = null
