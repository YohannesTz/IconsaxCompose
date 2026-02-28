package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 17.74f, y = 7.57f)
                verticalLineToRelative(dy = 0.22f)
                lineToRelative(dx = -0.01f, dy = -0.21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.28f, y = 6.56f)
                lineTo(x = 3.83f, y = 20.01f)
                curveToRelative(dx1 = -1.4f, dy1 = -0.89f, dx2 = -1.95f, dy2 = -2.48f, dx3 = -1.95f, dy3 = -4.01f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.42f, dx2 = 1.33f, dy2 = -4.75f, dx3 = 4.75f, dy3 = -4.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 2.89f, dy1 = 0.0f, dx2 = 4.28f, dy2 = 0.95f, dx3 = 4.65f, dy3 = 3.31f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.4f, y = 2.23f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.09f, dy1 = 0.0f)
                lineTo(x = 1.85f, y = 20.69f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -0.01f)
                lineTo(x = 21.4f, y = 3.3f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.08f)
                moveToRelative(dx = 0.98f, dy = 6.15f)
                verticalLineToRelative(dy = 7.24f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.43f, dx2 = -0.7f, dy2 = 2.0f, dx3 = -1.1f, dy3 = 2.21f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.86f, dy1 = 0.21f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.58f, dy1 = -0.58f)
                lineToRelative(dx = -1.48f, dy = -1.04f)
                curveToRelative(dx1 = -0.07f, dy1 = 2.21f, dx2 = -0.77f, dy2 = 3.47f, dx3 = -2.36f, dy3 = 4.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.38f, dy1 = 0.33f)
                horizontalLineToRelative(dx = -6.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = -0.04f)
                lineTo(x = 15.0f, y = 11.63f)
                lineToRelative(dx = 5.65f, dy = -5.65f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.63f, dy1 = 0.19f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.21f, dx2 = 1.1f, dy2 = 0.78f, dx3 = 1.1f, dy3 = 2.21f)
            }
        }.build().also { _videoSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _videoSlash: ImageVector? = null
