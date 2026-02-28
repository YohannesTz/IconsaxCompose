package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.0f, y = 2.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 2.82f, dy1 = 1.99f)
                moveTo(x = 6.81f, y = 14.93f)
                curveToRelative(dx1 = -0.35f, dy1 = -1.1f, dx2 = 0.06f, dy2 = -2.47f, dx3 = 1.22f, dy3 = -2.84f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.79f, dy1 = 0.56f)
                curveToRelative(dx1 = 0.4f, dy1 = -0.6f, dx2 = 1.18f, dy2 = -0.75f, dx3 = 1.78f, dy3 = -0.56f)
                curveToRelative(dx1 = 1.16f, dy1 = 0.37f, dx2 = 1.57f, dy2 = 1.74f, dx3 = 1.22f, dy3 = 2.84f)
                curveToRelative(dx1 = -0.55f, dy1 = 1.75f, dx2 = -2.47f, dy2 = 2.66f, dx3 = -3.0f, dy3 = 2.66f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.01f, dy1 = -2.66f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 14.97f)
                verticalLineTo(y = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineToRelative(dy = -5.0f)
                moveToRelative(dx = -8.0f, dy = -8.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _notificationFavorite = it }
    }

@Suppress("ObjectPropertyName")
private var _notificationFavorite: ImageVector? = null
