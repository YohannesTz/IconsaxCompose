package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Music: ImageVector
    get() {
        val current = _music
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Music",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.29f, y = 10.34f)
                verticalLineToRelative(dy = 8.07f)
                arcTo(horizontalEllipseRadius = 3.6f, verticalEllipseRadius = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.7f, y1 = 22.0f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -7.17f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.19f, dy1 = 0.76f)
                verticalLineToRelative(dy = -4.85f)
                close()
                moveToRelative(dx = 10.6f, dy = -3.02f)
                verticalLineToRelative(dy = 9.16f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.59f, dy1 = 3.59f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.59f, dy1 = -3.59f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.59f, dy1 = -3.58f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.2f, dy1 = 0.77f)
                verticalLineTo(y = 7.72f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.89f, y = 5.18f)
                verticalLineToRelative(dy = 2.14f)
                lineToRelative(dx = -12.0f, dy = 3.42f)
                verticalLineToRelative(dy = -4.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.3f, dy1 = -2.98f)
                lineToRelative(dx = 5.78f, dy = -1.58f)
                curveToRelative(dx1 = 1.17f, dy1 = -0.32f, dx2 = 2.16f, dy2 = -0.21f, dx3 = 2.86f, dy3 = 0.33f)
                quadToRelative(dx1 = 1.06f, dy1 = 0.8f, dx2 = 1.06f, dy2 = 2.67f)
            }
        }.build().also { _music = it }
    }

@Suppress("ObjectPropertyName")
private var _music: ImageVector? = null
