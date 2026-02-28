package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 19.14f, y = 20.25f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.54f, dy1 = -1.27f)
                arcToRelative(a = 9.2f, b = 9.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.65f, dy1 = -6.48f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -18.5f, dy1 = 0.0f)
                arcToRelative(a = 9.2f, b = 9.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.63f, dy1 = 6.46f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.01f, dy1 = 1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -0.01f)
                arcToRelative(a = 10.7f, b = 10.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.06f, dy1 = -7.51f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 18.42f, dy1 = 7.53f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 3.88f, b = 3.88f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -7.76f)
                arcTo(horizontalEllipseRadius = 3.88f, verticalEllipseRadius = 3.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 22.0f)
                moveToRelative(dx = 4.0f, dy = -13.5f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = 2.0f)
                verticalLineToRelative(dy = 0.75f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.25f, dy1 = 1.25f)
                horizontalLineTo(x = 16.0f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = -0.9f, dx3 = 2.0f, dy3 = -2.0f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = -2.0f, dx2 = -2.0f, dy2 = -2.0f)
            }
        }.build().also { _speedometer = it }
    }

@Suppress("ObjectPropertyName")
private var _speedometer: ImageVector? = null
