package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ElementTwo: ImageVector
    get() {
        val current = _elementTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ElementTwo",
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
                moveTo(x = 10.5f, y = 19.9f)
                verticalLineTo(y = 4.1f)
                curveTo(x1 = 10.5f, y1 = 2.6f, x2 = 9.86f, y2 = 2.0f, x3 = 8.27f, y3 = 2.0f)
                horizontalLineTo(x = 4.23f)
                curveTo(x1 = 2.64f, y1 = 2.0f, x2 = 2.0f, y2 = 2.6f, x3 = 2.0f, y3 = 4.1f)
                verticalLineToRelative(dy = 15.8f)
                curveTo(x1 = 2.0f, y1 = 21.4f, x2 = 2.64f, y2 = 22.0f, x3 = 4.23f, y3 = 22.0f)
                horizontalLineToRelative(dx = 4.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = -0.6f, dx3 = 2.23f, dy3 = -2.1f)
                moveTo(x = 22.0f, y = 8.52f)
                verticalLineTo(y = 3.98f)
                curveTo(x1 = 22.0f, y1 = 2.57f, x2 = 21.36f, y2 = 2.0f, x3 = 19.77f, y3 = 2.0f)
                horizontalLineToRelative(dx = -4.04f)
                curveToRelative(dx1 = -1.59f, dy1 = 0.0f, dx2 = -2.23f, dy2 = 0.57f, dx3 = -2.23f, dy3 = 1.98f)
                verticalLineToRelative(dy = 4.53f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.42f, dx2 = 0.64f, dy2 = 1.98f, dx3 = 2.23f, dy3 = 1.98f)
                horizontalLineToRelative(dx = 4.04f)
                curveTo(x1 = 21.36f, y1 = 10.5f, x2 = 22.0f, y2 = 9.93f, x3 = 22.0f, y3 = 8.52f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 19.77f)
                verticalLineToRelative(dy = -4.04f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.59f, dx2 = -0.64f, dy2 = -2.23f, dx3 = -2.23f, dy3 = -2.23f)
                horizontalLineToRelative(dx = -4.04f)
                curveToRelative(dx1 = -1.59f, dy1 = 0.0f, dx2 = -2.23f, dy2 = 0.64f, dx3 = -2.23f, dy3 = 2.23f)
                verticalLineToRelative(dy = 4.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.59f, dx2 = 0.64f, dy2 = 2.23f, dx3 = 2.23f, dy3 = 2.23f)
                horizontalLineToRelative(dx = 4.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = -0.64f, dx3 = 2.23f, dy3 = -2.23f)
            }
        }.build().also { _elementTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _elementTwo: ImageVector? = null
