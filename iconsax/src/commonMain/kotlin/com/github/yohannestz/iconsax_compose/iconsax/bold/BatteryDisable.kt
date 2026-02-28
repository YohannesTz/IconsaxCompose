package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BatteryDisable: ImageVector
    get() {
        val current = _batteryDisable
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BatteryDisable",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
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
                moveToRelative(dx = -2.14f, dy = 1.14f)
                verticalLineToRelative(dy = 3.72f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.95f, dx2 = -2.4f, dy2 = 5.35f, dx3 = -5.35f, dy3 = 5.35f)
                horizontalLineTo(x = 9.26f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.85f, dy1 = -1.53f)
                lineTo(x = 15.67f, y = 6.2f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.62f, dy1 = -0.11f)
                curveToRelative(dx1 = 0.72f, dy1 = 0.83f, dx2 = 0.99f, dy2 = 2.12f, dx3 = 0.99f, dy3 = 4.05f)
                moveTo(x = 16.4f, y = 1.87f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.03f, dy1 = 0.23f)
                lineToRelative(dx = -1.71f, dy = 2.71f)
                lineToRelative(dx = -0.73f, dy = -0.02f)
                horizontalLineTo(x = 7.35f)
                curveTo(x1 = 3.25f, y1 = 4.79f, x2 = 2.0f, y2 = 6.04f, x3 = 2.0f, y3 = 10.14f)
                verticalLineToRelative(dy = 3.72f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.05f, dx2 = 0.7f, dy2 = 4.51f, dx3 = 2.74f, dy3 = 5.06f)
                lineTo(x = 3.37f, y = 21.1f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.23f, dy1 = 1.03f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.0f, y1 = 22.25f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.63f, dy1 = -0.35f)
                lineToRelative(dx = 12.0f, dy = -19.0f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.23f, dy1 = -1.03f)
            }
        }.build().also { _batteryDisable = it }
    }

@Suppress("ObjectPropertyName")
private var _batteryDisable: ImageVector? = null
