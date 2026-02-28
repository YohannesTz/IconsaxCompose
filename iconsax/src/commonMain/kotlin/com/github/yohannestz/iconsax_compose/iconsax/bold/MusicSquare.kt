package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MusicSquare: ImageVector
    get() {
        val current = _musicSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MusicSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.54f, y = 13.67f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.3f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.65f, dy1 = -0.65f)
                arcToRelative(a = 0.66f, b = 0.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.65f, dy1 = -0.65f)
                moveToRelative(dx = -5.48f, dy = 0.99f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.3f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.3f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
                moveToRelative(dx = 0.69f, dy = 7.55f)
                verticalLineToRelative(dy = 4.76f)
                arcToRelative(a = 2.34f, b = 2.34f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -2.34f, dy1 = -2.34f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.65f, dy1 = 0.1f)
                verticalLineToRelative(dy = -1.42f)
                lineToRelative(dx = -3.78f, dy = 1.03f)
                verticalLineToRelative(dy = 3.62f)
                lineToRelative(dx = -0.01f, dy = 0.03f)
                arcToRelative(a = 2.34f, b = 2.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.34f, dy1 = 2.31f)
                arcToRelative(a = 2.34f, b = 2.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.68f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.65f, dy1 = 0.1f)
                verticalLineTo(y = 9.29f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.97f, dx2 = 0.6f, dy2 = -1.76f, dx3 = 1.54f, dy3 = -2.01f)
                lineToRelative(dx = 2.99f, dy = -0.82f)
                curveToRelative(dx1 = 0.96f, dy1 = -0.26f, dx2 = 1.56f, dy2 = -0.01f, dx3 = 1.9f, dy3 = 0.25f)
                reflectiveCurveToRelative(dx1 = 0.74f, dy1 = 0.77f, dx2 = 0.74f, dy2 = 1.77f)
                close()
            }
        }.build().also { _musicSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _musicSquare: ImageVector? = null
