package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Timer: ImageVector
    get() {
        val current = _timer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Timer",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.39f, y = 15.67f)
                lineTo(x = 13.35f, y = 12.0f)
                horizontalLineToRelative(dx = -2.71f)
                lineTo(x = 6.6f, y = 15.67f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.95f, dy1 = 4.01f)
                arcTo(horizontalEllipseRadius = 3.6f, verticalEllipseRadius = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.05f, y1 = 22.0f)
                horizontalLineToRelative(dx = 5.89f)
                arcToRelative(a = 3.62f, b = 3.62f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.45f, dy1 = -6.33f)
                moveToRelative(dx = -3.57f, dy = 2.47f)
                horizontalLineToRelative(dx = -3.64f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = -0.68f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.68f, dy1 = -0.68f)
                horizontalLineToRelative(dx = 3.64f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.68f, dy1 = 0.68f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = 0.68f)
                moveToRelative(dx = 4.53f, dy = -13.82f)
                arcTo(horizontalEllipseRadius = 3.6f, verticalEllipseRadius = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.95f, y1 = 2.0f)
                horizontalLineToRelative(dx = -5.9f)
                arcToRelative(a = 3.63f, b = 3.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.44f, dy1 = 6.33f)
                lineTo(x = 10.65f, y = 12.0f)
                horizontalLineToRelative(dx = 2.71f)
                lineToRelative(dx = 4.04f, dy = -3.67f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.95f, dy1 = -4.01f)
                moveToRelative(dx = -4.53f, dy = 2.91f)
                horizontalLineToRelative(dx = -3.64f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.5f, y1 = 6.55f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.68f, dy1 = -0.68f)
                horizontalLineToRelative(dx = 3.64f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.68f, dy1 = 0.68f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = 0.68f)
            }
        }.build().also { _timer = it }
    }

@Suppress("ObjectPropertyName")
private var _timer: ImageVector? = null
