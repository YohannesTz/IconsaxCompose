package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 15.41f, y = 16.34f)
                lineToRelative(dx = -4.75f, dy = 4.75f)
                arcToRelative(a = 3.03f, b = 3.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.07f, dy1 = 0.18f)
                lineTo(x = 6.4f, y = 21.09f)
                lineToRelative(dx = -0.87f, dy = -0.87f)
                lineToRelative(dx = -1.79f, dy = -1.8f)
                lineToRelative(dx = -0.86f, dy = -0.85f)
                lineToRelative(dx = -0.19f, dy = -0.21f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.19f, dy1 = -4.04f)
                lineToRelative(dx = 3.69f, dy = -3.68f)
                lineToRelative(dx = 1.06f, dy = -1.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.12f, y = 10.64f)
                lineToRelative(dx = -5.71f, dy = 5.7f)
                lineToRelative(dx = -7.78f, dy = -7.76f)
                lineToRelative(dx = 5.71f, dy = -5.7f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.26f, dy1 = 0.0f)
                lineToRelative(dx = 3.52f, dy = 3.51f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.25f)
            }
        }.build().also { _eraser = it }
    }

@Suppress("ObjectPropertyName")
private var _eraser: ImageVector? = null
