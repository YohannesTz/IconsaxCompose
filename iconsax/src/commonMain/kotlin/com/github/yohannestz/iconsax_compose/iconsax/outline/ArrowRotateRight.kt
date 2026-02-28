package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowRotateRight: ImageVector
    get() {
        val current = _arrowRotateRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowRotateRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 9.43f, verticalEllipseRadius = 9.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 3.9f)
                quadToRelative(dx1 = 1.6f, dy1 = 0.0f, dx2 = 3.11f, dy2 = 0.46f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = 0.94f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.94f, dy1 = 0.5f)
                arcTo(horizontalEllipseRadius = 9.0f, verticalEllipseRadius = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 5.4f)
                arcToRelative(a = 7.93f, b = 7.93f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 15.84f)
                arcToRelative(a = 7.93f, b = 7.93f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.59f, dy1 = -12.32f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = -1.04f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.04f, dy1 = 0.21f)
                arcToRelative(a = 9.4f, b = 9.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.59f, dy1 = 5.24f)
                arcTo(horizontalEllipseRadius = 9.44f, verticalEllipseRadius = 9.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.13f, y = 6.07f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.57f, dy1 = -0.26f)
                lineToRelative(dx = -2.89f, dy = -3.32f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.07f, dy1 = -1.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.07f)
                lineToRelative(dx = 2.89f, dy = 3.32f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.07f, dy1 = 1.06f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = 0.19f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.76f, y = 8.53f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = -0.31f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.16f, dy1 = -1.05f)
                lineToRelative(dx = 3.37f, dy = -2.46f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.89f, dy1 = 1.21f)
                lineTo(x = 13.2f, y = 8.39f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.44f, dy1 = 0.14f)
            }
        }.build().also { _arrowRotateRight = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowRotateRight: ImageVector? = null
