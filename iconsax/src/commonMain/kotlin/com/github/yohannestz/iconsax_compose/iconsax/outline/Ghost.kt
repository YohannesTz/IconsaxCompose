package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ghost: ImageVector
    get() {
        val current = _ghost
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ghost",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.33f, y = 22.75f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.18f, dy1 = -0.45f)
                lineToRelative(dx = -2.0f, dy = -1.83f)
                curveToRelative(dx1 = -0.08f, dy1 = -0.07f, dx2 = -0.24f, dy2 = -0.07f, dx3 = -0.33f, dy3 = 0.0f)
                lineTo(x = 9.83f, y = 22.3f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.35f, dy1 = 0.0f)
                lineToRelative(dx = -2.0f, dy = -1.83f)
                curveToRelative(dx1 = -0.08f, dy1 = -0.07f, dx2 = -0.24f, dy2 = -0.07f, dx3 = -0.33f, dy3 = 0.0f)
                lineToRelative(dx = -0.99f, dy = 0.91f)
                curveToRelative(dx1 = -0.91f, dy1 = 0.83f, dx2 = -1.63f, dy2 = 0.7f, dx3 = -1.98f, dy3 = 0.54f)
                reflectiveCurveToRelative(dx1 = -0.94f, dy1 = -0.6f, dx2 = -0.94f, dy2 = -1.85f)
                verticalLineToRelative(dy = -7.89f)
                curveToRelative(dx1 = 0.0f, dy1 = -6.03f, dx2 = 4.82f, dy2 = -10.93f, dx3 = 10.75f, dy3 = -10.93f)
                reflectiveCurveToRelative(dx1 = 10.75f, dy1 = 4.9f, dx2 = 10.75f, dy2 = 10.93f)
                verticalLineToRelative(dy = 7.89f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.25f, dx2 = -0.59f, dy2 = 1.7f, dx3 = -0.94f, dy3 = 1.85f)
                reflectiveCurveToRelative(dx1 = -1.07f, dy1 = 0.29f, dx2 = -1.98f, dy2 = -0.54f)
                lineToRelative(dx = -1.0f, dy = -0.91f)
                curveToRelative(dx1 = -0.08f, dy1 = -0.07f, dx2 = -0.24f, dy2 = -0.07f, dx3 = -0.32f, dy3 = 0.0f)
                lineToRelative(dx = -2.0f, dy = 1.83f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.17f, dy1 = 0.45f)
                moveTo(x = 12.0f, y = 18.91f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.17f, dy1 = 0.45f)
                lineToRelative(dx = 2.0f, dy = 1.83f)
                curveToRelative(dx1 = 0.08f, dy1 = 0.07f, dx2 = 0.24f, dy2 = 0.07f, dx3 = 0.32f, dy3 = 0.0f)
                lineToRelative(dx = 2.0f, dy = -1.83f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.35f, dy1 = 0.0f)
                lineToRelative(dx = 1.0f, dy = 0.91f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.35f, dy1 = 0.24f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.06f, dy1 = -0.45f)
                verticalLineToRelative(dy = -7.89f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.2f, dx2 = -4.15f, dy2 = -9.43f, dx3 = -9.25f, dy3 = -9.43f)
                reflectiveCurveToRelative(dx1 = -9.25f, dy1 = 4.23f, dx2 = -9.25f, dy2 = 9.43f)
                verticalLineToRelative(dy = 7.89f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.06f, dy1 = 0.45f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.35f, dy1 = -0.24f)
                lineToRelative(dx = 1.0f, dy = -0.91f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.35f, dy1 = 0.0f)
                lineToRelative(dx = 2.0f, dy = 1.83f)
                curveToRelative(dx1 = 0.08f, dy1 = 0.07f, dx2 = 0.24f, dy2 = 0.07f, dx3 = 0.32f, dy3 = 0.0f)
                lineToRelative(dx = 2.0f, dy = -1.83f)
                arcTo(horizontalEllipseRadius = 1.7f, verticalEllipseRadius = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.91f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 16.07f)
                arcToRelative(a = 7.4f, b = 7.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.45f, dy1 = -1.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.9f, dy1 = -1.2f)
                arcToRelative(a = 5.9f, b = 5.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.1f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.9f, dy1 = 1.2f)
                arcTo(horizontalEllipseRadius = 7.4f, verticalEllipseRadius = 7.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 16.07f)
                moveToRelative(dx = 0.0f, dy = -4.32f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.5f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 5.5f)
                moveToRelative(dx = 0.0f, dy = -4.0f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.5f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.5f)
            }
        }.build().also { _ghost = it }
    }

@Suppress("ObjectPropertyName")
private var _ghost: ImageVector? = null
