package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HomeHashtag: ImageVector
    get() {
        val current = _homeHashtag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HomeHashtag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.7f, y = 16.88f)
                horizontalLineToRelative(dx = 0.7f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.09f, dy1 = -2.09f)
                verticalLineToRelative(dy = -0.7f)
                horizontalLineTo(x = 12.7f)
                close()
                moveToRelative(dx = -4.19f, dy = -2.09f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.09f, dy1 = 2.09f)
                horizontalLineToRelative(dx = 0.7f)
                verticalLineToRelative(dy = -2.79f)
                horizontalLineTo(x = 8.51f)
                close()
                moveToRelative(dx = 0.0f, dy = -2.79f)
                verticalLineToRelative(dy = 0.7f)
                horizontalLineToRelative(dx = 2.79f)
                verticalLineTo(y = 9.91f)
                horizontalLineToRelative(dx = -0.7f)
                arcTo(horizontalEllipseRadius = 2.1f, verticalEllipseRadius = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.51f, y1 = 12.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.03f, y = 6.82f)
                lineTo(x = 14.28f, y = 2.8f)
                arcTo(horizontalEllipseRadius = 4.8f, verticalEllipseRadius = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.8f, y1 = 2.92f)
                lineTo(x = 3.79f, y = 6.83f)
                arcTo(horizontalEllipseRadius = 5.1f, verticalEllipseRadius = 5.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 10.47f)
                verticalLineToRelative(dy = 6.9f)
                arcTo(horizontalEllipseRadius = 4.63f, verticalEllipseRadius = 4.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.61f, y1 = 22.0f)
                horizontalLineToRelative(dx = 10.77f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.61f, dy1 = -4.62f)
                verticalLineTo(y = 10.6f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.96f, dy1 = -3.78f)
                moveToRelative(dx = -3.15f, dy = 7.97f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.49f, dy1 = 3.5f)
                horizontalLineTo(x = 10.6f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.49f, dy1 = -3.5f)
                verticalLineTo(y = 12.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.49f, dy1 = -3.49f)
                horizontalLineToRelative(dx = 2.79f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.49f, dy1 = 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.4f, y = 9.91f)
                horizontalLineToRelative(dx = -0.7f)
                verticalLineToRelative(dy = 2.79f)
                horizontalLineToRelative(dx = 2.79f)
                verticalLineTo(y = 12.0f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.09f, dy1 = -2.09f)
            }
        }.build().also { _homeHashtag = it }
    }

@Suppress("ObjectPropertyName")
private var _homeHashtag: ImageVector? = null
