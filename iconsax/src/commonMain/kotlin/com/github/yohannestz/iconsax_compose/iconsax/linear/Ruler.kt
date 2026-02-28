package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ruler: ImageVector
    get() {
        val current = _ruler
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ruler",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.0f, y = 17.0f)
                horizontalLineToRelative(dx = 14.0f)
                quadToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -3.0f)
                verticalLineToRelative(dy = -4.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -3.0f, dy2 = -3.0f)
                horizontalLineTo(x = 5.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 4.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 3.0f, dy2 = 3.0f)
                close()
                moveTo(x = 18.0f, y = 7.0f)
                verticalLineToRelative(dy = 5.0f)
                moveTo(x = 6.0f, y = 7.0f)
                verticalLineToRelative(dy = 4.0f)
                moveToRelative(dx = 4.05f, dy = -4.0f)
                lineTo(x = 10.0f, y = 12.0f)
                moveToRelative(dx = 4.0f, dy = -5.0f)
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _ruler = it }
    }

@Suppress("ObjectPropertyName")
private var _ruler: ImageVector? = null
