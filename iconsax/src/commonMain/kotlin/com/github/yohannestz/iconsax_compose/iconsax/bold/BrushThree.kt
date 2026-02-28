package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BrushThree: ImageVector
    get() {
        val current = _brushThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BrushThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.65f, y = 4.79f)
                horizontalLineToRelative(dx = -0.28f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.85f, dy1 = -1.89f)
                quadTo(x1 = 14.62f, y1 = 2.0f, x2 = 12.93f, y2 = 2.0f)
                horizontalLineTo(x = 7.35f)
                curveTo(x1 = 5.1f, y1 = 2.0f, x2 = 3.86f, y2 = 3.24f, x3 = 3.86f, y3 = 5.49f)
                quadToRelative(dx1 = 0.0f, dy1 = 1.69f, dx2 = 0.9f, dy2 = 2.59f)
                reflectiveQuadToRelative(dx1 = 2.59f, dy1 = 0.9f)
                horizontalLineToRelative(dx = 5.58f)
                curveToRelative(dx1 = 2.0f, dy1 = 0.0f, dx2 = 3.2f, dy2 = -0.99f, dx3 = 3.44f, dy3 = -2.79f)
                horizontalLineToRelative(dx = 0.28f)
                curveToRelative(dx1 = 2.09f, dy1 = 0.0f, dx2 = 2.09f, dy2 = 0.28f, dx3 = 2.09f, dy3 = 2.09f)
                verticalLineToRelative(dy = 1.86f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.81f, dx2 = 0.0f, dy2 = 2.09f, dx3 = -2.09f, dy3 = 2.09f)
                horizontalLineToRelative(dx = -3.72f)
                curveToRelative(dx1 = -2.99f, dy1 = 0.0f, dx2 = -3.42f, dy2 = 1.42f, dx3 = -3.48f, dy3 = 2.8f)
                curveToRelative(dx1 = -0.9f, dy1 = 0.06f, dx2 = -1.87f, dy2 = 0.48f, dx3 = -1.87f, dy3 = 2.08f)
                verticalLineToRelative(dy = 2.79f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.73f, dx2 = 1.14f, dy2 = 2.09f, dx3 = 2.09f, dy3 = 2.09f)
                horizontalLineToRelative(dx = 0.93f)
                curveToRelative(dx1 = 0.95f, dy1 = 0.0f, dx2 = 2.09f, dy2 = -0.36f, dx3 = 2.09f, dy3 = -2.09f)
                verticalLineToRelative(dy = -2.79f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.58f, dx2 = -0.95f, dy2 = -2.02f, dx3 = -1.85f, dy3 = -2.08f)
                curveToRelative(dx1 = 0.05f, dy1 = -1.01f, dx2 = 0.34f, dy2 = -1.41f, dx3 = 2.08f, dy3 = -1.41f)
                horizontalLineToRelative(dx = 3.72f)
                curveToRelative(dx1 = 3.25f, dy1 = 0.0f, dx2 = 3.49f, dy2 = -1.32f, dx3 = 3.49f, dy3 = -3.49f)
                verticalLineTo(y = 8.28f)
                curveToRelative(dx1 = 0.01f, dy1 = -2.17f, dx2 = -0.23f, dy2 = -3.49f, dx3 = -3.48f, dy3 = -3.49f)
            }
        }.build().also { _brushThree = it }
    }

@Suppress("ObjectPropertyName")
private var _brushThree: ImageVector? = null
