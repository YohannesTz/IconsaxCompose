package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GalleryFavorite: ImageVector
    get() {
        val current = _galleryFavorite
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GalleryFavorite",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.0f, y = 10.75f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.5f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 5.5f)
                moveToRelative(dx = 0.0f, dy = -4.0f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.5f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.43f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -2.32f, dx3 = -7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.43f, dx2 = 2.32f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 12.41f, y1 = 2.75f, x2 = 12.0f, y2 = 2.75f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.39f, y1 = 2.75f, x2 = 2.75f, y2 = 4.39f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.32f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.94f, y = 8.36f)
                curveToRelative(dx1 = -0.87f, dy1 = 0.0f, dx2 = -2.9f, dy2 = -1.07f, dx3 = -3.54f, dy3 = -3.02f)
                curveToRelative(dx1 = -0.43f, dy1 = -1.35f, dx2 = 0.07f, dy2 = -3.12f, dx3 = 1.63f, dy3 = -3.62f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.9f, dy1 = 0.22f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.92f, dy1 = -0.22f)
                curveToRelative(dx1 = 1.56f, dy1 = 0.5f, dx2 = 2.06f, dy2 = 2.27f, dx3 = 1.63f, dy3 = 3.62f)
                curveToRelative(dx1 = -0.63f, dy1 = 1.99f, dx2 = -2.77f, dy2 = 3.02f, dx3 = -3.54f, dy3 = 3.02f)
                moveToRelative(dx = -2.1f, dy = -3.48f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.12f, dy1 = 1.98f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.1f, dy1 = -1.98f)
                curveToRelative(dx1 = 0.2f, dy1 = -0.67f, dx2 = 0.0f, dy2 = -1.52f, dx3 = -0.67f, dy3 = -1.74f)
                curveToRelative(dx1 = -0.28f, dy1 = -0.1f, dx2 = -0.65f, dy2 = -0.04f, dx3 = -0.82f, dy3 = 0.22f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.23f, dy1 = 0.03f)
                curveToRelative(dx1 = -0.2f, dy1 = -0.3f, dx2 = -0.58f, dy2 = -0.33f, dx3 = -0.84f, dy3 = -0.25f)
                curveToRelative(dx1 = -0.67f, dy1 = 0.22f, dx2 = -0.88f, dy2 = 1.07f, dx3 = -0.67f, dy3 = 1.74f)
                moveTo(x = 2.66f, y = 19.7f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.41f, dy1 = -1.37f)
                lineToRelative(dx = 4.93f, dy = -3.31f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.55f, dy1 = 0.19f)
                lineToRelative(dx = 0.33f, dy = 0.29f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.84f, dy1 = 0.0f)
                lineToRelative(dx = 4.16f, dy = -3.57f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.8f, dy1 = 0.0f)
                lineToRelative(dx = 1.63f, dy = 1.4f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.08f, dy1 = 1.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.08f)
                lineToRelative(dx = -1.63f, dy = -1.4f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.85f, dy1 = 0.0f)
                lineToRelative(dx = -4.16f, dy = 3.57f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.8f, dy1 = 0.0f)
                lineToRelative(dx = -0.33f, dy = -0.3f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.73f, dy1 = -0.07f)
                lineToRelative(dx = -4.93f, dy = 3.3f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.42f, dy1 = 0.13f)
            }
        }.build().also { _galleryFavorite = it }
    }

@Suppress("ObjectPropertyName")
private var _galleryFavorite: ImageVector? = null
