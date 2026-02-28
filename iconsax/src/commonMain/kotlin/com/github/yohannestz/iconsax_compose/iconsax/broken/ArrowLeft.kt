package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowLeft: ImageVector
    get() {
        val current = _arrowLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.57f, y = 5.93f)
                lineTo(x = 3.5f, y = 12.0f)
                lineToRelative(dx = 6.07f, dy = 6.07f)
                moveTo(x = 12.82f, y = 12.0f)
                horizontalLineTo(x = 3.5f)
                moveToRelative(dx = 16.83f, dy = 0.0f)
                horizontalLineToRelative(dx = -3.48f)
            }
        }.build().also { _arrowLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowLeft: ImageVector? = null
