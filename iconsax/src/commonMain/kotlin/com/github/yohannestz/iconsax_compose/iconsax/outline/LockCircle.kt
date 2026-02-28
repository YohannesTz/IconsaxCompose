package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LockCircle: ImageVector
    get() {
        val current = _lockCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LockCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 11.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.25f, y1 = 11.0f)
                verticalLineToRelative(dy = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.46f, dx2 = -0.36f, dy2 = -2.25f, dx3 = -2.25f, dy3 = -2.25f)
                reflectiveCurveTo(x1 = 9.75f, y1 = 8.54f, x2 = 9.75f, y2 = 10.0f)
                verticalLineToRelative(dy = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 8.25f, y1 = 11.41f, x2 = 8.25f, y2 = 11.0f)
                verticalLineToRelative(dy = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.93f, dx2 = 0.0f, dy2 = -3.75f, dx3 = 3.75f, dy3 = -3.75f)
                reflectiveCurveToRelative(dx1 = 3.75f, dy1 = 2.82f, dx2 = 3.75f, dy2 = 3.75f)
                verticalLineToRelative(dy = 1.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 11.75f)
                moveToRelative(dx = -3.0f, dy = 3.6f)
                arcTo(horizontalEllipseRadius = 1.36f, verticalEllipseRadius = 1.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.65f, y1 = 14.0f)
                arcTo(horizontalEllipseRadius = 1.36f, verticalEllipseRadius = 1.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 12.65f)
                arcTo(horizontalEllipseRadius = 1.36f, verticalEllipseRadius = 1.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 13.35f, y1 = 14.0f)
                arcTo(horizontalEllipseRadius = 1.36f, verticalEllipseRadius = 1.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 15.35f)
                moveToRelative(dx = 0.0f, dy = -1.5f)
                arcTo(horizontalEllipseRadius = 0.15f, verticalEllipseRadius = 0.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 11.85f, y1 = 14.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.17f, dx2 = 0.3f, dy2 = 0.17f, dx3 = 0.3f, dy3 = 0.0f)
                arcTo(horizontalEllipseRadius = 0.15f, verticalEllipseRadius = 0.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 13.85f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.5f, y = 17.75f)
                horizontalLineToRelative(dx = -5.0f)
                curveToRelative(dx1 = -2.4f, dy1 = 0.0f, dx2 = -3.25f, dy2 = -0.85f, dx3 = -3.25f, dy3 = -3.25f)
                verticalLineToRelative(dy = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.4f, dx2 = 0.85f, dy2 = -3.25f, dx3 = 3.25f, dy3 = -3.25f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 2.4f, dy1 = 0.0f, dx2 = 3.25f, dy2 = 0.85f, dx3 = 3.25f, dy3 = 3.25f)
                verticalLineToRelative(dy = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.4f, dx2 = -0.85f, dy2 = 3.25f, dx3 = -3.25f, dy3 = 3.25f)
                moveToRelative(dx = -5.0f, dy = -6.0f)
                curveToRelative(dx1 = -1.59f, dy1 = 0.0f, dx2 = -1.75f, dy2 = 0.16f, dx3 = -1.75f, dy3 = 1.75f)
                verticalLineToRelative(dy = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.59f, dx2 = 0.16f, dy2 = 1.75f, dx3 = 1.75f, dy3 = 1.75f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 1.75f, dy2 = -0.16f, dx3 = 1.75f, dy3 = -1.75f)
                verticalLineToRelative(dy = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.59f, dx2 = -0.16f, dy2 = -1.75f, dx3 = -1.75f, dy3 = -1.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
        }.build().also { _lockCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _lockCircle: ImageVector? = null
