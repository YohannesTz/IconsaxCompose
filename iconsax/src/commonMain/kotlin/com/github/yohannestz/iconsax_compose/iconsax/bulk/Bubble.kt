package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bubble: ImageVector
    get() {
        val current = _bubble
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bubble",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.59f, y = 1.75f)
                arcToRelative(a = 5.38f, b = 5.38f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 10.76f)
                arcToRelative(a = 5.38f, b = 5.38f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -10.76f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 6.36f, y = 13.03f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.33f, dy1 = 3.33f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.84f, dx2 = -1.5f, dy2 = -3.33f, dx3 = -3.33f, dy3 = -3.33f)
                moveToRelative(dx = 10.26f, dy = 3.6f)
                arcToRelative(a = 2.81f, b = 2.81f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.62f)
                arcToRelative(a = 2.81f, b = 2.81f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.63f)
            }
        }.build().also { _bubble = it }
    }

@Suppress("ObjectPropertyName")
private var _bubble: ImageVector? = null
