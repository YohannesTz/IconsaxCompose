package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shield: ImageVector
    get() {
        val current = _shield
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Shield",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.41f, y = 6.96f)
                verticalLineTo(y = 8.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.64f, dx2 = -0.3f, dy2 = 1.24f, dx3 = -0.82f, dy3 = 1.61f)
                lineToRelative(dx = -11.0f, dy = 8.06f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.38f, dy1 = 0.0f)
                lineToRelative(dx = -1.44f, dy = -1.09f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.18f, dy1 = -2.36f)
                verticalLineTo(y = 6.96f)
                arcTo(horizontalEllipseRadius = 3.2f, verticalEllipseRadius = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.5f, y1 = 4.21f)
                lineToRelative(dx = 5.47f, dy = -2.05f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.06f, dy1 = 0.0f)
                lineToRelative(dx = 5.47f, dy = 2.05f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.91f, dy1 = 2.75f)
                moveToRelative(dx = -1.59f, dy = 5.38f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.6f, dy1 = 0.81f)
                verticalLineToRelative(dy = 1.88f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.19f, dy1 = 2.35f)
                lineToRelative(dx = -5.47f, dy = 4.1f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.76f, dy1 = -0.54f)
                lineToRelative(dx = -0.83f, dy = -0.62f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.01f, dy1 = -1.6f)
                close()
            }
        }.build().also { _shield = it }
    }

@Suppress("ObjectPropertyName")
private var _shield: ImageVector? = null
