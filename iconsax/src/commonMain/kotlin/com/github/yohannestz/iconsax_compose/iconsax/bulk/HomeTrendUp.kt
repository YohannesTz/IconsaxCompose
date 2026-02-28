package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HomeTrendUp: ImageVector
    get() {
        val current = _homeTrendUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HomeTrendUp",
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
                moveTo(x = 20.04f, y = 6.82f)
                lineTo(x = 14.28f, y = 2.8f)
                arcToRelative(a = 4.85f, b = 4.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.49f, dy1 = 0.13f)
                lineTo(x = 3.78f, y = 6.83f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.79f, dy1 = 3.64f)
                verticalLineToRelative(dy = 6.9f)
                arcTo(horizontalEllipseRadius = 4.63f, verticalEllipseRadius = 4.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.61f, y1 = 22.0f)
                horizontalLineToRelative(dx = 10.78f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.62f, dy1 = -4.62f)
                verticalLineTo(y = 10.6f)
                arcToRelative(a = 5.1f, b = 5.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.97f, dy1 = -3.78f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.83f, y = 11.27f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.38f, dy1 = -0.38f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.27f, dy1 = -0.05f)
                horizontalLineToRelative(dx = -1.86f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = 0.7f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = 0.7f)
                horizontalLineToRelative(dx = 0.18f)
                lineToRelative(dx = -2.11f, dy = 2.11f)
                lineToRelative(dx = -1.02f, dy = -1.52f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.51f, dy1 = -0.31f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.56f, dy1 = 0.2f)
                lineTo(x = 7.32f, y = 15.7f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.99f)
                quadToRelative(dx1 = 0.21f, dy1 = 0.2f, dx2 = 0.49f, dy2 = 0.2f)
                curveToRelative(dx1 = 0.28f, dy1 = 0.0f, dx2 = 0.36f, dy2 = -0.07f, dx3 = 0.49f, dy3 = -0.2f)
                lineToRelative(dx = 2.38f, dy = -2.38f)
                lineToRelative(dx = 1.02f, dy = 1.52f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.51f, dy1 = 0.31f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.56f, dy1 = -0.2f)
                lineToRelative(dx = 2.72f, dy = -2.72f)
                verticalLineToRelative(dy = 0.18f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = 0.7f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = -0.7f)
                verticalLineToRelative(dy = -1.86f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.06f, dy1 = -0.27f)
            }
        }.build().also { _homeTrendUp = it }
    }

@Suppress("ObjectPropertyName")
private var _homeTrendUp: ImageVector? = null
