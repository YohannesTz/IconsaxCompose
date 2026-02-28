package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 16.38f, y = 17.57f)
                lineToRelative(dx = -10.3f, dy = 4.34f)
                curveToRelative(dx1 = -1.07f, dy1 = 0.45f, dx2 = -2.0f, dy2 = -0.88f, dx3 = -1.21f, dy3 = -1.73f)
                lineToRelative(dx = 7.81f, dy = -8.48f)
                lineToRelative(dx = 4.05f, dy = 4.12f)
                arcToRelative(a = 1.07f, b = 1.07f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.35f, dy1 = 1.75f)
                moveToRelative(dx = 2.8f, dy = -13.8f)
                lineToRelative(dx = -6.5f, dy = 7.93f)
                lineToRelative(dx = -4.05f, dy = -4.1f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.35f, dy1 = -1.76f)
                lineToRelative(dx = 8.94f, dy = -3.75f)
                curveToRelative(dx1 = 1.04f, dy1 = -0.44f, dx2 = 1.97f, dy2 = 0.81f, dx3 = 1.25f, dy3 = 1.68f)
            }
        }.build().also { _thorchain = it }
    }

@Suppress("ObjectPropertyName")
private var _thorchain: ImageVector? = null
