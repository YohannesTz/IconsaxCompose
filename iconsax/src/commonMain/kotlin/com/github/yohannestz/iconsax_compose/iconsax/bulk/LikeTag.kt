package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LikeTag: ImageVector
    get() {
        val current = _likeTag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LikeTag",
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
                moveTo(x = 18.0f, y = 18.86f)
                horizontalLineToRelative(dx = -0.76f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = 0.87f)
                lineToRelative(dx = -1.71f, dy = 1.7f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.83f, dy1 = 0.0f)
                lineToRelative(dx = -1.71f, dy = -1.7f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = -0.87f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -1.66f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -1.33f, dx3 = -3.0f, dy3 = -2.97f)
                verticalLineTo(y = 5.0f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 2.0f)
                horizontalLineToRelative(dx = 12.0f)
                curveToRelative(dx1 = 1.66f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 1.33f, dx3 = 3.0f, dy3 = 2.97f)
                verticalLineTo(y = 15.9f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 2.97f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.58f, y = 9.57f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.89f, dy1 = -0.42f)
                horizontalLineToRelative(dx = -1.95f)
                arcTo(horizontalEllipseRadius = 0.4f, verticalEllipseRadius = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 13.41f, y1 = 9.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.1f, dy1 = -0.37f)
                lineToRelative(dx = 0.24f, dy = -1.56f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.67f, dy1 = -1.14f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = 0.36f)
                lineTo(x = 9.8f, y = 9.17f)
                verticalLineTo(y = 8.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.7f, dx2 = -0.3f, dy2 = -1.0f, dx3 = -1.04f, dy3 = -1.0f)
                horizontalLineTo(x = 8.27f)
                curveToRelative(dx1 = -0.74f, dy1 = 0.0f, dx2 = -1.04f, dy2 = 0.3f, dx3 = -1.04f, dy3 = 1.0f)
                verticalLineToRelative(dy = 4.78f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.7f, dx2 = 0.3f, dy2 = 0.99f, dx3 = 1.04f, dy3 = 0.99f)
                horizontalLineToRelative(dx = 0.49f)
                curveToRelative(dx1 = 0.7f, dy1 = 0.0f, dx2 = 1.0f, dy2 = -0.27f, dx3 = 1.03f, dy3 = -0.91f)
                lineToRelative(dx = 1.47f, dy = 1.13f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.2f, dx2 = 0.65f, dy2 = 0.3f, dx3 = 0.97f, dy3 = 0.3f)
                horizontalLineToRelative(dx = 1.85f)
                curveToRelative(dx1 = 0.64f, dy1 = 0.0f, dx2 = 1.28f, dy2 = -0.47f, dx3 = 1.42f, dy3 = -1.06f)
                lineToRelative(dx = 1.17f, dy = -3.56f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.09f, dy1 = -0.91f)
            }
        }.build().also { _likeTag = it }
    }

@Suppress("ObjectPropertyName")
private var _likeTag: ImageVector? = null
