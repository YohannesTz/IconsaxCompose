package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thorchain: ImageVector
    get() {
        val current = _thorchain
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Thorchain",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.7f, y = 11.7f)
                lineToRelative(dx = 4.1f, dy = 4.1f)
                curveToRelative(dx1 = 0.5f, dy1 = 0.6f, dx2 = 0.3f, dy2 = 1.5f, dx3 = -0.4f, dy3 = 1.8f)
                lineTo(x = 6.1f, y = 21.9f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.5f, dx2 = -2.0f, dy2 = -0.9f, dx3 = -1.2f, dy3 = -1.7f)
                close()
                moveToRelative(dx = 0.0f, dy = 0.0f)
                lineTo(x = 8.6f, y = 7.6f)
                curveTo(x1 = 8.1f, y1 = 7.1f, x2 = 8.3f, y2 = 6.1f, x3 = 9.0f, y3 = 5.8f)
                lineToRelative(dx = 8.9f, dy = -3.7f)
                curveToRelative(dx1 = 1.1f, dy1 = -0.4f, dx2 = 2.0f, dy2 = 0.8f, dx3 = 1.3f, dy3 = 1.7f)
                close()
            }
        }.build().also { _thorchain = it }
    }

@Suppress("ObjectPropertyName")
private var _thorchain: ImageVector? = null
