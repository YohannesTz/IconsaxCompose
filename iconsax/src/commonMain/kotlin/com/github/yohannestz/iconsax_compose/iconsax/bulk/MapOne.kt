package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MapOne: ImageVector
    get() {
        val current = _mapOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MapOne",
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
                moveTo(x = 8.56f, y = 3.34f)
                verticalLineToRelative(dy = 14.33f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.93f, dy1 = 0.24f)
                lineToRelative(dx = -2.35f, dy = 1.34f)
                curveToRelative(dx1 = -1.64f, dy1 = 0.94f, dx2 = -2.99f, dy2 = 0.16f, dx3 = -2.99f, dy3 = -1.74f)
                verticalLineTo(y = 7.78f)
                arcTo(horizontalEllipseRadius = 2.2f, verticalEllipseRadius = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.3f, y1 = 6.05f)
                lineToRelative(dx = 4.33f, dy = -2.48f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.93f, dy1 = -0.23f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.73f, y = 6.33f)
                verticalLineToRelative(dy = 14.33f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.96f, dy1 = -0.18f)
                lineToRelative(dx = -5.25f, dy = -2.63f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.96f, dy1 = -0.18f)
                verticalLineTo(y = 3.34f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.96f, dy1 = 0.18f)
                lineToRelative(dx = 5.25f, dy = 2.63f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.96f, dy1 = 0.18f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 6.49f)
                verticalLineToRelative(dy = 9.73f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = 1.73f)
                lineToRelative(dx = -4.33f, dy = 2.48f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.93f, dy1 = 0.23f)
                verticalLineTo(y = 6.33f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.93f, dy1 = -0.24f)
                lineToRelative(dx = 2.35f, dy = -1.34f)
                curveTo(x1 = 20.65f, y1 = 3.81f, x2 = 22.0f, y2 = 4.59f, x3 = 22.0f, y3 = 6.49f)
            }
        }.build().also { _mapOne = it }
    }

@Suppress("ObjectPropertyName")
private var _mapOne: ImageVector? = null
