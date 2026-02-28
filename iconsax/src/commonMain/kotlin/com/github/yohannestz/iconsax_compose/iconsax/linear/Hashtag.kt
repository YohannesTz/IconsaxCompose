package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hashtag: ImageVector
    get() {
        val current = _hashtag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Hashtag",
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
                moveTo(x = 10.0f, y = 3.0f)
                lineTo(x = 8.0f, y = 21.0f)
                moveToRelative(dx = 8.0f, dy = -18.0f)
                lineToRelative(dx = -2.0f, dy = 18.0f)
                moveTo(x = 3.5f, y = 9.0f)
                horizontalLineToRelative(dx = 18.0f)
                moveToRelative(dx = -19.0f, dy = 6.0f)
                horizontalLineToRelative(dx = 18.0f)
            }
        }.build().also { _hashtag = it }
    }

@Suppress("ObjectPropertyName")
private var _hashtag: ImageVector? = null
