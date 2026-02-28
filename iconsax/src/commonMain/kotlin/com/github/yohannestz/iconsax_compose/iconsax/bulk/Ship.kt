package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ship: ImageVector
    get() {
        val current = _ship
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ship",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.63f, y = 14.66f)
                lineToRelative(dx = -0.41f, dy = 1.86f)
                arcTo(horizontalEllipseRadius = 6.74f, verticalEllipseRadius = 6.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.38f, y1 = 22.0f)
                horizontalLineTo(x = 9.62f)
                arcToRelative(a = 6.74f, b = 6.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.84f, dy1 = -5.48f)
                lineToRelative(dx = -0.41f, dy = -1.86f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.21f, dy1 = -2.29f)
                lineTo(x = 5.0f, y = 11.8f)
                lineToRelative(dx = 5.51f, dy = -2.21f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.98f, dy1 = 0.0f)
                lineTo(x = 19.0f, y = 11.8f)
                lineToRelative(dx = 1.42f, dy = 0.57f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.21f, dy1 = 2.29f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 19.0f, y = 8.0f)
                verticalLineToRelative(dy = 3.8f)
                lineToRelative(dx = -5.51f, dy = -2.21f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.98f, dy1 = 0.0f)
                lineTo(x = 5.0f, y = 11.8f)
                verticalLineTo(y = 8.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = -3.0f)
                horizontalLineToRelative(dx = 8.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = 3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.5f, y = 5.0f)
                horizontalLineToRelative(dx = -5.0f)
                verticalLineTo(y = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = -1.0f)
                horizontalLineToRelative(dx = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
                close()
            }
        }.build().also { _ship = it }
    }

@Suppress("ObjectPropertyName")
private var _ship: ImageVector? = null
