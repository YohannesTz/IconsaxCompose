package com.github.yohannestz.iconsax_compose.iconsax.outline

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
            ) {
                moveTo(x = 16.05f, y = 20.59f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.53f, dy1 = -0.83f)
                lineToRelative(dx = -2.92f, dy = -1.83f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.66f, dy1 = -0.2f)
                horizontalLineTo(x = 8.5f)
                curveToRelative(dx1 = -2.42f, dy1 = 0.0f, dx2 = -3.75f, dy2 = -1.32f, dx3 = -3.75f, dy3 = -3.74f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.42f, dx2 = 1.33f, dy2 = -3.75f, dx3 = 3.75f, dy3 = -3.75f)
                horizontalLineToRelative(dx = 1.43f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.66f, dy1 = -0.2f)
                lineToRelative(dx = 2.92f, dy = -1.82f)
                curveToRelative(dx1 = 1.46f, dy1 = -0.91f, dx2 = 2.88f, dy2 = -1.08f, dx3 = 4.0f, dy3 = -0.46f)
                reflectiveCurveToRelative(dx1 = 1.73f, dy1 = 1.9f, dx2 = 1.73f, dy2 = 3.64f)
                verticalLineToRelative(dy = 9.17f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.72f, dx2 = -0.62f, dy2 = 3.02f, dx3 = -1.73f, dy3 = 3.64f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.46f, dy1 = 0.38f)
                moveTo(x = 8.5f, y = 7.75f)
                curveToRelative(dx1 = -1.58f, dy1 = 0.0f, dx2 = -2.25f, dy2 = 0.67f, dx3 = -2.25f, dy3 = 2.25f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.58f, dx2 = 0.67f, dy2 = 2.25f, dx3 = 2.25f, dy3 = 2.25f)
                horizontalLineToRelative(dx = 1.43f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.46f, dy1 = 0.42f)
                lineToRelative(dx = 2.92f, dy = 1.83f)
                curveToRelative(dx1 = 0.97f, dy1 = 0.6f, dx2 = 1.87f, dy2 = 0.76f, dx3 = 2.48f, dy3 = 0.42f)
                reflectiveCurveToRelative(dx1 = 0.96f, dy1 = -1.2f, dx2 = 0.96f, dy2 = -2.32f)
                verticalLineTo(y = 7.4f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.13f, dx2 = -0.35f, dy2 = -1.98f, dx3 = -0.96f, dy3 = -2.31f)
                reflectiveCurveToRelative(dx1 = -1.51f, dy1 = -0.2f, dx2 = -2.48f, dy2 = 0.42f)
                lineToRelative(dx = -2.92f, dy = 1.83f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.46f, dy1 = 0.42f)
                close()
            }
        }.build().also { _volumeMute = it }
    }

@Suppress("ObjectPropertyName")
private var _volumeMute: ImageVector? = null
