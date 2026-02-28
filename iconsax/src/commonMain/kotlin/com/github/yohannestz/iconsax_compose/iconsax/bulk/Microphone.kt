package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Microphone: ImageVector
    get() {
        val current = _microphone
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Microphone",
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
                moveTo(x = 12.0f, y = 21.93f)
                arcToRelative(a = 9.16f, b = 9.16f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -9.15f, dy1 = -9.15f)
                verticalLineTo(y = 10.9f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = -0.7f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = 0.7f)
                verticalLineToRelative(dy = 1.88f)
                arcToRelative(a = 7.75f, b = 7.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 15.48f, dy1 = 0.0f)
                verticalLineTo(y = 10.9f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = -0.7f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.7f, dy1 = 0.7f)
                verticalLineToRelative(dy = 1.88f)
                arcTo(horizontalEllipseRadius = 9.13f, verticalEllipseRadius = 9.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 21.93f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 6.1f, b = 6.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.1f, dy1 = 6.1f)
                verticalLineToRelative(dy = 4.69f)
                arcToRelative(a = 6.11f, b = 6.11f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 12.2f, dy1 = 0.0f)
                verticalLineTo(y = 8.1f)
                curveTo(x1 = 18.1f, y1 = 4.74f, x2 = 15.36f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                moveToRelative(dx = 2.18f, dy = 8.59f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.43f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.12f, dy1 = 0.0f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.43f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.43f, dy1 = -0.75f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.76f, dy1 = 0.0f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.43f, dy1 = 0.75f)
                moveToRelative(dx = 0.85f, dy = -2.77f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.78f, dy1 = 0.36f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.74f, dy1 = 0.0f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.8f, dy1 = -0.36f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.38f, dy1 = -0.78f)
                arcToRelative(a = 8.2f, b = 8.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.57f, dy1 = 0.0f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.37f, dy1 = 0.78f)
            }
        }.build().also { _microphone = it }
    }

@Suppress("ObjectPropertyName")
private var _microphone: ImageVector? = null
