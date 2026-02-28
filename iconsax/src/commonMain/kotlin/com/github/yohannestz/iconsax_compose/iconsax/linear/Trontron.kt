package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Trontron: ImageVector
    get() {
        val current = _trontron
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Trontron",
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
                moveTo(x = 2.6f, y = 3.6f)
                lineToRelative(dx = 6.7f, dy = 16.8f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.9f, dx2 = 1.1f, dy2 = 1.0f, dx3 = 1.7f, dy3 = 0.2f)
                lineToRelative(dx = 9.4f, dy = -11.9f)
                curveToRelative(dx1 = 0.3f, dy1 = -0.4f, dx2 = 0.3f, dy2 = -1.0f, dx3 = -0.1f, dy3 = -1.3f)
                lineToRelative(dx = -3.1f, dy = -3.1f)
                curveTo(x1 = 17.1f, y1 = 4.1f, x2 = 16.8f, y2 = 4.0f, x3 = 16.7f, y3 = 4.0f)
                lineToRelative(dx = -13.0f, dy = -1.7f)
                curveTo(x1 = 2.8f, y1 = 2.1f, x2 = 2.3f, y2 = 2.7f, x3 = 2.6f, y3 = 3.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.0f, y = 21.0f)
                lineToRelative(dx = 1.0f, dy = -11.0f)
                lineToRelative(dx = -8.0f, dy = -7.1f)
                moveTo(x = 17.0f, y = 4.0f)
                lineToRelative(dx = -6.0f, dy = 6.0f)
                lineToRelative(dx = 9.0f, dy = -1.8f)
            }
        }.build().also { _trontron = it }
    }

@Suppress("ObjectPropertyName")
private var _trontron: ImageVector? = null
