package com.github.yohannestz.iconsax_compose.iconsax.outline

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
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 8.26f, b = 8.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -8.25f, dy1 = -8.25f)
                verticalLineToRelative(dy = -5.0f)
                arcToRelative(a = 8.26f, b = 8.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 16.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.55f, dx2 = -3.7f, dy2 = 8.25f, dx3 = -8.25f, dy3 = 8.25f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcTo(horizontalEllipseRadius = 6.76f, verticalEllipseRadius = 6.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.25f, y1 = 9.5f)
                verticalLineToRelative(dy = 5.0f)
                arcToRelative(a = 6.76f, b = 6.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 13.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = -5.0f)
                arcTo(horizontalEllipseRadius = 6.76f, verticalEllipseRadius = 6.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 11.75f)
                arcTo(horizontalEllipseRadius = 2.25f, verticalEllipseRadius = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.75f, y1 = 9.5f)
                verticalLineToRelative(dy = -2.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 2.25f, verticalEllipseRadius = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 11.75f)
                moveToRelative(dx = 0.0f, dy = -5.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 6.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 6.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 6.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 1.59f, x2 = 12.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 4.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 6.75f)
            }
        }.build().also { _mouse = it }
    }

@Suppress("ObjectPropertyName")
private var _mouse: ImageVector? = null
