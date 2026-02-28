package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageEdit: ImageVector
    get() {
        val current = _messageEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageEdit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 2.0f)
                horizontalLineTo(x = 8.0f)
                quadTo(x1 = 2.0f, y1 = 2.0f, x2 = 2.0f, y2 = 8.0f)
                verticalLineToRelative(dy = 13.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 13.0f)
                quadToRelative(dx1 = 6.0f, dy1 = 0.0f, dx2 = 6.0f, dy2 = -6.0f)
                verticalLineTo(y = 8.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -6.0f, dx2 = -6.0f, dy2 = -6.0f)
                moveToRelative(dx = -4.89f, dy = 14.66f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.05f, dy1 = 0.53f)
                lineToRelative(dx = -2.08f, dy = 0.29f)
                lineToRelative(dx = -0.23f, dy = 0.02f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = -0.35f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.33f, dy1 = -1.13f)
                lineToRelative(dx = 0.29f, dy = -2.08f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.53f, dy1 = -1.05f)
                lineToRelative(dx = 3.77f, dy = -3.77f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.51f, dy1 = 1.09f)
                lineToRelative(dx = 0.25f, dy = 0.38f)
                lineToRelative(dx = 0.27f, dy = 0.35f)
                lineToRelative(dx = 0.09f, dy = 0.12f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.67f, dy1 = 0.67f)
                lineToRelative(dx = 0.11f, dy = 0.1f)
                quadToRelative(dx1 = 0.2f, dy1 = 0.16f, dx2 = 0.37f, dy2 = 0.28f)
                lineToRelative(dx = 0.41f, dy = 0.27f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.09f, dy1 = 0.51f)
                close()
                moveToRelative(dx = 5.44f, dy = -5.43f)
                lineToRelative(dx = -0.78f, dy = 0.78f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.19f, dy1 = 0.08f)
                lineToRelative(dx = -0.08f, dy = -0.01f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.58f, dy1 = -3.58f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.07f, dy1 = -0.26f)
                lineToRelative(dx = 0.79f, dy = -0.79f)
                curveToRelative(dx1 = 1.29f, dy1 = -1.29f, dx2 = 2.51f, dy2 = -1.26f, dx3 = 3.77f, dy3 = 0.0f)
                quadToRelative(dx1 = 0.96f, dy1 = 0.95f, dx2 = 0.95f, dy2 = 1.9f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.93f, dx2 = -0.95f, dy2 = 1.88f)
            }
        }.build().also { _messageEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _messageEdit: ImageVector? = null
