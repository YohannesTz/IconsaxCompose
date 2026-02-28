package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectRight: ImageVector
    get() {
        val current = _directRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DirectRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 2.71f, y = 17.02f)
                lineToRelative(dx = 1.74f, dy = -3.48f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.07f)
                lineTo(x = 2.71f, y = 6.98f)
                arcToRelative(a = 3.43f, b = 3.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.67f, dy1 = -4.57f)
                lineToRelative(dx = 1.54f, dy = 0.82f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.4f, y1 = 3.74f)
                lineToRelative(dx = 5.69f, dy = 12.65f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.48f, dy1 = 1.39f)
                lineToRelative(dx = -7.24f, dy = 3.81f)
                curveTo(x1 = 4.43f, y1 = 23.15f, x2 = 1.22f, y2 = 20.0f, x3 = 2.71f, y3 = 17.02f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.31f, y = 15.6f)
                lineToRelative(dx = -3.73f, dy = -8.28f)
                curveToRelative(dx1 = -0.42f, dy1 = -0.93f, dx2 = 0.58f, dy2 = -1.87f, dx3 = 1.48f, dy3 = -1.39f)
                lineToRelative(dx = 5.77f, dy = 3.04f)
                arcToRelative(a = 3.43f, b = 3.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.08f)
                lineToRelative(dx = -2.04f, dy = 1.07f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.48f, dy1 = -0.52f)
            }
        }.build().also { _directRight = it }
    }

@Suppress("ObjectPropertyName")
private var _directRight: ImageVector? = null
