package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationTick: ImageVector
    get() {
        val current = _locationTick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LocationTick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.62f, y = 8.49f)
                curveToRelative(dx1 = 1.97f, dy1 = -8.66f, dx2 = 14.8f, dy2 = -8.65f, dx3 = 16.76f, dy3 = 0.01f)
                curveToRelative(dx1 = 1.15f, dy1 = 5.08f, dx2 = -2.01f, dy2 = 9.38f, dx3 = -4.78f, dy3 = 12.04f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.21f, dy1 = 0.0f)
                curveToRelative(dx1 = -2.76f, dy1 = -2.66f, dx2 = -5.92f, dy2 = -6.97f, dx3 = -4.77f, dy3 = -12.05f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.25f, y = 11.5f)
                lineToRelative(dx = 1.5f, dy = 1.5f)
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
        }.build().also { _locationTick = it }
    }

@Suppress("ObjectPropertyName")
private var _locationTick: ImageVector? = null
