package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 21.74f, y = 20.5f)
                lineToRelative(dx = -0.86f, dy = -0.85f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.71f, dy1 = -2.36f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.3f, dy1 = -4.3f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.29f, dy1 = 4.3f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.66f, dy1 = 3.6f)
                lineToRelative(dx = 0.86f, dy = 0.86f)
                arcToRelative(a = 0.87f, b = 0.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.24f, dy1 = 0.0f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.02f, dy1 = -1.24f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 8.73f)
                quadToRelative(dx1 = -0.01f, dy1 = 1.78f, dx2 = -0.52f, dy2 = 3.31f)
                curveToRelative(dx1 = -0.06f, dy1 = 0.21f, dx2 = -0.31f, dy2 = 0.27f, dx3 = -0.49f, dy3 = 0.14f)
                arcToRelative(a = 6.4f, b = 6.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.79f, dy1 = -1.24f)
                arcToRelative(a = 6.3f, b = 6.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.49f, dy1 = 9.38f)
                curveToRelative(dx1 = 0.16f, dy1 = 0.28f, dx2 = -0.03f, dy2 = 0.64f, dx3 = -0.33f, dy3 = 0.53f)
                curveToRelative(dx1 = -2.41f, dy1 = -0.82f, dx2 = -7.28f, dy2 = -3.81f, dx3 = -8.86f, dy3 = -8.81f)
                arcTo(horizontalEllipseRadius = 11.0f, verticalEllipseRadius = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 8.73f)
                arcToRelative(a = 5.55f, b = 5.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 10.0f, dy1 = -3.36f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.44f, dy1 = -2.23f)
                curveToRelative(dx1 = 3.07f, dy1 = 0.0f, dx2 = 5.56f, dy2 = 2.5f, dx3 = 5.56f, dy3 = 5.59f)
            }
        }.build().also { _heartSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _heartSearch: ImageVector? = null
