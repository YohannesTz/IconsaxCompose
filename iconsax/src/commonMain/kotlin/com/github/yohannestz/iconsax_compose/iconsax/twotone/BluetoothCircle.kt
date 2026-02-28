package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.59f, y = 15.56f)
                lineToRelative(dx = 6.62f, dy = -6.07f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.02f, dy1 = -0.89f)
                lineToRelative(dx = -2.06f, dy = -1.72f)
                curveToRelative(dx1 = -0.54f, dy1 = -0.45f, dx2 = -0.97f, dy2 = -0.24f, dx3 = -0.97f, dy3 = 0.46f)
                verticalLineToRelative(dy = 9.33f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.7f, dx2 = 0.44f, dy2 = 0.9f, dx3 = 0.97f, dy3 = 0.46f)
                lineToRelative(dx = 2.06f, dy = -1.72f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.02f, dy1 = -0.89f)
                lineTo(x = 8.59f, y = 8.45f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
        }.build().also { _bluetoothCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _bluetoothCircle: ImageVector? = null
