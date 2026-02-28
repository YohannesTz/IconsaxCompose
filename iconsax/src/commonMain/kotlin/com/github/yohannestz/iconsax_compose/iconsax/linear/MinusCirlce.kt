package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.92f, y = 22.0f)
                curveToRelative(dx1 = 5.5f, dy1 = 0.0f, dx2 = 10.0f, dy2 = -4.5f, dx3 = 10.0f, dy3 = -10.0f)
                reflectiveCurveToRelative(dx1 = -4.5f, dy1 = -10.0f, dx2 = -10.0f, dy2 = -10.0f)
                reflectiveCurveToRelative(dx1 = -10.0f, dy1 = 4.5f, dx2 = -10.0f, dy2 = 10.0f)
                reflectiveCurveToRelative(dx1 = 4.5f, dy1 = 10.0f, dx2 = 10.0f, dy2 = 10.0f)
                moveToRelative(dx = -4.0f, dy = -10.0f)
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _minusCirlce = it }
    }

@Suppress("ObjectPropertyName")
private var _minusCirlce: ImageVector? = null
