package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Unlimited: ImageVector
    get() {
        val current = _unlimited
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Unlimited",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.45f, y = 17.3f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.24f, dy1 = -2.18f)
                curveToRelative(dx1 = -0.24f, dy1 = -0.33f, dx2 = -0.17f, dy2 = -0.8f, dx3 = 0.16f, dy3 = -1.05f)
                reflectiveCurveToRelative(dx1 = 0.8f, dy1 = -0.17f, dx2 = 1.05f, dy2 = 0.16f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.03f, dy1 = 1.56f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -7.6f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.49f, dy1 = 1.97f)
                lineToRelative(dx = -2.65f, dy = 4.41f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.77f, dy1 = 2.7f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.3f, dy1 = -5.3f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.3f, dy1 = -5.3f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.24f, dy1 = 2.18f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.16f, dy1 = 1.05f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.05f, dy1 = -0.16f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.03f, dy1 = -1.56f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 7.6f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.49f, dy1 = -1.97f)
                lineToRelative(dx = 2.65f, dy = -4.4f)
                curveToRelative(dx1 = 1.0f, dy1 = -1.68f, dx2 = 2.83f, dy2 = -2.7f, dx3 = 4.77f, dy3 = -2.7f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 10.6f)
            }
        }.build().also { _unlimited = it }
    }

@Suppress("ObjectPropertyName")
private var _unlimited: ImageVector? = null
