package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gameboy: ImageVector
    get() {
        val current = _gameboy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Gameboy",
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
                moveTo(x = 17.0f, y = 22.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -2.2f, dy1 = 0.0f, dx2 = -4.0f, dy2 = -1.8f, dx3 = -4.0f, dy3 = -4.0f)
                verticalLineTo(y = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.2f, dx2 = 1.8f, dy2 = -4.0f, dx3 = 4.0f, dy3 = -4.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 2.2f, dy1 = 0.0f, dx2 = 4.0f, dy2 = 1.8f, dx3 = 4.0f, dy3 = 4.0f)
                verticalLineToRelative(dy = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.2f, dx2 = -1.8f, dy2 = 4.0f, dx3 = -4.0f, dy3 = 4.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.25f, y = 11.0f)
                horizontalLineToRelative(dx = -8.5f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 9.25f)
                verticalLineToRelative(dy = -2.5f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.75f, y1 = 5.0f)
                horizontalLineToRelative(dx = 8.5f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 6.75f)
                verticalLineToRelative(dy = 2.5f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.25f, y1 = 11.0f)
                moveToRelative(dx = -5.39f, dy = 6.08f)
                lineToRelative(dx = -0.65f, dy = -0.65f)
                lineToRelative(dx = 0.62f, dy = -0.62f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineToRelative(dx = -0.62f, dy = 0.62f)
                lineToRelative(dx = -0.59f, dy = -0.6f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.07f)
                lineToRelative(dx = 0.59f, dy = 0.59f)
                lineToRelative(dx = -0.62f, dy = 0.62f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                quadTo(x1 = 7.71f, y1 = 18.33f, x2 = 8.0f, y2 = 18.33f)
                curveToRelative(dx1 = 0.29f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                lineToRelative(dx = 0.62f, dy = -0.62f)
                lineToRelative(dx = 0.65f, dy = 0.65f)
                quadToRelative(dx1 = 0.24f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.29f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                moveToRelative(dx = 5.65f, dy = -0.75f)
                curveToRelative(dx1 = -0.55f, dy1 = 0.0f, dx2 = -1.01f, dy2 = -0.45f, dx3 = -1.01f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.44f, dy1 = -1.0f, dx2 = 0.99f, dy2 = -1.0f)
                horizontalLineToRelative(dx = 0.02f)
                curveToRelative(dx1 = 0.55f, dy1 = 0.0f, dx2 = 1.0f, dy2 = 0.45f, dx3 = 1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.45f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                moveToRelative(dx = -2.02f, dy = 2.16f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -0.99f)
                verticalLineToRelative(dy = -0.02f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.55f, dx2 = 0.45f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.01f)
            }
        }.build().also { _gameboy = it }
    }

@Suppress("ObjectPropertyName")
private var _gameboy: ImageVector? = null
