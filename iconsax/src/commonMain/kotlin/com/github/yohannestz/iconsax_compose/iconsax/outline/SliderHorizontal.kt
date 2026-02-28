package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SliderHorizontal: ImageVector
    get() {
        val current = _sliderHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SliderHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.0f, y = 22.25f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -3.3f, dy1 = 0.0f, dx2 = -5.29f, dy2 = -0.66f, dx3 = -5.66f, dy3 = -4.01f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.09f, dy1 = -1.74f)
                verticalLineToRelative(dy = -9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.75f, dx2 = 0.03f, dy2 = -1.3f, dx3 = 0.1f, dy3 = -1.77f)
                curveTo(x1 = 4.71f, y1 = 2.41f, x2 = 6.7f, y2 = 1.75f, x3 = 10.0f, y3 = 1.75f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 3.3f, dy1 = 0.0f, dx2 = 5.29f, dy2 = 0.66f, dx3 = 5.66f, dy3 = 4.01f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.09f, dy1 = 1.74f)
                verticalLineToRelative(dy = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.75f, dx2 = -0.03f, dy2 = 1.3f, dx3 = -0.1f, dy3 = 1.77f)
                curveToRelative(dx1 = -0.36f, dy1 = 3.32f, dx2 = -2.35f, dy2 = 3.98f, dx3 = -5.65f, dy3 = 3.98f)
                moveToRelative(dx = -4.0f, dy = -19.0f)
                curveToRelative(dx1 = -3.31f, dy1 = 0.0f, dx2 = -3.94f, dy2 = 0.67f, dx3 = -4.17f, dy3 = 2.67f)
                arcTo(horizontalEllipseRadius = 13.0f, verticalEllipseRadius = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.75f, y1 = 7.5f)
                verticalLineToRelative(dy = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.68f, dx2 = 0.03f, dy2 = 1.16f, dx3 = 0.08f, dy3 = 1.55f)
                curveToRelative(dx1 = 0.22f, dy1 = 2.03f, dx2 = 0.86f, dy2 = 2.7f, dx3 = 4.17f, dy3 = 2.7f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 3.31f, dy1 = 0.0f, dx2 = 3.94f, dy2 = -0.67f, dx3 = 4.17f, dy3 = -2.67f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.08f, dy1 = -1.58f)
                verticalLineToRelative(dy = -9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.68f, dx2 = -0.03f, dy2 = -1.16f, dx3 = -0.08f, dy3 = -1.55f)
                curveToRelative(dx1 = -0.22f, dy1 = -2.03f, dx2 = -0.86f, dy2 = -2.7f, dx3 = -4.17f, dy3 = -2.7f)
                close()
                moveToRelative(dx = -8.0f, dy = 17.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.75f, y1 = 4.09f, x2 = 2.75f, y2 = 4.5f)
                verticalLineToRelative(dy = 15.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 20.25f)
                moveToRelative(dx = 20.0f, dy = -0.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.25f, y1 = 19.0f)
                verticalLineTo(y = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 22.75f, y1 = 3.59f, x2 = 22.75f, y2 = 4.0f)
                verticalLineToRelative(dy = 15.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 19.75f)
            }
        }.build().also { _sliderHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _sliderHorizontal: ImageVector? = null
