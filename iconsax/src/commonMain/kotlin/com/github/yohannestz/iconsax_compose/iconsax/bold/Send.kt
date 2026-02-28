package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Send: ImageVector
    get() {
        val current = _send
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Send",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.07f, y = 8.5f)
                lineTo(x = 9.51f, y = 4.24f)
                curveTo(x1 = 3.76f, y1 = 1.35f, x2 = 1.4f, y2 = 3.7f, x3 = 4.28f, y3 = 9.46f)
                lineToRelative(dx = 0.87f, dy = 1.74f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.6f)
                lineToRelative(dx = -0.87f, dy = 1.74f)
                curveToRelative(dx1 = -2.88f, dy1 = 5.75f, dx2 = -0.53f, dy2 = 8.1f, dx3 = 5.23f, dy3 = 5.23f)
                lineToRelative(dx = 8.56f, dy = -4.28f)
                curveToRelative(dx1 = 3.84f, dy1 = -1.92f, dx2 = 3.84f, dy2 = -5.06f, dx3 = 0.0f, dy3 = -6.98f)
                moveToRelative(dx = -3.23f, dy = 4.25f)
                horizontalLineToRelative(dx = -5.4f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 5.4f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _send = it }
    }

@Suppress("ObjectPropertyName")
private var _send: ImageVector? = null
