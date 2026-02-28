package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SaveTwo: ImageVector
    get() {
        val current = _saveTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SaveTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.89f, y = 5.88f)
                horizontalLineTo(x = 5.11f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 8.98f)
                verticalLineToRelative(dy = 11.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.45f, dx2 = 1.04f, dy2 = 2.07f, dx3 = 2.31f, dy3 = 1.36f)
                lineToRelative(dx = 3.93f, dy = -2.2f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.51f, dy1 = 0.0f)
                lineToRelative(dx = 3.93f, dy = 2.2f)
                curveTo(x1 = 14.96f, y1 = 22.4f, x2 = 16.0f, y2 = 21.8f, x3 = 16.0f, y3 = 20.35f)
                verticalLineTo(y = 8.99f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.71f, dx2 = -1.4f, dy2 = -3.11f, dx3 = -3.11f, dy3 = -3.11f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 5.11f)
                verticalLineToRelative(dy = 11.36f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.45f, dx2 = -1.04f, dy2 = 2.06f, dx3 = -2.31f, dy3 = 1.36f)
                lineToRelative(dx = -1.93f, dy = -1.08f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.26f, dy1 = -0.44f)
                verticalLineTo(y = 8.99f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.61f, dy1 = -4.61f)
                horizontalLineTo(x = 8.82f)
                curveToRelative(dx1 = -0.37f, dy1 = 0.0f, dx2 = -0.63f, dy2 = -0.39f, dx3 = -0.46f, dy3 = -0.71f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.11f, y1 = 2.0f)
                horizontalLineToRelative(dx = 7.78f)
                curveTo(x1 = 20.6f, y1 = 2.0f, x2 = 22.0f, y2 = 3.4f, x3 = 22.0f, y3 = 5.11f)
            }
        }.build().also { _saveTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _saveTwo: ImageVector? = null
