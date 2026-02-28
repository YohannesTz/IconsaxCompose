package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Polygon: ImageVector
    get() {
        val current = _polygon
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Polygon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 12.1f)
                lineToRelative(dx = -4.5f, dy = 2.6f)
                lineTo(x = 3.0f, y = 12.1f)
                verticalLineTo(y = 6.9f)
                lineToRelative(dx = 4.5f, dy = -2.6f)
                lineTo(x = 12.0f, y = 6.9f)
                verticalLineToRelative(dy = 1.57f)
                moveToRelative(dx = 9.0f, dy = 7.51f)
                verticalLineToRelative(dy = 1.31f)
                lineToRelative(dx = -4.5f, dy = 2.6f)
                lineToRelative(dx = -4.5f, dy = -2.6f)
                verticalLineToRelative(dy = -1.65f)
                moveToRelative(dx = 0.0f, dy = -3.54f)
                lineToRelative(dx = 4.5f, dy = -2.6f)
                lineToRelative(dx = 4.5f, dy = 2.6f)
            }
        }.build().also { _polygon = it }
    }

@Suppress("ObjectPropertyName")
private var _polygon: ImageVector? = null
