package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HashtagSquare: ImageVector
    get() {
        val current = _hashtagSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HashtagSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.05f, y = 10.14f)
                verticalLineToRelative(dy = 1.16f)
                horizontalLineToRelative(dx = 3.26f)
                verticalLineTo(y = 8.05f)
                horizontalLineToRelative(dx = -1.16f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.1f, dy1 = 2.09f)
                moveToRelative(dx = 0.0f, dy = 3.72f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.09f, dy1 = 2.09f)
                horizontalLineToRelative(dx = 1.16f)
                verticalLineTo(y = 12.7f)
                horizontalLineTo(x = 8.05f)
                close()
                moveToRelative(dx = 4.65f, dy = 2.09f)
                horizontalLineToRelative(dx = 1.16f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.09f, dy1 = -2.09f)
                verticalLineTo(y = 12.7f)
                horizontalLineTo(x = 12.7f)
                close()
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
                moveToRelative(dx = 1.16f, dy = 11.86f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.49f, dy1 = 3.49f)
                horizontalLineToRelative(dx = -3.72f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.49f, dy1 = -3.49f)
                verticalLineToRelative(dy = -3.72f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.49f, dy1 = -3.49f)
                horizontalLineToRelative(dx = 3.72f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.49f, dy1 = 3.49f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.86f, y = 8.05f)
                horizontalLineTo(x = 12.7f)
                verticalLineToRelative(dy = 3.26f)
                horizontalLineToRelative(dx = 3.26f)
                verticalLineToRelative(dy = -1.16f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.1f, dy1 = -2.1f)
            }
        }.build().also { _hashtagSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _hashtagSquare: ImageVector? = null
