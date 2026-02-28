package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GeminiTwo: ImageVector
    get() {
        val current = _geminiTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GeminiTwo",
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
                moveTo(x = 12.0f, y = 22.0f)
                verticalLineTo(y = 3.0f)
                moveToRelative(dx = 3.3f, dy = 2.3f)
                lineTo(x = 12.0f, y = 2.0f)
                lineTo(x = 8.7f, y = 5.3f)
                moveTo(x = 5.0f, y = 7.0f)
                lineTo(x = 3.0f, y = 5.0f)
                lineTo(x = 1.0f, y = 7.0f)
                moveToRelative(dx = 22.0f, dy = 0.0f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.0f, y = 6.04f)
                verticalLineTo(y = 11.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 6.0f, dx2 = 6.0f, dy2 = 6.0f)
                horizontalLineToRelative(dx = 6.0f)
                quadToRelative(dx1 = 6.0f, dy1 = 0.0f, dx2 = 6.0f, dy2 = -6.0f)
                verticalLineTo(y = 6.04f)
                moveTo(x = 9.0f, y = 20.0f)
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _geminiTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _geminiTwo: ImageVector? = null
