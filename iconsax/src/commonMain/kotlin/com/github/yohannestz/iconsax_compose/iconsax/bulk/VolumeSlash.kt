package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeSlash: ImageVector
    get() {
        val current = _volumeSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VolumeSlash",
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
                arcToRelative(a = 5.9f, b = 5.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.72f, dy1 = -5.84f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.4f, dy1 = -0.98f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.98f, dy1 = 0.4f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = 7.33f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = 0.29f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.83f, y = 19.25f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = -1.2f)
                arcToRelative(a = 10.1f, b = 10.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.23f, dy1 = -9.96f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.4f, dy1 = -0.98f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.98f, dy1 = 0.4f)
                arcToRelative(a = 11.6f, b = 11.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.41f, dy1 = 11.44f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = 0.3f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 14.04f, y = 12.96f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.71f, dy1 = 0.7f)
                verticalLineToRelative(dy = 2.94f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.72f, dx2 = -0.62f, dy2 = 3.0f, dx3 = -1.73f, dy3 = 3.63f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.47f, dy1 = 0.37f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.54f, dy1 = -0.82f)
                lineToRelative(dx = -0.64f, dy = -0.4f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.18f, dy1 = -1.55f)
                close()
                moveToRelative(dx = -0.02f, dy = -9.18f)
                curveToRelative(dx1 = -1.12f, dy1 = -0.62f, dx2 = -2.55f, dy2 = -0.46f, dx3 = -4.01f, dy3 = 0.45f)
                lineTo(x = 7.09f, y = 6.06f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.66f, dy1 = 0.2f)
                horizontalLineTo(x = 5.0f)
                curveToRelative(dx1 = -2.42f, dy1 = 0.0f, dx2 = -3.75f, dy2 = 1.32f, dx3 = -3.75f, dy3 = 3.74f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.42f, dx2 = 1.33f, dy2 = 3.75f, dx3 = 3.75f, dy3 = 3.75f)
                horizontalLineToRelative(dx = 1.25f)
                lineToRelative(dx = 9.5f, dy = -9.5f)
                verticalLineTo(y = 7.41f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.72f, dx2 = -0.62f, dy2 = -3.0f, dx3 = -1.73f, dy3 = -3.63f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.77f, y = 2.23f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.1f, dy1 = 0.0f)
                lineTo(x = 2.24f, y = 20.69f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -0.01f)
                lineTo(x = 21.77f, y = 3.3f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.08f)
            }
        }.build().also { _volumeSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _volumeSlash: ImageVector? = null
