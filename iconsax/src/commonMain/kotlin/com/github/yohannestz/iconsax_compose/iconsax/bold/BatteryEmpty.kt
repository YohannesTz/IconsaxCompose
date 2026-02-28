package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BatteryEmpty: ImageVector
    get() {
        val current = _batteryEmpty
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BatteryEmpty",
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
                moveToRelative(dx = -7.49f, dy = -4.21f)
                horizontalLineTo(x = 7.35f)
                curveTo(x1 = 3.25f, y1 = 4.79f, x2 = 2.0f, y2 = 6.04f, x3 = 2.0f, y3 = 10.14f)
                verticalLineToRelative(dy = 3.72f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.1f, dx2 = 1.25f, dy2 = 5.35f, dx3 = 5.35f, dy3 = 5.35f)
                horizontalLineToRelative(dx = 5.58f)
                curveToRelative(dx1 = 4.1f, dy1 = 0.0f, dx2 = 5.35f, dy2 = -1.25f, dx3 = 5.35f, dy3 = -5.35f)
                verticalLineToRelative(dy = -3.72f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.1f, dx2 = -1.25f, dy2 = -5.35f, dx3 = -5.35f, dy3 = -5.35f)
                moveTo(x = 7.1f, y = 14.18f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = 0.57f)
                lineToRelative(dx = -0.18f, dy = -0.02f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.55f, dy1 = -0.91f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.64f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.55f, dy1 = -0.91f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.91f, dy1 = 0.55f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.36f)
            }
        }.build().also { _batteryEmpty = it }
    }

@Suppress("ObjectPropertyName")
private var _batteryEmpty: ImageVector? = null
