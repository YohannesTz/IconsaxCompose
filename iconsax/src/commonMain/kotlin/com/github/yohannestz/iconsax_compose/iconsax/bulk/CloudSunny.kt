package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudSunny: ImageVector
    get() {
        val current = _cloudSunny
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudSunny",
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
                moveTo(x = 20.61f, y = 10.83f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.9f, dy1 = -1.78f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.44f, dy1 = -3.07f)
                curveToRelative(dx1 = -2.2f, dy1 = -2.66f, dx2 = -5.8f, dy2 = -2.65f, dx3 = -8.23f, dy3 = -1.27f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.92f, dy1 = 7.28f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.1f, dy1 = 4.06f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.96f, dy1 = 4.19f)
                horizontalLineToRelative(dx = 10.38f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.83f, dy1 = -1.49f)
                curveToRelative(dx1 = 2.51f, dy1 = -2.22f, dx2 = 2.18f, dy2 = -5.84f, dx3 = 0.42f, dy3 = -7.92f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.76f, y = 8.74f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.9f, dx2 = -0.32f, dy2 = 1.76f, dx3 = -0.9f, dy3 = 2.42f)
                lineToRelative(dx = -0.25f, dy = -0.33f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.91f, dy1 = -1.78f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.37f, dy1 = -2.98f)
                lineTo(x = 16.27f, y = 6.0f)
                lineToRelative(dx = -0.31f, dy = -0.34f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.07f, dy1 = -0.64f)
                arcToRelative(a = 3.73f, b = 3.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.73f, dy1 = 3.73f)
            }
        }.build().also { _cloudSunny = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudSunny: ImageVector? = null
