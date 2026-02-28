package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchFavorite: ImageVector
    get() {
        val current = _searchFavorite
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SearchFavorite",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.0f, y = 1.99f)
                arcToRelative(a = 9.02f, b = 9.02f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.02f, dy1 = 18.03f)
                arcTo(horizontalEllipseRadius = 9.02f, verticalEllipseRadius = 9.02f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 11.0f, y1 = 2.0f)
                moveToRelative(dx = 3.18f, dy = 9.57f)
                curveToRelative(dx1 = -0.56f, dy1 = 1.78f, dx2 = -2.51f, dy2 = 2.75f, dx3 = -3.18f, dy3 = 2.75f)
                curveToRelative(dx1 = -0.69f, dy1 = 0.0f, dx2 = -2.6f, dy2 = -0.93f, dx3 = -3.18f, dy3 = -2.75f)
                curveToRelative(dx1 = -0.38f, dy1 = -1.2f, dx2 = 0.05f, dy2 = -2.74f, dx3 = 1.41f, dy3 = -3.17f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.0f, y1 = 8.68f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.78f, dy1 = -0.3f)
                curveToRelative(dx1 = 1.35f, dy1 = 0.45f, dx2 = 1.78f, dy2 = 2.0f, dx3 = 1.4f, dy3 = 3.18f)
                moveToRelative(dx = 7.81f, dy = 7.39f)
                curveTo(x1 = 21.66f, y1 = 18.34f, x2 = 20.96f, y2 = 18.0f, x3 = 20.02f, y3 = 18.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.68f, dy1 = 0.79f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.22f, dy1 = 1.84f)
                curveToRelative(dx1 = 0.43f, dy1 = 1.3f, dx2 = 1.18f, dy2 = 1.59f, dx3 = 1.59f, dy3 = 1.64f)
                lineToRelative(dx = 0.19f, dy = 0.01f)
                curveToRelative(dx1 = 0.44f, dy1 = 0.0f, dx2 = 1.12f, dy2 = -0.19f, dx3 = 1.78f, dy3 = -1.18f)
                curveToRelative(dx1 = 0.53f, dy1 = -0.77f, dx2 = 0.63f, dy2 = -1.54f, dx3 = 0.31f, dy3 = -2.15f)
            }
        }.build().also { _searchFavorite = it }
    }

@Suppress("ObjectPropertyName")
private var _searchFavorite: ImageVector? = null
