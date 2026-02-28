package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sound: ImageVector
    get() {
        val current = _sound
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Sound",
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
                moveTo(x = 3.0f, y = 8.25f)
                verticalLineToRelative(dy = 7.5f)
                moveToRelative(dx = 4.5f, dy = -10.0f)
                verticalLineToRelative(dy = 12.5f)
                moveToRelative(dx = 4.5f, dy = -15.0f)
                verticalLineToRelative(dy = 17.5f)
                moveToRelative(dx = 4.5f, dy = -15.0f)
                verticalLineToRelative(dy = 12.5f)
                moveToRelative(dx = 4.5f, dy = -10.0f)
                verticalLineToRelative(dy = 7.5f)
            }
        }.build().also { _sound = it }
    }

@Suppress("ObjectPropertyName")
private var _sound: ImageVector? = null
