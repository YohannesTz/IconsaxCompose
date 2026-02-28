package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BluetoothCircle: ImageVector
    get() {
        val current = _bluetoothCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BluetoothCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.6f, y = 18.1f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = -0.1f)
                curveToRelative(dx1 = -0.22f, dy1 = -0.1f, dx2 = -0.72f, dy2 = -0.42f, dx3 = -0.72f, dy3 = -1.33f)
                verticalLineTo(y = 14.0f)
                lineToRelative(dx = -2.3f, dy = 2.1f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -0.04f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.08f, y1 = 15.0f)
                lineToRelative(dx = 3.28f, dy = -3.01f)
                lineToRelative(dx = -3.28f, dy = -3.01f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.05f, dy1 = -1.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = -0.05f)
                lineToRelative(dx = 2.3f, dy = 2.1f)
                verticalLineTo(y = 7.33f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.9f, dx2 = 0.5f, dy2 = -1.23f, dx3 = 0.72f, dy3 = -1.34f)
                curveToRelative(dx1 = 0.21f, dy1 = -0.1f, dx2 = 0.79f, dy2 = -0.27f, dx3 = 1.49f, dy3 = 0.3f)
                lineTo(x = 15.66f, y = 8.0f)
                arcToRelative(a = 1.33f, b = 1.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.05f, dy1 = 2.02f)
                lineToRelative(dx = -2.13f, dy = 1.95f)
                lineToRelative(dx = 2.13f, dy = 1.95f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.44f, dy1 = 1.02f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = 1.0f)
                lineToRelative(dx = -2.06f, dy = 1.72f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = 0.45f)
                moveToRelative(dx = 0.3f, dy = -4.7f)
                verticalLineToRelative(dy = 2.93f)
                lineToRelative(dx = 1.67f, dy = -1.4f)
                close()
                moveToRelative(dx = 0.0f, dy = -5.73f)
                verticalLineToRelative(dy = 2.92f)
                lineToRelative(dx = 1.67f, dy = -1.53f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
        }.build().also { _bluetoothCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _bluetoothCircle: ImageVector? = null
