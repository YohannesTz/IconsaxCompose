package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Triangle: ImageVector
    get() {
        val current = _triangle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Triangle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.25f, y = 3.9f)
                verticalLineToRelative(dy = 9.02f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.43f, dy1 = 0.82f)
                lineToRelative(dx = -7.21f, dy = 5.05f)
                curveToRelative(dx1 = -0.59f, dy1 = 0.4f, dx2 = -1.43f, dy2 = 0.09f, dx3 = -1.56f, dy3 = -0.62f)
                arcTo(horizontalEllipseRadius = 4.6f, verticalEllipseRadius = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.7f, y1 = 15.2f)
                lineTo(x = 5.82f, y = 9.6f)
                lineToRelative(dx = 2.94f, dy = -5.3f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.5f, y1 = 3.24f)
                curveToRelative(dx1 = 0.6f, dy1 = -0.7f, dx2 = 1.75f, dy2 = -0.25f, dx3 = 1.75f, dy3 = 0.67f)
                moveToRelative(dx = 9.14f, dy = 14.89f)
                lineToRelative(dx = -7.21f, dy = -5.05f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.43f, dy1 = -0.82f)
                verticalLineTo(y = 3.9f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.92f, dx2 = 1.15f, dy2 = -1.37f, dx3 = 1.75f, dy3 = -0.67f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.74f, dy1 = 1.08f)
                lineToRelative(dx = 2.94f, dy = 5.29f)
                lineToRelative(dx = 3.12f, dy = 5.6f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.65f, dy1 = 2.97f)
                curveToRelative(dx1 = -0.13f, dy1 = 0.7f, dx2 = -0.97f, dy2 = 1.03f, dx3 = -1.56f, dy3 = 0.62f)
                moveTo(x = 5.26f, y = 19.14f)
                lineToRelative(dx = 6.15f, dy = -4.1f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.2f, dy1 = 0.0f)
                lineToRelative(dx = 6.15f, dy = 4.1f)
                curveToRelative(dx1 = 1.63f, dy1 = 1.09f, dx2 = 1.36f, dy2 = 1.98f, dx3 = -0.6f, dy3 = 1.98f)
                horizontalLineTo(x = 5.85f)
                curveToRelative(dx1 = -1.95f, dy1 = -0.01f, dx2 = -2.22f, dy2 = -0.9f, dx3 = -0.59f, dy3 = -1.98f)
            }
        }.build().also { _triangle = it }
    }

@Suppress("ObjectPropertyName")
private var _triangle: ImageVector? = null
