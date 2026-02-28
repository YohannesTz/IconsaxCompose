package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowDown: ImageVector
    get() {
        val current = _arrowDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowDown",
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
                moveTo(x = 18.07f, y = 14.43f)
                lineTo(x = 12.0f, y = 20.5f)
                lineToRelative(dx = -6.07f, dy = -6.07f)
                moveTo(x = 12.0f, y = 12.0f)
                verticalLineToRelative(dy = 8.33f)
                moveTo(x = 12.0f, y = 3.5f)
                verticalLineToRelative(dy = 4.53f)
            }
        }.build().also { _arrowDown = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowDown: ImageVector? = null
