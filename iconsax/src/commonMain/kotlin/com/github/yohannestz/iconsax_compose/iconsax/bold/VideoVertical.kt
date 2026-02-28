package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoVertical: ImageVector
    get() {
        val current = _videoVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 6.36f, y = 7.78f)
                horizontalLineTo(x = 2.0f)
                verticalLineToRelative(dy = 3.47f)
                horizontalLineToRelative(dx = 4.36f)
                close()
                moveToRelative(dx = 0.0f, dy = -1.5f)
                verticalLineTo(y = 2.14f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.21f, dy1 = 4.15f)
                horizontalLineToRelative(dx = 4.21f)
                moveToRelative(dx = 0.0f, dy = 10.03f)
                verticalLineToRelative(dy = -3.56f)
                horizontalLineTo(x = 2.0f)
                verticalLineToRelative(dy = 3.53f)
                horizontalLineToRelative(dx = 4.24f)
                close()
                moveTo(x = 21.85f, y = 6.28f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.99f, dy1 = -4.1f)
                verticalLineToRelative(dy = 4.1f)
                close()
                moveToRelative(dx = -5.49f, dy = 4.97f)
                verticalLineTo(y = 2.01f)
                lineTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.86f)
                verticalLineToRelative(dy = 9.25f)
                close()
                moveToRelative(dx = 5.64f, dy = 1.5f)
                horizontalLineToRelative(dx = -4.14f)
                verticalLineToRelative(dy = 3.53f)
                horizontalLineTo(x = 22.0f)
                close()
                moveToRelative(dx = -4.14f, dy = 9.07f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.98f, dy1 = -4.04f)
                horizontalLineToRelative(dx = -3.98f)
                close()
                moveTo(x = 6.24f, y = 17.78f)
                horizontalLineTo(x = 2.16f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.2f, dy1 = 4.1f)
                verticalLineToRelative(dy = -4.12f)
                close()
                moveTo(x = 22.0f, y = 7.78f)
                horizontalLineToRelative(dx = -4.14f)
                verticalLineToRelative(dy = 3.47f)
                horizontalLineTo(x = 22.0f)
                close()
                moveTo(x = 7.86f, y = 12.75f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = 8.33f)
                lineToRelative(dx = 0.17f, dy = -0.01f)
                verticalLineToRelative(dy = -9.24f)
                close()
            }
        }.build().also { _videoVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _videoVertical: ImageVector? = null
