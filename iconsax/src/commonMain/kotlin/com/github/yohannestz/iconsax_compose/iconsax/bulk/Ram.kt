package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ram: ImageVector
    get() {
        val current = _ram
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ram",
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
                moveTo(x = 18.5f, y = 10.0f)
                verticalLineToRelative(dy = 2.17f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.59f, dy1 = 1.42f)
                lineToRelative(dx = 0.82f, dy = 0.82f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.59f, dy1 = 1.42f)
                verticalLineTo(y = 17.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.85f, dx2 = -1.38f, dy2 = 4.8f, dx3 = -4.49f, dy3 = 4.98f)
                lineToRelative(dx = -0.02f, dy = -2.99f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = -1.99f)
                horizontalLineTo(x = 9.98f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = 2.0f)
                lineToRelative(dx = 0.01f, dy = 2.98f)
                curveTo(x1 = 4.83f, y1 = 21.8f, x2 = 3.5f, y2 = 19.85f, x3 = 3.5f, y3 = 17.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 1.47f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 3.47f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 2.0f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.55f, dx2 = -0.45f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -1.0f, dy1 = 0.45f, dx2 = -1.0f, dy2 = 1.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.01f, y = 21.98f)
                lineTo(x = 15.5f, y = 22.0f)
                horizontalLineToRelative(dx = -7.0f)
                quadToRelative(dx1 = -0.27f, dy1 = 0.0f, dx2 = -0.51f, dy2 = -0.02f)
                lineTo(x = 7.98f, y = 19.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = -2.0f)
                horizontalLineToRelative(dx = 4.01f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = 1.99f)
                close()
                moveTo(x = 13.97f, y = 8.53f)
                horizontalLineToRelative(dx = -6.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 6.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _ram = it }
    }

@Suppress("ObjectPropertyName")
private var _ram: ImageVector? = null
