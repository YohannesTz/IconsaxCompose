package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChemicalGlass: ImageVector
    get() {
        val current = _chemicalGlass
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ChemicalGlass",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.16f, y = 22.0f)
                curveToRelative(dx1 = -4.18f, dy1 = 0.0f, dx2 = -5.02f, dy2 = -2.53f, dx3 = -3.66f, dy3 = -5.61f)
                lineToRelative(dx = 4.25f, dy = -9.65f)
                horizontalLineToRelative(dx = -0.3f)
                arcToRelative(a = 2.37f, b = 2.37f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.38f, dy1 = -2.37f)
                curveTo(x1 = 6.07f, y1 = 3.07f, x2 = 7.13f, y2 = 2.0f, x3 = 8.44f, y3 = 2.0f)
                horizontalLineToRelative(dx = 7.11f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.68f, dy1 = 0.7f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.63f, dy1 = 2.25f)
                arcToRelative(a = 2.46f, b = 2.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.42f, dy1 = 1.79f)
                horizontalLineToRelative(dx = -0.16f)
                lineToRelative(dx = 4.22f, dy = 9.66f)
                curveToRelative(dx1 = 1.35f, dy1 = 3.08f, dx2 = 0.47f, dy2 = 5.6f, dx3 = -3.67f, dy3 = 5.6f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.94f, y = 13.12f)
                reflectiveCurveTo(x1 = 9.0f, y1 = 13.0f, x2 = 12.0f, y2 = 14.0f)
                reflectiveCurveToRelative(dx1 = 5.83f, dy1 = -0.89f, dx2 = 5.83f, dy2 = -0.89f)
            }
        }.build().also { _chemicalGlass = it }
    }

@Suppress("ObjectPropertyName")
private var _chemicalGlass: ImageVector? = null
