package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Monitor: ImageVector
    get() {
        val current = _monitor
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Monitor",
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
                moveTo(x = 6.44f, y = 2.0f)
                horizontalLineToRelative(dx = 11.11f)
                curveTo(x1 = 21.11f, y1 = 2.0f, x2 = 22.0f, y2 = 2.89f, x3 = 22.0f, y3 = 6.44f)
                verticalLineToRelative(dy = 6.33f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.56f, dx2 = -0.89f, dy2 = 4.44f, dx3 = -4.44f, dy3 = 4.44f)
                horizontalLineTo(x = 6.44f)
                curveTo(x1 = 2.89f, y1 = 17.22f, x2 = 2.0f, y2 = 16.33f, x3 = 2.0f, y3 = 12.78f)
                verticalLineTo(y = 6.44f)
                curveTo(x1 = 2.0f, y1 = 2.89f, x2 = 2.89f, y2 = 2.0f, x3 = 6.44f, y3 = 2.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 17.22f)
                verticalLineTo(y = 22.0f)
                moveTo(x = 2.0f, y = 13.0f)
                horizontalLineToRelative(dx = 20.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.5f, y = 22.0f)
                horizontalLineToRelative(dx = 9.0f)
            }
        }.build().also { _monitor = it }
    }

@Suppress("ObjectPropertyName")
private var _monitor: ImageVector? = null
