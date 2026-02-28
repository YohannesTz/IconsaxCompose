package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowDownThree: ImageVector
    get() {
        val current = _arrowDownThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowDownThree",
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
                moveTo(x = 6.31f, y = 11.22f)
                curveTo(x1 = 4.66f, y1 = 8.35f, x2 = 6.01f, y2 = 6.0f, x3 = 9.33f, y3 = 6.0f)
                horizontalLineToRelative(dx = 5.34f)
                curveToRelative(dx1 = 3.31f, dy1 = 0.0f, dx2 = 4.67f, dy2 = 2.35f, dx3 = 3.01f, dy3 = 5.22f)
                lineToRelative(dx = -1.34f, dy = 2.31f)
                lineTo(x = 15.0f, y = 15.84f)
                curveToRelative(dx1 = -1.66f, dy1 = 2.87f, dx2 = -4.37f, dy2 = 2.87f, dx3 = -6.03f, dy3 = 0.0f)
            }
        }.build().also { _arrowDownThree = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowDownThree: ImageVector? = null
