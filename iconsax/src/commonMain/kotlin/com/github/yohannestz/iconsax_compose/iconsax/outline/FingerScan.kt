package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FingerScan: ImageVector
    get() {
        val current = _fingerScan
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FingerScan",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.63f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.4f, dy1 = -2.4f)
                verticalLineToRelative(dy = -2.47f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.4f, dy1 = -2.4f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.4f, dy1 = 2.4f)
                verticalLineToRelative(dy = 2.47f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.4f, dy1 = 2.4f)
                moveToRelative(dx = 0.0f, dy = -5.76f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = 0.9f)
                verticalLineToRelative(dy = 2.47f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.5f, dx2 = 0.4f, dy2 = 0.9f, dx3 = 0.9f, dy3 = 0.9f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = -0.4f, dx2 = 0.9f, dy2 = -0.9f)
                verticalLineToRelative(dy = -2.47f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = -0.9f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 18.82f)
                arcToRelative(a = 5.76f, b = 5.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.75f, dy1 = -5.75f)
                verticalLineToRelative(dy = -2.14f)
                arcToRelative(a = 5.76f, b = 5.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 11.47f, dy1 = -0.59f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.67f, dy1 = 0.82f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.82f, dy1 = -0.67f)
                arcTo(horizontalEllipseRadius = 4.24f, verticalEllipseRadius = 4.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 6.68f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.25f, dy1 = 4.25f)
                verticalLineToRelative(dy = 2.14f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 17.32f)
                curveToRelative(dx1 = 2.2f, dy1 = 0.0f, dx2 = 4.06f, dy2 = -1.72f, dx3 = 4.24f, dy3 = -3.91f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.12f)
                arcTo(horizontalEllipseRadius = 5.8f, verticalEllipseRadius = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.82f)
                moveToRelative(dx = 10.0f, dy = -9.07f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.25f, y1 = 9.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.58f, dx2 = -1.67f, dy2 = -4.25f, dx3 = -4.25f, dy3 = -4.25f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 14.59f, y1 = 1.25f, x2 = 15.0f, y2 = 1.25f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 3.44f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 2.31f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 9.75f)
                moveToRelative(dx = -20.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.25f, y1 = 9.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.44f, dx2 = 2.31f, dy2 = -5.75f, dx3 = 5.75f, dy3 = -5.75f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.41f, y1 = 2.75f, x2 = 9.0f, y2 = 2.75f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 4.42f, y1 = 2.75f, x2 = 2.75f, y2 = 4.42f, x3 = 2.75f, y3 = 7.0f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 9.75f)
                moveToRelative(dx = 15.0f, dy = 13.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 2.58f, dy1 = 0.0f, dx2 = 4.25f, dy2 = -1.67f, dx3 = 4.25f, dy3 = -4.25f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.44f, dx2 = -2.31f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
                moveToRelative(dx = -8.0f, dy = 0.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.44f, dy1 = 0.0f, dx2 = -5.75f, dy2 = -2.31f, dx3 = -5.75f, dy3 = -5.75f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.75f, y1 = 14.59f, x2 = 2.75f, y2 = 15.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.58f, dx2 = 1.67f, dy2 = 4.25f, dx3 = 4.25f, dy3 = 4.25f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.41f, y1 = 22.75f, x2 = 9.0f, y2 = 22.75f)
            }
        }.build().also { _fingerScan = it }
    }

@Suppress("ObjectPropertyName")
private var _fingerScan: ImageVector? = null
