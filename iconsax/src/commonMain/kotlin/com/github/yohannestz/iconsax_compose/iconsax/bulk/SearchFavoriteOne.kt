package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 11.5f, y = 21.0f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -19.0f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 19.0f)
            }
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
                moveTo(x = 13.27f, y = 8.89f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.78f, dy1 = 0.29f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.77f, dy1 = -0.3f)
                curveToRelative(dx1 = -1.36f, dy1 = 0.45f, dx2 = -1.79f, dy2 = 2.0f, dx3 = -1.41f, dy3 = 3.18f)
                curveToRelative(dx1 = 0.58f, dy1 = 1.8f, dx2 = 2.49f, dy2 = 2.75f, dx3 = 3.18f, dy3 = 2.75f)
                curveToRelative(dx1 = 0.67f, dy1 = 0.0f, dx2 = 2.62f, dy2 = -0.96f, dx3 = 3.18f, dy3 = -2.75f)
                curveToRelative(dx1 = 0.39f, dy1 = -1.18f, dx2 = -0.04f, dy2 = -2.73f, dx3 = -1.4f, dy3 = -3.17f)
            }
        }.build().also { _searchFavoriteOne = it }
    }

@Suppress("ObjectPropertyName")
private var _searchFavoriteOne: ImageVector? = null
