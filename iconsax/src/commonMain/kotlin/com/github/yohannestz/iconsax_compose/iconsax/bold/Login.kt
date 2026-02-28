package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Login: ImageVector
    get() {
        val current = _login
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Login",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.76f, y = 2.0f)
                arcTo(horizontalEllipseRadius = 0.85f, verticalEllipseRadius = 0.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.9f, y1 = 2.86f)
                verticalLineToRelative(dy = 8.46f)
                horizontalLineToRelative(dx = 3.67f)
                lineTo(x = 12.0f, y = 9.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 2.84f, dy = 2.85f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -2.84f, dy = 2.85f)
                quadToRelative(dx1 = -0.24f, dy1 = 0.22f, dx2 = -0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 1.56f, dy = -1.56f)
                horizontalLineTo(x = 9.9f)
                verticalLineToRelative(dy = 8.33f)
                arcToRelative(a = 0.86f, b = 0.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.86f, dy1 = 0.86f)
                curveToRelative(dx1 = 5.89f, dy1 = 0.0f, dx2 = 10.0f, dy2 = -4.11f, dx3 = 10.0f, dy3 = -10.0f)
                reflectiveCurveTo(x1 = 16.64f, y1 = 2.0f, x2 = 10.76f, y2 = 2.0f)
                moveToRelative(dx = -6.77f, dy = 9.32f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = 0.75f, dx2 = 0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = 5.9f)
                verticalLineToRelative(dy = -1.5f)
                close()
            }
        }.build().also { _login = it }
    }

@Suppress("ObjectPropertyName")
private var _login: ImageVector? = null
