package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shop: ImageVector
    get() {
        val current = _shop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Shop",
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
                moveTo(x = 21.37f, y = 11.39f)
                verticalLineToRelative(dy = 5.99f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = 5.0f)
                horizontalLineTo(x = 7.63f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = -5.0f)
                verticalLineToRelative(dy = -5.92f)
                arcToRelative(a = 4.08f, b = 4.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.24f, dy1 = -0.35f)
                arcTo(horizontalEllipseRadius = 3.8f, verticalEllipseRadius = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 12.75f)
                curveToRelative(dx1 = 1.28f, dy1 = 0.0f, dx2 = 2.42f, dy2 = -0.6f, dx3 = 3.11f, dy3 = -1.6f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.2f, dy1 = 1.6f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.06f, dy1 = -1.36f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.99f, y = 1.25f)
                horizontalLineToRelative(dx = -6.0f)
                lineTo(x = 8.25f, y = 8.61f)
                arcTo(horizontalEllipseRadius = 3.74f, verticalEllipseRadius = 3.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 12.75f)
                arcToRelative(a = 3.73f, b = 3.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.77f, dy1 = -3.67f)
                verticalLineTo(y = 8.89f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.6f,
                strokeAlpha = 0.6f,
            ) {
                moveTo(x = 22.36f, y = 8.27f)
                lineTo(x = 22.07f, y = 5.5f)
                curveToRelative(dx1 = -0.42f, dy1 = -3.02f, dx2 = -1.79f, dy2 = -4.25f, dx3 = -4.72f, dy3 = -4.25f)
                horizontalLineToRelative(dx = -3.84f)
                lineToRelative(dx = 0.74f, dy = 7.5f)
                lineToRelative(dx = 0.02f, dy = 0.4f)
                arcToRelative(a = 4.15f, b = 4.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.04f, dy1 = 3.6f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.28f, dy1 = -1.63f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.77f, dy1 = -2.85f)
                moveTo(x = 6.59f, y = 1.25f)
                curveToRelative(dx1 = -2.94f, dy1 = 0.0f, dx2 = -4.3f, dy2 = 1.23f, dx3 = -4.73f, dy3 = 4.28f)
                lineTo(x = 1.59f, y = 8.28f)
                arcToRelative(a = 4.01f, b = 4.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.05f, dy1 = 4.47f)
                arcToRelative(a = 4.14f, b = 4.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.05f, dy1 = -3.66f)
                lineToRelative(dx = 0.78f, dy = -7.83f)
                horizontalLineTo(x = 6.59f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.35f, y = 16.66f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.23f, dy1 = 2.49f)
                verticalLineToRelative(dy = 3.23f)
                horizontalLineToRelative(dx = 5.75f)
                verticalLineTo(y = 19.5f)
                curveToRelative(dx1 = 0.01f, dy1 = -2.09f, dx2 = -1.22f, dy2 = -3.08f, dx3 = -3.52f, dy3 = -2.84f)
            }
        }.build().also { _shop = it }
    }

@Suppress("ObjectPropertyName")
private var _shop: ImageVector? = null
