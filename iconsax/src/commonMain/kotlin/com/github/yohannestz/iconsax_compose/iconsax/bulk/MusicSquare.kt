package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.2f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveToRelative(dx1 = -3.64f, dy1 = 0.0f, dx2 = -5.8f, dy2 = 2.17f, dx3 = -5.8f, dy3 = 5.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.16f, dy2 = 5.81f, dx3 = 5.8f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.2f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.14f, y = 6.71f)
                curveToRelative(dx1 = -0.34f, dy1 = -0.26f, dx2 = -0.94f, dy2 = -0.5f, dx3 = -1.9f, dy3 = -0.25f)
                lineToRelative(dx = -3.0f, dy = 0.82f)
                arcTo(horizontalEllipseRadius = 2.04f, verticalEllipseRadius = 2.04f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.72f, y1 = 9.3f)
                verticalLineToRelative(dy = 3.78f)
                arcToRelative(a = 2.34f, b = 2.34f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -0.65f, dy1 = 4.58f)
                arcToRelative(a = 2.35f, b = 2.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.34f, dy1 = -2.3f)
                verticalLineToRelative(dy = -3.66f)
                lineToRelative(dx = 3.79f, dy = -1.03f)
                verticalLineToRelative(dy = 1.42f)
                arcToRelative(a = 2.34f, b = 2.34f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 1.69f, dy1 = 2.24f)
                verticalLineTo(y = 8.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.0f, dx2 = -0.41f, dy2 = -1.52f, dx3 = -0.74f, dy3 = -1.78f)
                moveToRelative(dx = -7.08f, dy = 9.25f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.3f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.3f)
                moveToRelative(dx = 5.48f, dy = -1.0f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.3f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.65f, dy1 = 0.65f)
                arcToRelative(a = 0.66f, b = 0.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = 0.65f)
            }
        }.build().also { _musicSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _musicSquare: ImageVector? = null
