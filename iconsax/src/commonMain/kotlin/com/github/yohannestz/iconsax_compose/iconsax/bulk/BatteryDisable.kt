package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 14.5f, y = 4.87f)
                lineTo(x = 5.52f, y = 19.09f)
                curveTo(x1 = 2.87f, y1 = 18.71f, x2 = 2.0f, y2 = 17.27f, x3 = 2.0f, y3 = 13.86f)
                verticalLineToRelative(dy = -3.72f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.1f, dx2 = 1.25f, dy2 = -5.35f, dx3 = 5.35f, dy3 = -5.35f)
                horizontalLineToRelative(dx = 5.58f)
                quadToRelative(dx1 = 0.87f, dy1 = 0.0f, dx2 = 1.57f, dy2 = 0.08f)
                moveToRelative(dx = 3.78f, dy = 5.27f)
                verticalLineToRelative(dy = 3.72f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.95f, dx2 = -2.4f, dy2 = 5.35f, dx3 = -5.35f, dy3 = 5.35f)
                horizontalLineTo(x = 7.45f)
                lineToRelative(dx = 8.78f, dy = -13.9f)
                curveToRelative(dx1 = 1.52f, dy1 = 0.69f, dx2 = 2.05f, dy2 = 2.15f, dx3 = 2.05f, dy3 = 4.83f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 4.0f, y = 22.25f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.4f, dy1 = -0.12f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.23f, dy1 = -1.03f)
                lineToRelative(dx = 12.0f, dy = -19.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.03f, dy1 = -0.23f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.23f, dy1 = 1.03f)
                lineToRelative(dx = -12.0f, dy = 19.0f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.0f, y1 = 22.25f)
            }
        }.build().also { _batteryDisable = it }
    }

@Suppress("ObjectPropertyName")
private var _batteryDisable: ImageVector? = null
