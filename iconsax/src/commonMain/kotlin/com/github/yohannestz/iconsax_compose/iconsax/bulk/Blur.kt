package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Blur: ImageVector
    get() {
        val current = _blur
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Blur",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.61f, y = 2.21f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.22f, dy1 = 0.0f)
                curveTo(x1 = 9.49f, y1 = 3.66f, x2 = 3.88f, y2 = 8.39f, x3 = 3.91f, y3 = 13.9f)
                arcToRelative(a = 8.11f, b = 8.11f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 16.2f, dy1 = 0.01f)
                curveToRelative(dx1 = 0.01f, dy1 = -5.43f, dx2 = -5.61f, dy2 = -10.24f, dx3 = -7.5f, dy3 = -11.7f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.09f, y = 14.2f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.27f, dy1 = 1.79f)
                lineToRelative(dx = -7.07f, dy = 3.44f)
                verticalLineToRelative(dy = 2.54f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = 0.0f)
                verticalLineTo(y = 2.31f)
                lineToRelative(dx = 0.13f, dy = -0.1f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.23f, dy1 = 0.0f)
                lineToRelative(dx = 0.14f, dy = 0.11f)
                verticalLineToRelative(dy = 5.44f)
                lineToRelative(dx = 3.78f, dy = -1.84f)
                arcToRelative(a = 22.0f, b = 22.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.95f, dy1 = 1.18f)
                lineToRelative(dx = -0.13f, dy = 0.09f)
                lineToRelative(dx = -4.6f, dy = 2.24f)
                verticalLineToRelative(dy = 3.33f)
                lineToRelative(dx = 6.29f, dy = -3.06f)
                lineToRelative(dx = 0.02f, dy = -0.01f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.56f, dy1 = 1.39f)
                lineToRelative(dx = -6.87f, dy = 3.35f)
                verticalLineToRelative(dy = 3.33f)
                lineToRelative(dx = 6.62f, dy = -3.22f)
                close()
            }
        }.build().also { _blur = it }
    }

@Suppress("ObjectPropertyName")
private var _blur: ImageVector? = null
