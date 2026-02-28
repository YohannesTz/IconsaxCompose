package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.12f, y = 6.0f)
                curveToRelative(dx1 = 0.58f, dy1 = -0.28f, dx2 = 1.15f, dy2 = 0.02f, dx3 = 1.49f, dy3 = 0.3f)
                lineToRelative(dx = 2.06f, dy = 1.72f)
                arcToRelative(a = 1.32f, b = 1.32f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.04f, dy1 = 2.03f)
                lineTo(x = 13.58f, y = 12.0f)
                lineToRelative(dx = 2.13f, dy = 1.96f)
                arcToRelative(a = 1.32f, b = 1.32f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.04f, dy1 = 2.02f)
                lineTo(x = 13.6f, y = 17.7f)
                curveToRelative(dx1 = -0.34f, dy1 = 0.28f, dx2 = -0.9f, dy2 = 0.57f, dx3 = -1.48f, dy3 = 0.3f)
                reflectiveCurveToRelative(dx1 = -0.72f, dy1 = -0.89f, dx2 = -0.72f, dy2 = -1.34f)
                verticalLineToRelative(dy = -2.68f)
                lineTo(x = 9.1f, y = 16.11f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.02f, dy1 = -1.1f)
                lineToRelative(dx = 3.28f, dy = -3.0f)
                lineToRelative(dx = -3.28f, dy = -3.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 9.1f, y1 = 7.9f)
                lineToRelative(dx = 2.31f, dy = 2.12f)
                verticalLineTo(y = 7.34f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.44f, dx2 = 0.13f, dy2 = -1.06f, dx3 = 0.7f, dy3 = -1.34f)
                moveToRelative(dx = 0.79f, dy = 7.43f)
                lineToRelative(dx = 1.66f, dy = 1.52f)
                lineToRelative(dx = -1.66f, dy = 1.39f)
                close()
                moveToRelative(dx = 0.0f, dy = -2.85f)
                verticalLineToRelative(dy = -2.9f)
                lineToRelative(dx = 1.66f, dy = 1.38f)
                close()
            }
        }.build().also { _bluetoothCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _bluetoothCircle: ImageVector? = null
