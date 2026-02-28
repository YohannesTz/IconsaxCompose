package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bluetooth: ImageVector
    get() {
        val current = _bluetooth
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bluetooth",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.93f, y = 10.64f)
                lineToRelative(dx = 2.33f, dy = -2.13f)
                lineToRelative(dx = -2.33f, dy = -1.87f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
                moveToRelative(dx = 0.08f, dy = 12.39f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.48f, dy1 = 1.1f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 1.08f)
                lineToRelative(dx = -2.42f, dy = 2.02f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.09f, dy1 = 0.45f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = -0.11f)
                curveToRelative(dx1 = -0.23f, dy1 = -0.11f, dx2 = -0.77f, dy2 = -0.47f, dx3 = -0.77f, dy3 = -1.45f)
                verticalLineToRelative(dy = -3.42f)
                lineToRelative(dx = -2.92f, dy = 2.68f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -0.05f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.05f, dy1 = -1.06f)
                lineToRelative(dx = 3.93f, dy = -3.6f)
                verticalLineToRelative(dy = -0.08f)
                lineTo(x = 7.49f, y = 8.38f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.04f, dy1 = -1.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = -0.05f)
                lineToRelative(dx = 2.92f, dy = 2.68f)
                verticalLineTo(y = 6.53f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.98f, dx2 = 0.54f, dy2 = -1.34f, dx3 = 0.77f, dy3 = -1.45f)
                reflectiveCurveToRelative(dx1 = 0.85f, dy1 = -0.29f, dx2 = 1.6f, dy2 = 0.34f)
                lineToRelative(dx = 2.42f, dy = 2.02f)
                arcToRelative(a = 1.44f, b = 1.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.05f, dy1 = 2.18f)
                lineTo(x = 13.67f, y = 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.93f, y = 17.36f)
                lineToRelative(dx = 2.33f, dy = -1.95f)
                lineToRelative(dx = -2.33f, dy = -2.11f)
                close()
            }
        }.build().also { _bluetooth = it }
    }

@Suppress("ObjectPropertyName")
private var _bluetooth: ImageVector? = null
