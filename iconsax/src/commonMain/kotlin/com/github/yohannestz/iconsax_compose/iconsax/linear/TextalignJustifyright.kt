package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextalignJustifyright: ImageVector
    get() {
        val current = _textalignJustifyright
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TextalignJustifyright",
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
                moveTo(x = 12.0f, y = 4.5f)
                horizontalLineToRelative(dx = 9.0f)
                moveToRelative(dx = -9.0f, dy = 5.0f)
                horizontalLineToRelative(dx = 9.0f)
                moveToRelative(dx = -18.0f, dy = 5.0f)
                horizontalLineToRelative(dx = 18.0f)
                moveToRelative(dx = -18.0f, dy = 5.0f)
                horizontalLineToRelative(dx = 18.0f)
            }
        }.build().also { _textalignJustifyright = it }
    }

@Suppress("ObjectPropertyName")
private var _textalignJustifyright: ImageVector? = null
