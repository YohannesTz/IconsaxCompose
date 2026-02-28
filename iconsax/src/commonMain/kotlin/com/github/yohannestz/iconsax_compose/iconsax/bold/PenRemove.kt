package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PenRemove: ImageVector
    get() {
        val current = _penRemove
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PenRemove",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 6.5f, y = 2.0f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.81f, dy1 = 0.99f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 6.5f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.46f, dy1 = 3.38f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.37f, dy1 = -2.18f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.5f, y1 = 2.0f)
                moveToRelative(dx = 1.66f, dy = 5.25f)
                horizontalLineTo(x = 4.8f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 4.39f, y1 = 5.75f, x2 = 4.8f, y2 = 5.75f)
                horizontalLineToRelative(dx = 3.36f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 21.29f)
                lineToRelative(dx = -9.36f, dy = 1.1f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.72f, dy1 = -0.26f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.19f, dy1 = -1.19f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.26f, dy1 = -1.7f)
                lineToRelative(dx = 0.85f, dy = -7.15f)
                lineToRelative(dx = 0.24f, dy = 0.08f)
                arcToRelative(a = 5.94f, b = 5.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.88f, dy1 = -1.15f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.0f, dy1 = -3.71f)
                lineToRelative(dx = 0.01f, dy = -0.15f)
                lineToRelative(dx = 0.17f, dy = 0.01f)
                lineToRelative(dx = 6.08f, dy = 6.09f)
                lineToRelative(dx = 0.26f, dy = 4.42f)
                curveToRelative(dx1 = 0.25f, dy1 = 2.48f, dx2 = -0.61f, dy2 = 3.34f, dx3 = -2.96f, dy3 = 3.61f)
                moveToRelative(dx = 6.0f, dy = -11.0f)
                lineToRelative(dx = -2.07f, dy = 1.3f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.21f, dy1 = -0.14f)
                lineToRelative(dx = -4.43f, dy = -4.43f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.14f, dy1 = -1.2f)
                lineToRelative(dx = 1.31f, dy = -2.08f)
                curveToRelative(dx1 = 0.8f, dy1 = -1.26f, dx2 = 2.4f, dy2 = -1.32f, dx3 = 3.59f, dy3 = -0.15f)
                lineToRelative(dx = 3.11f, dy = 3.11f)
                curveToRelative(dx1 = 1.09f, dy1 = 1.11f, dx2 = 1.02f, dy2 = 2.83f, dx3 = -0.16f, dy3 = 3.58f)
            }
        }.build().also { _penRemove = it }
    }

@Suppress("ObjectPropertyName")
private var _penRemove: ImageVector? = null
