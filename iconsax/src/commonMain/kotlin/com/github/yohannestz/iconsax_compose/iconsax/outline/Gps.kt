package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gps: ImageVector
    get() {
        val current = _gps
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Gps",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 20.25f)
                arcToRelative(a = 8.26f, b = 8.26f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.02f, dy1 = -16.52f)
                arcTo(horizontalEllipseRadius = 8.26f, verticalEllipseRadius = 8.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 20.25f)
                moveToRelative(dx = 0.0f, dy = -15.0f)
                arcToRelative(a = 6.76f, b = 6.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 13.5f)
                arcToRelative(a = 6.76f, b = 6.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -13.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.75f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -7.5f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 7.5f)
                moveToRelative(dx = 0.0f, dy = -6.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.5f)
                moveToRelative(dx = 0.0f, dy = -5.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 4.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 1.59f, x2 = 12.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 4.75f)
                moveToRelative(dx = -8.0f, dy = 8.0f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 11.25f, x2 = 2.0f, y2 = 11.25f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 4.41f, y1 = 12.75f, x2 = 4.0f, y2 = 12.75f)
                moveToRelative(dx = 8.0f, dy = 10.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 22.0f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
                moveToRelative(dx = 10.0f, dy = -10.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _gps = it }
    }

@Suppress("ObjectPropertyName")
private var _gps: ImageVector? = null
