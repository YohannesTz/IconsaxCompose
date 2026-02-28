package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                horizontalLineTo(x = 8.7f)
                curveTo(x1 = 6.8f, y1 = 2.0f, x2 = 5.3f, y2 = 3.5f, x3 = 5.3f, y3 = 5.3f)
                reflectiveCurveToRelative(dx1 = 1.5f, dy1 = 3.3f, dx2 = 3.3f, dy2 = 3.3f)
                horizontalLineTo(x = 12.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 6.7f)
                horizontalLineTo(x = 8.7f)
                curveToRelative(dx1 = -1.8f, dy1 = 0.0f, dx2 = -3.3f, dy2 = 1.5f, dx3 = -3.3f, dy3 = 3.3f)
                reflectiveCurveToRelative(dx1 = 1.5f, dy1 = 3.3f, dx2 = 3.3f, dy2 = 3.3f)
                horizontalLineTo(x = 12.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 6.6f)
                horizontalLineTo(x = 8.7f)
                curveToRelative(dx1 = -1.8f, dy1 = 0.0f, dx2 = -3.3f, dy2 = 1.5f, dx3 = -3.3f, dy3 = 3.3f)
                reflectiveCurveToRelative(dx1 = 1.5f, dy1 = 3.3f, dx2 = 3.3f, dy2 = 3.3f)
                reflectiveCurveToRelative(dx1 = 3.3f, dy1 = -1.5f, dx2 = 3.3f, dy2 = -3.3f)
                close()
                moveTo(x = 12.0f, y = 2.0f)
                horizontalLineToRelative(dx = 3.3f)
                curveToRelative(dx1 = 1.8f, dy1 = 0.0f, dx2 = 3.3f, dy2 = 1.5f, dx3 = 3.3f, dy3 = 3.3f)
                reflectiveCurveToRelative(dx1 = -1.5f, dy1 = 3.3f, dx2 = -3.3f, dy2 = 3.3f)
                horizontalLineTo(x = 12.0f)
                close()
                moveToRelative(dx = 3.3f, dy = 6.7f)
                curveToRelative(dx1 = 1.8f, dy1 = 0.0f, dx2 = 3.3f, dy2 = 1.5f, dx3 = 3.3f, dy3 = 3.3f)
                reflectiveCurveToRelative(dx1 = -1.5f, dy1 = 3.3f, dx2 = -3.3f, dy2 = 3.3f)
                reflectiveCurveTo(x1 = 12.0f, y1 = 13.8f, x2 = 12.0f, y2 = 12.0f)
                reflectiveCurveToRelative(dx1 = 1.5f, dy1 = -3.3f, dx2 = 3.3f, dy2 = -3.3f)
                close()
            }
        }.build().also { _figma = it }
    }

@Suppress("ObjectPropertyName")
private var _figma: ImageVector? = null
