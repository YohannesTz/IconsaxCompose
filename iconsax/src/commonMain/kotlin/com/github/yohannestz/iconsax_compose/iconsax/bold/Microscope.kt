package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Microscope: ImageVector
    get() {
        val current = _microscope
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Microscope",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.84f, y = 10.9f)
                lineToRelative(dx = 5.66f, dy = -3.8f)
                arcToRelative(a = 1.24f, b = 1.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.34f, dy1 = -1.71f)
                lineToRelative(dx = -1.82f, dy = -2.71f)
                arcToRelative(a = 1.24f, b = 1.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.72f, dy1 = -0.34f)
                lineToRelative(dx = -5.66f, dy = 3.79f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.52f, y = 10.42f)
                lineToRelative(dx = -1.76f, dy = 1.18f)
                lineToRelative(dx = -2.67f, dy = 1.8f)
                lineToRelative(dx = -0.35f, dy = 0.22f)
                lineToRelative(dx = -0.16f, dy = -0.24f)
                lineToRelative(dx = -2.24f, dy = -3.34f)
                lineTo(x = 7.18f, y = 9.8f)
                lineToRelative(dx = 4.78f, dy = -3.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.64f, y = 16.02f)
                lineToRelative(dx = 3.95f, dy = -2.64f)
                lineToRelative(dx = -2.24f, dy = -3.34f)
                lineToRelative(dx = -3.95f, dy = 2.64f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.27f, dy1 = 1.39f)
                lineToRelative(dx = 1.13f, dy = 1.68f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.38f, dy1 = 0.27f)
                moveToRelative(dx = 10.92f, dy = 5.8f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.31f, dy1 = 0.06f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.69f, dy1 = -0.45f)
                lineToRelative(dx = -3.73f, dy = -8.24f)
                lineToRelative(dx = -3.78f, dy = 8.25f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.69f, dy1 = 0.44f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.31f, dy1 = -0.07f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.37f, dy1 = -1.0f)
                lineToRelative(dx = 3.41f, dy = -7.42f)
                lineToRelative(dx = 2.67f, dy = -1.79f)
                lineToRelative(dx = 4.17f, dy = 9.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.37f, dy1 = 1.0f)
            }
        }.build().also { _microscope = it }
    }

@Suppress("ObjectPropertyName")
private var _microscope: ImageVector? = null
