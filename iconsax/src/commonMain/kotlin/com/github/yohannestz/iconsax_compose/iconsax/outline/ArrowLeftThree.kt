package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowLeftThree: ImageVector
    get() {
        val current = _arrowLeftThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowLeftThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.1f, y = 19.15f)
                arcToRelative(a = 5.4f, b = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.69f, dy1 = -0.81f)
                lineToRelative(dx = -4.63f, dy = -2.67f)
                curveTo(x1 = 6.15f, y1 = 14.72f, x2 = 5.25f, y2 = 13.42f, x3 = 5.25f, y3 = 12.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = -2.72f, dx2 = 2.53f, dy2 = -3.66f)
                lineToRelative(dx = 4.63f, dy = -2.67f)
                curveToRelative(dx1 = 1.63f, dy1 = -0.94f, dx2 = 3.2f, dy2 = -1.07f, dx3 = 4.44f, dy3 = -0.36f)
                curveToRelative(dx1 = 1.23f, dy1 = 0.71f, dx2 = 1.91f, dy2 = 2.14f, dx3 = 1.91f, dy3 = 4.02f)
                verticalLineToRelative(dy = 5.34f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.88f, dx2 = -0.68f, dy2 = 3.31f, dx3 = -1.91f, dy3 = 4.02f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.75f, dy1 = 0.46f)
                moveToRelative(dx = 0.0f, dy = -12.79f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.94f, dy1 = 0.61f)
                lineTo(x = 8.53f, y = 9.64f)
                curveTo(x1 = 7.38f, y1 = 10.3f, x2 = 6.75f, y2 = 11.14f, x3 = 6.75f, y3 = 12.0f)
                reflectiveCurveToRelative(dx1 = 0.63f, dy1 = 1.7f, dx2 = 1.78f, dy2 = 2.36f)
                lineToRelative(dx = 4.63f, dy = 2.67f)
                curveToRelative(dx1 = 1.15f, dy1 = 0.66f, dx2 = 2.19f, dy2 = 0.79f, dx3 = 2.94f, dy3 = 0.36f)
                reflectiveCurveToRelative(dx1 = 1.16f, dy1 = -1.4f, dx2 = 1.16f, dy2 = -2.72f)
                verticalLineTo(y = 9.33f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.32f, dx2 = -0.41f, dy2 = -2.29f, dx3 = -1.16f, dy3 = -2.72f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -0.25f)
            }
        }.build().also { _arrowLeftThree = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowLeftThree: ImageVector? = null
