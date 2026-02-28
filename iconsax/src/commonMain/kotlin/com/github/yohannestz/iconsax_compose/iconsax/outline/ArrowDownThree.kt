package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 12.0f, y = 18.75f)
                curveToRelative(dx1 = -1.42f, dy1 = 0.0f, dx2 = -2.72f, dy2 = -0.9f, dx3 = -3.66f, dy3 = -2.53f)
                lineToRelative(dx = -2.67f, dy = -4.63f)
                curveTo(x1 = 4.72f, y1 = 9.96f, x2 = 4.6f, y2 = 8.39f, x3 = 5.3f, y3 = 7.16f)
                curveTo(x1 = 6.0f, y1 = 5.93f, x2 = 7.45f, y2 = 5.25f, x3 = 9.33f, y3 = 5.25f)
                horizontalLineToRelative(dx = 5.34f)
                curveToRelative(dx1 = 1.88f, dy1 = 0.0f, dx2 = 3.3f, dy2 = 0.68f, dx3 = 4.02f, dy3 = 1.91f)
                curveToRelative(dx1 = 0.7f, dy1 = 1.23f, dx2 = 0.58f, dy2 = 2.81f, dx3 = -0.36f, dy3 = 4.44f)
                lineToRelative(dx = -2.67f, dy = 4.63f)
                curveToRelative(dx1 = -0.94f, dy1 = 1.62f, dx2 = -2.24f, dy2 = 2.52f, dx3 = -3.66f, dy3 = 2.52f)
                moveToRelative(dx = -2.67f, dy = -12.0f)
                curveTo(x1 = 8.0f, y1 = 6.75f, x2 = 7.03f, y2 = 7.16f, x3 = 6.6f, y3 = 7.91f)
                curveTo(x1 = 6.17f, y1 = 8.66f, x2 = 6.3f, y2 = 9.7f, x3 = 6.96f, y3 = 10.84f)
                lineToRelative(dx = 2.67f, dy = 4.63f)
                curveToRelative(dx1 = 0.66f, dy1 = 1.15f, dx2 = 1.5f, dy2 = 1.78f, dx3 = 2.36f, dy3 = 1.78f)
                reflectiveCurveToRelative(dx1 = 1.7f, dy1 = -0.63f, dx2 = 2.36f, dy2 = -1.78f)
                lineToRelative(dx = 2.67f, dy = -4.63f)
                curveToRelative(dx1 = 0.66f, dy1 = -1.15f, dx2 = 0.79f, dy2 = -2.19f, dx3 = 0.36f, dy3 = -2.94f)
                reflectiveCurveToRelative(dx1 = -1.4f, dy1 = -1.16f, dx2 = -2.72f, dy2 = -1.16f)
                close()
            }
        }.build().also { _arrowDownThree = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowDownThree: ImageVector? = null
