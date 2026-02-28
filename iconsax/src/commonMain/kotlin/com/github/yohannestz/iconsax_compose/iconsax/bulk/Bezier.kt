package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                moveTo(x = 3.0f, y = 9.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.0f)
                moveToRelative(dx = 18.0f, dy = 0.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.0f)
                moveTo(x = 7.5f, y = 16.5f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.89f, dy1 = 1.36f)
                arcTo(horizontalEllipseRadius = 1.4f, verticalEllipseRadius = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 20.0f)
                horizontalLineTo(x = 4.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = -1.5f)
                verticalLineToRelative(dy = -2.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.0f, y1 = 15.0f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.5f, dy1 = 1.5f)
                moveToRelative(dx = 14.0f, dy = 0.0f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.0f, y1 = 20.0f)
                horizontalLineToRelative(dx = -2.0f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = -0.14f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.89f, dy1 = -1.36f)
                verticalLineToRelative(dy = -2.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 15.0f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.5f, dy1 = 1.5f)
                moveTo(x = 15.0f, y = 5.5f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.82f, dx2 = -0.68f, dy2 = 1.5f, dx3 = -1.5f, dy3 = 1.5f)
                horizontalLineToRelative(dx = -3.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 8.5f)
                verticalLineToRelative(dy = -3.0f)
                curveTo(x1 = 9.0f, y1 = 4.68f, x2 = 9.68f, y2 = 4.0f, x3 = 10.5f, y3 = 4.0f)
                horizontalLineToRelative(dx = 3.0f)
                curveTo(x1 = 14.32f, y1 = 4.0f, x2 = 15.0f, y2 = 4.68f, x3 = 15.0f, y3 = 5.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 9.0f, y = 6.25f)
                horizontalLineTo(x = 5.0f)
                curveTo(x1 = 4.59f, y1 = 6.25f, x2 = 4.25f, y2 = 6.59f, x3 = 4.25f, y3 = 7.0f)
                reflectiveCurveTo(x1 = 4.59f, y1 = 7.75f, x2 = 5.0f, y2 = 7.75f)
                horizontalLineToRelative(dx = 2.57f)
                arcToRelative(a = 8.4f, b = 8.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.28f, dy1 = 7.34f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.74f, dy1 = 0.66f)
                horizontalLineToRelative(dx = 0.09f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.66f, dy1 = -0.83f)
                quadToRelative(dx1 = -0.03f, dy1 = -0.2f, dx2 = -0.02f, dy2 = -0.41f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.6f, dx2 = 1.41f, dy2 = -5.0f, dx3 = 3.59f, dy3 = -6.1f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.68f, y1 = 7.4f)
                lineTo(x = 9.66f, y = 7.37f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.11f, dy1 = -0.36f)
                arcTo(horizontalEllipseRadius = 0.8f, verticalEllipseRadius = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 6.25f)
                moveToRelative(dx = 7.43f, dy = 1.5f)
                horizontalLineTo(x = 19.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 19.41f, y1 = 6.25f, x2 = 19.0f, y2 = 6.25f)
                horizontalLineToRelative(dx = -4.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.25f, y1 = 7.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.11f, dy1 = 0.36f)
                lineToRelative(dx = -0.02f, dy = 0.03f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.33f, dy1 = 1.01f)
                arcToRelative(a = 6.8f, b = 6.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.59f, dy1 = 6.1f)
                lineToRelative(dx = -0.02f, dy = 0.41f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.66f, dy1 = 0.83f)
                horizontalLineToRelative(dx = 0.09f)
                curveToRelative(dx1 = 0.38f, dy1 = 0.0f, dx2 = 0.7f, dy2 = -0.28f, dx3 = 0.74f, dy3 = -0.66f)
                quadToRelative(dx1 = 0.03f, dy1 = -0.3f, dx2 = 0.04f, dy2 = -0.59f)
                arcToRelative(a = 8.5f, b = 8.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.34f, dy1 = -6.74f)
            }
        }.build().also { _bezier = it }
    }

@Suppress("ObjectPropertyName")
private var _bezier: ImageVector? = null
