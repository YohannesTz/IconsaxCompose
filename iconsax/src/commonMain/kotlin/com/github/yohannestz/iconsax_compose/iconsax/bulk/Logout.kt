package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 13.24f, y = 2.0f)
                arcToRelative(a = 0.86f, b = 0.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.86f, dy1 = 0.86f)
                verticalLineToRelative(dy = 18.29f)
                arcToRelative(a = 0.86f, b = 0.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.86f, dy1 = 0.86f)
                curveToRelative(dx1 = -5.89f, dy1 = 0.0f, dx2 = -10.0f, dy2 = -4.11f, dx3 = -10.0f, dy3 = -10.0f)
                reflectiveCurveTo(x1 = 7.36f, y1 = 2.0f, x2 = 13.24f, y2 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.54f, y = 11.54f)
                lineTo(x = 17.7f, y = 8.69f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = 1.56f, dy = 1.56f)
                horizontalLineTo(x = 8.63f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = 0.75f, dx2 = 0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = 9.57f)
                lineToRelative(dx = -1.56f, dy = 1.56f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                quadToRelative(dx1 = 0.23f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                lineToRelative(dx = 2.84f, dy = -2.85f)
                arcToRelative(a = 0.73f, b = 0.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.04f)
            }
        }.build().also { _logout = it }
    }

@Suppress("ObjectPropertyName")
private var _logout: ImageVector? = null
