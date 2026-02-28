package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.82f)
                curveTo(x1 = 4.18f, y1 = 2.0f, x2 = 2.01f, y2 = 4.17f, x3 = 2.01f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.17f, dy2 = 5.81f, dx3 = 5.81f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.71f, y = 19.03f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = -0.11f)
                curveToRelative(dx1 = -0.23f, dy1 = -0.11f, dx2 = -0.77f, dy2 = -0.47f, dx3 = -0.77f, dy3 = -1.45f)
                verticalLineToRelative(dy = -3.42f)
                lineToRelative(dx = -2.92f, dy = 2.68f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -0.05f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.05f, dy1 = -1.06f)
                lineToRelative(dx = 3.93f, dy = -3.6f)
                verticalLineToRelative(dy = -0.08f)
                lineTo(x = 7.5f, y = 8.38f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.05f, dy1 = -1.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = -0.05f)
                lineToRelative(dx = 2.92f, dy = 2.68f)
                verticalLineTo(y = 6.53f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.98f, dx2 = 0.54f, dy2 = -1.34f, dx3 = 0.77f, dy3 = -1.45f)
                reflectiveCurveToRelative(dx1 = 0.85f, dy1 = -0.29f, dx2 = 1.6f, dy2 = 0.34f)
                lineToRelative(dx = 2.42f, dy = 2.02f)
                arcToRelative(a = 1.44f, b = 1.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.05f, dy1 = 2.18f)
                lineToRelative(dx = -2.61f, dy = 2.39f)
                lineToRelative(dx = 2.61f, dy = 2.39f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.48f, dy1 = 1.1f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 1.08f)
                lineTo(x = 13.8f, y = 18.6f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.09f, dy1 = 0.43f)
                moveToRelative(dx = 0.22f, dy = -5.73f)
                verticalLineToRelative(dy = 4.06f)
                lineToRelative(dx = 2.33f, dy = -1.95f)
                close()
                moveToRelative(dx = 0.0f, dy = -6.66f)
                verticalLineToRelative(dy = 4.0f)
                lineToRelative(dx = 2.33f, dy = -2.14f)
                close()
            }
        }.build().also { _bluetooth = it }
    }

@Suppress("ObjectPropertyName")
private var _bluetooth: ImageVector? = null
