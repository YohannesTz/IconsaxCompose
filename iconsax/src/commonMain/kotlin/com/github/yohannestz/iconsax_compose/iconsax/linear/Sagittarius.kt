package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sagittarius: ImageVector
    get() {
        val current = _sagittarius
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Sagittarius",
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
                moveTo(x = 12.0f, y = 3.0f)
                horizontalLineToRelative(dx = 9.0f)
                verticalLineToRelative(dy = 9.0f)
                moveToRelative(dx = 0.0f, dy = -9.0f)
                lineTo(x = 3.0f, y = 21.0f)
                moveTo(x = 6.6f, y = 6.6f)
                lineToRelative(dx = 10.8f, dy = 10.8f)
            }
        }.build().also { _sagittarius = it }
    }

@Suppress("ObjectPropertyName")
private var _sagittarius: ImageVector? = null
