package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dash: ImageVector
    get() {
        val current = _dash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 13.5f, y = 21.25f)
                horizontalLineTo(x = 3.94f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = -0.93f)
                lineToRelative(dx = 1.06f, dy = -4.25f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 15.5f)
                horizontalLineToRelative(dx = 7.44f)
                curveToRelative(dx1 = 2.9f, dy1 = 0.0f, dx2 = 4.56f, dy2 = -1.66f, dx3 = 4.56f, dy3 = -4.56f)
                verticalLineToRelative(dy = -0.19f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.6f, dx2 = -0.65f, dy2 = -2.25f, dx3 = -2.25f, dy3 = -2.25f)
                horizontalLineTo(x = 6.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = -0.93f)
                lineToRelative(dx = 1.06f, dy = -4.25f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.73f, dy1 = -0.57f)
                horizontalLineTo(x = 16.0f)
                curveToRelative(dx1 = 4.16f, dy1 = 0.0f, dx2 = 6.75f, dy2 = 2.59f, dx3 = 6.75f, dy3 = 6.75f)
                verticalLineTo(y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.71f, dx2 = -3.54f, dy2 = 9.25f, dx3 = -9.25f, dy3 = 9.25f)
                moveToRelative(dx = -8.6f, dy = -1.5f)
                horizontalLineToRelative(dx = 8.6f)
                curveToRelative(dx1 = 4.85f, dy1 = 0.0f, dx2 = 7.75f, dy2 = -2.9f, dx3 = 7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.34f, dx2 = -1.91f, dy2 = -5.25f, dx3 = -5.25f, dy3 = -5.25f)
                horizontalLineTo(x = 7.71f)
                lineTo(x = 7.02f, y = 7.0f)
                horizontalLineToRelative(dx = 7.73f)
                curveToRelative(dx1 = 2.42f, dy1 = 0.0f, dx2 = 3.75f, dy2 = 1.33f, dx3 = 3.75f, dy3 = 3.75f)
                verticalLineToRelative(dy = 0.19f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.74f, dx2 = -2.32f, dy2 = 6.06f, dx3 = -6.06f, dy3 = 6.06f)
                horizontalLineTo(x = 5.59f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 9.19f, y = 14.25f)
                horizontalLineTo(x = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = -0.93f)
                lineToRelative(dx = 0.37f, dy = -1.48f)
                arcToRelative(a = 2.74f, b = 2.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.67f, dy1 = -2.08f)
                horizontalLineToRelative(dx = 7.19f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.73f, dy1 = 0.93f)
                lineToRelative(dx = -0.37f, dy = 1.48f)
                arcToRelative(a = 2.76f, b = 2.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.67f, dy1 = 2.08f)
                moveToRelative(dx = -6.23f, dy = -1.5f)
                horizontalLineToRelative(dx = 6.23f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.21f, dy1 = -0.95f)
                lineToRelative(dx = 0.14f, dy = -0.55f)
                horizontalLineTo(x = 4.31f)
                arcTo(horizontalEllipseRadius = 1.25f, verticalEllipseRadius = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.1f, y1 = 12.2f)
                close()
            }
        }.build().also { _dash = it }
    }

@Suppress("ObjectPropertyName")
private var _dash: ImageVector? = null
