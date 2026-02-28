package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sort: ImageVector
    get() {
        val current = _sort
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Sort",
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
                moveTo(x = 10.0f, y = 7.0f)
                horizontalLineToRelative(dx = 11.0f)
                moveTo(x = 3.0f, y = 7.0f)
                horizontalLineToRelative(dx = 3.0f)
                moveToRelative(dx = 0.0f, dy = 5.0f)
                horizontalLineToRelative(dx = 12.0f)
                moveToRelative(dx = -8.0f, dy = 5.0f)
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _sort = it }
    }

@Suppress("ObjectPropertyName")
private var _sort: ImageVector? = null
