package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stop: ImageVector
    get() {
        val current = _stop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Stop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.36f, y = 7.78f)
                lineToRelative(dx = -15.82f, dy = 9.5f)
                curveToRelative(dx1 = -0.61f, dy1 = 0.37f, dx2 = -1.43f, dy2 = 0.0f, dx3 = -1.51f, dy3 = -0.71f)
                lineTo(x = 3.0f, y = 16.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 2.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 4.23f, dy2 = 1.54f, dx3 = 4.81f, dy3 = 3.65f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.45f, dy1 = 1.13f)
                moveTo(x = 21.0f, y = 11.09f)
                verticalLineTo(y = 16.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -2.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                horizontalLineTo(x = 8.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.53f, dy1 = -0.69f)
                curveTo(x1 = 4.83f, y1 = 19.94f, x2 = 4.87f, y2 = 19.0f, x3 = 5.5f, y3 = 18.62f)
                lineToRelative(dx = 13.98f, dy = -8.39f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.0f, y1 = 11.09f)
            }
        }.build().also { _stop = it }
    }

@Suppress("ObjectPropertyName")
private var _stop: ImageVector? = null
