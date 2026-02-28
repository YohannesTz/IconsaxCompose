package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrangeHorizontal: ImageVector
    get() {
        val current = _arrangeHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrangeHorizontal",
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
                moveTo(x = 17.28f, y = 10.45f)
                lineTo(x = 21.0f, y = 6.73f)
                lineToRelative(dx = -3.72f, dy = -3.72f)
                moveTo(x = 3.0f, y = 6.73f)
                horizontalLineToRelative(dx = 18.0f)
                moveTo(x = 6.72f, y = 13.55f)
                lineTo(x = 3.0f, y = 17.27f)
                lineToRelative(dx = 3.72f, dy = 3.72f)
                moveTo(x = 21.0f, y = 17.27f)
                horizontalLineTo(x = 3.0f)
            }
        }.build().also { _arrangeHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _arrangeHorizontal: ImageVector? = null
