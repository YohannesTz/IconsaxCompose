package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lovely: ImageVector
    get() {
        val current = _lovely
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Lovely",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.8f, y = 9.91f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.77f, dy1 = 1.39f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.77f, dy1 = -1.39f)
                arcToRelative(a = 3.47f, b = 3.47f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.46f, dy1 = 3.48f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.32f, dy1 = 2.06f)
                curveToRelative(dx1 = 0.98f, dy1 = 3.11f, dx2 = 4.02f, dy2 = 4.98f, dx3 = 5.52f, dy3 = 5.49f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.77f, dy1 = 0.0f)
                curveToRelative(dx1 = 1.5f, dy1 = -0.51f, dx2 = 4.54f, dy2 = -2.37f, dx3 = 5.52f, dy3 = -5.49f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.32f, dy1 = -2.06f)
                arcToRelative(a = 3.46f, b = 3.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.45f, dy1 = -3.48f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.75f, y = 8.34f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.23f, dx2 = -0.23f, dy2 = 0.38f, dx3 = -0.45f, dy3 = 0.32f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.95f, dy1 = 0.74f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = 0.0f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.76f, dy1 = -0.9f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.68f, dy1 = 4.71f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.71f, dy1 = 6.34f)
                curveToRelative(dx1 = 0.07f, dy1 = 0.07f, dx2 = 0.01f, dy2 = 0.2f, dx3 = -0.08f, dy3 = 0.15f)
                curveTo(x1 = 8.08f, y1 = 18.77f, x2 = 2.0f, y2 = 14.91f, x3 = 2.0f, y3 = 8.34f)
                arcToRelative(a = 5.22f, b = 5.22f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.38f, dy1 = -3.15f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.17f, dy1 = -2.09f)
                curveToRelative(dx1 = 2.87f, dy1 = 0.0f, dx2 = 5.2f, dy2 = 2.34f, dx3 = 5.2f, dy3 = 5.24f)
            }
        }.build().also { _lovely = it }
    }

@Suppress("ObjectPropertyName")
private var _lovely: ImageVector? = null
