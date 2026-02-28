package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Figma: ImageVector
    get() {
        val current = _figma
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Figma",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.75f, y = 9.42f)
                horizontalLineTo(x = 8.67f)
                arcToRelative(a = 4.08f, b = 4.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -8.16f)
                horizontalLineToRelative(dx = 4.08f)
                close()
                moveTo(x = 8.67f, y = 2.75f)
                arcToRelative(a = 2.59f, b = 2.59f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.16f)
                horizontalLineToRelative(dx = 2.58f)
                verticalLineTo(y = 2.74f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.75f, y = 16.08f)
                horizontalLineTo(x = 8.67f)
                arcToRelative(a = 4.08f, b = 4.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -8.16f)
                horizontalLineToRelative(dx = 4.08f)
                close()
                moveTo(x = 8.67f, y = 9.42f)
                arcToRelative(a = 2.59f, b = 2.59f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.16f)
                horizontalLineToRelative(dx = 2.58f)
                verticalLineTo(y = 9.41f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 8.67f, y = 22.75f)
                arcToRelative(a = 4.08f, b = 4.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -8.16f)
                horizontalLineToRelative(dx = 4.08f)
                verticalLineToRelative(dy = 4.08f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.08f, dy1 = 4.08f)
                moveToRelative(dx = 0.0f, dy = -6.67f)
                arcToRelative(a = 2.59f, b = 2.59f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.16f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.58f, dy1 = -2.58f)
                verticalLineToRelative(dy = -2.58f)
                close()
                moveToRelative(dx = 6.66f, dy = -6.66f)
                horizontalLineToRelative(dx = -4.08f)
                verticalLineTo(y = 1.25f)
                horizontalLineToRelative(dx = 4.08f)
                arcToRelative(a = 4.08f, b = 4.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 8.17f)
                moveToRelative(dx = -2.58f, dy = -1.5f)
                horizontalLineToRelative(dx = 2.58f)
                arcToRelative(a = 2.59f, b = 2.59f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.16f)
                horizontalLineToRelative(dx = -2.58f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 15.33f, y = 16.08f)
                arcToRelative(a = 4.08f, b = 4.08f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -8.17f)
                arcToRelative(a = 4.08f, b = 4.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 8.17f)
                moveToRelative(dx = 0.0f, dy = -6.66f)
                arcToRelative(a = 2.59f, b = 2.59f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.16f)
                arcToRelative(a = 2.58f, b = 2.58f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.16f)
            }
        }.build().also { _figma = it }
    }

@Suppress("ObjectPropertyName")
private var _figma: ImageVector? = null
