package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stickynote: ImageVector
    get() {
        val current = _stickynote
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Stickynote",
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
                moveTo(x = 21.5f, y = 8.37f)
                verticalLineToRelative(dy = 7.45f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.23f, dx2 = -0.18f, dy2 = 0.43f)
                lineToRelative(dx = -5.51f, dy = 5.55f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.47f, dy1 = 0.2f)
                horizontalLineTo(x = 7.37f)
                arcToRelative(a = 4.87f, b = 4.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.87f, dy1 = -4.87f)
                verticalLineTo(y = 8.37f)
                arcTo(horizontalEllipseRadius = 4.87f, verticalEllipseRadius = 4.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.37f, y1 = 3.5f)
                horizontalLineToRelative(dx = 9.26f)
                arcToRelative(a = 4.87f, b = 4.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.87f, dy1 = 4.87f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.29f, y = 6.29f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = 2.78f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.76f)
                moveToRelative(dx = 7.42f, dy = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = 2.78f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.76f)
                moveToRelative(dx = -0.93f, dy = 6.42f)
                horizontalLineTo(x = 7.36f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 7.42f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveTo(x = 12.0f, y = 16.42f)
                horizontalLineTo(x = 7.36f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineTo(x = 12.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = 9.5f, dy = -0.6f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.23f, dx2 = -0.18f, dy2 = 0.43f)
                lineToRelative(dx = -5.51f, dy = 5.55f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.47f, dy1 = 0.2f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.64f)
                verticalLineToRelative(dy = -3.5f)
                arcToRelative(a = 2.73f, b = 2.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.76f, dy1 = -2.67f)
                lineToRelative(dx = 3.4f, dy = -0.01f)
                arcToRelative(a = 0.64f, b = 0.64f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.65f, dy1 = 0.64f)
            }
        }.build().also { _stickynote = it }
    }

@Suppress("ObjectPropertyName")
private var _stickynote: ImageVector? = null
