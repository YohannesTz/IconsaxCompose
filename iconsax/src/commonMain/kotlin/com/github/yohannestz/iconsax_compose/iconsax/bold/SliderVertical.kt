package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 22.0f, y = 15.0f)
                verticalLineTo(y = 9.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = -3.0f)
                horizontalLineTo(x = 5.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = 3.0f)
                verticalLineToRelative(dy = 6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 3.0f)
                horizontalLineToRelative(dx = 14.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = -3.0f)
                moveTo(x = 5.93f, y = 19.5f)
                horizontalLineToRelative(dx = 12.14f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.49f, dy1 = 0.6f)
                curveToRelative(dx1 = -0.27f, dy1 = 1.48f, dx2 = -1.14f, dy2 = 1.9f, dx3 = -3.23f, dy3 = 1.9f)
                horizontalLineTo(x = 8.67f)
                curveToRelative(dx1 = -2.1f, dy1 = 0.0f, dx2 = -2.96f, dy2 = -0.42f, dx3 = -3.23f, dy3 = -1.9f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.49f, dy1 = -0.6f)
                moveTo(x = 8.67f, y = 2.0f)
                horizontalLineToRelative(dx = 6.66f)
                curveToRelative(dx1 = 2.1f, dy1 = 0.0f, dx2 = 2.96f, dy2 = 0.42f, dx3 = 3.23f, dy3 = 1.9f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = 0.6f)
                horizontalLineTo(x = 5.93f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = -0.6f)
                curveTo(x1 = 5.71f, y1 = 2.42f, x2 = 6.57f, y2 = 2.0f, x3 = 8.67f, y3 = 2.0f)
            }
        }.build().also { _sliderVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _sliderVertical: ImageVector? = null
