package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 12.0f, y = 22.25f)
                arcTo(horizontalEllipseRadius = 4.13f, verticalEllipseRadius = 4.13f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 12.0f, y1 = 14.0f)
                arcTo(horizontalEllipseRadius = 4.13f, verticalEllipseRadius = 4.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.25f)
                moveToRelative(dx = 0.0f, dy = -6.75f)
                arcToRelative(a = 2.62f, b = 2.62f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.25f)
                arcToRelative(a = 2.62f, b = 2.62f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.25f)
                moveToRelative(dx = 4.0f, dy = -2.75f)
                horizontalLineToRelative(dx = -0.75f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = -1.5f)
                verticalLineTo(y = 10.5f)
                arcTo(horizontalEllipseRadius = 2.25f, verticalEllipseRadius = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 16.0f, y1 = 12.75f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 0.75f)
                horizontalLineTo(x = 16.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 16.41f, y1 = 9.75f, x2 = 16.0f, y2 = 9.75f)
            }
        }.build().also { _speedometer = it }
    }

@Suppress("ObjectPropertyName")
private var _speedometer: ImageVector? = null
