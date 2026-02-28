package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Trontron: ImageVector
    get() {
        val current = _trontron
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Trontron",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 19.4f, y = 10.53f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.56f, dy1 = 0.91f)
                lineToRelative(dx = -6.95f, dy = 8.85f)
                curveToRelative(dx1 = -0.35f, dy1 = 0.45f, dx2 = -1.07f, dy2 = 0.16f, dx3 = -1.0f, dy3 = -0.4f)
                lineToRelative(dx = 0.7f, dy = -7.6f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.45f, dy1 = -0.51f)
                close()
                moveToRelative(dx = 2.24f, dy = -2.84f)
                arcToRelative(a = 0.42f, b = 0.42f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.21f, dy1 = 0.7f)
                lineToRelative(dx = -8.44f, dy = 1.7f)
                curveToRelative(dx1 = -0.55f, dy1 = 0.1f, dx2 = -0.91f, dy2 = -0.57f, dx3 = -0.51f, dy3 = -0.97f)
                lineTo(x = 17.5f, y = 4.1f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.82f, dy1 = 0.01f)
                close()
                moveToRelative(dx = -6.95f, dy = -4.5f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.33f, dy1 = 0.97f)
                lineToRelative(dx = -3.56f, dy = 3.56f)
                arcToRelative(a = 0.57f, b = 0.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.78f, dy1 = 0.02f)
                lineTo(x = 5.34f, y = 3.0f)
                curveTo(x1 = 4.92f, y1 = 2.62f, x2 = 5.24f, y2 = 1.93f, x3 = 5.8f, y3 = 2.0f)
                close()
                moveToRelative(dx = -3.97f, dy = 6.88f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.38f, dy1 = 0.94f)
                lineToRelative(dx = -0.86f, dy = 10.46f)
                curveToRelative(dx1 = -0.05f, dy1 = 0.6f, dx2 = -0.88f, dy2 = 0.72f, dx3 = -1.1f, dy3 = 0.16f)
                lineTo(x = 2.29f, y = 3.96f)
                curveTo(x1 = 2.07f, y1 = 3.4f, x2 = 2.75f, y2 = 2.93f, x3 = 3.2f, y3 = 3.33f)
                close()
            }
        }.build().also { _trontron = it }
    }

@Suppress("ObjectPropertyName")
private var _trontron: ImageVector? = null
