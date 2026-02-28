package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 7.63f, y = 3.57f)
                curveTo(x1 = 7.81f, y1 = 3.47f, x2 = 8.0f, y2 = 3.62f, x3 = 8.0f, y3 = 3.83f)
                verticalLineToRelative(dy = 13.55f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.23f, dx2 = -0.15f, dy2 = 0.42f, dx3 = -0.35f, dy3 = 0.52f)
                horizontalLineTo(x = 7.63f)
                lineToRelative(dx = -2.35f, dy = 1.35f)
                curveToRelative(dx1 = -1.64f, dy1 = 0.94f, dx2 = -2.99f, dy2 = 0.16f, dx3 = -2.99f, dy3 = -1.74f)
                verticalLineTo(y = 7.78f)
                arcTo(horizontalEllipseRadius = 2.2f, verticalEllipseRadius = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.3f, y1 = 6.05f)
                close()
                moveToRelative(dx = 7.1f, dy = 2.53f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 6.55f)
                verticalLineTo(y = 19.7f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.72f, dy1 = 0.45f)
                lineToRelative(dx = -4.25f, dy = -2.04f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.28f, dy1 = -0.45f)
                verticalLineTo(y = 4.45f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.47f, y1 = 4.0f)
                close()
                moveTo(x = 22.0f, y = 6.5f)
                verticalLineToRelative(dy = 9.73f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = 1.73f)
                lineToRelative(dx = -3.5f, dy = 2.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.74f, dy1 = -0.43f)
                verticalLineTo(y = 6.33f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 5.9f)
                lineToRelative(dx = 2.01f, dy = -1.15f)
                curveTo(x1 = 20.65f, y1 = 3.81f, x2 = 22.0f, y2 = 4.59f, x3 = 22.0f, y3 = 6.49f)
            }
        }.build().also { _mapOne = it }
    }

@Suppress("ObjectPropertyName")
private var _mapOne: ImageVector? = null
