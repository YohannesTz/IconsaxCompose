package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Drop: ImageVector
    get() {
        val current = _drop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Drop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.61f, y = 2.21f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.22f, dy1 = 0.0f)
                curveTo(x1 = 9.49f, y1 = 3.66f, x2 = 3.88f, y2 = 8.39f, x3 = 3.91f, y3 = 13.9f)
                arcToRelative(a = 8.11f, b = 8.11f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 16.2f, dy1 = 0.01f)
                curveToRelative(dx1 = 0.01f, dy1 = -5.43f, dx2 = -5.61f, dy2 = -10.24f, dx3 = -7.5f, dy3 = -11.7f)
                close()
            }
        }.build().also { _drop = it }
    }

@Suppress("ObjectPropertyName")
private var _drop: ImageVector? = null
