package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrangeHorizontalCircle: ImageVector
    get() {
        val current = _arrangeHorizontalCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrangeHorizontalCircle",
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
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.85f, y = 13.53f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.41f, dy1 = -0.41f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.29f, dy1 = -0.06f)
                horizontalLineTo(x = 6.84f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = 0.75f, dx2 = 0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = 8.5f)
                lineToRelative(dx = -1.76f, dy = 1.76f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                quadToRelative(dx1 = 0.23f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                lineToRelative(dx = 3.04f, dy = -3.04f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.16f, dy1 = -0.24f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.01f, dy1 = -0.57f)
                moveToRelative(dx = -0.7f, dy = -4.1f)
                horizontalLineToRelative(dx = -8.5f)
                lineToRelative(dx = 1.76f, dy = -1.76f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineTo(x = 6.31f, y = 9.65f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.16f, dy1 = 0.24f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.57f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = 0.47f)
                horizontalLineToRelative(dx = 10.31f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.76f, dy2 = -0.75f)
            }
        }.build().also { _arrangeHorizontalCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _arrangeHorizontalCircle: ImageVector? = null
