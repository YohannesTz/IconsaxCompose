package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MinusCirlce: ImageVector
    get() {
        val current = _minusCirlce
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MinusCirlce",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                curveTo(x1 = 6.49f, y1 = 2.0f, x2 = 2.0f, y2 = 6.49f, x3 = 2.0f, y3 = 12.0f)
                reflectiveCurveToRelative(dx1 = 4.49f, dy1 = 10.0f, dx2 = 10.0f, dy2 = 10.0f)
                reflectiveCurveToRelative(dx1 = 10.0f, dy1 = -4.49f, dx2 = 10.0f, dy2 = -10.0f)
                reflectiveCurveTo(x1 = 17.51f, y1 = 2.0f, x2 = 12.0f, y2 = 2.0f)
                moveToRelative(dx = 3.92f, dy = 10.75f)
                horizontalLineToRelative(dx = -8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 8.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _minusCirlce = it }
    }

@Suppress("ObjectPropertyName")
private var _minusCirlce: ImageVector? = null
