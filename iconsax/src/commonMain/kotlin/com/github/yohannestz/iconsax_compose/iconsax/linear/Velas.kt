package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Velas: ImageVector
    get() {
        val current = _velas
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Velas",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 3.0f)
                horizontalLineToRelative(dx = 20.0f)
                moveTo(x = 4.0f, y = 6.4f)
                horizontalLineToRelative(dx = 16.0f)
                curveToRelative(dx1 = 0.9f, dy1 = 0.0f, dx2 = 1.4f, dy2 = 1.0f, dx3 = 0.9f, dy3 = 1.7f)
                lineToRelative(dx = -8.0f, dy = 12.4f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.7f, dx2 = -1.4f, dy2 = 0.7f, dx3 = -1.9f, dy3 = 0.0f)
                lineTo(x = 3.0f, y = 8.1f)
                curveTo(x1 = 2.6f, y1 = 7.3f, x2 = 3.2f, y2 = 6.4f, x3 = 4.0f, y3 = 6.4f)
            }
        }.build().also { _velas = it }
    }

@Suppress("ObjectPropertyName")
private var _velas: ImageVector? = null
