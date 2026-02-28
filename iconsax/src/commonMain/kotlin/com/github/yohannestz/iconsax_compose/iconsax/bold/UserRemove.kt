package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserRemove: ImageVector
    get() {
        val current = _userRemove
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.UserRemove",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 14.0f)
                curveToRelative(dx1 = -5.01f, dy1 = 0.0f, dx2 = -9.09f, dy2 = 3.36f, dx3 = -9.09f, dy3 = 7.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = 0.5f)
                horizontalLineToRelative(dx = 17.18f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = -0.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.14f, dx2 = -4.08f, dy2 = -7.5f, dx3 = -9.09f, dy3 = -7.5f)
                moveToRelative(dx = 4.85f, dy = -8.2f)
                arcToRelative(a = 5.14f, b = 5.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.31f, dy1 = -2.33f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.27f, dy1 = -1.45f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.8f, dy1 = 1.45f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.0f, y1 = 7.07f)
                arcToRelative(a = 4.98f, b = 4.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 8.53f, dy1 = 3.47f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.32f, dy1 = -4.74f)
                moveTo(x = 14.0f, y = 9.0f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.32f, dy1 = 0.0f)
                lineToRelative(dx = -0.69f, dy = -0.7f)
                lineToRelative(dx = -0.66f, dy = 0.67f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.32f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 0.93f, verticalEllipseRadius = 0.93f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.0f, y1 = 7.65f)
                lineToRelative(dx = 0.66f, dy = -0.66f)
                lineToRelative(dx = -0.64f, dy = -0.62f)
                arcToRelative(a = 0.97f, b = 0.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.34f)
                arcToRelative(a = 0.97f, b = 0.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.34f, dy1 = 0.0f)
                lineToRelative(dx = 0.62f, dy = 0.64f)
                lineTo(x = 12.65f, y = 5.0f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.32f, dy1 = 0.0f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.32f)
                lineToRelative(dx = -0.66f, dy = 0.66f)
                lineToRelative(dx = 0.69f, dy = 0.7f)
                arcTo(horizontalEllipseRadius = 0.94f, verticalEllipseRadius = 0.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.0f, y1 = 9.0f)
            }
        }.build().also { _userRemove = it }
    }

@Suppress("ObjectPropertyName")
private var _userRemove: ImageVector? = null
