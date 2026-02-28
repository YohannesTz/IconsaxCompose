package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 12.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -9.84f, dy1 = 10.0f)
                horizontalLineTo(x = 12.0f)
                quadToRelative(dx1 = -0.92f, dy1 = 0.0f, dx2 = -1.79f, dy2 = -0.16f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.27f, y1 = 5.65f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.45f, dy1 = 4.66f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 12.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.1f, y = 8.02f)
                arcToRelative(a = 22.0f, b = 22.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.24f, dy1 = 0.4f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.89f, dy1 = -1.76f)
                arcToRelative(a = 23.0f, b = 23.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -8.63f, dy1 = 0.24f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.78f, dy1 = 4.23f)
                arcToRelative(a = 22.0f, b = 22.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.77f, dy1 = -5.48f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.08f, dy1 = 1.62f)
                arcToRelative(a = 24.0f, b = 24.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.46f, dy1 = 7.2f)
                lineToRelative(dx = 0.07f, dy = 0.05f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.25f, dy1 = 2.38f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.75f, dy1 = -0.33f)
                arcToRelative(a = 22.0f, b = 22.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.51f, dy1 = 5.27f)
                arcTo(horizontalEllipseRadius = 11.0f, verticalEllipseRadius = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 22.0f)
                horizontalLineToRelative(dx = 0.16f)
                arcToRelative(a = 24.0f, b = 24.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.19f, dy1 = -7.7f)
                arcToRelative(a = 4.96f, b = 4.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.25f, dy1 = -6.28f)
                moveToRelative(dx = -0.17f, dy = 5.59f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.96f, dy1 = 1.7f)
                arcToRelative(a = 3.44f, b = 3.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.42f, dy1 = -3.42f)
                arcToRelative(a = 3.42f, b = 3.42f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 6.38f, dy1 = 1.72f)
            }
        }.build().also { _chrome = it }
    }

@Suppress("ObjectPropertyName")
private var _chrome: ImageVector? = null
