package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotificationCircle: ImageVector
    get() {
        val current = _notificationCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NotificationCircle",
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
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 19.0f, y = 9.5f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.76f, dy1 = -6.95f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.0f)
                curveTo(x1 = 6.49f, y1 = 2.0f, x2 = 2.0f, y2 = 6.49f, x3 = 2.0f, y3 = 12.0f)
                reflectiveCurveToRelative(dx1 = 4.49f, dy1 = 10.0f, dx2 = 10.0f, dy2 = 10.0f)
                arcToRelative(a = 10.02f, b = 10.02f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 9.45f, dy1 = -13.24f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.0f, y1 = 9.5f)
            }
        }.build().also { _notificationCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _notificationCircle: ImageVector? = null
