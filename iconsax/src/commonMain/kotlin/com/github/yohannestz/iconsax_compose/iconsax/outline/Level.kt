package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Level: ImageVector
    get() {
        val current = _level
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Level",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                curveToRelative(dx1 = -5.08f, dy1 = 0.0f, dx2 = -9.51f, dy2 = -3.61f, dx3 = -10.53f, dy3 = -8.58f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.58f, dy1 = -0.89f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.89f, dy1 = 0.58f)
                arcTo(horizontalEllipseRadius = 9.3f, verticalEllipseRadius = 9.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 21.25f)
                arcToRelative(a = 9.3f, b = 9.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 9.06f, dy1 = -7.35f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.89f, dy1 = -0.58f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.58f, dy1 = 0.89f)
                arcTo(horizontalEllipseRadius = 10.8f, verticalEllipseRadius = 10.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
                moveToRelative(dx = 9.81f, dy = -11.94f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = -0.61f)
                arcTo(horizontalEllipseRadius = 9.3f, verticalEllipseRadius = 9.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.74f)
                arcToRelative(a = 9.3f, b = 9.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -9.06f, dy1 = 7.39f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.89f, dy1 = 0.58f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = -0.9f)
                arcTo(horizontalEllipseRadius = 10.8f, verticalEllipseRadius = 10.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 1.25f)
                curveToRelative(dx1 = 5.13f, dy1 = 0.0f, dx2 = 9.56f, dy2 = 3.65f, dx3 = 10.55f, dy3 = 8.67f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.59f, dy1 = 0.88f)
                quadToRelative(dx1 = -0.08f, dy1 = 0.02f, dx2 = -0.15f, dy2 = 0.02f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 14.25f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.5f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = 0.75f, dx2 = 0.75f, dy2 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
            }
        }.build().also { _level = it }
    }

@Suppress("ObjectPropertyName")
private var _level: ImageVector? = null
