package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectNotification: ImageVector
    get() {
        val current = _directNotification
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DirectNotification",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.0f, y = 8.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.0f)
                moveToRelative(dx = 1.34f, dy = 4.72f)
                horizontalLineToRelative(dx = -3.31f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.18f, dy1 = 1.34f)
                lineToRelative(dx = -0.8f, dy = 1.58f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.99f, dy1 = 0.61f)
                horizontalLineTo(x = 9.95f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.99f, dy1 = -0.62f)
                lineToRelative(dx = -0.79f, dy = -1.57f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.18f, dy1 = -1.35f)
                horizontalLineTo(x = 2.66f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 13.38f)
                verticalLineToRelative(dy = 3.09f)
                curveTo(x1 = 2.0f, y1 = 19.94f, x2 = 4.07f, y2 = 22.0f, x3 = 7.53f, y3 = 22.0f)
                horizontalLineToRelative(dx = 7.96f)
                curveToRelative(dx1 = 3.26f, dy1 = 0.0f, dx2 = 5.27f, dy2 = -1.79f, dx3 = 5.51f, dy3 = -4.96f)
                verticalLineToRelative(dy = -3.66f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.36f, dx2 = -0.3f, dy2 = -0.66f, dx3 = -0.66f, dy3 = -0.66f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.0f, y = 10.4f)
                verticalLineToRelative(dy = 0.93f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.66f, dy1 = -0.11f)
                horizontalLineToRelative(dx = -3.31f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.51f, dy1 = 2.17f)
                lineToRelative(dx = -0.7f, dy = 1.37f)
                horizontalLineToRelative(dx = -2.63f)
                lineTo(x = 9.51f, y = 13.4f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.52f, dy1 = -2.18f)
                horizontalLineTo(x = 2.66f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 11.33f)
                verticalLineTo(y = 8.52f)
                arcTo(horizontalEllipseRadius = 5.5f, verticalEllipseRadius = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.52f, y1 = 3.0f)
                horizontalLineToRelative(dx = 6.08f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.98f, dy1 = 1.2f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.3f, dy1 = 2.59f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.33f, dy1 = 2.33f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.59f, dy1 = 0.3f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.0f, y1 = 10.4f)
            }
        }.build().also { _directNotification = it }
    }

@Suppress("ObjectPropertyName")
private var _directNotification: ImageVector? = null
