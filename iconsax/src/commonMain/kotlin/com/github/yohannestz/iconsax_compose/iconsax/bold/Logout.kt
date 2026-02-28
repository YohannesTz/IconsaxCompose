package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Logout: ImageVector
    get() {
        val current = _logout
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Logout",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.88f, y = 12.07f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = -0.75f)
                horizontalLineToRelative(dx = 5.48f)
                verticalLineTo(y = 2.86f)
                arcTo(horizontalEllipseRadius = 0.87f, verticalEllipseRadius = 0.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 13.24f, y1 = 2.0f)
                curveToRelative(dx1 = -5.9f, dy1 = 0.0f, dx2 = -10.0f, dy2 = 4.11f, dx3 = -10.0f, dy3 = 10.0f)
                reflectiveCurveToRelative(dx1 = 4.1f, dy1 = 10.0f, dx2 = 10.0f, dy2 = 10.0f)
                arcToRelative(a = 0.86f, b = 0.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.86f, dy1 = -0.86f)
                verticalLineToRelative(dy = -8.33f)
                horizontalLineTo(x = 8.63f)
                arcToRelative(a = 0.73f, b = 0.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.74f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.54f, y = 11.54f)
                lineTo(x = 17.7f, y = 8.69f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = 1.56f, dy = 1.56f)
                horizontalLineToRelative(dx = -4.1f)
                verticalLineToRelative(dy = 1.5f)
                horizontalLineToRelative(dx = 4.1f)
                lineToRelative(dx = -1.57f, dy = 1.56f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                quadToRelative(dx1 = 0.23f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                lineToRelative(dx = 2.84f, dy = -2.85f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.01f, dy1 = -1.04f)
            }
        }.build().also { _logout = it }
    }

@Suppress("ObjectPropertyName")
private var _logout: ImageVector? = null
