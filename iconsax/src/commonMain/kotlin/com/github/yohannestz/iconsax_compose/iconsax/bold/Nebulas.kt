package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Nebulas: ImageVector
    get() {
        val current = _nebulas
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Nebulas",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = 1.5f, dy = 12.75f)
                lineToRelative(dx = -0.31f, dy = -0.1f)
                lineToRelative(dx = -0.19f, dy = 0.6f)
                lineToRelative(dx = -1.0f, dy = 3.0f)
                lineToRelative(dx = -2.5f, dy = -4.68f)
                lineToRelative(dx = -0.1f, dy = -0.19f)
                lineTo(x = 6.0f, y = 12.25f)
                lineToRelative(dx = 2.18f, dy = -1.09f)
                lineTo(x = 10.0f, y = 10.25f)
                lineToRelative(dx = 0.47f, dy = -0.21f)
                lineTo(x = 12.0f, y = 5.25f)
                lineToRelative(dx = 1.55f, dy = 3.4f)
                lineToRelative(dx = 0.95f, dy = 2.1f)
                lineToRelative(dx = -0.41f, dy = 0.21f)
                lineTo(x = 18.0f, y = 12.25f)
                close()
            }
        }.build().also { _nebulas = it }
    }

@Suppress("ObjectPropertyName")
private var _nebulas: ImageVector? = null
