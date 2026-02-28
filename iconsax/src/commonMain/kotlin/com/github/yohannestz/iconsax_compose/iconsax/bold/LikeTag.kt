package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 18.0f, y = 2.0f)
                horizontalLineTo(x = 6.0f)
                curveTo(x1 = 4.34f, y1 = 2.0f, x2 = 3.0f, y2 = 3.33f, x3 = 3.0f, y3 = 4.97f)
                verticalLineToRelative(dy = 10.91f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 2.97f)
                horizontalLineToRelative(dx = 0.76f)
                curveToRelative(dx1 = 0.8f, dy1 = 0.0f, dx2 = 1.56f, dy2 = 0.31f, dx3 = 2.12f, dy3 = 0.87f)
                lineToRelative(dx = 1.71f, dy = 1.69f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.83f, dy1 = 0.0f)
                lineToRelative(dx = 1.71f, dy = -1.69f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.12f, dy1 = -0.87f)
                horizontalLineTo(x = 18.0f)
                curveToRelative(dx1 = 1.66f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -1.33f, dx3 = 3.0f, dy3 = -2.97f)
                verticalLineTo(y = 4.97f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.0f, y1 = 2.0f)
                moveToRelative(dx = -1.32f, dy = 8.5f)
                lineToRelative(dx = -1.17f, dy = 3.56f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.42f, dy1 = 1.07f)
                horizontalLineToRelative(dx = -1.85f)
                curveToRelative(dx1 = -0.32f, dy1 = 0.0f, dx2 = -0.77f, dy2 = -0.11f, dx3 = -0.97f, dy3 = -0.31f)
                lineTo(x = 9.8f, y = 13.67f)
                curveToRelative(dx1 = -0.03f, dy1 = 0.64f, dx2 = -0.32f, dy2 = 0.91f, dx3 = -1.03f, dy3 = 0.91f)
                horizontalLineTo(x = 8.29f)
                curveToRelative(dx1 = -0.74f, dy1 = 0.0f, dx2 = -1.04f, dy2 = -0.29f, dx3 = -1.04f, dy3 = -0.99f)
                verticalLineTo(y = 8.82f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.7f, dx2 = 0.3f, dy2 = -0.99f, dx3 = 1.04f, dy3 = -0.99f)
                horizontalLineToRelative(dx = 0.49f)
                curveToRelative(dx1 = 0.74f, dy1 = 0.0f, dx2 = 1.04f, dy2 = 0.29f, dx3 = 1.04f, dy3 = 0.99f)
                verticalLineToRelative(dy = 0.36f)
                lineToRelative(dx = 1.94f, dy = -2.88f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.14f, dy1 = -0.36f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.67f, dy1 = 1.14f)
                lineToRelative(dx = -0.24f, dy = 1.56f)
                arcTo(horizontalEllipseRadius = 0.4f, verticalEllipseRadius = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 13.42f, y1 = 9.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.33f, dy1 = 0.15f)
                horizontalLineToRelative(dx = 1.95f)
                quadToRelative(dx1 = 0.59f, dy1 = 0.0f, dx2 = 0.89f, dy2 = 0.42f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.09f, dy1 = 0.93f)
            }
        }.build().also { _likeTag = it }
    }

@Suppress("ObjectPropertyName")
private var _likeTag: ImageVector? = null
