package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Milk: ImageVector
    get() {
        val current = _milk
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Milk",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.0f, y = 16.0f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 3.0f)
                horizontalLineTo(x = 9.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = -3.0f)
                verticalLineToRelative(dy = -4.01f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.01f, dy1 = -1.0f)
                horizontalLineToRelative(dx = 2.88f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = 0.46f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.08f, y1 = 15.0f)
                horizontalLineTo(x = 17.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
                moveTo(x = 17.41f, y = 9.4f)
                lineToRelative(dx = -2.12f, dy = -2.12f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 6.59f)
                verticalLineTo(y = 4.91f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.5f, y1 = 2.0f)
                horizontalLineToRelative(dx = -5.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 4.91f)
                verticalLineToRelative(dy = 1.68f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.29f, dy2 = 0.7f)
                lineTo(x = 6.59f, y = 9.41f)
                arcTo(horizontalEllipseRadius = 2.4f, verticalEllipseRadius = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.0f, y1 = 10.83f)
                verticalLineToRelative(dy = 0.65f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.99f, dy1 = 1.0f)
                lineTo(x = 9.9f, y = 12.5f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.85f, dy1 = 0.7f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.37f, dy1 = 0.3f)
                horizontalLineTo(x = 17.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.0f)
                verticalLineToRelative(dy = -1.67f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.45f, dx2 = -0.27f, dy2 = -1.1f, dx3 = -0.59f, dy3 = -1.42f)
            }
        }.build().also { _milk = it }
    }

@Suppress("ObjectPropertyName")
private var _milk: ImageVector? = null
