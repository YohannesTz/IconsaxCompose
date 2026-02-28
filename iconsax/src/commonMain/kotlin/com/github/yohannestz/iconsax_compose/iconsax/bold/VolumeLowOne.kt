package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeLowOne: ImageVector
    get() {
        val current = _volumeLowOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VolumeLowOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.33f, y = 16.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = -1.2f)
                arcToRelative(a = 5.9f, b = 5.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -7.1f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.2f, dy1 = -0.9f)
                arcToRelative(a = 7.4f, b = 7.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 8.9f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = 0.3f)
                moveTo(x = 15.35f, y = 3.78f)
                curveToRelative(dx1 = -1.12f, dy1 = -0.62f, dx2 = -2.55f, dy2 = -0.46f, dx3 = -4.01f, dy3 = 0.45f)
                lineTo(x = 8.42f, y = 6.06f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.66f, dy1 = 0.2f)
                horizontalLineTo(x = 6.33f)
                curveTo(x1 = 3.9f, y1 = 6.25f, x2 = 2.58f, y2 = 7.57f, x3 = 2.58f, y3 = 10.0f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.42f, dx2 = 1.33f, dy2 = 3.75f, dx3 = 3.75f, dy3 = 3.75f)
                horizontalLineToRelative(dx = 1.43f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.66f, dy1 = 0.2f)
                lineToRelative(dx = 2.92f, dy = 1.82f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.54f, dy1 = 0.82f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.47f, dy1 = -0.37f)
                curveToRelative(dx1 = 1.1f, dy1 = -0.62f, dx2 = 1.73f, dy2 = -1.9f, dx3 = 1.73f, dy3 = -3.63f)
                verticalLineTo(y = 7.41f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.72f, dx2 = -0.62f, dy2 = -3.0f, dx3 = -1.73f, dy3 = -3.63f)
            }
        }.build().also { _volumeLowOne = it }
    }

@Suppress("ObjectPropertyName")
private var _volumeLowOne: ImageVector? = null
