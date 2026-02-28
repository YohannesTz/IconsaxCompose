package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowRightThree: ImageVector
    get() {
        val current = _arrowRightThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowRightThree",
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
                moveTo(x = 6.0f, y = 12.0f)
                verticalLineTo(y = 9.33f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.31f, dx2 = 2.35f, dy2 = -4.67f, dx3 = 5.22f, dy3 = -3.01f)
                lineToRelative(dx = 2.31f, dy = 1.34f)
                lineTo(x = 15.84f, y = 9.0f)
                curveToRelative(dx1 = 2.87f, dy1 = 1.66f, dx2 = 2.87f, dy2 = 4.37f, dx3 = 0.0f, dy3 = 6.03f)
                lineToRelative(dx = -2.31f, dy = 1.34f)
                lineToRelative(dx = -2.31f, dy = 1.34f)
                curveTo(x1 = 8.35f, y1 = 19.34f, x2 = 6.0f, y2 = 17.99f, x3 = 6.0f, y3 = 14.67f)
                close()
            }
        }.build().also { _arrowRightThree = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowRightThree: ImageVector? = null
