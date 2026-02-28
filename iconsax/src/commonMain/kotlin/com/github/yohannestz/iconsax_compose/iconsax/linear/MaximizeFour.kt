package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaximizeFour: ImageVector
    get() {
        val current = _maximizeFour
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MaximizeFour",
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
                moveTo(x = 21.0f, y = 9.0f)
                verticalLineTo(y = 3.0f)
                horizontalLineToRelative(dx = -6.0f)
                moveTo(x = 3.0f, y = 15.0f)
                verticalLineToRelative(dy = 6.0f)
                horizontalLineToRelative(dx = 6.0f)
                moveTo(x = 21.0f, y = 3.0f)
                lineToRelative(dx = -7.5f, dy = 7.5f)
                moveToRelative(dx = -3.0f, dy = 3.0f)
                lineTo(x = 3.0f, y = 21.0f)
            }
        }.build().also { _maximizeFour = it }
    }

@Suppress("ObjectPropertyName")
private var _maximizeFour: ImageVector? = null
