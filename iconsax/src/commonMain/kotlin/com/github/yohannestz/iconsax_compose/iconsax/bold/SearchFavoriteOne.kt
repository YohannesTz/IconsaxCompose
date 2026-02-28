package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchFavoriteOne: ImageVector
    get() {
        val current = _searchFavoriteOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SearchFavoriteOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.3f, y = 22.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = -0.2f)
                lineToRelative(dx = -1.86f, dy = -1.86f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.99f, dy1 = 0.0f)
                lineToRelative(dx = 1.86f, dy = 1.87f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 0.99f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = 0.2f)
                moveTo(x = 11.5f, y = 2.0f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.02f, dy1 = 19.02f)
                arcTo(horizontalEllipseRadius = 9.5f, verticalEllipseRadius = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 11.5f, y1 = 2.0f)
                moveToRelative(dx = 3.18f, dy = 10.06f)
                curveToRelative(dx1 = -0.56f, dy1 = 1.78f, dx2 = -2.51f, dy2 = 2.75f, dx3 = -3.18f, dy3 = 2.75f)
                curveToRelative(dx1 = -0.69f, dy1 = 0.0f, dx2 = -2.6f, dy2 = -0.93f, dx3 = -3.18f, dy3 = -2.75f)
                curveToRelative(dx1 = -0.38f, dy1 = -1.19f, dx2 = 0.05f, dy2 = -2.74f, dx3 = 1.41f, dy3 = -3.17f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.77f, dy1 = 0.29f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.78f, dy1 = -0.29f)
                curveToRelative(dx1 = 1.35f, dy1 = 0.44f, dx2 = 1.78f, dy2 = 1.99f, dx3 = 1.4f, dy3 = 3.17f)
            }
        }.build().also { _searchFavoriteOne = it }
    }

@Suppress("ObjectPropertyName")
private var _searchFavoriteOne: ImageVector? = null
