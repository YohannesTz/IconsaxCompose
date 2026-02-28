package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BackwardItem: ImageVector
    get() {
        val current = _backwardItem
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BackwardItem",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.85f, y = 11.75f)
                horizontalLineToRelative(dx = -2.7f)
                curveToRelative(dx1 = -2.66f, dy1 = 0.0f, dx2 = -3.9f, dy2 = -1.24f, dx3 = -3.9f, dy3 = -3.9f)
                verticalLineToRelative(dy = -2.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.66f, dx2 = 1.24f, dy2 = -3.9f, dx3 = 3.9f, dy3 = -3.9f)
                horizontalLineToRelative(dx = 2.7f)
                curveToRelative(dx1 = 2.66f, dy1 = 0.0f, dx2 = 3.9f, dy2 = 1.24f, dx3 = 3.9f, dy3 = 3.9f)
                verticalLineToRelative(dy = 2.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.66f, dx2 = -1.24f, dy2 = 3.9f, dx3 = -3.9f, dy3 = 3.9f)
                moveToRelative(dx = -2.7f, dy = -9.0f)
                curveToRelative(dx1 = -1.84f, dy1 = 0.0f, dx2 = -2.4f, dy2 = 0.56f, dx3 = -2.4f, dy3 = 2.4f)
                verticalLineToRelative(dy = 2.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.84f, dx2 = 0.56f, dy2 = 2.4f, dx3 = 2.4f, dy3 = 2.4f)
                horizontalLineToRelative(dx = 2.7f)
                curveToRelative(dx1 = 1.84f, dy1 = 0.0f, dx2 = 2.4f, dy2 = -0.56f, dx3 = 2.4f, dy3 = -2.4f)
                verticalLineToRelative(dy = -2.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.84f, dx2 = -0.56f, dy2 = -2.4f, dx3 = -2.4f, dy3 = -2.4f)
                close()
                moveToRelative(dx = -8.3f, dy = 20.0f)
                horizontalLineToRelative(dx = -2.7f)
                curveToRelative(dx1 = -2.66f, dy1 = 0.0f, dx2 = -3.9f, dy2 = -1.24f, dx3 = -3.9f, dy3 = -3.9f)
                verticalLineToRelative(dy = -2.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.66f, dx2 = 1.24f, dy2 = -3.9f, dx3 = 3.9f, dy3 = -3.9f)
                horizontalLineToRelative(dx = 2.7f)
                curveToRelative(dx1 = 2.66f, dy1 = 0.0f, dx2 = 3.9f, dy2 = 1.24f, dx3 = 3.9f, dy3 = 3.9f)
                verticalLineToRelative(dy = 2.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.66f, dx2 = -1.24f, dy2 = 3.9f, dx3 = -3.9f, dy3 = 3.9f)
                moveToRelative(dx = -2.7f, dy = -9.0f)
                curveToRelative(dx1 = -1.84f, dy1 = 0.0f, dx2 = -2.4f, dy2 = 0.56f, dx3 = -2.4f, dy3 = 2.4f)
                verticalLineToRelative(dy = 2.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.84f, dx2 = 0.56f, dy2 = 2.4f, dx3 = 2.4f, dy3 = 2.4f)
                horizontalLineToRelative(dx = 2.7f)
                curveToRelative(dx1 = 1.84f, dy1 = 0.0f, dx2 = 2.4f, dy2 = -0.56f, dx3 = 2.4f, dy3 = -2.4f)
                verticalLineToRelative(dy = -2.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.84f, dx2 = -0.56f, dy2 = -2.4f, dx3 = -2.4f, dy3 = -2.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.62f, y = 18.13f)
                horizontalLineTo(x = 11.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -1.23f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.84f, dx2 = -0.56f, dy2 = -2.4f, dx3 = -2.4f, dy3 = -2.4f)
                horizontalLineTo(x = 6.62f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.87f, y1 = 13.0f)
                verticalLineToRelative(dy = -2.62f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.12f, dx2 = 1.4f, dy2 = -4.5f, dx3 = 4.51f, dy3 = -4.5f)
                horizontalLineTo(x = 13.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.74f)
                verticalLineToRelative(dy = 1.23f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.84f, dx2 = 0.56f, dy2 = 2.4f, dx3 = 2.4f, dy3 = 2.4f)
                horizontalLineToRelative(dx = 1.23f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.13f, y1 = 11.0f)
                verticalLineToRelative(dy = 2.62f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.12f, dx2 = -1.39f, dy2 = 4.51f, dx3 = -4.5f, dy3 = 4.51f)
                moveToRelative(dx = -1.87f, dy = -1.5f)
                horizontalLineToRelative(dx = 1.87f)
                curveToRelative(dx1 = 2.28f, dy1 = 0.0f, dx2 = 3.01f, dy2 = -0.73f, dx3 = 3.01f, dy3 = -3.0f)
                verticalLineToRelative(dy = -1.88f)
                horizontalLineToRelative(dx = -0.48f)
                curveToRelative(dx1 = -2.66f, dy1 = 0.0f, dx2 = -3.9f, dy2 = -1.24f, dx3 = -3.9f, dy3 = -3.9f)
                verticalLineTo(y = 7.37f)
                horizontalLineToRelative(dx = -1.87f)
                curveToRelative(dx1 = -2.28f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 0.73f, dx3 = -3.0f, dy3 = 3.01f)
                verticalLineToRelative(dy = 1.87f)
                horizontalLineToRelative(dx = 0.47f)
                curveToRelative(dx1 = 2.66f, dy1 = 0.0f, dx2 = 3.9f, dy2 = 1.24f, dx3 = 3.9f, dy3 = 3.9f)
                close()
            }
        }.build().also { _backwardItem = it }
    }

@Suppress("ObjectPropertyName")
private var _backwardItem: ImageVector? = null
