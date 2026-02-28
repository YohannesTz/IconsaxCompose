package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.0f, y = 11.0f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -9.0f, dy1 = -9.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.5f, y = 6.13f)
                curveToRelative(dx1 = -0.35f, dy1 = -1.1f, dx2 = 0.06f, dy2 = -2.47f, dx3 = 1.22f, dy3 = -2.84f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.79f, dy1 = 0.56f)
                curveToRelative(dx1 = 0.4f, dy1 = -0.61f, dx2 = 1.18f, dy2 = -0.75f, dx3 = 1.78f, dy3 = -0.56f)
                curveToRelative(dx1 = 1.16f, dy1 = 0.37f, dx2 = 1.57f, dy2 = 1.74f, dx3 = 1.22f, dy3 = 2.84f)
                curveToRelative(dx1 = -0.55f, dy1 = 1.75f, dx2 = -2.47f, dy2 = 2.66f, dx3 = -3.0f, dy3 = 2.66f)
                curveToRelative(dx1 = -0.54f, dy1 = 0.0f, dx2 = -2.44f, dy2 = -0.89f, dx3 = -3.01f, dy3 = -2.66f)
                moveToRelative(dx = 5.43f, dy = 14.56f)
                curveToRelative(dx1 = 0.53f, dy1 = 1.6f, dx2 = 1.74f, dy2 = 1.76f, dx3 = 2.67f, dy3 = 0.36f)
                curveToRelative(dx1 = 0.85f, dy1 = -1.28f, dx2 = 0.29f, dy2 = -2.33f, dx3 = -1.25f, dy3 = -2.33f)
                curveToRelative(dx1 = -1.14f, dy1 = -0.01f, dx2 = -1.78f, dy2 = 0.88f, dx3 = -1.42f, dy3 = 1.97f)
            }
        }.build().also { _searchFavorite = it }
    }

@Suppress("ObjectPropertyName")
private var _searchFavorite: ImageVector? = null
