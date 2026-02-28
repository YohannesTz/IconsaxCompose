package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ship: ImageVector
    get() {
        val current = _ship
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ship",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.38f, y = 22.75f)
                horizontalLineTo(x = 9.62f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.57f, dy1 = -6.07f)
                lineToRelative(dx = -0.41f, dy = -1.86f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.66f, dy1 = -3.15f)
                lineToRelative(dx = 6.93f, dy = -2.78f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.54f, dy1 = 0.0f)
                lineToRelative(dx = 6.93f, dy = 2.78f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.66f, dy1 = 3.15f)
                lineToRelative(dx = -0.41f, dy = 1.86f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.57f, dy1 = 6.07f)
                moveTo(x = 12.0f, y = 10.05f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.22f, dy1 = 0.23f)
                lineToRelative(dx = -6.93f, dy = 2.78f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.76f, dy1 = 1.43f)
                lineToRelative(dx = 0.4f, dy = 1.86f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.12f, dy1 = 4.89f)
                horizontalLineToRelative(dx = 4.76f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.1f, dy1 = -4.9f)
                lineToRelative(dx = 0.42f, dy = -1.85f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.76f, dy1 = -1.43f)
                lineToRelative(dx = -6.93f, dy = -2.78f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = -0.23f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 22.0f)
                verticalLineTo(y = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 12.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.0f, y = 12.55f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.28f, dy1 = -0.05f)
                lineToRelative(dx = -5.5f, dy = -2.21f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.44f, dy1 = 0.0f)
                lineToRelative(dx = -5.5f, dy = 2.21f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.7f, dy1 = -0.08f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.34f, dy1 = -0.62f)
                verticalLineTo(y = 8.0f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.0f, y1 = 4.25f)
                horizontalLineToRelative(dx = 8.0f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.74f, y1 = 8.0f)
                verticalLineToRelative(dy = 3.8f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.33f, dy1 = 0.62f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.4f, dy1 = 0.13f)
                moveToRelative(dx = -7.0f, dy = -4.0f)
                quadToRelative(dx1 = 0.9f, dy1 = 0.0f, dx2 = 1.77f, dy2 = 0.34f)
                lineToRelative(dx = 4.48f, dy = 1.8f)
                verticalLineTo(y = 8.0f)
                arcTo(horizontalEllipseRadius = 2.25f, verticalEllipseRadius = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.0f, y1 = 5.75f)
                horizontalLineTo(x = 8.0f)
                arcTo(horizontalEllipseRadius = 2.25f, verticalEllipseRadius = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.75f, y1 = 8.0f)
                verticalLineToRelative(dy = 2.69f)
                lineToRelative(dx = 4.48f, dy = -1.8f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 8.55f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.5f, y = 5.75f)
                horizontalLineToRelative(dx = -5.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.75f, y1 = 5.0f)
                verticalLineTo(y = 3.0f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.75f, dy1 = -1.75f)
                horizontalLineToRelative(dx = 3.0f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.25f, y1 = 3.0f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = -4.25f, dy = -1.5f)
                horizontalLineToRelative(dx = 3.5f)
                verticalLineTo(y = 3.0f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.25f, dy1 = -0.25f)
                horizontalLineToRelative(dx = -3.0f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 10.25f, y1 = 3.0f)
                close()
            }
        }.build().also { _ship = it }
    }

@Suppress("ObjectPropertyName")
private var _ship: ImageVector? = null
