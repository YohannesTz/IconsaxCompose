package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloseCircle: ImageVector
    get() {
        val current = _closeCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloseCircle",
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
                moveTo(x = 12.0f, y = 22.0f)
                curveToRelative(dx1 = 5.5f, dy1 = 0.0f, dx2 = 10.0f, dy2 = -4.5f, dx3 = 10.0f, dy3 = -10.0f)
                reflectiveCurveTo(x1 = 17.5f, y1 = 2.0f, x2 = 12.0f, y2 = 2.0f)
                reflectiveCurveTo(x1 = 2.0f, y1 = 6.5f, x2 = 2.0f, y2 = 12.0f)
                reflectiveCurveToRelative(dx1 = 4.5f, dy1 = 10.0f, dx2 = 10.0f, dy2 = 10.0f)
                moveToRelative(dx = -2.83f, dy = -7.17f)
                lineToRelative(dx = 5.66f, dy = -5.66f)
                moveToRelative(dx = 0.0f, dy = 5.66f)
                lineTo(x = 9.17f, y = 9.17f)
            }
        }.build().also { _closeCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _closeCircle: ImageVector? = null
