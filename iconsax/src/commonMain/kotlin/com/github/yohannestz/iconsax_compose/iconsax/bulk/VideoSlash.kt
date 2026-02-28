package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoSlash: ImageVector
    get() {
        val current = _videoSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoSlash",
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
                moveTo(x = 17.65f, y = 6.56f)
                lineTo(x = 4.2f, y = 20.01f)
                curveTo(x1 = 2.8f, y1 = 19.12f, x2 = 2.25f, y2 = 17.53f, x3 = 2.25f, y3 = 16.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.42f, dx2 = 1.33f, dy2 = -4.75f, dx3 = 4.75f, dy3 = -4.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 2.89f, dy1 = 0.0f, dx2 = 4.29f, dy2 = 0.95f, dx3 = 4.65f, dy3 = 3.31f)
                moveToRelative(dx = 0.1f, dy = 2.69f)
                verticalLineTo(y = 16.0f)
                lineToRelative(dx = -0.01f, dy = 0.21f)
                lineToRelative(dx = -0.01f, dy = 0.21f)
                horizontalLineToRelative(dx = 0.01f)
                curveToRelative(dx1 = -0.11f, dy1 = 3.11f, dx2 = -1.46f, dy2 = 4.33f, dx3 = -4.74f, dy3 = 4.33f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = -0.04f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 17.73f, y = 16.42f)
                lineToRelative(dx = 0.01f, dy = -0.21f)
                verticalLineToRelative(dy = 0.21f)
                close()
                moveToRelative(dx = 0.01f, dy = -8.85f)
                verticalLineToRelative(dy = 0.22f)
                lineToRelative(dx = -0.01f, dy = -0.21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.75f, y = 8.38f)
                verticalLineToRelative(dy = 7.24f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.43f, dx2 = -0.69f, dy2 = 2.0f, dx3 = -1.1f, dy3 = 2.21f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.85f, dy1 = 0.21f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.59f, dy1 = -0.58f)
                lineToRelative(dx = -1.47f, dy = -1.04f)
                horizontalLineToRelative(dx = -0.01f)
                lineToRelative(dx = 0.01f, dy = -0.21f)
                lineToRelative(dx = 0.01f, dy = -0.21f)
                verticalLineTo(y = 9.25f)
                lineToRelative(dx = 3.27f, dy = -3.27f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.63f, dy1 = 0.19f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.21f, dx2 = 1.1f, dy2 = 0.78f, dx3 = 1.1f, dy3 = 2.21f)
                moveToRelative(dx = -0.98f, dy = -6.15f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.1f, dy1 = 0.0f)
                lineTo(x = 2.24f, y = 20.69f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -0.01f)
                lineTo(x = 21.77f, y = 3.3f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.08f)
            }
        }.build().also { _videoSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _videoSlash: ImageVector? = null
