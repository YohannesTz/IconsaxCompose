package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 19.5f, y = 9.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -1.53f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = -7.0f)
                curveToRelative(dx1 = -3.53f, dy1 = 0.0f, dx2 = -5.0f, dy2 = 2.0f, dx3 = -5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.31f, dx2 = 0.88f, dy2 = 4.03f, dx3 = 2.9f, dy3 = 4.68f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.1f, dx2 = 0.59f, dy2 = -0.14f, dx3 = 0.59f, dy3 = -0.46f)
                lineTo(x = 6.98f, y = 19.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = -3.0f)
                horizontalLineToRelative(dx = 4.01f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = 2.98f)
                lineToRelative(dx = 0.02f, dy = 2.25f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.31f, dx2 = 0.3f, dy2 = 0.55f, dx3 = 0.6f, dy3 = 0.45f)
                curveTo(x1 = 19.58f, y1 = 21.0f, x2 = 20.5f, y2 = 19.3f, x3 = 20.5f, y3 = 17.0f)
                verticalLineToRelative(dy = -1.17f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.59f, dy1 = -1.42f)
                lineToRelative(dx = -0.82f, dy = -0.82f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.59f, dy1 = -1.42f)
                verticalLineTo(y = 10.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = -1.0f)
                moveToRelative(dx = -5.53f, dy = -0.47f)
                horizontalLineToRelative(dx = -6.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 6.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.01f, y = 20.97f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = 1.01f)
                horizontalLineTo(x = 8.99f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -1.0f)
                lineTo(x = 7.98f, y = 19.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = -2.0f)
                horizontalLineToRelative(dx = 4.01f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = 1.99f)
                close()
            }
        }.build().also { _ram = it }
    }

@Suppress("ObjectPropertyName")
private var _ram: ImageVector? = null
