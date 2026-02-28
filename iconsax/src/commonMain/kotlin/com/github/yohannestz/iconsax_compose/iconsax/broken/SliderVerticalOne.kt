package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                moveTo(x = 17.0f, y = 18.0f)
                horizontalLineTo(x = 7.0f)
                quadToRelative(dx1 = -0.93f, dy1 = 0.0f, dx2 = -1.66f, dy2 = -0.09f)
                curveTo(x1 = 2.71f, y1 = 17.62f, x2 = 2.0f, y2 = 16.38f, x3 = 2.0f, y3 = 13.0f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.38f, dx2 = 0.71f, dy2 = -4.62f, dx3 = 3.34f, dy3 = -4.91f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 6.0f)
                horizontalLineToRelative(dx = 10.0f)
                quadToRelative(dx1 = 0.93f, dy1 = 0.0f, dx2 = 1.66f, dy2 = 0.09f)
                curveTo(x1 = 21.29f, y1 = 6.38f, x2 = 22.0f, y2 = 7.62f, x3 = 22.0f, y3 = 11.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.38f, dx2 = -0.71f, dy2 = 4.62f, dx3 = -3.34f, dy3 = 4.91f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 18.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.33f, y = 2.0f)
                curveToRelative(dx1 = 2.67f, dy1 = 0.0f, dx2 = 3.34f, dy2 = 0.67f, dx3 = 3.34f, dy3 = 3.33f)
                verticalLineToRelative(dy = 0.34f)
                lineToRelative(dx = -0.01f, dy = 0.42f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.0f, y1 = 6.0f)
                horizontalLineTo(x = 7.0f)
                quadTo(x1 = 6.07f, y1 = 6.0f, x2 = 5.34f, y2 = 6.09f)
                lineTo(x = 5.33f, y = 5.67f)
                verticalLineTo(y = 5.33f)
                curveTo(x1 = 5.33f, y1 = 2.67f, x2 = 6.0f, y2 = 2.0f, x3 = 8.67f, y3 = 2.0f)
                horizontalLineToRelative(dx = 2.2f)
                moveToRelative(dx = 4.46f, dy = 20.0f)
                horizontalLineTo(x = 8.67f)
                curveTo(x1 = 6.0f, y1 = 22.0f, x2 = 5.33f, y2 = 21.33f, x3 = 5.33f, y3 = 18.67f)
                verticalLineToRelative(dy = -0.34f)
                lineToRelative(dx = 0.01f, dy = -0.42f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.0f, y1 = 18.0f)
                horizontalLineToRelative(dx = 10.0f)
                quadToRelative(dx1 = 0.93f, dy1 = 0.0f, dx2 = 1.66f, dy2 = -0.09f)
                lineToRelative(dx = 0.01f, dy = 0.42f)
                verticalLineToRelative(dy = 0.34f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.66f, dx2 = -0.67f, dy2 = 3.33f, dx3 = -3.34f, dy3 = 3.33f)
            }
        }.build().also { _sliderVerticalOne = it }
    }

@Suppress("ObjectPropertyName")
private var _sliderVerticalOne: ImageVector? = null
