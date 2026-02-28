package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
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
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 15.0f, y = 2.0f)
                horizontalLineTo(x = 9.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = 3.0f)
                verticalLineToRelative(dy = 14.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 3.0f)
                horizontalLineToRelative(dx = 6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = -3.0f)
                verticalLineTo(y = 5.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = -3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.67f, y = 5.33f)
                horizontalLineToRelative(dx = -0.69f)
                lineTo(x = 18.0f, y = 5.5f)
                verticalLineToRelative(dy = 13.0f)
                lineToRelative(dx = -0.02f, dy = 0.16f)
                horizontalLineToRelative(dx = 0.69f)
                curveToRelative(dx1 = 2.66f, dy1 = 0.0f, dx2 = 3.33f, dy2 = -0.66f, dx3 = 3.33f, dy3 = -3.33f)
                verticalLineTo(y = 8.67f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.67f, dx2 = -0.67f, dy2 = -3.34f, dx3 = -3.33f, dy3 = -3.34f)
                moveTo(x = 6.0f, y = 18.5f)
                verticalLineToRelative(dy = -13.0f)
                lineToRelative(dx = 0.02f, dy = -0.16f)
                lineToRelative(dx = -0.35f, dy = -0.01f)
                horizontalLineTo(x = 5.33f)
                curveTo(x1 = 2.67f, y1 = 5.33f, x2 = 2.0f, y2 = 6.0f, x3 = 2.0f, y3 = 8.67f)
                verticalLineToRelative(dy = 6.66f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.67f, dx2 = 0.67f, dy2 = 3.34f, dx3 = 3.33f, dy3 = 3.34f)
                horizontalLineToRelative(dx = 0.34f)
                lineToRelative(dx = 0.35f, dy = -0.01f)
                close()
            }
        }.build().also { _sliderHorizontalOne = it }
    }

@Suppress("ObjectPropertyName")
private var _sliderHorizontalOne: ImageVector? = null
