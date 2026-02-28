package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Size: ImageVector
    get() {
        val current = _size
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Size",
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
                moveTo(x = 16.97f, y = 12.25f)
                verticalLineToRelative(dy = 4.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.75f, dx2 = -1.5f, dy2 = 5.25f, dx3 = -5.25f, dy3 = 5.25f)
                horizontalLineToRelative(dx = -4.5f)
                curveToRelative(dx1 = -3.75f, dy1 = 0.0f, dx2 = -5.25f, dy2 = -1.5f, dx3 = -5.25f, dy3 = -5.25f)
                verticalLineToRelative(dy = -4.5f)
                curveTo(x1 = 1.97f, y1 = 8.5f, x2 = 3.47f, y2 = 7.0f, x3 = 7.22f, y3 = 7.0f)
                horizontalLineToRelative(dx = 4.5f)
                curveToRelative(dx1 = 3.75f, dy1 = 0.0f, dx2 = 5.25f, dy2 = 1.5f, dx3 = 5.25f, dy3 = 5.25f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.97f, y = 5.85f)
                verticalLineToRelative(dy = 3.3f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.75f, dx2 = -1.1f, dy2 = 3.85f, dx3 = -3.85f, dy3 = 3.85f)
                horizontalLineToRelative(dx = -1.15f)
                verticalLineToRelative(dy = -0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.75f, dx2 = -1.5f, dy2 = -5.25f, dx3 = -5.25f, dy3 = -5.25f)
                horizontalLineToRelative(dx = -0.75f)
                verticalLineTo(y = 5.85f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.75f, dx2 = 1.1f, dy2 = -3.85f, dx3 = 3.85f, dy3 = -3.85f)
                horizontalLineToRelative(dx = 3.3f)
                curveToRelative(dx1 = 2.75f, dy1 = 0.0f, dx2 = 3.85f, dy2 = 1.1f, dx3 = 3.85f, dy3 = 3.85f)
            }
        }.build().also { _size = it }
    }

@Suppress("ObjectPropertyName")
private var _size: ImageVector? = null
