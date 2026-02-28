package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowUpThree: ImageVector
    get() {
        val current = _arrowUpThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowUpThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 18.0f)
                horizontalLineTo(x = 9.33f)
                curveToRelative(dx1 = -3.31f, dy1 = 0.0f, dx2 = -4.67f, dy2 = -2.35f, dx3 = -3.01f, dy3 = -5.22f)
                lineToRelative(dx = 1.34f, dy = -2.31f)
                lineTo(x = 9.0f, y = 8.16f)
                curveToRelative(dx1 = 1.66f, dy1 = -2.87f, dx2 = 4.37f, dy2 = -2.87f, dx3 = 6.03f, dy3 = 0.0f)
                lineToRelative(dx = 1.34f, dy = 2.31f)
                lineToRelative(dx = 1.34f, dy = 2.31f)
                curveToRelative(dx1 = 1.66f, dy1 = 2.87f, dx2 = 0.3f, dy2 = 5.22f, dx3 = -3.01f, dy3 = 5.22f)
                close()
            }
        }.build().also { _arrowUpThree = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowUpThree: ImageVector? = null
