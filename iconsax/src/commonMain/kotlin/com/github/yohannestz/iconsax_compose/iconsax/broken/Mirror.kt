package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Mirror: ImageVector
    get() {
        val current = _mirror
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Mirror",
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
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -4.59f, dy1 = 1.45f)
                moveTo(x = 16.0f, y = 22.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveTo(x = 6.0f, y = 22.0f)
                horizontalLineToRelative(dx = 7.0f)
            }
        }.build().also { _mirror = it }
    }

@Suppress("ObjectPropertyName")
private var _mirror: ImageVector? = null
