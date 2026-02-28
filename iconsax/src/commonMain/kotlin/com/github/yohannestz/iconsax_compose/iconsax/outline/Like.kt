package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Like: ImageVector
    get() {
        val current = _like
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Like",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.94f, dy1 = -0.8f)
                lineToRelative(dx = -1.71f, dy = -1.69f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.59f, dy1 = -0.65f)
                horizontalLineTo(x = 6.0f)
                arcToRelative(a = 3.74f, b = 3.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.75f, dy1 = -3.72f)
                verticalLineTo(y = 5.0f)
                arcTo(horizontalEllipseRadius = 3.74f, verticalEllipseRadius = 3.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 1.25f)
                horizontalLineToRelative(dx = 12.0f)
                arcToRelative(a = 3.74f, b = 3.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.75f, dy1 = 3.72f)
                verticalLineTo(y = 15.9f)
                arcTo(horizontalEllipseRadius = 3.74f, verticalEllipseRadius = 3.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 19.61f)
                horizontalLineToRelative(dx = -0.76f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.59f, dy1 = 0.65f)
                lineToRelative(dx = -1.71f, dy = 1.7f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.94f, dy1 = 0.8f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveToRelative(dx1 = -1.24f, dy1 = 0.0f, dx2 = -2.25f, dy2 = 1.0f, dx3 = -2.25f, dy3 = 2.22f)
                verticalLineToRelative(dy = 10.91f)
                arcTo(horizontalEllipseRadius = 2.23f, verticalEllipseRadius = 2.23f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.0f, y1 = 18.1f)
                horizontalLineToRelative(dx = 0.76f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.65f, dy1 = 1.1f)
                lineToRelative(dx = 1.71f, dy = 1.68f)
                arcToRelative(a = 1.27f, b = 1.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.77f, dy1 = 0.0f)
                lineToRelative(dx = 1.71f, dy = -1.69f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.65f, dy1 = -1.09f)
                horizontalLineTo(x = 18.0f)
                curveToRelative(dx1 = 1.24f, dy1 = 0.0f, dx2 = 2.25f, dy2 = -1.0f, dx3 = 2.25f, dy3 = -2.22f)
                verticalLineTo(y = 4.98f)
                arcTo(horizontalEllipseRadius = 2.23f, verticalEllipseRadius = 2.23f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.0f, y1 = 2.74f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.75f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.52f, dy1 = -0.08f)
                curveToRelative(dx1 = -1.32f, dy1 = -0.45f, dx2 = -4.72f, dy2 = -2.44f, dx3 = -4.72f, dy3 = -6.16f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.25f, dy1 = -2.57f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.25f, dy1 = 2.57f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.72f, dx2 = -3.41f, dy2 = 5.71f, dx3 = -4.72f, dy3 = 6.16f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 15.75f)
                moveToRelative(dx = -2.0f, dy = -8.0f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.75f, dy1 = 1.76f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.83f, dx2 = 2.75f, dy2 = 4.41f, dx3 = 3.71f, dy3 = 4.74f)
                horizontalLineToRelative(dx = 0.08f)
                curveToRelative(dx1 = 0.97f, dy1 = -0.34f, dx2 = 3.7f, dy2 = -1.92f, dx3 = 3.7f, dy3 = -4.73f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.15f, dy1 = -1.06f)
                curveToRelative(dx1 = -0.28f, dy1 = 0.38f, dx2 = -0.92f, dy2 = 0.38f, dx3 = -1.2f, dy3 = 0.0f)
                arcTo(horizontalEllipseRadius = 1.7f, verticalEllipseRadius = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 10.0f, y1 = 7.75f)
            }
        }.build().also { _like = it }
    }

@Suppress("ObjectPropertyName")
private var _like: ImageVector? = null
