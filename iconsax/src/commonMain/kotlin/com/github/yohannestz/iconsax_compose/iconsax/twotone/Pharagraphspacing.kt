package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pharagraphspacing: ImageVector
    get() {
        val current = _pharagraphspacing
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Pharagraphspacing",
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
                moveTo(x = 3.0f, y = 22.0f)
                horizontalLineToRelative(dx = 18.0f)
                moveTo(x = 3.0f, y = 2.0f)
                horizontalLineToRelative(dx = 18.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 6.0f)
                verticalLineToRelative(dy = 12.0f)
                moveToRelative(dx = 2.83f, dy = -10.28f)
                lineTo(x = 12.0f, y = 4.89f)
                lineTo(x = 9.17f, y = 7.72f)
                moveToRelative(dx = 5.66f, dy = 8.17f)
                lineTo(x = 12.0f, y = 18.72f)
                lineToRelative(dx = -2.83f, dy = -2.83f)
            }
        }.build().also { _pharagraphspacing = it }
    }

@Suppress("ObjectPropertyName")
private var _pharagraphspacing: ImageVector? = null
