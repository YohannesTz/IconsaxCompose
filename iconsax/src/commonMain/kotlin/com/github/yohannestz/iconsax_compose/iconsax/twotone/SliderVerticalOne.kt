package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SliderVerticalOne: ImageVector
    get() {
        val current = _sliderVerticalOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SliderVerticalOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.5f, y = 5.0f)
                horizontalLineToRelative(dx = 9.0f)
                quadToRelative(dx1 = 0.93f, dy1 = 0.0f, dx2 = 1.66f, dy2 = 0.09f)
                curveTo(x1 = 20.79f, y1 = 5.38f, x2 = 21.5f, y2 = 6.62f, x3 = 21.5f, y3 = 10.0f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.38f, dx2 = -0.71f, dy2 = 4.62f, dx3 = -3.34f, dy3 = 4.91f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.5f, y1 = 19.0f)
                horizontalLineToRelative(dx = -9.0f)
                quadToRelative(dx1 = -0.93f, dy1 = 0.0f, dx2 = -1.66f, dy2 = -0.09f)
                curveTo(x1 = 3.21f, y1 = 18.62f, x2 = 2.5f, y2 = 17.38f, x3 = 2.5f, y3 = 14.0f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.38f, dx2 = 0.71f, dy2 = -4.62f, dx3 = 3.34f, dy3 = -4.91f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.5f, y1 = 5.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.5f, y = 2.0f)
                horizontalLineToRelative(dx = 15.0f)
                moveTo(x = 5.0f, y = 22.0f)
                horizontalLineToRelative(dx = 15.0f)
            }
        }.build().also { _sliderVerticalOne = it }
    }

@Suppress("ObjectPropertyName")
private var _sliderVerticalOne: ImageVector? = null
