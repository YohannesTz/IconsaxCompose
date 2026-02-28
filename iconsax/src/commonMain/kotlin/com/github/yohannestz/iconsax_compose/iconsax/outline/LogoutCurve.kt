package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoutCurve: ImageVector
    get() {
        val current = _logoutCurve
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LogoutCurve",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.24f, y = 22.27f)
                horizontalLineToRelative(dx = -0.13f)
                curveToRelative(dx1 = -4.44f, dy1 = 0.0f, dx2 = -6.58f, dy2 = -1.75f, dx3 = -6.95f, dy3 = -5.67f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.5f, dy1 = -0.14f)
                curveToRelative(dx1 = 0.29f, dy1 = 3.14f, dx2 = 1.77f, dy2 = 4.31f, dx3 = 5.46f, dy3 = 4.31f)
                horizontalLineToRelative(dx = 0.13f)
                curveToRelative(dx1 = 4.07f, dy1 = 0.0f, dx2 = 5.51f, dy2 = -1.44f, dx3 = 5.51f, dy3 = -5.51f)
                verticalLineTo(y = 8.74f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.07f, dx2 = -1.44f, dy2 = -5.51f, dx3 = -5.51f, dy3 = -5.51f)
                horizontalLineToRelative(dx = -0.13f)
                curveToRelative(dx1 = -3.71f, dy1 = 0.0f, dx2 = -5.19f, dy2 = 1.19f, dx3 = -5.46f, dy3 = 4.39f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.84f, y1 = 8.3f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.69f, dy1 = -0.81f)
                curveToRelative(dx1 = 0.34f, dy1 = -3.98f, dx2 = 2.49f, dy2 = -5.76f, dx3 = 6.96f, dy3 = -5.76f)
                horizontalLineToRelative(dx = 0.13f)
                curveToRelative(dx1 = 4.91f, dy1 = 0.0f, dx2 = 7.01f, dy2 = 2.1f, dx3 = 7.01f, dy3 = 7.01f)
                verticalLineToRelative(dy = 6.52f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.91f, dx2 = -2.1f, dy2 = 7.01f, dx3 = -7.01f, dy3 = 7.01f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 12.75f)
                horizontalLineTo(x = 3.62f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineTo(x = 15.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.85f, y = 16.1f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = -3.35f, dy = -3.35f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 3.35f, dy = -3.35f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineTo(x = 3.56f, y = 12.0f)
                lineToRelative(dx = 2.82f, dy = 2.82f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
            }
        }.build().also { _logoutCurve = it }
    }

@Suppress("ObjectPropertyName")
private var _logoutCurve: ImageVector? = null
