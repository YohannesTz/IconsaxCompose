package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowRightThree: ImageVector
    get() {
        val current = _arrowRightThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowRightThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.9f, y = 19.15f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.74f, dy1 = -0.45f)
                curveToRelative(dx1 = -1.23f, dy1 = -0.71f, dx2 = -1.91f, dy2 = -2.14f, dx3 = -1.91f, dy3 = -4.02f)
                verticalLineTo(y = 9.33f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.88f, dx2 = 0.68f, dy2 = -3.31f, dx3 = 1.91f, dy3 = -4.02f)
                reflectiveCurveToRelative(dx1 = 2.8f, dy1 = -0.58f, dx2 = 4.44f, dy2 = 0.36f)
                lineToRelative(dx = 4.63f, dy = 2.67f)
                curveToRelative(dx1 = 1.63f, dy1 = 0.94f, dx2 = 2.53f, dy2 = 2.24f, dx3 = 2.53f, dy3 = 3.66f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = 2.72f, dx2 = -2.53f, dy2 = 3.66f)
                lineToRelative(dx = -4.63f, dy = 2.67f)
                arcToRelative(a = 5.4f, b = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.7f, dy1 = 0.82f)
                moveToRelative(dx = 0.0f, dy = -12.79f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = 0.25f)
                curveTo(x1 = 7.16f, y1 = 7.04f, x2 = 6.75f, y2 = 8.0f, x3 = 6.75f, y3 = 9.33f)
                verticalLineToRelative(dy = 5.34f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.32f, dx2 = 0.41f, dy2 = 2.29f, dx3 = 1.16f, dy3 = 2.72f)
                reflectiveCurveToRelative(dx1 = 1.79f, dy1 = 0.3f, dx2 = 2.94f, dy2 = -0.36f)
                lineToRelative(dx = 4.63f, dy = -2.67f)
                curveToRelative(dx1 = 1.15f, dy1 = -0.66f, dx2 = 1.78f, dy2 = -1.5f, dx3 = 1.78f, dy3 = -2.36f)
                reflectiveCurveToRelative(dx1 = -0.63f, dy1 = -1.7f, dx2 = -1.78f, dy2 = -2.36f)
                lineToRelative(dx = -4.63f, dy = -2.67f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.9f, y1 = 6.36f)
            }
        }.build().also { _arrowRightThree = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowRightThree: ImageVector? = null
