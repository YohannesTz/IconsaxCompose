package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextItalic: ImageVector
    get() {
        val current = _textItalic
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TextItalic",
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
                moveTo(x = 9.62f, y = 3.0f)
                horizontalLineToRelative(dx = 9.25f)
                moveTo(x = 5.12f, y = 21.0f)
                horizontalLineToRelative(dx = 9.25f)
                moveToRelative(dx = -3.87f, dy = -3.01f)
                lineToRelative(dx = -0.75f, dy = 3.0f)
                moveTo(x = 14.25f, y = 3.0f)
                lineTo(x = 11.5f, y = 14.01f)
            }
        }.build().also { _textItalic = it }
    }

@Suppress("ObjectPropertyName")
private var _textItalic: ImageVector? = null
