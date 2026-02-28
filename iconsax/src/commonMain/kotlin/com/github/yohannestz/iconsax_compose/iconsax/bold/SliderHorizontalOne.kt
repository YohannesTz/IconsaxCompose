package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 3.5f, y = 5.06f)
                verticalLineToRelative(dy = 13.88f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 2.0f, y1 = 19.35f, x2 = 2.0f, y2 = 18.94f)
                verticalLineTo(y = 5.06f)
                curveTo(x1 = 2.0f, y1 = 4.65f, x2 = 2.34f, y2 = 4.3f, x3 = 2.75f, y3 = 4.3f)
                reflectiveCurveTo(x1 = 3.5f, y1 = 4.65f, x2 = 3.5f, y2 = 5.06f)
                moveToRelative(dx = 18.5f, dy = 0.0f)
                verticalLineToRelative(dy = 13.88f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineTo(y = 5.06f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 22.0f, y1 = 4.65f, x2 = 22.0f, y2 = 5.06f)
                moveTo(x = 8.0f, y = 21.25f)
                horizontalLineToRelative(dx = 8.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = -3.0f)
                verticalLineTo(y = 5.75f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = -3.0f)
                horizontalLineTo(x = 8.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = 3.0f)
                verticalLineToRelative(dy = 12.5f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 3.0f)
            }
        }.build().also { _sliderHorizontalOne = it }
    }

@Suppress("ObjectPropertyName")
private var _sliderHorizontalOne: ImageVector? = null
