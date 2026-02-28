package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Scan: ImageVector
    get() {
        val current = _scan
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Scan",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 2.0f, y = 9.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.25f, y1 = 9.0f)
                verticalLineTo(y = 6.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.9f, dx2 = 2.36f, dy2 = -5.25f, dx3 = 5.25f, dy3 = -5.25f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.41f, y1 = 2.75f, x2 = 9.0f, y2 = 2.75f)
                horizontalLineTo(x = 6.5f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.75f, y1 = 6.5f)
                verticalLineTo(y = 9.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 9.75f)
                moveToRelative(dx = 20.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.25f, y1 = 9.0f)
                verticalLineTo(y = 6.5f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.75f, dy1 = -3.75f)
                horizontalLineTo(x = 15.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 14.59f, y1 = 1.25f, x2 = 15.0f, y2 = 1.25f)
                horizontalLineToRelative(dx = 2.5f)
                arcToRelative(a = 5.26f, b = 5.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.25f, dy1 = 5.25f)
                verticalLineTo(y = 9.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 9.75f)
                moveToRelative(dx = -4.5f, dy = 13.0f)
                horizontalLineTo(x = 16.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 1.5f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.75f, dy1 = -3.75f)
                verticalLineTo(y = 16.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 1.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.9f, dx2 = -2.36f, dy2 = 5.25f, dx3 = -5.25f, dy3 = 5.25f)
                moveToRelative(dx = -8.5f, dy = 0.0f)
                horizontalLineTo(x = 6.5f)
                arcToRelative(a = 5.26f, b = 5.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.25f, dy1 = -5.25f)
                verticalLineTo(y = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.75f, y1 = 14.59f, x2 = 2.75f, y2 = 15.0f)
                verticalLineToRelative(dy = 2.5f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.75f, dy1 = 3.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.41f, y1 = 22.75f, x2 = 9.0f, y2 = 22.75f)
                moveToRelative(dx = 5.0f, dy = -4.5f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -2.42f, dy1 = 0.0f, dx2 = -3.75f, dy2 = -1.33f, dx3 = -3.75f, dy3 = -3.75f)
                verticalLineToRelative(dy = -5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.42f, dx2 = 1.33f, dy2 = -3.75f, dx3 = 3.75f, dy3 = -3.75f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 2.42f, dy1 = 0.0f, dx2 = 3.75f, dy2 = 1.33f, dx3 = 3.75f, dy3 = 3.75f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.42f, dx2 = -1.33f, dy2 = 3.75f, dx3 = -3.75f, dy3 = 3.75f)
                moveToRelative(dx = -4.0f, dy = -11.0f)
                curveToRelative(dx1 = -1.58f, dy1 = 0.0f, dx2 = -2.25f, dy2 = 0.67f, dx3 = -2.25f, dy3 = 2.25f)
                verticalLineToRelative(dy = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.58f, dx2 = 0.67f, dy2 = 2.25f, dx3 = 2.25f, dy3 = 2.25f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 1.58f, dy1 = 0.0f, dx2 = 2.25f, dy2 = -0.67f, dx3 = 2.25f, dy3 = -2.25f)
                verticalLineToRelative(dy = -5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.58f, dx2 = -0.67f, dy2 = -2.25f, dx3 = -2.25f, dy3 = -2.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.0f, y = 12.75f)
                horizontalLineTo(x = 5.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 4.59f, y1 = 11.25f, x2 = 5.0f, y2 = 11.25f)
                horizontalLineToRelative(dx = 14.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _scan = it }
    }

@Suppress("ObjectPropertyName")
private var _scan: ImageVector? = null
