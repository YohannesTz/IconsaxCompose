package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.59f, y = 12.26f)
                arcToRelative(a = 5.13f, b = 5.13f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -10.26f)
                arcToRelative(a = 5.13f, b = 5.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 10.26f)
                close()
                moveToRelative(dx = -9.23f, dy = 7.18f)
                arcToRelative(a = 3.08f, b = 3.08f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.16f)
                arcToRelative(a = 3.08f, b = 3.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.16f)
                close()
                moveTo(x = 16.62f, y = 22.0f)
                arcToRelative(a = 2.56f, b = 2.56f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.12f)
                arcToRelative(a = 2.56f, b = 2.56f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.12f)
                close()
            }
        }.build().also { _bubble = it }
    }

@Suppress("ObjectPropertyName")
private var _bubble: ImageVector? = null
