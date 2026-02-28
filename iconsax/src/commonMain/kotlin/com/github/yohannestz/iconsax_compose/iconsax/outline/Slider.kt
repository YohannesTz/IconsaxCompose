package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Slider: ImageVector
    get() {
        val current = _slider
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Slider",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                arcTo(horizontalEllipseRadius = 4.6f, verticalEllipseRadius = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.25f, y1 = 18.0f)
                verticalLineTo(y = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.75f, dx2 = 2.0f, dy2 = -4.75f, dx3 = 4.75f, dy3 = -4.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 2.75f, dy1 = 0.0f, dx2 = 4.75f, dy2 = 2.0f, dx3 = 4.75f, dy3 = 4.75f)
                verticalLineToRelative(dy = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.75f, dx2 = -2.0f, dy2 = 4.75f, dx3 = -4.75f, dy3 = 4.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 6.75f, y1 = 2.75f, x2 = 5.75f, y2 = 4.38f, x3 = 5.75f, y3 = 6.0f)
                verticalLineToRelative(dy = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.62f, dx2 = 1.0f, dy2 = 3.25f, dx3 = 3.25f, dy3 = 3.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 2.25f, dy1 = 0.0f, dx2 = 3.25f, dy2 = -1.63f, dx3 = 3.25f, dy3 = -3.25f)
                verticalLineTo(y = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.62f, dx2 = -1.0f, dy2 = -3.25f, dx3 = -3.25f, dy3 = -3.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.0f, y = 16.76f)
                horizontalLineTo(x = 5.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 4.59f, y1 = 15.26f, x2 = 5.0f, y2 = 15.26f)
                horizontalLineToRelative(dx = 14.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveTo(x = 2.0f, y = 20.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.25f, y1 = 20.0f)
                verticalLineTo(y = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.75f, y1 = 3.59f, x2 = 2.75f, y2 = 4.0f)
                verticalLineToRelative(dy = 16.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 20.75f)
                moveToRelative(dx = 20.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.25f, y1 = 20.0f)
                verticalLineTo(y = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 22.75f, y1 = 3.59f, x2 = 22.75f, y2 = 4.0f)
                verticalLineToRelative(dy = 16.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 20.75f)
            }
        }.build().also { _slider = it }
    }

@Suppress("ObjectPropertyName")
private var _slider: ImageVector? = null
