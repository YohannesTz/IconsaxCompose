package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lock: ImageVector
    get() {
        val current = _lock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Lock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.75f, y = 8.0f)
                verticalLineToRelative(dy = 2.1f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.5f, dy1 = -0.1f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.15f, dx2 = -0.89f, dy2 = -5.25f, dx3 = -5.25f, dy3 = -5.25f)
                reflectiveCurveTo(x1 = 6.75f, y1 = 4.85f, x2 = 6.75f, y2 = 8.0f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.5f, dy1 = 0.1f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.9f, dx2 = 0.7f, dy2 = -6.75f, dx3 = 6.75f, dy3 = -6.75f)
                reflectiveCurveTo(x1 = 18.75f, y1 = 5.1f, x2 = 18.75f, y2 = 8.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 15.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.0f, dx2 = -1.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -4.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -1.0f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.34f, dx2 = 0.7f, dy2 = -4.59f, dx3 = 3.25f, dy3 = -4.9f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.5f, dy1 = -0.1f)
                horizontalLineToRelative(dx = 10.5f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.1f)
                curveTo(x1 = 21.3f, y1 = 10.41f, x2 = 22.0f, y2 = 11.66f, x3 = 22.0f, y3 = 15.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.0f, y = 17.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = -0.08f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.33f, dy1 = -0.21f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 16.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.2f, dx2 = 0.08f, dy2 = -0.38f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = -0.33f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.33f, dy1 = -0.21f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.09f, dy1 = 0.2f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = 0.34f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 16.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = 0.7f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.0f, y1 = 17.0f)
                moveToRelative(dx = 4.0f, dy = 0.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = -0.29f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.21f, dy1 = -0.33f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.0f, y1 = 16.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = -0.71f)
                arcToRelative(a = 1.05f, b = 1.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.42f, dy1 = 0.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = 1.09f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.21f, dy1 = 0.33f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 17.0f)
                moveToRelative(dx = 4.0f, dy = 0.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = -0.29f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 16.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = -0.71f)
                arcToRelative(a = 1.05f, b = 1.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.42f, dy1 = 0.0f)
                lineToRelative(dx = 0.12f, dy = 0.16f)
                lineToRelative(dx = 0.09f, dy = 0.17f)
                lineToRelative(dx = 0.06f, dy = 0.18f)
                lineTo(x = 17.0f, y = 16.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = 0.71f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 17.0f)
            }
        }.build().also { _lock = it }
    }

@Suppress("ObjectPropertyName")
private var _lock: ImageVector? = null
