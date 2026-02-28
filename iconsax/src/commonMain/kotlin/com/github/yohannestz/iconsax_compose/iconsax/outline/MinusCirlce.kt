package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 11.92f, y = 22.75f)
                curveTo(x1 = 6.0f, y1 = 22.75f, x2 = 1.17f, y2 = 17.93f, x3 = 1.17f, y3 = 12.0f)
                reflectiveCurveTo(x1 = 6.0f, y1 = 1.25f, x2 = 11.92f, y2 = 1.25f)
                reflectiveCurveTo(x1 = 22.67f, y1 = 6.07f, x2 = 22.67f, y2 = 12.0f)
                reflectiveCurveToRelative(dx1 = -4.82f, dy1 = 10.75f, dx2 = -10.75f, dy2 = 10.75f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.92f, y = 12.75f)
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
