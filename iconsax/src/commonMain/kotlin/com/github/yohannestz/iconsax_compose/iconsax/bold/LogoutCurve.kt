package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 16.8f, y = 2.0f)
                horizontalLineToRelative(dx = -2.6f)
                curveTo(x1 = 11.0f, y1 = 2.0f, x2 = 9.0f, y2 = 4.0f, x3 = 9.0f, y3 = 7.2f)
                verticalLineToRelative(dy = 4.05f)
                horizontalLineToRelative(dx = 6.25f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                horizontalLineTo(x = 9.0f)
                verticalLineToRelative(dy = 4.05f)
                curveTo(x1 = 9.0f, y1 = 20.0f, x2 = 11.0f, y2 = 22.0f, x3 = 14.2f, y3 = 22.0f)
                horizontalLineToRelative(dx = 2.59f)
                curveToRelative(dx1 = 3.2f, dy1 = 0.0f, dx2 = 5.2f, dy2 = -2.0f, dx3 = 5.2f, dy3 = -5.2f)
                verticalLineTo(y = 7.2f)
                curveTo(x1 = 22.0f, y1 = 4.0f, x2 = 20.0f, y2 = 2.0f, x3 = 16.8f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 4.56f, y = 11.25f)
                lineToRelative(dx = 2.07f, dy = -2.07f)
                quadToRelative(dx1 = 0.22f, dy1 = -0.24f, dx2 = 0.22f, dy2 = -0.53f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.29f, dx2 = -0.07f, dy2 = -0.39f, dx3 = -0.22f, dy3 = -0.53f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineToRelative(dx = -3.35f, dy = 3.35f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = 3.35f, dy = 3.35f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = -2.07f, dy = -2.07f)
                horizontalLineTo(x = 9.0f)
                verticalLineToRelative(dy = -1.5f)
                close()
            }
        }.build().also { _logoutCurve = it }
    }

@Suppress("ObjectPropertyName")
private var _logoutCurve: ImageVector? = null
