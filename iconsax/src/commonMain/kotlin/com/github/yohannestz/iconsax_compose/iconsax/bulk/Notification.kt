package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Notification: ImageVector
    get() {
        val current = _notification
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Notification",
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
                moveTo(x = 19.34f, y = 14.49f)
                lineToRelative(dx = -1.0f, dy = -1.66f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.4f, dy1 = -1.48f)
                verticalLineTo(y = 8.82f)
                arcToRelative(a = 5.93f, b = 5.93f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -11.84f, dy1 = 0.0f)
                verticalLineToRelative(dy = 2.53f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.4f, dy1 = 1.47f)
                lineToRelative(dx = -1.01f, dy = 1.67f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.24f, dy1 = 2.09f)
                arcTo(horizontalEllipseRadius = 2.4f, verticalEllipseRadius = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.0f, y1 = 18.02f)
                arcToRelative(a = 18.97f, b = 18.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 12.04f, dy1 = 0.01f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.3f, dy1 = -3.54f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.25f, y = 3.32f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.45f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 2.5f, verticalEllipseRadius = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.02f, y1 = 2.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.23f, dy1 = 1.32f)
                moveToRelative(dx = 0.58f, dy = 16.69f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.82f, dy1 = -2.0f)
                lineToRelative(dx = 0.4f, dy = 0.05f)
                arcToRelative(a = 15.0f, b = 15.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.44f, dy1 = 0.16f)
                quadToRelative(dx1 = 0.86f, dy1 = 0.0f, dx2 = 1.7f, dy2 = -0.08f)
                quadToRelative(dx1 = 0.32f, dy1 = -0.02f, dx2 = 0.62f, dy2 = -0.06f)
                close()
            }
        }.build().also { _notification = it }
    }

@Suppress("ObjectPropertyName")
private var _notification: ImageVector? = null
