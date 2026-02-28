package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoHorizontal: ImageVector
    get() {
        val current = _videoHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.25f, y = 7.86f)
                horizontalLineTo(x = 2.0f)
                verticalLineToRelative(dy = 8.33f)
                lineToRelative(dx = 0.01f, dy = 0.17f)
                horizontalLineToRelative(dx = 9.24f)
                close()
                moveToRelative(dx = -3.56f, dy = -1.5f)
                horizontalLineToRelative(dx = 3.56f)
                verticalLineTo(y = 2.0f)
                horizontalLineTo(x = 7.72f)
                verticalLineToRelative(dy = 4.24f)
                close()
                moveTo(x = 6.22f, y = 6.24f)
                verticalLineTo(y = 2.16f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.1f, dy1 = 4.2f)
                horizontalLineToRelative(dx = 4.12f)
                close()
                moveToRelative(dx = 10.0f, dy = -4.24f)
                horizontalLineToRelative(dx = -3.47f)
                verticalLineToRelative(dy = 4.36f)
                horizontalLineToRelative(dx = 3.47f)
                close()
                moveToRelative(dx = 1.49f, dy = 4.36f)
                horizontalLineToRelative(dx = 4.16f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.15f, dy1 = -4.21f)
                verticalLineToRelative(dy = 4.18f)
                close()
                moveToRelative(dx = 0.0f, dy = 15.49f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.1f, dy1 = -3.99f)
                horizontalLineToRelative(dx = -4.1f)
                close()
                moveToRelative(dx = -1.49f, dy = -3.99f)
                horizontalLineToRelative(dx = -3.47f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = 3.47f)
                close()
                moveToRelative(dx = -3.47f, dy = -1.5f)
                horizontalLineToRelative(dx = 9.24f)
                lineTo(x = 22.0f, y = 16.19f)
                verticalLineTo(y = 7.86f)
                horizontalLineToRelative(dx = -9.25f)
                close()
                moveToRelative(dx = -1.5f, dy = 1.5f)
                horizontalLineTo(x = 7.72f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = 3.53f)
                close()
                moveToRelative(dx = -9.07f, dy = 0.0f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.04f, dy1 = 3.98f)
                verticalLineToRelative(dy = -3.98f)
                close()
            }
        }.build().also { _videoHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _videoHorizontal: ImageVector? = null
