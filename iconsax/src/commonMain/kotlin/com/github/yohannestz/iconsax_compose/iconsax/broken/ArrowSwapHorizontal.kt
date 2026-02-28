package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowSwapHorizontal: ImageVector
    get() {
        val current = _arrowSwapHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowSwapHorizontal",
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
                moveTo(x = 3.5f, y = 9.01f)
                lineToRelative(dx = 5.01f, dy = -5.02f)
                moveToRelative(dx = 4.5f, dy = 5.02f)
                horizontalLineTo(x = 3.5f)
                moveToRelative(dx = 17.0f, dy = 0.0f)
                horizontalLineTo(x = 17.0f)
                moveToRelative(dx = 3.5f, dy = 5.98f)
                lineToRelative(dx = -5.01f, dy = 5.02f)
                moveToRelative(dx = -4.5f, dy = -5.02f)
                horizontalLineToRelative(dx = 9.51f)
                moveToRelative(dx = -17.0f, dy = 0.0f)
                horizontalLineTo(x = 7.0f)
            }
        }.build().also { _arrowSwapHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowSwapHorizontal: ImageVector? = null
