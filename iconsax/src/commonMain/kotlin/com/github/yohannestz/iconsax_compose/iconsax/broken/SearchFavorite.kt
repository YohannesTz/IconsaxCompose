package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                moveTo(x = 2.0f, y = 11.5f)
                arcTo(horizontalEllipseRadius = 9.5f, verticalEllipseRadius = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.5f, y1 = 2.0f)
                moveToRelative(dx = 9.5f, dy = 9.5f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -9.5f, dy1 = 9.5f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -8.53f, dy1 = -5.31f)
                moveTo(x = 22.0f, y = 22.0f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
                moveTo(x = 14.5f, y = 6.13f)
                curveToRelative(dx1 = -0.35f, dy1 = -1.1f, dx2 = 0.06f, dy2 = -2.47f, dx3 = 1.22f, dy3 = -2.84f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.79f, dy1 = 0.56f)
                curveToRelative(dx1 = 0.4f, dy1 = -0.6f, dx2 = 1.18f, dy2 = -0.75f, dx3 = 1.78f, dy3 = -0.56f)
                curveToRelative(dx1 = 1.16f, dy1 = 0.37f, dx2 = 1.57f, dy2 = 1.74f, dx3 = 1.22f, dy3 = 2.84f)
                curveToRelative(dx1 = -0.55f, dy1 = 1.75f, dx2 = -2.47f, dy2 = 2.66f, dx3 = -3.0f, dy3 = 2.66f)
                curveToRelative(dx1 = -0.54f, dy1 = 0.0f, dx2 = -2.44f, dy2 = -0.89f, dx3 = -3.01f, dy3 = -2.66f)
            }
        }.build().also { _searchFavorite = it }
    }

@Suppress("ObjectPropertyName")
private var _searchFavorite: ImageVector? = null
