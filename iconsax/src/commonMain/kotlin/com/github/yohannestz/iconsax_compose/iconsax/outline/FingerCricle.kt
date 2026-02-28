package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FingerCricle: ImageVector
    get() {
        val current = _fingerCricle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FingerCricle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.63f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.4f, dy1 = -2.4f)
                verticalLineToRelative(dy = -2.47f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.4f, dy1 = -2.4f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.4f, dy1 = 2.4f)
                verticalLineToRelative(dy = 2.47f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.4f, dy1 = 2.4f)
                moveToRelative(dx = 0.0f, dy = -5.76f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = 0.9f)
                verticalLineToRelative(dy = 2.47f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.5f, dx2 = 0.4f, dy2 = 0.9f, dx3 = 0.9f, dy3 = 0.9f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = -0.4f, dx2 = 0.9f, dy2 = -0.9f)
                verticalLineToRelative(dy = -2.47f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = -0.9f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 18.82f)
                arcToRelative(a = 5.76f, b = 5.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.75f, dy1 = -5.75f)
                verticalLineToRelative(dy = -2.14f)
                arcToRelative(a = 5.76f, b = 5.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 11.47f, dy1 = -0.59f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.67f, dy1 = 0.82f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.82f, dy1 = -0.67f)
                arcTo(horizontalEllipseRadius = 4.24f, verticalEllipseRadius = 4.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 6.68f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.25f, dy1 = 4.25f)
                verticalLineToRelative(dy = 2.14f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 17.32f)
                curveToRelative(dx1 = 2.2f, dy1 = 0.0f, dx2 = 4.06f, dy2 = -1.72f, dx3 = 4.24f, dy3 = -3.91f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.12f)
                arcTo(horizontalEllipseRadius = 5.8f, verticalEllipseRadius = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.82f)
            }
        }.build().also { _fingerCricle = it }
    }

@Suppress("ObjectPropertyName")
private var _fingerCricle: ImageVector? = null
