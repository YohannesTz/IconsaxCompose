package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Eraser: ImageVector
    get() {
        val current = _eraser
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Eraser",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.03f, y = 22.0f)
                horizontalLineToRelative(dx = -7.04f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 7.04f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = -7.39f, dy = -5.31f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.42f)
                lineToRelative(dx = -2.98f, dy = 2.98f)
                arcToRelative(a = 3.03f, b = 3.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.07f, dy1 = 0.18f)
                lineTo(x = 6.4f, y = 21.09f)
                lineToRelative(dx = -0.87f, dy = -0.87f)
                lineToRelative(dx = -1.79f, dy = -1.79f)
                lineToRelative(dx = -0.86f, dy = -0.86f)
                lineToRelative(dx = -0.19f, dy = -0.21f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.19f, dy1 = -4.04f)
                lineToRelative(dx = 2.98f, dy = -2.98f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.41f, dy1 = 0.0f)
                close()
                moveToRelative(dx = 7.48f, dy = -6.05f)
                lineToRelative(dx = -5.0f, dy = 5.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.41f, dy1 = 0.0f)
                lineTo(x = 8.34f, y = 9.3f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.42f)
                lineToRelative(dx = 5.0f, dy = -4.99f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.26f, dy1 = 0.0f)
                lineToRelative(dx = 3.52f, dy = 3.51f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.25f)
            }
        }.build().also { _eraser = it }
    }

@Suppress("ObjectPropertyName")
private var _eraser: ImageVector? = null
