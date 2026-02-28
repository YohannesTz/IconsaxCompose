package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoCircle: ImageVector
    get() {
        val current = _videoCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.76f, y = 16.37f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.16f, dy1 = -0.3f)
                curveToRelative(dx1 = -0.8f, dy1 = -0.46f, dx2 = -1.26f, dy2 = -1.4f, dx3 = -1.26f, dy3 = -2.6f)
                verticalLineToRelative(dy = -2.95f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.18f, dx2 = 0.46f, dy2 = -2.13f, dx3 = 1.26f, dy3 = -2.6f)
                curveToRelative(dx1 = 0.8f, dy1 = -0.45f, dx2 = 1.84f, dy2 = -0.38f, dx3 = 2.87f, dy3 = 0.22f)
                lineToRelative(dx = 2.57f, dy = 1.48f)
                curveToRelative(dx1 = 1.02f, dy1 = 0.59f, dx2 = 1.61f, dy2 = 1.46f, dx3 = 1.61f, dy3 = 2.38f)
                reflectiveCurveToRelative(dx1 = -0.59f, dy1 = 1.79f, dx2 = -1.61f, dy2 = 2.38f)
                lineToRelative(dx = -2.57f, dy = 1.48f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.71f, dy1 = 0.5f)
                moveToRelative(dx = 0.01f, dy = -7.24f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.41f, dy1 = 0.1f)
                curveToRelative(dx1 = -0.32f, dy1 = 0.19f, dx2 = -0.51f, dy2 = 0.66f, dx3 = -0.51f, dy3 = 1.29f)
                verticalLineToRelative(dy = 2.96f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.63f, dx2 = 0.18f, dy2 = 1.1f, dx3 = 0.51f, dy3 = 1.29f)
                curveToRelative(dx1 = 0.32f, dy1 = 0.19f, dx2 = 0.82f, dy2 = 0.1f, dx3 = 1.37f, dy3 = -0.21f)
                lineToRelative(dx = 2.57f, dy = -1.48f)
                curveToRelative(dx1 = 0.55f, dy1 = -0.32f, dx2 = 0.86f, dy2 = -0.71f, dx3 = 0.86f, dy3 = -1.08f)
                reflectiveCurveToRelative(dx1 = -0.31f, dy1 = -0.77f, dx2 = -0.86f, dy2 = -1.08f)
                lineToRelative(dx = -2.57f, dy = -1.48f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.96f, dy1 = -0.31f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
        }.build().also { _videoCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _videoCircle: ImageVector? = null
