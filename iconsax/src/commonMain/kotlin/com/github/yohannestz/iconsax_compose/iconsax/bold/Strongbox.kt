package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Strongbox: ImageVector
    get() {
        val current = _strongbox
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Strongbox",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.25f, y = 12.58f)
                verticalLineToRelative(dy = 1.98f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = -1.98f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.84f, dy1 = -0.92f)
                horizontalLineTo(x = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = 1.0f)
                verticalLineToRelative(dy = 3.53f)
                arcTo(horizontalEllipseRadius = 5.8f, verticalEllipseRadius = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.81f, y1 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveTo(x1 = 19.4f, y1 = 22.0f, x2 = 22.0f, y2 = 19.4f, x3 = 22.0f, y3 = 16.19f)
                verticalLineToRelative(dy = -3.53f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.0f)
                horizontalLineToRelative(dx = -6.91f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.84f, dy1 = 0.92f)
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                arcTo(horizontalEllipseRadius = 5.8f, verticalEllipseRadius = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 7.81f)
                verticalLineToRelative(dy = 1.35f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 6.67f)
                arcToRelative(a = 2.37f, b = 2.37f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.97f, dy1 = -1.88f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.66f, dy1 = 1.66f)
                quadToRelative(dx1 = 0.02f, dy1 = 0.11f, dx2 = 0.03f, dy2 = 0.22f)
                horizontalLineTo(x = 21.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.0f)
                verticalLineTo(y = 7.81f)
                arcTo(horizontalEllipseRadius = 5.8f, verticalEllipseRadius = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.19f, y1 = 2.0f)
            }
        }.build().also { _strongbox = it }
    }

@Suppress("ObjectPropertyName")
private var _strongbox: ImageVector? = null
