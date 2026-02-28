package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartSquare: ImageVector
    get() {
        val current = _chartSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ChartSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
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
                moveTo(x = 9.11f, y = 16.9f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = 0.5f)
                horizontalLineTo(x = 5.82f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = -0.5f)
                verticalLineToRelative(dy = -4.62f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.14f, dy1 = -1.14f)
                horizontalLineToRelative(dx = 2.15f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = 0.5f)
                close()
                moveToRelative(dx = 4.78f, dy = 0.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = 0.5f)
                horizontalLineTo(x = 10.6f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = -0.5f)
                verticalLineTo(y = 7.74f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.14f, dy1 = -1.14f)
                horizontalLineToRelative(dx = 1.52f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.14f, dy1 = 1.14f)
                close()
                moveToRelative(dx = 4.79f, dy = 0.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = 0.5f)
                horizontalLineToRelative(dx = -2.79f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = -0.5f)
                verticalLineToRelative(dy = -3.55f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = -0.5f)
                horizontalLineToRelative(dx = 2.15f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.14f, dy1 = 1.14f)
                close()
            }
        }.build().also { _chartSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _chartSquare: ImageVector? = null
