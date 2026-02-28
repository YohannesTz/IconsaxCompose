package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.0f, y = 7.0f)
                verticalLineToRelative(dy = 10.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.93f, dx2 = -0.09f, dy2 = 1.66f)
                curveTo(x1 = 17.62f, y1 = 21.29f, x2 = 16.38f, y2 = 22.0f, x3 = 13.0f, y3 = 22.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -3.38f, dy1 = 0.0f, dx2 = -4.62f, dy2 = -0.71f, dx3 = -4.91f, dy3 = -3.34f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 17.0f)
                verticalLineTo(y = 7.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.93f, dx2 = 0.09f, dy2 = -1.66f)
                curveTo(x1 = 6.38f, y1 = 2.71f, x2 = 7.62f, y2 = 2.0f, x3 = 11.0f, y3 = 2.0f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 3.38f, dy1 = 0.0f, dx2 = 4.62f, dy2 = 0.71f, dx3 = 4.91f, dy3 = 3.34f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 7.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.0f, y = 17.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.93f, dx2 = 0.09f, dy2 = 1.66f)
                lineToRelative(dx = -0.42f, dy = 0.01f)
                horizontalLineTo(x = 5.33f)
                curveTo(x1 = 2.67f, y1 = 18.67f, x2 = 2.0f, y2 = 18.0f, x3 = 2.0f, y3 = 15.33f)
                verticalLineTo(y = 8.67f)
                curveTo(x1 = 2.0f, y1 = 6.0f, x2 = 2.67f, y2 = 5.33f, x3 = 5.33f, y3 = 5.33f)
                horizontalLineToRelative(dx = 0.34f)
                lineToRelative(dx = 0.42f, dy = 0.01f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.0f, y1 = 7.0f)
                close()
                moveToRelative(dx = 16.0f, dy = -8.33f)
                verticalLineToRelative(dy = 6.66f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.67f, dx2 = -0.67f, dy2 = 3.34f, dx3 = -3.33f, dy3 = 3.34f)
                horizontalLineToRelative(dx = -0.34f)
                lineToRelative(dx = -0.42f, dy = -0.01f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.0f, y1 = 17.0f)
                verticalLineTo(y = 7.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.93f, dx2 = -0.09f, dy2 = -1.66f)
                lineToRelative(dx = 0.42f, dy = -0.01f)
                horizontalLineToRelative(dx = 0.34f)
                curveTo(x1 = 21.33f, y1 = 5.33f, x2 = 22.0f, y2 = 6.0f, x3 = 22.0f, y3 = 8.67f)
            }
        }.build().also { _sliderHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _sliderHorizontal: ImageVector? = null
