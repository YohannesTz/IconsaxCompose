package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                moveToRelative(dx = 6.05f, dy = -12.0f)
                horizontalLineToRelative(dx = 1.45f)
                moveToRelative(dx = -18.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 13.49f)
                moveTo(x = 3.95f, y = 15.0f)
                horizontalLineTo(x = 2.5f)
                moveToRelative(dx = 18.0f, dy = 0.0f)
                horizontalLineTo(x = 7.01f)
            }
        }.build().also { _hashtag = it }
    }

@Suppress("ObjectPropertyName")
private var _hashtag: ImageVector? = null
