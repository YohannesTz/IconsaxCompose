package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowLeftThree: ImageVector
    get() {
        val current = _arrowLeftThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowLeftThree",
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
                moveTo(x = 18.0f, y = 12.0f)
                verticalLineToRelative(dy = 2.67f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.31f, dx2 = -2.35f, dy2 = 4.67f, dx3 = -5.22f, dy3 = 3.01f)
                lineToRelative(dx = -2.31f, dy = -1.34f)
                lineTo(x = 8.16f, y = 15.0f)
                curveToRelative(dx1 = -2.87f, dy1 = -1.66f, dx2 = -2.87f, dy2 = -4.37f, dx3 = 0.0f, dy3 = -6.03f)
                lineToRelative(dx = 2.31f, dy = -1.34f)
                lineToRelative(dx = 2.31f, dy = -1.34f)
                curveTo(x1 = 15.65f, y1 = 4.66f, x2 = 18.0f, y2 = 6.01f, x3 = 18.0f, y3 = 9.33f)
                close()
            }
        }.build().also { _arrowLeftThree = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowLeftThree: ImageVector? = null
