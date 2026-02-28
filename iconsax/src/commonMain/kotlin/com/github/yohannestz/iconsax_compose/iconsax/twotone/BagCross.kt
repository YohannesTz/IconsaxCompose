package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BagCross: ImageVector
    get() {
        val current = _bagCross
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BagCross",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.39f, y = 17.36f)
                lineToRelative(dx = -2.75f, dy = -2.75f)
                moveToRelative(dx = 2.72f, dy = 0.03f)
                lineToRelative(dx = -2.75f, dy = 2.75f)
                moveTo(x = 8.81f, y = 2.0f)
                lineTo(x = 5.19f, y = 5.63f)
                moveToRelative(dx = 10.0f, dy = -3.63f)
                lineToRelative(dx = 3.62f, dy = 3.63f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 7.85f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.85f, dx2 = 0.99f, dy2 = -2.0f, dx3 = 2.22f, dy3 = -2.0f)
                horizontalLineToRelative(dx = 15.56f)
                curveToRelative(dx1 = 1.23f, dy1 = 0.0f, dx2 = 2.22f, dy2 = 0.15f, dx3 = 2.22f, dy3 = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.15f, dx2 = -0.99f, dy2 = 2.0f, dx3 = -2.22f, dy3 = 2.0f)
                horizontalLineTo(x = 4.22f)
                curveTo(x1 = 2.99f, y1 = 9.85f, x2 = 2.0f, y2 = 10.0f, x3 = 2.0f, y3 = 7.85f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.5f, y = 10.0f)
                lineToRelative(dx = 1.41f, dy = 8.64f)
                curveTo(x1 = 5.23f, y1 = 20.58f, x2 = 6.0f, y2 = 22.0f, x3 = 8.86f, y3 = 22.0f)
                horizontalLineToRelative(dx = 6.03f)
                curveToRelative(dx1 = 3.11f, dy1 = 0.0f, dx2 = 3.57f, dy2 = -1.36f, dx3 = 3.93f, dy3 = -3.24f)
                lineTo(x = 20.5f, y = 10.0f)
            }
        }.build().also { _bagCross = it }
    }

@Suppress("ObjectPropertyName")
private var _bagCross: ImageVector? = null
