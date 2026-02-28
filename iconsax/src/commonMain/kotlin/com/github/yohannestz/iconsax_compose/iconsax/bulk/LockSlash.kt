package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LockSlash: ImageVector
    get() {
        val current = _lockSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LockSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.63f, y = 15.72f)
                arcToRelative(a = 1.63f, b = 1.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.08f, dy1 = 0.73f)
                lineToRelative(dx = 2.18f, dy = -2.18f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.9f, dy1 = 1.45f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 7.35f, y = 9.44f)
                curveTo(x1 = 3.25f, y1 = 9.44f, x2 = 2.0f, y2 = 10.7f, x3 = 2.0f, y3 = 14.8f)
                verticalLineToRelative(dy = 1.86f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.05f, dx2 = 0.31f, dy2 = 3.4f, dx3 = 1.14f, dy3 = 4.21f)
                lineTo(x = 9.1f, y = 14.9f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.08f, dy1 = -2.08f)
                lineToRelative(dx = 3.38f, dy = -3.38f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.13f, y = 5.87f)
                lineToRelative(dx = -1.26f, dy = 1.26f)
                curveTo(x1 = 16.83f, y1 = 5.35f, x2 = 16.16f, y2 = 3.4f, x3 = 12.0f, y3 = 3.4f)
                curveToRelative(dx1 = -4.05f, dy1 = 0.0f, dx2 = -4.88f, dy2 = 1.95f, dx3 = -4.88f, dy3 = 4.88f)
                verticalLineToRelative(dy = 1.17f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.4f, dy1 = 0.08f)
                verticalLineTo(y = 8.28f)
                curveTo(x1 = 5.72f, y1 = 5.58f, x2 = 6.37f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                quadToRelative(dx1 = 5.32f, dy1 = 0.0f, dx2 = 6.13f, dy2 = 3.87f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 14.79f)
                verticalLineToRelative(dy = 1.86f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.1f, dx2 = -1.25f, dy2 = 5.35f, dx3 = -5.35f, dy3 = 5.35f)
                horizontalLineToRelative(dx = -9.3f)
                quadToRelative(dx1 = -1.26f, dy1 = 0.0f, dx2 = -2.18f, dy2 = -0.17f)
                lineToRelative(dx = 4.36f, dy = -4.36f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 18.74f)
                arcToRelative(a = 3.02f, b = 3.02f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.75f, dy1 = -5.49f)
                lineToRelative(dx = 3.8f, dy = -3.79f)
                curveTo(x1 = 20.92f, y1 = 9.65f, x2 = 22.0f, y2 = 11.0f, x3 = 22.0f, y3 = 14.79f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.77f, y = 2.23f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.1f, dy1 = 0.0f)
                lineTo(x = 2.24f, y = 20.69f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -0.01f)
                lineTo(x = 21.77f, y = 3.3f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.08f)
            }
        }.build().also { _lockSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _lockSlash: ImageVector? = null
