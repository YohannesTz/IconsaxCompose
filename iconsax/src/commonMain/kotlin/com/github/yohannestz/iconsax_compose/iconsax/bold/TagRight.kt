package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TagRight: ImageVector
    get() {
        val current = _tagRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TagRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.88f, y = 6.12f)
                lineTo(x = 3.92f, y = 20.08f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = -0.1f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.08f, dy1 = -2.48f)
                lineToRelative(dx = 2.76f, dy = -4.43f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.14f)
                lineTo(x = 2.34f, y = 6.5f)
                arcToRelative(a = 2.22f, b = 2.22f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.88f, dy1 = -3.4f)
                horizontalLineToRelative(dx = 11.45f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.88f, dy1 = 1.04f)
                lineToRelative(dx = 0.47f, dy = 0.74f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.14f, dy1 = 1.24f)
                moveToRelative(dx = 3.75f, dy = 7.0f)
                lineToRelative(dx = -5.18f, dy = 6.9f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.78f, dy1 = 0.88f)
                horizontalLineTo(x = 7.51f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = -1.7f)
                lineTo(x = 18.32f, y = 7.67f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.56f, dy1 = 0.18f)
                lineToRelative(dx = 1.85f, dy = 2.97f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.1f, dy1 = 2.28f)
            }
        }.build().also { _tagRight = it }
    }

@Suppress("ObjectPropertyName")
private var _tagRight: ImageVector? = null
