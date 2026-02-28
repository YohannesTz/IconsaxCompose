package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 12.0f, y = 2.0f)
                horizontalLineTo(x = 8.67f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.66f)
                horizontalLineTo(x = 12.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 6.67f)
                horizontalLineTo(x = 8.67f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.66f)
                horizontalLineTo(x = 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 15.33f)
                horizontalLineTo(x = 8.67f)
                arcTo(horizontalEllipseRadius = 3.33f, verticalEllipseRadius = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 12.0f, y1 = 18.66f)
                close()
                moveTo(x = 12.0f, y = 2.0f)
                horizontalLineToRelative(dx = 3.33f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.66f)
                horizontalLineTo(x = 12.0f)
                close()
                moveToRelative(dx = 3.33f, dy = 6.67f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.66f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.66f)
            }
        }.build().also { _figma = it }
    }

@Suppress("ObjectPropertyName")
private var _figma: ImageVector? = null
