package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotificationBing: ImageVector
    get() {
        val current = _notificationBing
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NotificationBing",
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
                moveTo(x = 20.4f, y = 16.33f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.64f, dy1 = 1.58f)
                arcToRelative(a = 22.0f, b = 22.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.64f, dy1 = 0.87f)
                lineToRelative(dx = -0.54f, dy = 0.07f)
                lineToRelative(dx = -0.68f, dy = 0.07f)
                arcToRelative(a = 24.0f, b = 24.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.79f, dy1 = -0.01f)
                lineToRelative(dx = -0.79f, dy = -0.09f)
                lineToRelative(dx = -0.44f, dy = -0.06f)
                lineToRelative(dx = -0.33f, dy = -0.05f)
                arcToRelative(a = 21.0f, b = 21.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.28f, dy1 = -0.81f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.68f, dy1 = -1.57f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.26f, dy1 = -2.28f)
                lineToRelative(dx = 1.13f, dy = -1.88f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.46f, dy1 = -1.68f)
                verticalLineTo(y = 8.63f)
                arcToRelative(a = 6.59f, b = 6.59f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 13.15f, dy1 = 0.0f)
                verticalLineToRelative(dy = 1.86f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.47f, dy1 = 1.68f)
                lineToRelative(dx = 1.13f, dy = 1.88f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = 2.28f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 10.76f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.24f, y1 = 10.0f)
                verticalLineTo(y = 6.9f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.52f, dy1 = 0.0f)
                verticalLineTo(y = 10.0f)
                arcTo(horizontalEllipseRadius = 0.77f, verticalEllipseRadius = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 10.76f)
                moveToRelative(dx = 2.83f, dy = 9.25f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.82f, dy1 = -2.0f)
                lineToRelative(dx = 0.4f, dy = 0.05f)
                arcToRelative(a = 15.0f, b = 15.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.44f, dy1 = 0.16f)
                quadToRelative(dx1 = 0.86f, dy1 = 0.0f, dx2 = 1.7f, dy2 = -0.08f)
                quadToRelative(dx1 = 0.32f, dy1 = -0.02f, dx2 = 0.62f, dy2 = -0.06f)
                close()
            }
        }.build().also { _notificationBing = it }
    }

@Suppress("ObjectPropertyName")
private var _notificationBing: ImageVector? = null
