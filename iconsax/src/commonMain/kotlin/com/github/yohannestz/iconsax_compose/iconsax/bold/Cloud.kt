package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cloud: ImageVector
    get() {
        val current = _cloud
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Cloud",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.74f, y = 12.9f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.26f, dy1 = -2.21f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.79f, dy1 = -1.65f)
                curveToRelative(dx1 = -0.55f, dy1 = -2.5f, dx2 = -2.09f, dy2 = -4.3f, dx3 = -4.28f, dy3 = -4.97f)
                arcToRelative(a = 6.9f, b = 6.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.87f, dy1 = 1.79f)
                arcToRelative(a = 6.3f, b = 6.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.43f, dy1 = 6.1f)
                arcToRelative(a = 4.05f, b = 4.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.1f, dy1 = 3.76f)
                lineTo(x = 2.0f, y = 16.02f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.97f, dy1 = 4.2f)
                horizontalLineToRelative(dx = 10.38f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.82f, dy1 = -1.48f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.57f, dy1 = -5.83f)
            }
        }.build().also { _cloud = it }
    }

@Suppress("ObjectPropertyName")
private var _cloud: ImageVector? = null
