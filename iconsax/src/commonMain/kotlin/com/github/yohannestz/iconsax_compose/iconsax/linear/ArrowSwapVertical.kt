package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowSwapVertical: ImageVector
    get() {
        val current = _arrowSwapVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowSwapVertical",
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
                moveTo(x = 9.01f, y = 20.5f)
                lineToRelative(dx = -5.02f, dy = -5.01f)
                moveTo(x = 9.01f, y = 3.5f)
                verticalLineToRelative(dy = 17.0f)
                moveToRelative(dx = 5.98f, dy = -17.0f)
                lineToRelative(dx = 5.02f, dy = 5.01f)
                moveTo(x = 14.99f, y = 20.5f)
                verticalLineToRelative(dy = -17.0f)
            }
        }.build().also { _arrowSwapVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowSwapVertical: ImageVector? = null
