package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Mouse: ImageVector
    get() {
        val current = _mouse
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Mouse",
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
                moveTo(x = 19.5f, y = 9.5f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.13f, dx2 = -3.37f, dy2 = 7.5f, dx3 = -7.5f, dy3 = 7.5f)
                reflectiveCurveToRelative(dx1 = -7.5f, dy1 = -3.37f, dx2 = -7.5f, dy2 = -7.5f)
                verticalLineToRelative(dy = -5.0f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.2f, dy1 = -5.3f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.55f, dy1 = -2.16f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 7.5f, verticalEllipseRadius = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.5f, y1 = 9.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.87f, y = 7.5f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 1.9f, verticalEllipseRadius = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 11.38f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.88f, dy1 = -1.88f)
                verticalLineToRelative(dy = -2.0f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.13f, dy1 = -1.72f)
                verticalLineTo(y = 2.04f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = 3.74f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.12f, dy1 = 1.72f)
            }
        }.build().also { _mouse = it }
    }

@Suppress("ObjectPropertyName")
private var _mouse: ImageVector? = null
