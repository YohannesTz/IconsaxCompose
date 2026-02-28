package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
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
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 2.0f, y = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 3.0f)
                horizontalLineToRelative(dx = 14.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = -3.0f)
                verticalLineTo(y = 9.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = -3.0f)
                horizontalLineTo(x = 5.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = 3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.33f, y = 5.33f)
                verticalLineToRelative(dy = 0.34f)
                lineToRelative(dx = 0.01f, dy = 0.35f)
                lineTo(x = 5.5f, y = 6.0f)
                horizontalLineToRelative(dx = 13.0f)
                lineToRelative(dx = 0.16f, dy = 0.02f)
                lineToRelative(dx = 0.01f, dy = -0.35f)
                verticalLineTo(y = 5.33f)
                curveTo(x1 = 18.67f, y1 = 2.67f, x2 = 18.0f, y2 = 2.0f, x3 = 15.33f, y3 = 2.0f)
                horizontalLineTo(x = 8.67f)
                curveTo(x1 = 6.0f, y1 = 2.0f, x2 = 5.33f, y2 = 2.67f, x3 = 5.33f, y3 = 5.33f)
                moveTo(x = 18.5f, y = 18.0f)
                horizontalLineToRelative(dx = -13.0f)
                lineToRelative(dx = -0.16f, dy = -0.02f)
                lineToRelative(dx = -0.01f, dy = 0.35f)
                verticalLineToRelative(dy = 0.34f)
                curveTo(x1 = 5.33f, y1 = 21.33f, x2 = 6.0f, y2 = 22.0f, x3 = 8.67f, y3 = 22.0f)
                horizontalLineToRelative(dx = 6.66f)
                curveToRelative(dx1 = 2.67f, dy1 = 0.0f, dx2 = 3.34f, dy2 = -0.67f, dx3 = 3.34f, dy3 = -3.33f)
                verticalLineToRelative(dy = -0.34f)
                lineToRelative(dx = -0.01f, dy = -0.35f)
                close()
            }
        }.build().also { _sliderVerticalOne = it }
    }

@Suppress("ObjectPropertyName")
private var _sliderVerticalOne: ImageVector? = null
