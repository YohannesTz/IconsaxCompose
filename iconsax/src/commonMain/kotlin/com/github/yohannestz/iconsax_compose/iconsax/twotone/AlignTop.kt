package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignTop: ImageVector
    get() {
        val current = _alignTop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignTop",
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
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.26f, y = 5.1f)
                verticalLineToRelative(dy = 11.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = -0.64f, dy2 = 2.1f, dx3 = -2.23f, dy3 = 2.1f)
                horizontalLineToRelative(dx = -1.04f)
                curveToRelative(dx1 = -1.59f, dy1 = 0.0f, dx2 = -2.23f, dy2 = -0.6f, dx3 = -2.23f, dy3 = -2.1f)
                verticalLineTo(y = 5.1f)
                moveToRelative(dx = -8.5f, dy = 0.0f)
                verticalLineToRelative(dy = 6.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = 0.64f, dy2 = 2.1f, dx3 = 2.23f, dy3 = 2.1f)
                horizontalLineToRelative(dx = 1.04f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.23f, dy2 = -0.6f, dx3 = 2.23f, dy3 = -2.1f)
                verticalLineTo(y = 5.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 5.0f)
                horizontalLineToRelative(dx = 20.0f)
            }
        }.build().also { _alignTop = it }
    }

@Suppress("ObjectPropertyName")
private var _alignTop: ImageVector? = null
