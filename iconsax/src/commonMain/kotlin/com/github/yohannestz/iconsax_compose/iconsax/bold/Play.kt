package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Play: ImageVector
    get() {
        val current = _play
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Play",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.49f, y = 9.6f)
                lineTo(x = 5.6f, y = 16.77f)
                arcToRelative(a = 1.06f, b = 1.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.6f, dy1 = -0.9f)
                verticalLineToRelative(dy = -8.0f)
                arcToRelative(a = 4.54f, b = 4.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.8f, dy1 = -3.93f)
                lineToRelative(dx = 4.59f, dy = 2.64f)
                lineToRelative(dx = 2.09f, dy = 1.2f)
                arcToRelative(a = 1.06f, b = 1.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.01f, dy1 = 1.82f)
                moveToRelative(dx = 0.6f, dy = 5.86f)
                lineToRelative(dx = -4.05f, dy = 2.34f)
                lineTo(x = 10.0f, y = 20.13f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.28f, dy1 = -0.18f)
                curveToRelative(dx1 = -0.58f, dy1 = -0.4f, dx2 = -0.51f, dy2 = -1.29f, dx3 = 0.1f, dy3 = -1.65f)
                lineToRelative(dx = 12.7f, dy = -7.62f)
                curveToRelative(dx1 = 0.6f, dy1 = -0.36f, dx2 = 1.4f, dy2 = -0.02f, dx3 = 1.5f, dy3 = 0.67f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.93f, dy1 = 4.11f)
            }
        }.build().also { _play = it }
    }

@Suppress("ObjectPropertyName")
private var _play: ImageVector? = null
