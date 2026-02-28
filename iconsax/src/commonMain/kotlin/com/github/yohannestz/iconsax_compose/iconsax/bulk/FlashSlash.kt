package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlashSlash: ImageVector
    get() {
        val current = _flashSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FlashSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.77f, y = 2.23f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.09f, dy1 = 0.0f)
                lineTo(x = 2.23f, y = 20.69f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -0.01f)
                lineTo(x = 21.77f, y = 3.3f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.08f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 14.82f, y = 3.52f)
                verticalLineToRelative(dy = 5.66f)
                lineToRelative(dx = -5.64f, dy = 5.64f)
                verticalLineToRelative(dy = -1.54f)
                horizontalLineTo(x = 6.09f)
                curveToRelative(dx1 = -1.4f, dy1 = 0.0f, dx2 = -1.79f, dy2 = -0.86f, dx3 = -0.86f, dy3 = -1.91f)
                lineTo(x = 12.0f, y = 3.67f)
                lineToRelative(dx = 0.8f, dy = -0.91f)
                curveToRelative(dx1 = 1.11f, dy1 = -1.26f, dx2 = 2.02f, dy2 = -0.92f, dx3 = 2.02f, dy3 = 0.76f)
                moveToRelative(dx = 3.95f, dy = 9.1f)
                lineTo(x = 12.0f, y = 20.33f)
                lineToRelative(dx = -0.8f, dy = 0.92f)
                curveToRelative(dx1 = -1.11f, dy1 = 1.26f, dx2 = -2.02f, dy2 = 0.92f, dx3 = -2.02f, dy3 = -0.76f)
                verticalLineToRelative(dy = -2.66f)
                lineToRelative(dx = 7.1f, dy = -7.1f)
                horizontalLineToRelative(dx = 1.63f)
                curveToRelative(dx1 = 1.4f, dy1 = 0.0f, dx2 = 1.79f, dy2 = 0.86f, dx3 = 0.86f, dy3 = 1.9f)
            }
        }.build().also { _flashSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _flashSlash: ImageVector? = null
