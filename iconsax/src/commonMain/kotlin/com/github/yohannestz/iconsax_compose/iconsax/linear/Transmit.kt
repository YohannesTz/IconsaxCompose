package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Transmit: ImageVector
    get() {
        val current = _transmit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Transmit",
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
                moveTo(x = 3.5f, y = 22.0f)
                horizontalLineToRelative(dx = 17.0f)
                moveTo(x = 5.0f, y = 3.5f)
                lineToRelative(dx = 14.0f, dy = 14.0f)
                moveTo(x = 5.0f, y = 13.77f)
                verticalLineTo(y = 3.5f)
                horizontalLineToRelative(dx = 10.27f)
            }
        }.build().also { _transmit = it }
    }

@Suppress("ObjectPropertyName")
private var _transmit: ImageVector? = null
