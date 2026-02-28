package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 9.0f, y = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = -3.0f)
                verticalLineTo(y = 5.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = -3.0f)
                horizontalLineTo(x = 9.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = 3.0f)
                verticalLineToRelative(dy = 14.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 3.0f)
                moveTo(x = 4.5f, y = 5.93f)
                verticalLineToRelative(dy = 12.14f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = 0.49f)
                curveTo(x1 = 2.42f, y1 = 18.29f, x2 = 2.0f, y2 = 17.43f, x3 = 2.0f, y3 = 15.33f)
                verticalLineTo(y = 8.67f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.1f, dx2 = 0.42f, dy2 = -2.96f, dx3 = 1.9f, dy3 = -3.23f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.6f, dy1 = 0.49f)
                moveTo(x = 22.0f, y = 8.67f)
                verticalLineToRelative(dy = 6.66f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.1f, dx2 = -0.42f, dy2 = 2.96f, dx3 = -1.9f, dy3 = 3.23f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = -0.49f)
                verticalLineTo(y = 5.93f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.6f, dy1 = -0.49f)
                curveTo(x1 = 21.58f, y1 = 5.71f, x2 = 22.0f, y2 = 6.57f, x3 = 22.0f, y3 = 8.67f)
            }
        }.build().also { _sliderHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _sliderHorizontal: ImageVector? = null
