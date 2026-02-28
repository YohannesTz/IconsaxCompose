package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SliderHorizontalOne: ImageVector
    get() {
        val current = _sliderHorizontalOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SliderHorizontalOne",
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
                moveTo(x = 5.0f, y = 16.5f)
                verticalLineToRelative(dy = -9.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.93f, dx2 = 0.09f, dy2 = -1.66f)
                curveTo(x1 = 5.38f, y1 = 3.21f, x2 = 6.62f, y2 = 2.5f, x3 = 10.0f, y3 = 2.5f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 3.38f, dy1 = 0.0f, dx2 = 4.62f, dy2 = 0.71f, dx3 = 4.91f, dy3 = 3.34f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.0f, y1 = 7.5f)
                verticalLineToRelative(dy = 9.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.93f, dx2 = -0.09f, dy2 = 1.66f)
                curveToRelative(dx1 = -0.29f, dy1 = 2.63f, dx2 = -1.53f, dy2 = 3.34f, dx3 = -4.91f, dy3 = 3.34f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -3.38f, dy1 = 0.0f, dx2 = -4.62f, dy2 = -0.71f, dx3 = -4.91f, dy3 = -3.34f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 16.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 19.5f)
                verticalLineToRelative(dy = -15.0f)
                moveTo(x = 22.0f, y = 19.0f)
                verticalLineTo(y = 4.0f)
            }
        }.build().also { _sliderHorizontalOne = it }
    }

@Suppress("ObjectPropertyName")
private var _sliderHorizontalOne: ImageVector? = null
