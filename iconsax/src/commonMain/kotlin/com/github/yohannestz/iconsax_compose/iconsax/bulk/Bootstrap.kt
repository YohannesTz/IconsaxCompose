package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap: ImageVector
    get() {
        val current = _bootstrap
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bootstrap",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 17.0f, y = 3.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = 3.0f)
                verticalLineToRelative(dy = 0.84f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.63f, y1 = 9.1f)
                arcTo(horizontalEllipseRadius = 2.8f, verticalEllipseRadius = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.0f, y1 = 11.0f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.63f, dy1 = 1.9f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.0f, y1 = 17.16f)
                verticalLineTo(y = 18.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 3.0f)
                horizontalLineToRelative(dx = 10.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = -3.0f)
                verticalLineToRelative(dy = -0.84f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.37f, dy1 = -2.26f)
                arcTo(horizontalEllipseRadius = 2.8f, verticalEllipseRadius = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 23.0f, y1 = 13.0f)
                verticalLineToRelative(dy = -2.0f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.63f, dy1 = -1.9f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.0f, y1 = 6.84f)
                verticalLineTo(y = 6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = -3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.67f, y = 16.92f)
                horizontalLineTo(x = 9.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 16.17f)
                verticalLineTo(y = 7.84f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = -0.75f)
                horizontalLineToRelative(dx = 2.92f)
                arcTo(horizontalEllipseRadius = 2.83f, verticalEllipseRadius = 2.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.58f, y1 = 12.0f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.91f, dy1 = 4.92f)
                moveToRelative(dx = -2.17f, dy = -1.5f)
                horizontalLineToRelative(dx = 2.17f)
                arcToRelative(a = 1.33f, b = 1.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.66f)
                horizontalLineTo(x = 10.5f)
                close()
                moveToRelative(dx = 0.0f, dy = -4.17f)
                horizontalLineToRelative(dx = 2.17f)
                arcToRelative(a = 1.33f, b = 1.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.66f)
                horizontalLineTo(x = 10.5f)
                close()
            }
        }.build().also { _bootstrap = it }
    }

@Suppress("ObjectPropertyName")
private var _bootstrap: ImageVector? = null
