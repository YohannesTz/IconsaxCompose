package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Watch: ImageVector
    get() {
        val current = _watch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Watch",
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
                moveTo(x = 8.5f, y = 19.0f)
                horizontalLineToRelative(dx = 7.0f)
                quadToRelative(dx1 = 3.5f, dy1 = 0.0f, dx2 = 3.5f, dy2 = -3.5f)
                verticalLineToRelative(dy = -7.0f)
                quadTo(x1 = 19.0f, y1 = 5.0f, x2 = 15.5f, y2 = 5.0f)
                horizontalLineToRelative(dx = -7.0f)
                quadTo(x1 = 5.0f, y1 = 5.0f, x2 = 5.0f, y2 = 8.5f)
                verticalLineToRelative(dy = 7.0f)
                quadTo(x1 = 5.0f, y1 = 19.0f, x2 = 8.5f, y2 = 19.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.0f, y = 2.0f)
                horizontalLineTo(x = 8.0f)
                moveToRelative(dx = 8.0f, dy = 20.0f)
                horizontalLineTo(x = 8.0f)
                moveToRelative(dx = 3.5f, dy = -12.5f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineToRelative(dx = 3.0f)
            }
        }.build().also { _watch = it }
    }

@Suppress("ObjectPropertyName")
private var _watch: ImageVector? = null
