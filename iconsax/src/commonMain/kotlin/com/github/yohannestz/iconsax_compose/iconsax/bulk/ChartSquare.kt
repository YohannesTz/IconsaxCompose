package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.2f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveToRelative(dx1 = -3.64f, dy1 = 0.0f, dx2 = -5.8f, dy2 = 2.17f, dx3 = -5.8f, dy3 = 5.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.16f, dy2 = 5.81f, dx3 = 5.8f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.2f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.11f, y = 11.15f)
                horizontalLineTo(x = 7.46f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = 1.14f)
                verticalLineToRelative(dy = 5.12f)
                horizontalLineToRelative(dx = 3.79f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.76f, y = 6.6f)
                horizontalLineToRelative(dx = -1.52f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = 1.14f)
                verticalLineToRelative(dy = 9.66f)
                horizontalLineToRelative(dx = 3.8f)
                verticalLineTo(y = 7.74f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.63f, dx2 = -0.5f, dy2 = -1.14f, dx3 = -1.14f, dy3 = -1.14f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.55f, y = 12.85f)
                horizontalLineTo(x = 13.9f)
                verticalLineToRelative(dy = 4.55f)
                horizontalLineToRelative(dx = 3.79f)
                verticalLineTo(y = 14.0f)
                arcToRelative(a = 1.15f, b = 1.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = -1.15f)
            }
        }.build().also { _chartSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _chartSquare: ImageVector? = null
