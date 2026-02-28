package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Framer: ImageVector
    get() {
        val current = _framer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Framer",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 19.0f, y = 16.75f)
                horizontalLineTo(x = 5.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.25f, y1 = 16.0f)
                verticalLineTo(y = 9.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 8.25f)
                horizontalLineToRelative(dx = 5.19f)
                lineTo(x = 4.47f, y = 2.53f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 1.25f)
                horizontalLineToRelative(dx = 14.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.75f, y1 = 2.0f)
                verticalLineToRelative(dy = 7.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.0f, y1 = 9.75f)
                horizontalLineToRelative(dx = -5.19f)
                lineToRelative(dx = 5.72f, dy = 5.72f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.0f, y1 = 16.75f)
                moveToRelative(dx = -13.25f, dy = -1.5f)
                horizontalLineToRelative(dx = 11.44f)
                lineToRelative(dx = -5.5f, dy = -5.5f)
                horizontalLineTo(x = 5.75f)
                close()
                moveToRelative(dx = 6.56f, dy = -7.0f)
                horizontalLineToRelative(dx = 5.94f)
                verticalLineToRelative(dy = -5.5f)
                horizontalLineTo(x = 6.81f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = -0.18f)
                lineToRelative(dx = -7.0f, dy = -6.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.22f, dy1 = -0.83f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = -0.49f)
                horizontalLineToRelative(dx = 7.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.74f, y1 = 16.0f)
                verticalLineToRelative(dy = 6.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.44f, dy1 = 0.68f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = 0.07f)
                moveToRelative(dx = -4.97f, dy = -6.0f)
                lineToRelative(dx = 4.22f, dy = 3.62f)
                verticalLineToRelative(dy = -3.62f)
                close()
            }
        }.build().also { _framer = it }
    }

@Suppress("ObjectPropertyName")
private var _framer: ImageVector? = null
