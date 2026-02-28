package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeartSearch: ImageVector
    get() {
        val current = _heartSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HeartSearch",
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
                moveTo(x = 16.44f, y = 3.1f)
                arcTo(horizontalEllipseRadius = 5.6f, verticalEllipseRadius = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 5.33f)
                arcTo(horizontalEllipseRadius = 5.6f, verticalEllipseRadius = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.56f, y1 = 3.1f)
                arcTo(horizontalEllipseRadius = 5.57f, verticalEllipseRadius = 5.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 8.7f)
                quadToRelative(dx1 = 0.01f, dy1 = 1.77f, dx2 = 0.52f, dy2 = 3.3f)
                curveToRelative(dx1 = 1.58f, dy1 = 5.0f, dx2 = 6.45f, dy2 = 8.0f, dx3 = 8.86f, dy3 = 8.81f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.24f, dy1 = 0.0f)
                curveToRelative(dx1 = 2.41f, dy1 = -0.82f, dx2 = 7.28f, dy2 = -3.8f, dx3 = 8.86f, dy3 = -8.8f)
                arcTo(horizontalEllipseRadius = 11.0f, verticalEllipseRadius = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 8.68f)
                arcToRelative(a = 5.57f, b = 5.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.56f, dy1 = -5.59f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.77f, y = 20.68f)
                lineToRelative(dx = -0.76f, dy = -0.76f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.63f, dy1 = -2.09f)
                arcToRelative(a = 3.82f, b = 3.82f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -3.82f, dy1 = 3.82f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.09f, dy1 = -0.63f)
                lineToRelative(dx = 0.76f, dy = 0.76f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.55f, dy1 = 0.23f)
                quadToRelative(dx1 = 0.31f, dy1 = 0.0f, dx2 = 0.55f, dy2 = -0.23f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.1f)
            }
        }.build().also { _heartSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _heartSearch: ImageVector? = null
