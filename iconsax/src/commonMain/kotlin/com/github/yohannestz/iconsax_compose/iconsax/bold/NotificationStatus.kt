package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotificationStatus: ImageVector
    get() {
        val current = _notificationStatus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NotificationStatus",
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
            ) {
                moveTo(x = 19.8f, y = 9.42f)
                lineToRelative(dx = -0.06f, dy = 0.01f)
                lineToRelative(dx = -0.31f, dy = 0.05f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.33f, dy1 = -0.07f)
                lineToRelative(dx = -0.33f, dy = -0.09f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.93f, dy1 = -0.38f)
                quadToRelative(dx1 = -0.18f, dy1 = -0.1f, dx2 = -0.35f, dy2 = -0.21f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.22f, dy1 = -1.22f)
                quadToRelative(dx1 = -0.11f, dy1 = -0.17f, dx2 = -0.21f, dy2 = -0.35f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = -0.93f)
                lineTo(x = 14.59f, y = 5.9f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.07f, dy1 = -1.33f)
                lineToRelative(dx = 0.05f, dy = -0.31f)
                lineToRelative(dx = 0.01f, dy = -0.06f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 13.6f, y1 = 3.0f)
                horizontalLineTo(x = 7.52f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.11f, dy1 = 0.11f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.3f, dy1 = 4.3f)
                lineTo(x = 2.06f, y = 7.76f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 8.52f)
                verticalLineToRelative(dy = 7.96f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.11f, dy1 = 1.11f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.3f, dy1 = 4.3f)
                lineToRelative(dx = 0.35f, dy = 0.05f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.52f, y1 = 22.0f)
                horizontalLineToRelative(dx = 7.96f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.11f, dy1 = -0.11f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.3f, dy1 = -4.3f)
                lineToRelative(dx = 0.05f, dy = -0.35f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 21.0f, y1 = 16.48f)
                verticalLineTo(y = 10.4f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = -0.98f)
                moveTo(x = 6.75f, y = 12.5f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 12.16f, y1 = 14.0f, x2 = 11.75f, y2 = 14.0f)
                horizontalLineToRelative(dx = -5.0f)
                curveTo(x1 = 6.34f, y1 = 14.0f, x2 = 6.0f, y2 = 13.66f, x3 = 6.0f, y3 = 13.25f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                moveToRelative(dx = 9.0f, dy = 5.5f)
                horizontalLineToRelative(dx = -9.0f)
                curveTo(x1 = 6.34f, y1 = 18.0f, x2 = 6.0f, y2 = 17.66f, x3 = 6.0f, y3 = 17.25f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 9.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 16.16f, y1 = 18.0f, x2 = 15.75f, y2 = 18.0f)
            }
        }.build().also { _notificationStatus = it }
    }

@Suppress("ObjectPropertyName")
private var _notificationStatus: ImageVector? = null
