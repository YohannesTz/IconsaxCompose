package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RowVertical: ImageVector
    get() {
        val current = _rowVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RowVertical",
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
                moveTo(x = 19.9f, y = 13.5f)
                horizontalLineTo(x = 4.1f)
                curveToRelative(dx1 = -1.5f, dy1 = 0.0f, dx2 = -2.1f, dy2 = 0.64f, dx3 = -2.1f, dy3 = 2.23f)
                verticalLineToRelative(dy = 4.04f)
                curveTo(x1 = 2.0f, y1 = 21.36f, x2 = 2.6f, y2 = 22.0f, x3 = 4.1f, y3 = 22.0f)
                horizontalLineToRelative(dx = 15.8f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 2.1f, dy2 = -0.64f, dx3 = 2.1f, dy3 = -2.23f)
                verticalLineToRelative(dy = -4.04f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.59f, dx2 = -0.6f, dy2 = -2.23f, dx3 = -2.1f, dy3 = -2.23f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.9f, y = 2.0f)
                horizontalLineTo(x = 4.1f)
                curveTo(x1 = 2.6f, y1 = 2.0f, x2 = 2.0f, y2 = 2.64f, x3 = 2.0f, y3 = 4.23f)
                verticalLineToRelative(dy = 4.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.59f, dx2 = 0.6f, dy2 = 2.23f, dx3 = 2.1f, dy3 = 2.23f)
                horizontalLineToRelative(dx = 15.8f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 2.1f, dy2 = -0.64f, dx3 = 2.1f, dy3 = -2.23f)
                verticalLineTo(y = 4.23f)
                curveTo(x1 = 22.0f, y1 = 2.64f, x2 = 21.4f, y2 = 2.0f, x3 = 19.9f, y3 = 2.0f)
            }
        }.build().also { _rowVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _rowVertical: ImageVector? = null
