package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowDownThree: ImageVector
    get() {
        val current = _arrowDownThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowDownThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.33f, y = 6.0f)
                horizontalLineToRelative(dx = 5.34f)
                curveToRelative(dx1 = 3.32f, dy1 = 0.0f, dx2 = 4.67f, dy2 = 2.35f, dx3 = 3.02f, dy3 = 5.22f)
                lineToRelative(dx = -0.74f, dy = 1.28f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.87f, dy1 = 0.5f)
                horizontalLineTo(x = 7.92f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.87f, dy1 = -0.5f)
                lineToRelative(dx = -0.74f, dy = -1.28f)
                curveTo(x1 = 4.66f, y1 = 8.35f, x2 = 6.01f, y2 = 6.0f, x3 = 9.33f, y3 = 6.0f)
                moveToRelative(dx = -0.54f, dy = 8.0f)
                horizontalLineToRelative(dx = 6.43f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.43f, dy1 = 0.75f)
                lineToRelative(dx = -0.64f, dy = 1.1f)
                curveToRelative(dx1 = -1.65f, dy1 = 2.87f, dx2 = -4.37f, dy2 = 2.87f, dx3 = -6.02f, dy3 = 0.0f)
                lineToRelative(dx = -0.64f, dy = -1.1f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.8f, y1 = 14.0f)
            }
        }.build().also { _arrowDownThree = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowDownThree: ImageVector? = null
