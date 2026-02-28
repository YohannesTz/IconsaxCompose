package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Litecoin: ImageVector
    get() {
        val current = _litecoin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Litecoin",
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
                moveToRelative(dx = 3.82f, dy = 14.32f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.98f, dy1 = 0.82f)
                horizontalLineTo(x = 9.3f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.96f, dy1 = -1.27f)
                lineToRelative(dx = 0.84f, dy = -2.95f)
                lineToRelative(dx = -1.71f, dy = 0.34f)
                lineToRelative(dx = -0.15f, dy = 0.01f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.14f, dy1 = -1.48f)
                lineToRelative(dx = 2.47f, dy = -0.49f)
                lineToRelative(dx = 1.31f, dy = -4.57f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.48f, dy1 = -0.36f)
                horizontalLineToRelative(dx = 1.36f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.97f, dy1 = 1.26f)
                lineToRelative(dx = -0.81f, dy = 3.01f)
                lineToRelative(dx = 1.93f, dy = -0.39f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.29f, dy1 = 1.47f)
                lineToRelative(dx = -2.66f, dy = 0.53f)
                lineToRelative(dx = -0.55f, dy = 2.05f)
                horizontalLineTo(x = 15.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.98f, dy1 = 1.18f)
                close()
            }
        }.build().also { _litecoin = it }
    }

@Suppress("ObjectPropertyName")
private var _litecoin: ImageVector? = null
