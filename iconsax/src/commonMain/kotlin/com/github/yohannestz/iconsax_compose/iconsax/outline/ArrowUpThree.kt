package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowUpThree: ImageVector
    get() {
        val current = _arrowUpThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowUpThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.67f, y = 18.75f)
                horizontalLineTo(x = 9.33f)
                curveToRelative(dx1 = -1.88f, dy1 = 0.0f, dx2 = -3.31f, dy2 = -0.68f, dx3 = -4.02f, dy3 = -1.91f)
                reflectiveCurveToRelative(dx1 = -0.58f, dy1 = -2.81f, dx2 = 0.36f, dy2 = -4.44f)
                lineToRelative(dx = 2.67f, dy = -4.63f)
                curveTo(x1 = 9.28f, y1 = 6.15f, x2 = 10.58f, y2 = 5.25f, x3 = 12.0f, y3 = 5.25f)
                reflectiveCurveToRelative(dx1 = 2.72f, dy1 = 0.9f, dx2 = 3.66f, dy2 = 2.53f)
                lineToRelative(dx = 2.67f, dy = 4.63f)
                curveToRelative(dx1 = 0.94f, dy1 = 1.63f, dx2 = 1.07f, dy2 = 3.21f, dx3 = 0.36f, dy3 = 4.44f)
                curveToRelative(dx1 = -0.71f, dy1 = 1.22f, dx2 = -2.14f, dy2 = 1.9f, dx3 = -4.02f, dy3 = 1.9f)
                moveTo(x = 12.0f, y = 6.75f)
                curveToRelative(dx1 = -0.86f, dy1 = 0.0f, dx2 = -1.7f, dy2 = 0.63f, dx3 = -2.36f, dy3 = 1.78f)
                lineToRelative(dx = -2.67f, dy = 4.63f)
                curveToRelative(dx1 = -0.66f, dy1 = 1.15f, dx2 = -0.79f, dy2 = 2.19f, dx3 = -0.36f, dy3 = 2.94f)
                reflectiveCurveToRelative(dx1 = 1.4f, dy1 = 1.16f, dx2 = 2.72f, dy2 = 1.16f)
                horizontalLineToRelative(dx = 5.34f)
                curveToRelative(dx1 = 1.32f, dy1 = 0.0f, dx2 = 2.29f, dy2 = -0.41f, dx3 = 2.72f, dy3 = -1.16f)
                reflectiveCurveToRelative(dx1 = 0.3f, dy1 = -1.79f, dx2 = -0.36f, dy2 = -2.94f)
                lineToRelative(dx = -2.67f, dy = -4.63f)
                curveTo(x1 = 13.7f, y1 = 7.38f, x2 = 12.86f, y2 = 6.75f, x3 = 12.0f, y3 = 6.75f)
            }
        }.build().also { _arrowUpThree = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowUpThree: ImageVector? = null
