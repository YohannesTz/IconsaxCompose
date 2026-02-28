package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrangeVertical: ImageVector
    get() {
        val current = _arrangeVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrangeVertical",
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
                moveTo(x = 10.45f, y = 6.72f)
                lineTo(x = 6.73f, y = 3.0f)
                lineTo(x = 3.01f, y = 6.72f)
                moveTo(x = 6.73f, y = 21.0f)
                verticalLineTo(y = 3.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.55f, y = 17.28f)
                lineTo(x = 17.27f, y = 21.0f)
                lineToRelative(dx = 3.72f, dy = -3.72f)
                moveTo(x = 17.27f, y = 3.0f)
                verticalLineToRelative(dy = 18.0f)
            }
        }.build().also { _arrangeVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _arrangeVertical: ImageVector? = null
