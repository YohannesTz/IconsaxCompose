package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SliderVertical: ImageVector
    get() {
        val current = _sliderVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SliderVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.5f, y = 19.75f)
                horizontalLineToRelative(dx = -9.0f)
                curveToRelative(dx1 = -0.75f, dy1 = 0.0f, dx2 = -1.3f, dy2 = -0.03f, dx3 = -1.77f, dy3 = -0.1f)
                curveTo(x1 = 2.41f, y1 = 19.29f, x2 = 1.75f, y2 = 17.3f, x3 = 1.75f, y3 = 14.0f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.3f, dx2 = 0.66f, dy2 = -5.29f, dx3 = 4.01f, dy3 = -5.66f)
                arcTo(horizontalEllipseRadius = 13.0f, verticalEllipseRadius = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.5f, y1 = 4.25f)
                horizontalLineToRelative(dx = 9.0f)
                curveToRelative(dx1 = 0.75f, dy1 = 0.0f, dx2 = 1.3f, dy2 = 0.03f, dx3 = 1.77f, dy3 = 0.1f)
                curveTo(x1 = 21.6f, y1 = 4.72f, x2 = 22.25f, y2 = 6.7f, x3 = 22.25f, y3 = 10.0f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.3f, dx2 = -0.66f, dy2 = 5.29f, dx3 = -4.01f, dy3 = 5.66f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.74f, dy1 = 0.09f)
                moveToRelative(dx = -9.0f, dy = -14.0f)
                curveToRelative(dx1 = -0.68f, dy1 = 0.0f, dx2 = -1.16f, dy2 = 0.03f, dx3 = -1.55f, dy3 = 0.08f)
                curveToRelative(dx1 = -2.03f, dy1 = 0.23f, dx2 = -2.7f, dy2 = 0.86f, dx3 = -2.7f, dy3 = 4.17f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.31f, dx2 = 0.67f, dy2 = 3.94f, dx3 = 2.67f, dy3 = 4.17f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.58f, dy1 = 0.08f)
                horizontalLineToRelative(dx = 9.0f)
                curveToRelative(dx1 = 0.68f, dy1 = 0.0f, dx2 = 1.16f, dy2 = -0.03f, dx3 = 1.55f, dy3 = -0.08f)
                curveToRelative(dx1 = 2.03f, dy1 = -0.22f, dx2 = 2.7f, dy2 = -0.86f, dx3 = 2.7f, dy3 = -4.17f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.31f, dx2 = -0.67f, dy2 = -3.94f, dx3 = -2.67f, dy3 = -4.17f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.58f, dy1 = -0.08f)
                close()
                moveToRelative(dx = 12.0f, dy = -3.0f)
                horizontalLineToRelative(dx = -15.0f)
                curveTo(x1 = 4.09f, y1 = 2.75f, x2 = 3.75f, y2 = 2.41f, x3 = 3.75f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 4.09f, y1 = 1.25f, x2 = 4.5f, y2 = 1.25f)
                horizontalLineToRelative(dx = 15.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 0.5f, dy = 20.0f)
                horizontalLineTo(x = 5.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 4.59f, y1 = 21.25f, x2 = 5.0f, y2 = 21.25f)
                horizontalLineToRelative(dx = 15.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _sliderVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _sliderVertical: ImageVector? = null
