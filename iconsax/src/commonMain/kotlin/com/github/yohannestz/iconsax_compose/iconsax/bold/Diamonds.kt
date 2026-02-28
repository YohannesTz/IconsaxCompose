package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Diamonds: ImageVector
    get() {
        val current = _diamonds
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Diamonds",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.77f, y = 9.8f)
                lineTo(x = 20.97f, y = 8.0f)
                lineToRelative(dx = -1.76f, dy = -3.96f)
                curveTo(x1 = 18.74f, y1 = 3.0f, x2 = 18.0f, y2 = 2.14f, x3 = 16.3f, y3 = 2.14f)
                horizontalLineTo(x = 7.7f)
                curveTo(x1 = 6.0f, y1 = 2.15f, x2 = 5.26f, y2 = 3.0f, x3 = 4.79f, y3 = 4.05f)
                lineTo(x = 3.03f, y = 8.0f)
                lineToRelative(dx = -0.8f, dy = 1.8f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.56f, dy1 = 3.44f)
                lineToRelative(dx = 6.85f, dy = 7.54f)
                arcToRelative(a = 3.13f, b = 3.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.72f, dy1 = 0.0f)
                lineToRelative(dx = 6.85f, dy = -7.54f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.56f, dy1 = -3.44f)
            }
        }.build().also { _diamonds = it }
    }

@Suppress("ObjectPropertyName")
private var _diamonds: ImageVector? = null
