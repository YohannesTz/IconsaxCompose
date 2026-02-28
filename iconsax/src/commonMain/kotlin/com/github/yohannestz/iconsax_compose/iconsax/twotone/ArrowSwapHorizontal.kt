package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowSwapHorizontal: ImageVector
    get() {
        val current = _arrowSwapHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowSwapHorizontal",
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
                moveTo(x = 20.5f, y = 14.99f)
                lineToRelative(dx = -5.01f, dy = 5.02f)
                moveTo(x = 3.5f, y = 14.99f)
                horizontalLineToRelative(dx = 17.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.5f, y = 9.01f)
                lineToRelative(dx = 5.01f, dy = -5.02f)
                moveTo(x = 20.5f, y = 9.01f)
                horizontalLineToRelative(dx = -17.0f)
            }
        }.build().also { _arrowSwapHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowSwapHorizontal: ImageVector? = null
