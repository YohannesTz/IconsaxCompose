package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BatteryCharging: ImageVector
    get() {
        val current = _batteryCharging
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BatteryCharging",
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
                moveTo(x = 12.93f, y = 4.79f)
                horizontalLineTo(x = 7.35f)
                curveTo(x1 = 3.25f, y1 = 4.79f, x2 = 2.0f, y2 = 6.04f, x3 = 2.0f, y3 = 10.14f)
                verticalLineToRelative(dy = 3.72f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.1f, dx2 = 1.25f, dy2 = 5.35f, dx3 = 5.35f, dy3 = 5.35f)
                horizontalLineToRelative(dx = 5.58f)
                curveToRelative(dx1 = 4.1f, dy1 = 0.0f, dx2 = 5.35f, dy2 = -1.25f, dx3 = 5.35f, dy3 = -5.35f)
                verticalLineToRelative(dy = -3.72f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.1f, dx2 = -1.25f, dy2 = -5.35f, dx3 = -5.35f, dy3 = -5.35f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.42f, y = 9.0f)
                lineTo(x = 19.9f, y = 8.98f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = 0.7f)
                verticalLineToRelative(dy = 4.65f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = 0.7f)
                lineToRelative(dx = 0.54f, dy = -0.02f)
                curveTo(x1 = 22.0f, y1 = 14.83f, x2 = 22.0f, y2 = 13.73f, x3 = 22.0f, y3 = 12.93f)
                verticalLineToRelative(dy = -1.86f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.8f, dx2 = 0.0f, dy2 = -1.9f, dx3 = -1.58f, dy3 = -2.07f)
                moveToRelative(dx = -10.41f, dy = 7.24f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = -0.18f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.44f, y1 = 15.0f)
                lineToRelative(dx = 1.8f, dy = -2.11f)
                quadToRelative(dx1 = 0.01f, dy1 = -0.04f, dx2 = -0.02f, dy2 = -0.09f)
                quadToRelative(dx1 = -0.03f, dy1 = -0.06f, dx2 = -0.11f, dy2 = -0.06f)
                horizontalLineTo(x = 9.12f)
                arcToRelative(a = 1.61f, b = 1.61f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.41f, dy1 = -2.43f)
                lineToRelative(dx = 1.71f, dy = -2.26f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.2f, dy1 = 0.9f)
                lineToRelative(dx = -1.65f, dy = 2.19f)
                quadTo(x1 = 9.0f, y1 = 11.1f, x2 = 9.02f, y2 = 11.19f)
                quadToRelative(dx1 = 0.03f, dy1 = 0.06f, dx2 = 0.11f, dy2 = 0.06f)
                horizontalLineToRelative(dx = 2.01f)
                arcToRelative(a = 1.61f, b = 1.61f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.41f, dy1 = 2.43f)
                lineToRelative(dx = -0.08f, dy = 0.11f)
                lineToRelative(dx = -1.87f, dy = 2.19f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.59f, dy1 = 0.26f)
            }
        }.build().also { _batteryCharging = it }
    }

@Suppress("ObjectPropertyName")
private var _batteryCharging: ImageVector? = null
