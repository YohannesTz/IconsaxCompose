package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeMute: ImageVector
    get() {
        val current = _volumeMute
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VolumeMute",
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
                moveTo(x = 19.25f, y = 7.41f)
                verticalLineToRelative(dy = 9.18f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.72f, dx2 = -0.62f, dy2 = 3.01f, dx3 = -1.73f, dy3 = 3.63f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.47f, dy1 = 0.37f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.54f, dy1 = -0.82f)
                lineToRelative(dx = -2.92f, dy = -1.83f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.66f, dy1 = -0.19f)
                horizontalLineTo(x = 9.0f)
                verticalLineTo(y = 6.25f)
                horizontalLineToRelative(dx = 0.93f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.66f, dy1 = -0.19f)
                lineToRelative(dx = 2.92f, dy = -1.83f)
                curveToRelative(dx1 = 1.46f, dy1 = -0.9f, dx2 = 2.89f, dy2 = -1.07f, dx3 = 4.01f, dy3 = -0.45f)
                reflectiveCurveToRelative(dx1 = 1.73f, dy1 = 1.91f, dx2 = 1.73f, dy2 = 3.63f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.0f, y = 6.25f)
                verticalLineToRelative(dy = 11.5f)
                horizontalLineTo(x = 8.5f)
                curveToRelative(dx1 = -2.42f, dy1 = 0.0f, dx2 = -3.75f, dy2 = -1.33f, dx3 = -3.75f, dy3 = -3.75f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.42f, dx2 = 1.33f, dy2 = -3.75f, dx3 = 3.75f, dy3 = -3.75f)
                close()
            }
        }.build().also { _volumeMute = it }
    }

@Suppress("ObjectPropertyName")
private var _volumeMute: ImageVector? = null
