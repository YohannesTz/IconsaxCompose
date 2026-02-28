package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 6.44f)
                verticalLineToRelative(dy = 3.33f)
                moveTo(x = 12.02f, y = 2.0f)
                arcToRelative(a = 6.66f, b = 6.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.66f, dy1 = 6.66f)
                verticalLineToRelative(dy = 2.1f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.63f, dy1 = 2.28f)
                lineToRelative(dx = -1.27f, dy = 2.12f)
                curveToRelative(dx1 = -0.78f, dy1 = 1.31f, dx2 = -0.24f, dy2 = 2.77f, dx3 = 1.2f, dy3 = 3.25f)
                arcToRelative(a = 23.3f, b = 23.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 14.73f, dy1 = 0.0f)
                arcToRelative(a = 2.22f, b = 2.22f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.2f, dy1 = -3.25f)
                lineToRelative(dx = -1.27f, dy = -2.12f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.63f, dy1 = -2.28f)
                verticalLineToRelative(dy = -2.1f)
                arcTo(horizontalEllipseRadius = 6.7f, verticalEllipseRadius = 6.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.02f, y1 = 2.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.33f, y = 18.82f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.83f, dx2 = -1.5f, dy2 = 3.33f, dx3 = -3.33f, dy3 = 3.33f)
                arcToRelative(a = 3.34f, b = 3.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.33f, dy1 = -3.33f)
            }
        }.build().also { _notificationBing = it }
    }

@Suppress("ObjectPropertyName")
private var _notificationBing: ImageVector? = null
