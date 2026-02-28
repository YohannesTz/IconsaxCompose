package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Timer: ImageVector
    get() {
        val current = _timer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Timer",
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
                moveTo(x = 15.24f, y = 2.0f)
                horizontalLineTo(x = 8.76f)
                curveTo(x1 = 5.0f, y1 = 2.0f, x2 = 4.71f, y2 = 5.38f, x3 = 6.74f, y3 = 7.22f)
                lineToRelative(dx = 10.52f, dy = 9.56f)
                curveTo(x1 = 19.29f, y1 = 18.62f, x2 = 19.0f, y2 = 22.0f, x3 = 15.24f, y3 = 22.0f)
                horizontalLineTo(x = 8.76f)
                curveTo(x1 = 5.0f, y1 = 22.0f, x2 = 4.71f, y2 = 18.62f, x3 = 6.74f, y3 = 16.78f)
                lineToRelative(dx = 10.52f, dy = -9.56f)
                curveTo(x1 = 19.29f, y1 = 5.38f, x2 = 19.0f, y2 = 2.0f, x3 = 15.24f, y3 = 2.0f)
            }
        }.build().also { _timer = it }
    }

@Suppress("ObjectPropertyName")
private var _timer: ImageVector? = null
