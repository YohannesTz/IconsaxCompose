package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Status: ImageVector
    get() {
        val current = _status
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Status",
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
                moveTo(x = 10.24f, y = 14.74f)
                arcTo(horizontalEllipseRadius = 1.8f, verticalEllipseRadius = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 14.22f)
                horizontalLineTo(x = 3.92f)
                arcToRelative(a = 1.74f, b = 1.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.58f, dy1 = 2.49f)
                arcToRelative(a = 10.8f, b = 10.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.09f, dy1 = 5.43f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 22.24f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.75f, dy1 = -1.76f)
                lineToRelative(dx = 0.01f, dy = -4.5f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.52f, dy1 = -1.24f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.48f, y = 9.6f)
                arcTo(horizontalEllipseRadius = 10.7f, verticalEllipseRadius = 10.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 1.25f)
                curveToRelative(dx1 = -5.05f, dy1 = 0.0f, dx2 = -9.36f, dy2 = 3.43f, dx3 = -10.48f, dy3 = 8.35f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.34f, dy1 = 1.47f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.38f, dy1 = 0.66f)
                horizontalLineToRelative(dx = 17.53f)
                arcToRelative(a = 1.74f, b = 1.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.71f, dy1 = -2.13f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.56f, y = 15.1f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.5f, dy1 = -0.84f)
                lineTo(x = 15.0f, y = 14.25f)
                arcTo(horizontalEllipseRadius = 1.74f, verticalEllipseRadius = 1.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 13.25f, y1 = 16.0f)
                lineToRelative(dx = 0.01f, dy = 4.48f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.75f, dy1 = 1.76f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.56f, dy1 = -0.1f)
                arcToRelative(a = 10.9f, b = 10.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.07f, dy1 = -5.38f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.08f, dy1 = -1.66f)
            }
        }.build().also { _status = it }
    }

@Suppress("ObjectPropertyName")
private var _status: ImageVector? = null
