package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WatchStatus: ImageVector
    get() {
        val current = _watchStatus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WatchStatus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.5f, y = 19.75f)
                horizontalLineToRelative(dx = -7.0f)
                curveToRelative(dx1 = -2.74f, dy1 = 0.0f, dx2 = -4.25f, dy2 = -1.51f, dx3 = -4.25f, dy3 = -4.25f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.74f, dx2 = 1.51f, dy2 = -4.25f, dx3 = 4.25f, dy3 = -4.25f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 2.74f, dy1 = 0.0f, dx2 = 4.25f, dy2 = 1.51f, dx3 = 4.25f, dy3 = 4.25f)
                verticalLineToRelative(dy = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.74f, dx2 = -1.51f, dy2 = 4.25f, dx3 = -4.25f, dy3 = 4.25f)
                moveToRelative(dx = -7.0f, dy = -14.0f)
                curveToRelative(dx1 = -1.93f, dy1 = 0.0f, dx2 = -2.75f, dy2 = 0.82f, dx3 = -2.75f, dy3 = 2.75f)
                verticalLineToRelative(dy = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.93f, dx2 = 0.82f, dy2 = 2.75f, dx3 = 2.75f, dy3 = 2.75f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 1.93f, dy1 = 0.0f, dx2 = 2.75f, dy2 = -0.82f, dx3 = 2.75f, dy3 = -2.75f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.93f, dx2 = -0.82f, dy2 = -2.75f, dx3 = -2.75f, dy3 = -2.75f)
                close()
                moveToRelative(dx = 7.5f, dy = -3.0f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 7.59f, y1 = 2.75f, x2 = 7.25f, y2 = 2.41f, x3 = 7.25f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 1.25f, x2 = 8.0f, y2 = 1.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 16.41f, y1 = 2.75f, x2 = 16.0f, y2 = 2.75f)
                moveToRelative(dx = 0.0f, dy = 20.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 21.25f, x2 = 8.0f, y2 = 21.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 14.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 14.0f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 4.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 14.75f)
                moveToRelative(dx = 3.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.25f, y1 = 14.0f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 0.74f, verticalEllipseRadius = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 14.75f)
                moveToRelative(dx = -6.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.25f, y1 = 14.0f)
                verticalLineToRelative(dy = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 9.75f, y1 = 12.59f, x2 = 9.75f, y2 = 13.0f)
                verticalLineToRelative(dy = 1.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 14.75f)
            }
        }.build().also { _watchStatus = it }
    }

@Suppress("ObjectPropertyName")
private var _watchStatus: ImageVector? = null
