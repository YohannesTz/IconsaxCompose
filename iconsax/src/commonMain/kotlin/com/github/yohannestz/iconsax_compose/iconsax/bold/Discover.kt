package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Discover: ImageVector
    get() {
        val current = _discover
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Discover",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.98f, y = 3.02f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.29f, dy1 = -0.91f)
                lineToRelative(dx = -9.8f, dy = 2.45f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.33f, dy1 = 3.33f)
                lineTo(x = 2.11f, y = 17.7f)
                arcToRelative(a = 3.46f, b = 3.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.19f, dy1 = 4.19f)
                lineToRelative(dx = 9.81f, dy = -2.45f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.33f, dy1 = -3.33f)
                lineToRelative(dx = 2.45f, dy = -9.81f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.91f, dy1 = -3.28f)
                moveTo(x = 12.0f, y = 15.88f)
                arcToRelative(a = 3.88f, b = 3.88f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -7.77f)
                arcToRelative(a = 3.88f, b = 3.88f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 7.77f)
            }
        }.build().also { _discover = it }
    }

@Suppress("ObjectPropertyName")
private var _discover: ImageVector? = null
