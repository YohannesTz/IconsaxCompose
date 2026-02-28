package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BluetoothRectangle: ImageVector
    get() {
        val current = _bluetoothRectangle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BluetoothRectangle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.9f, y = 16.33f)
                lineToRelative(dx = 1.67f, dy = -1.39f)
                lineToRelative(dx = -1.67f, dy = -1.53f)
                close()
                moveToRelative(dx = 0.0f, dy = -5.74f)
                lineToRelative(dx = 1.67f, dy = -1.53f)
                lineToRelative(dx = -1.67f, dy = -1.39f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 2.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 6.0f, y1 = 2.0f, x2 = 4.0f, y2 = 4.0f, x3 = 4.0f, y3 = 7.0f)
                verticalLineToRelative(dy = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 2.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -2.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                moveToRelative(dx = 0.72f, dy = 11.95f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.44f, dy1 = 1.02f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = 1.0f)
                lineTo(x = 13.6f, y = 17.7f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = 0.41f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = -0.1f)
                curveToRelative(dx1 = -0.22f, dy1 = -0.1f, dx2 = -0.72f, dy2 = -0.43f, dx3 = -0.72f, dy3 = -1.34f)
                verticalLineTo(y = 14.0f)
                lineToRelative(dx = -2.3f, dy = 2.11f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -0.05f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.08f, y1 = 15.0f)
                lineToRelative(dx = 3.28f, dy = -3.0f)
                lineToRelative(dx = -3.28f, dy = -3.01f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.1f, y1 = 7.88f)
                lineTo(x = 11.4f, y = 10.0f)
                verticalLineTo(y = 7.33f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.9f, dx2 = 0.5f, dy2 = -1.23f, dx3 = 0.72f, dy3 = -1.34f)
                curveToRelative(dx1 = 0.21f, dy1 = -0.1f, dx2 = 0.79f, dy2 = -0.28f, dx3 = 1.49f, dy3 = 0.3f)
                lineToRelative(dx = 2.06f, dy = 1.72f)
                arcToRelative(a = 1.33f, b = 1.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.05f, dy1 = 2.02f)
                lineTo(x = 13.58f, y = 12.0f)
                close()
            }
        }.build().also { _bluetoothRectangle = it }
    }

@Suppress("ObjectPropertyName")
private var _bluetoothRectangle: ImageVector? = null
