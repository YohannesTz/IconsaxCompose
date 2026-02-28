package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Speedometer: ImageVector
    get() {
        val current = _speedometer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Speedometer",
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
                moveTo(x = 19.1f, y = 20.3f)
                curveToRelative(dx1 = -0.2f, dy1 = 0.0f, dx2 = -0.4f, dy2 = -0.1f, dx3 = -0.5f, dy3 = -0.2f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.1f)
                curveToRelative(dx1 = 1.7f, dy1 = -1.7f, dx2 = 2.6f, dy2 = -4.0f, dx3 = 2.6f, dy3 = -6.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.1f, dx2 = -4.1f, dy2 = -9.2f, dx3 = -9.2f, dy3 = -9.2f)
                reflectiveCurveToRelative(dx1 = -9.2f, dy1 = 4.1f, dx2 = -9.2f, dy2 = 9.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.4f, dx2 = 0.9f, dy2 = 4.7f, dx3 = 2.6f, dy3 = 6.5f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.3f, dx2 = 0.3f, dy2 = 0.8f, dx3 = 0.0f, dy3 = 1.1f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.1f, dy1 = 0.0f)
                curveToRelative(dx1 = -2.0f, dy1 = -2.0f, dx2 = -3.1f, dy2 = -4.7f, dx3 = -3.1f, dy3 = -7.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -6.0f, dx2 = 4.9f, dy2 = -10.9f, dx3 = 10.8f, dy3 = -10.9f)
                reflectiveCurveToRelative(dx1 = 10.8f, dy1 = 4.8f, dx2 = 10.8f, dy2 = 10.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.8f, dx2 = -1.1f, dy2 = 5.5f, dx3 = -3.1f, dy3 = 7.5f)
                quadToRelative(dx1 = -0.3f, dy1 = 0.3f, dx2 = -0.6f, dy2 = 0.3f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -7.8f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 7.8f)
                moveToRelative(dx = 4.0f, dy = -13.5f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = 2.0f)
                verticalLineToRelative(dy = 0.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.7f, dx2 = 0.6f, dy2 = 1.2f, dx3 = 1.2f, dy3 = 1.2f)
                horizontalLineTo(x = 16.0f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = -0.9f, dx3 = 2.0f, dy3 = -2.0f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = -2.0f, dx2 = -2.0f, dy2 = -2.0f)
            }
        }.build().also { _speedometer = it }
    }

@Suppress("ObjectPropertyName")
private var _speedometer: ImageVector? = null
