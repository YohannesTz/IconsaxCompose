package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Google: ImageVector
    get() {
        val current = _google
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Google",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.2f, y = 5.87f)
                lineTo(x = 12.0f, y = 5.88f)
                verticalLineTo(y = 2.01f)
                lineTo(x = 12.2f, y = 2.0f)
                curveToRelative(dx1 = 2.26f, dy1 = 0.0f, dx2 = 4.2f, dy2 = 0.69f, dx3 = 5.79f, dy3 = 1.86f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.1f, dy1 = 1.52f)
                lineTo(x = 16.7f, y = 6.74f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.25f, dy1 = 0.12f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.25f, dy1 = -0.99f)
                moveToRelative(dx = 9.6f, dy = 6.35f)
                arcToRelative(a = 9.8f, b = 9.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.98f, dy1 = 7.36f)
                arcTo(horizontalEllipseRadius = 9.5f, verticalEllipseRadius = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.2f, y1 = 22.0f)
                lineTo(x = 12.0f, y = 21.99f)
                verticalLineToRelative(dy = -3.87f)
                lineToRelative(dx = 0.2f, dy = 0.01f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.47f, dy1 = -1.0f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.04f, dy1 = -3.24f)
                horizontalLineTo(x = 13.2f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -1.0f)
                verticalLineToRelative(dy = -1.71f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = -1.0f)
                horizontalLineToRelative(dx = 7.55f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.99f, dy1 = 0.89f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.06f, dy1 = 1.15f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 6.5f, y = 10.02f)
                quadTo(x1 = 6.19f, y1 = 10.96f, x2 = 6.18f, y2 = 12.0f)
                curveToRelative(dx1 = -0.01f, dy1 = 1.04f, dx2 = 0.12f, dy2 = 1.35f, dx3 = 0.33f, dy3 = 1.98f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 18.12f)
                verticalLineTo(y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -8.72f, dy1 = -5.5f)
                horizontalLineTo(x = 3.27f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -8.98f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 2.01f)
                verticalLineToRelative(dy = 3.87f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.5f, dy1 = 4.14f)
            }
        }.build().also { _google = it }
    }

@Suppress("ObjectPropertyName")
private var _google: ImageVector? = null
