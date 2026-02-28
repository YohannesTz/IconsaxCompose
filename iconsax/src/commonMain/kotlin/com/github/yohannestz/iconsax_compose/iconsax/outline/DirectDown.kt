package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectDown: ImageVector
    get() {
        val current = _directDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DirectDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 21.75f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.49f, dy1 = -2.11f)
                lineToRelative(dx = -6.1f, dy = -11.6f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.67f, dy1 = -4.6f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.58f, dy1 = -0.76f)
                lineTo(x = 10.9f, y = 4.3f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.2f, dy1 = 0.0f)
                lineToRelative(dx = 3.23f, dy = -1.62f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.6f, dy1 = 0.77f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.66f, dy1 = 4.6f)
                lineToRelative(dx = -6.1f, dy = 11.59f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.49f, dy1 = 2.1f)
                moveToRelative(dx = -6.12f, dy = -18.0f)
                arcTo(horizontalEllipseRadius = 2.5f, verticalEllipseRadius = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.15f, y1 = 4.5f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.42f, dy1 = 2.85f)
                lineToRelative(dx = 6.1f, dy = 11.59f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.16f, dy1 = 1.3f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.16f, dy1 = -1.3f)
                lineToRelative(dx = 6.1f, dy = -11.6f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.42f, dy1 = -2.84f)
                arcTo(horizontalEllipseRadius = 2.4f, verticalEllipseRadius = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.0f, y1 = 4.02f)
                lineToRelative(dx = -3.24f, dy = 1.62f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.53f, dy1 = 0.0f)
                lineTo(x = 7.0f, y = 4.02f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.1f, dy1 = -0.27f)
            }
        }.build().also { _directDown = it }
    }

@Suppress("ObjectPropertyName")
private var _directDown: ImageVector? = null
