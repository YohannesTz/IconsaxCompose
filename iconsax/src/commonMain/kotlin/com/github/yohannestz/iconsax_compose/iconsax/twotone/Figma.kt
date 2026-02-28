package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Figma: ImageVector
    get() {
        val current = _figma
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Figma",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 6.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveTo(x1 = 8.9f, y1 = 6.0f, x2 = 8.0f, y2 = 6.9f, x3 = 8.0f, y3 = 8.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = 2.0f, dx2 = 2.0f, dy2 = 2.0f)
                horizontalLineToRelative(dx = 2.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 4.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = 0.9f, dx3 = -2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = 2.0f, dx2 = 2.0f, dy2 = 2.0f)
                horizontalLineToRelative(dx = 2.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 4.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = 0.9f, dx3 = -2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = 2.0f, dx2 = 2.0f, dy2 = 2.0f)
                reflectiveCurveToRelative(dx1 = 2.0f, dy1 = -0.9f, dx2 = 2.0f, dy2 = -2.0f)
                close()
                moveToRelative(dx = 0.0f, dy = -8.0f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.9f, dx3 = 2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = 2.0f, dx2 = -2.0f, dy2 = 2.0f)
                horizontalLineToRelative(dx = -2.0f)
                close()
                moveToRelative(dx = 2.0f, dy = 4.0f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.9f, dx3 = 2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = 2.0f, dx2 = -2.0f, dy2 = 2.0f)
                reflectiveCurveToRelative(dx1 = -2.0f, dy1 = -0.9f, dx2 = -2.0f, dy2 = -2.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = -2.0f, dx2 = 2.0f, dy2 = -2.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                close()
            }
        }.build().also { _figma = it }
    }

@Suppress("ObjectPropertyName")
private var _figma: ImageVector? = null
