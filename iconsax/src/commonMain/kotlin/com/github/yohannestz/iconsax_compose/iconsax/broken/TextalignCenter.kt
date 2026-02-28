package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextalignCenter: ImageVector
    get() {
        val current = _textalignCenter
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TextalignCenter",
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
                moveTo(x = 7.26f, y = 9.5f)
                horizontalLineToRelative(dx = 9.48f)
                moveTo(x = 3.0f, y = 14.5f)
                horizontalLineToRelative(dx = 18.0f)
                moveToRelative(dx = -13.74f, dy = 5.0f)
                horizontalLineToRelative(dx = 9.48f)
                moveToRelative(dx = -6.69f, dy = -15.0f)
                horizontalLineTo(x = 21.0f)
                moveToRelative(dx = -18.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 2.98f)
            }
        }.build().also { _textalignCenter = it }
    }

@Suppress("ObjectPropertyName")
private var _textalignCenter: ImageVector? = null
