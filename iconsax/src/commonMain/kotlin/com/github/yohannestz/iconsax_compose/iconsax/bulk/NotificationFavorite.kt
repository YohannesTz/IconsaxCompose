package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotificationFavorite: ImageVector
    get() {
        val current = _notificationFavorite
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NotificationFavorite",
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
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.5f, y1 = 5.0f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.49f, dy1 = -2.0f)
                horizontalLineTo(x = 7.52f)
                curveTo(x1 = 4.07f, y1 = 3.0f, x2 = 2.0f, y2 = 5.06f, x3 = 2.0f, y3 = 8.52f)
                verticalLineToRelative(dy = 7.95f)
                curveTo(x1 = 2.0f, y1 = 19.94f, x2 = 4.07f, y2 = 22.0f, x3 = 7.52f, y3 = 22.0f)
                horizontalLineToRelative(dx = 7.95f)
                curveToRelative(dx1 = 3.46f, dy1 = 0.0f, dx2 = 5.52f, dy2 = -2.06f, dx3 = 5.52f, dy3 = -5.52f)
                verticalLineTo(y = 9.01f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.0f, y1 = 9.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.9f, y = 12.36f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.61f, dy1 = 0.26f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.6f, dy1 = -0.26f)
                curveToRelative(dx1 = -1.23f, dy1 = 0.4f, dx2 = -1.62f, dy2 = 1.8f, dx3 = -1.27f, dy3 = 2.88f)
                curveToRelative(dx1 = 0.53f, dy1 = 1.64f, dx2 = 2.26f, dy2 = 2.5f, dx3 = 2.88f, dy3 = 2.5f)
                curveToRelative(dx1 = 0.61f, dy1 = 0.0f, dx2 = 2.37f, dy2 = -0.88f, dx3 = 2.88f, dy3 = -2.5f)
                curveToRelative(dx1 = 0.35f, dy1 = -1.08f, dx2 = -0.05f, dy2 = -2.48f, dx3 = -1.28f, dy3 = -2.88f)
            }
        }.build().also { _notificationFavorite = it }
    }

@Suppress("ObjectPropertyName")
private var _notificationFavorite: ImageVector? = null
