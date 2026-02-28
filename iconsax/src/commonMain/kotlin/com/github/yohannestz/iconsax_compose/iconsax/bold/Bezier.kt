package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bezier: ImageVector
    get() {
        val current = _bezier
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bezier",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.14f, y = 7.72f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 23.0f, y1 = 7.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.86f, dy1 = -0.72f)
                quadTo(x1 = 19.07f, y1 = 6.26f, x2 = 19.0f, y2 = 6.25f)
                horizontalLineToRelative(dx = -4.0f)
                verticalLineTo(y = 5.5f)
                curveTo(x1 = 15.0f, y1 = 4.68f, x2 = 14.32f, y2 = 4.0f, x3 = 13.5f, y3 = 4.0f)
                horizontalLineToRelative(dx = -3.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 5.5f)
                verticalLineToRelative(dy = 0.75f)
                horizontalLineTo(x = 5.0f)
                quadToRelative(dx1 = -0.07f, dy1 = 0.0f, dx2 = -0.14f, dy2 = 0.03f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.0f, y1 = 5.0f)
                curveTo(x1 = 1.9f, y1 = 5.0f, x2 = 1.0f, y2 = 5.9f, x3 = 1.0f, y3 = 7.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = 2.0f, dx2 = 2.0f, dy2 = 2.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.86f, dy1 = -1.28f)
                quadTo(x1 = 4.93f, y1 = 7.74f, x2 = 5.0f, y2 = 7.75f)
                horizontalLineToRelative(dx = 2.57f)
                arcTo(horizontalEllipseRadius = 8.4f, verticalEllipseRadius = 8.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.28f, y1 = 15.0f)
                horizontalLineTo(x = 4.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.5f, dy1 = 1.5f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.0f, y1 = 20.0f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.61f, dy1 = -0.14f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.5f, y1 = 18.5f)
                verticalLineToRelative(dy = -2.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.0f, y1 = 15.0f)
                horizontalLineTo(x = 5.77f)
                lineToRelative(dx = 0.01f, dy = -0.09f)
                quadToRelative(dx1 = -0.02f, dy1 = -0.2f, dx2 = -0.02f, dy2 = -0.41f)
                arcToRelative(a = 6.8f, b = 6.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.26f, dy1 = -5.9f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 10.5f, y1 = 10.0f)
                horizontalLineToRelative(dx = 3.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.49f, dy1 = -1.4f)
                arcToRelative(a = 6.8f, b = 6.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.26f, dy1 = 5.9f)
                lineToRelative(dx = -0.02f, dy = 0.41f)
                lineToRelative(dx = 0.01f, dy = 0.09f)
                horizontalLineTo(x = 18.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.5f, dy1 = 1.5f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.89f, dy1 = 1.36f)
                arcTo(horizontalEllipseRadius = 1.4f, verticalEllipseRadius = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.0f, y1 = 20.0f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.5f, dy1 = -1.5f)
                verticalLineToRelative(dy = -2.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 20.0f, y1 = 15.0f)
                horizontalLineToRelative(dx = -0.28f)
                lineToRelative(dx = 0.03f, dy = -0.5f)
                arcToRelative(a = 8.4f, b = 8.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.32f, dy1 = -6.75f)
                horizontalLineTo(x = 19.0f)
                quadToRelative(dx1 = 0.07f, dy1 = 0.0f, dx2 = 0.14f, dy2 = -0.03f)
            }
        }.build().also { _bezier = it }
    }

@Suppress("ObjectPropertyName")
private var _bezier: ImageVector? = null
