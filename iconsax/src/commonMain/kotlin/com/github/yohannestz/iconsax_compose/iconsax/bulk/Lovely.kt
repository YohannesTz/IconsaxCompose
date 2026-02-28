package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lovely: ImageVector
    get() {
        val current = _lovely
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Lovely",
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
                moveTo(x = 19.86f, y = 8.1f)
                lineToRelative(dx = -0.01f, dy = 0.43f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.53f, dy1 = 0.86f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.98f, dy1 = -1.14f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.46f, dy1 = 4.5f)
                arcToRelative(a = 8.7f, b = 8.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.78f, dy1 = 6.23f)
                lineToRelative(dx = -0.28f, dy = -0.06f)
                curveTo(x1 = 7.79f, y1 = 18.03f, x2 = 2.0f, y2 = 14.35f, x3 = 2.0f, y3 = 8.1f)
                arcToRelative(a = 4.97f, b = 4.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.93f, dy1 = -3.0f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.9f, y1 = 3.1f)
                arcToRelative(a = 4.97f, b = 4.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.96f, dy1 = 5.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.0f, y = 9.59f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.64f, dy1 = 1.32f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.94f, dy1 = 2.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.31f, dy1 = 1.96f)
                curveToRelative(dx1 = 0.94f, dy1 = 2.97f, dx2 = 3.83f, dy2 = 4.74f, dx3 = 5.26f, dy3 = 5.23f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.74f, dy1 = 0.0f)
                curveToRelative(dx1 = 1.43f, dy1 = -0.49f, dx2 = 4.32f, dy2 = -2.26f, dx3 = 5.26f, dy3 = -5.23f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.31f, dy1 = -1.96f)
                arcTo(horizontalEllipseRadius = 3.3f, verticalEllipseRadius = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.0f, y1 = 9.59f)
            }
        }.build().also { _lovely = it }
    }

@Suppress("ObjectPropertyName")
private var _lovely: ImageVector? = null
