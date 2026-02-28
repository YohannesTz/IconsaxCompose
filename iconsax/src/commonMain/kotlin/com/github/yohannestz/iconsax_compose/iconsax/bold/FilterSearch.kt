package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FilterSearch: ImageVector
    get() {
        val current = _filterSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FilterSearch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.72f, y = 18.24f)
                lineToRelative(dx = -0.94f, dy = -0.94f)
                arcToRelative(a = 4.71f, b = 4.71f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -1.34f, dy1 = 1.34f)
                lineToRelative(dx = 0.94f, dy = 0.94f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.68f, dy1 = 0.28f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.68f, dy1 = -0.28f)
                arcToRelative(a = 0.97f, b = 0.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.02f, dy1 = -1.34f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.58f, y = 4.02f)
                verticalLineToRelative(dy = 2.22f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.81f, dx2 = -0.5f, dy2 = 1.82f, dx3 = -1.0f, dy3 = 2.33f)
                lineTo(x = 18.4f, y = 8.73f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.1f)
                quadToRelative(dx1 = -0.3f, dy1 = -0.1f, dx2 = -0.6f, dy2 = -0.17f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.78f, dy1 = 11.32f)
                curveToRelative(dx1 = 0.23f, dy1 = 0.15f, dx2 = 0.32f, dy2 = 0.47f, dx3 = 0.12f, dy3 = 0.65f)
                lineToRelative(dx = -0.21f, dy = 0.16f)
                lineTo(x = 11.0f, y = 21.7f)
                arcToRelative(a = 2.03f, b = 2.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.09f, dy1 = -1.72f)
                verticalLineToRelative(dy = -5.35f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = -2.12f)
                lineTo(x = 3.32f, y = 8.47f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = -2.02f)
                verticalLineTo(y = 4.12f)
                curveTo(x1 = 2.42f, y1 = 2.91f, x2 = 3.32f, y2 = 2.0f, x3 = 4.41f, y3 = 2.0f)
                horizontalLineToRelative(dx = 13.18f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.99f, dy1 = 2.02f)
            }
        }.build().also { _filterSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _filterSearch: ImageVector? = null
