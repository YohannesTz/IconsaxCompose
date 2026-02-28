package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.5f, y = 9.5f)
                curveTo(x1 = 22.0f, y1 = 9.5f, x2 = 22.0f, y2 = 10.0f, x3 = 22.0f, y3 = 11.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.0f, dx2 = 0.0f, dy2 = 1.5f, dx3 = -1.5f, dy3 = 1.5f)
                moveTo(x = 4.0f, y = 21.5f)
                lineToRelative(dx = 4.09f, dy = -6.47f)
                lineTo(x = 16.0f, y = 2.5f)
                moveTo(x = 2.0f, y = 14.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.4f, dx2 = 0.72f, dy2 = 4.63f, dx3 = 3.39f, dy3 = 4.92f)
                moveTo(x = 7.0f, y = 5.0f)
                curveToRelative(dx1 = -4.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = 1.0f, dx3 = -5.0f, dy3 = 5.0f)
                moveToRelative(dx = 11.0f, dy = 9.0f)
                curveToRelative(dx1 = 4.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -1.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.4f, dx2 = -0.72f, dy2 = -4.63f, dx3 = -3.37f, dy3 = -4.92f)
            }
        }.build().also { _batteryDisable = it }
    }

@Suppress("ObjectPropertyName")
private var _batteryDisable: ImageVector? = null
