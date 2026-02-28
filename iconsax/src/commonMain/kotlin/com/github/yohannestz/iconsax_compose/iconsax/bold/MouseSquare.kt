package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MouseSquare: ImageVector
    get() {
        val current = _mouseSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MouseSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.0f, y = 7.52f)
                verticalLineToRelative(dy = 5.88f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = 0.48f)
                lineToRelative(dx = -3.93f, dy = -1.22f)
                arcToRelative(a = 3.02f, b = 3.02f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.78f, dy1 = 3.79f)
                lineToRelative(dx = 1.21f, dy = 3.9f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 13.37f, y1 = 21.0f)
                horizontalLineTo(x = 7.52f)
                curveTo(x1 = 4.07f, y1 = 21.0f, x2 = 2.0f, y2 = 18.94f, x3 = 2.0f, y3 = 15.48f)
                verticalLineTo(y = 7.52f)
                curveTo(x1 = 2.0f, y1 = 4.06f, x2 = 4.07f, y2 = 2.0f, x3 = 7.52f, y3 = 2.0f)
                horizontalLineToRelative(dx = 7.96f)
                curveTo(x1 = 18.93f, y1 = 2.0f, x2 = 21.0f, y2 = 4.06f, x3 = 21.0f, y3 = 7.52f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.96f, y = 18.84f)
                lineToRelative(dx = -1.63f, dy = 0.55f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.96f, dy1 = 0.96f)
                lineToRelative(dx = -0.55f, dy = 1.63f)
                arcToRelative(a = 1.52f, b = 1.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.89f, dy1 = -0.03f)
                lineTo(x = 14.08f, y = 16.0f)
                arcToRelative(a = 1.52f, b = 1.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.9f, dy1 = -1.91f)
                lineToRelative(dx = 5.96f, dy = 1.85f)
                curveToRelative(dx1 = 1.4f, dy1 = 0.44f, dx2 = 1.42f, dy2 = 2.43f, dx3 = 0.02f, dy3 = 2.9f)
            }
        }.build().also { _mouseSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _mouseSquare: ImageVector? = null
