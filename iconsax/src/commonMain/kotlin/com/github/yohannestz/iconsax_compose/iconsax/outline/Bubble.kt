package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bubble: ImageVector
    get() {
        val current = _bubble
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bubble",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.59f, y = 13.01f)
                arcToRelative(a = 5.9f, b = 5.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.88f, dy1 = -5.88f)
                arcToRelative(a = 5.9f, b = 5.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.88f, dy1 = -5.88f)
                arcToRelative(a = 5.9f, b = 5.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.88f, dy1 = 5.88f)
                arcToRelative(a = 5.9f, b = 5.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.88f, dy1 = 5.88f)
                moveToRelative(dx = 0.0f, dy = -10.26f)
                arcToRelative(a = 4.39f, b = 4.39f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.01f, dy1 = 8.77f)
                arcToRelative(a = 4.39f, b = 4.39f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.01f, dy1 = -8.77f)
                moveTo(x = 6.36f, y = 20.19f)
                arcToRelative(a = 3.84f, b = 3.84f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.01f, dy1 = -7.67f)
                arcToRelative(a = 3.84f, b = 3.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 7.67f)
                moveToRelative(dx = 0.0f, dy = -6.16f)
                arcToRelative(a = 2.33f, b = 2.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.67f)
                arcToRelative(a = 2.33f, b = 2.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.67f)
                moveToRelative(dx = 10.26f, dy = 8.72f)
                arcToRelative(a = 3.31f, b = 3.31f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.62f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.31f, dy1 = 3.3f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.31f, dy1 = 3.32f)
                moveToRelative(dx = 0.0f, dy = -5.13f)
                arcToRelative(a = 1.81f, b = 1.81f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.62f)
                arcToRelative(a = 1.81f, b = 1.81f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.62f)
                close()
            }
        }.build().also { _bubble = it }
    }

@Suppress("ObjectPropertyName")
private var _bubble: ImageVector? = null
