package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Slider: ImageVector
    get() {
        val current = _slider
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Slider",
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
                moveTo(x = 15.0f, y = 22.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -2.5f, dy1 = 0.0f, dx2 = -4.0f, dy2 = -1.8f, dx3 = -4.0f, dy3 = -4.0f)
                verticalLineTo(y = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.2f, dx2 = 1.5f, dy2 = -4.0f, dx3 = 4.0f, dy3 = -4.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 2.5f, dy1 = 0.0f, dx2 = 4.0f, dy2 = 1.8f, dx3 = 4.0f, dy3 = 4.0f)
                verticalLineToRelative(dy = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.2f, dx2 = -1.5f, dy2 = 4.0f, dx3 = -4.0f, dy3 = 4.0f)
                moveTo(x = 5.0f, y = 16.01f)
                horizontalLineToRelative(dx = 14.0f)
                moveTo(x = 2.0f, y = 4.0f)
                verticalLineToRelative(dy = 16.0f)
                moveTo(x = 22.0f, y = 4.0f)
                verticalLineToRelative(dy = 16.0f)
            }
        }.build().also { _slider = it }
    }

@Suppress("ObjectPropertyName")
private var _slider: ImageVector? = null
