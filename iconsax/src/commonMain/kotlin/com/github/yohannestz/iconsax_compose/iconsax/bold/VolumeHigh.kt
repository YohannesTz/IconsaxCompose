package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeHigh: ImageVector
    get() {
        val current = _volumeHigh
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VolumeHigh",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.0f, y = 16.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = -1.2f)
                arcToRelative(a = 5.9f, b = 5.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -7.1f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.2f, dy1 = -0.9f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 8.9f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = 0.3f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.83f, y = 19.25f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = -1.2f)
                arcToRelative(a = 10.1f, b = 10.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -12.1f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.2f, dy1 = -0.9f)
                arcToRelative(a = 11.6f, b = 11.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 13.9f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = 0.3f)
                moveTo(x = 14.02f, y = 3.78f)
                curveToRelative(dx1 = -1.12f, dy1 = -0.62f, dx2 = -2.55f, dy2 = -0.46f, dx3 = -4.01f, dy3 = 0.45f)
                lineTo(x = 7.09f, y = 6.06f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.66f, dy1 = 0.2f)
                horizontalLineTo(x = 5.0f)
                curveToRelative(dx1 = -2.42f, dy1 = 0.0f, dx2 = -3.75f, dy2 = 1.32f, dx3 = -3.75f, dy3 = 3.74f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.42f, dx2 = 1.33f, dy2 = 3.75f, dx3 = 3.75f, dy3 = 3.75f)
                horizontalLineToRelative(dx = 1.43f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.66f, dy1 = 0.2f)
                lineToRelative(dx = 2.92f, dy = 1.82f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.54f, dy1 = 0.82f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.47f, dy1 = -0.37f)
                curveToRelative(dx1 = 1.11f, dy1 = -0.62f, dx2 = 1.73f, dy2 = -1.9f, dx3 = 1.73f, dy3 = -3.63f)
                verticalLineTo(y = 7.41f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.72f, dx2 = -0.62f, dy2 = -3.0f, dx3 = -1.73f, dy3 = -3.63f)
            }
        }.build().also { _volumeHigh = it }
    }

@Suppress("ObjectPropertyName")
private var _volumeHigh: ImageVector? = null
