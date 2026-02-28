package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wing: ImageVector
    get() {
        val current = _wing
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Wing",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.0f, y = 5.0f)
                horizontalLineToRelative(dx = 3.5f)
                lineToRelative(dx = 2.7f, dy = 4.7f)
                lineTo(x = 17.0f, y = 19.0f)
                lineToRelative(dx = -1.85f, dy = -3.1f)
                lineToRelative(dx = 3.55f, dy = -6.2f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 5.0f)
                horizontalLineToRelative(dx = 3.5f)
                lineToRelative(dx = 2.7f, dy = 4.7f)
                lineTo(x = 10.0f, y = 19.0f)
                lineToRelative(dx = -1.85f, dy = -3.1f)
                lineToRelative(dx = 3.55f, dy = -6.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 1.8f, y = 5.0f)
                horizontalLineToRelative(dx = 3.5f)
                lineTo(x = 8.0f, y = 9.8f)
                lineToRelative(dx = -1.7f, dy = 2.9f)
                close()
            }
        }.build().also { _wing = it }
    }

@Suppress("ObjectPropertyName")
private var _wing: ImageVector? = null
