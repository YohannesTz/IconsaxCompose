package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pet: ImageVector
    get() {
        val current = _pet
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Pet",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.08f, y = 15.72f)
                arcToRelative(a = 7.94f, b = 7.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.56f, dy1 = -6.4f)
                arcToRelative(a = 7.8f, b = 7.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.64f, dy1 = 7.03f)
                arcTo(horizontalEllipseRadius = 5.15f, verticalEllipseRadius = 5.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.08f, y1 = 22.0f)
                horizontalLineToRelative(dx = 4.68f)
                arcToRelative(a = 5.4f, b = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.18f, dy1 = -1.85f)
                arcToRelative(a = 5.4f, b = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.14f, dy1 = -4.43f)
                moveToRelative(dx = -8.8f, dy = -7.86f)
                arcToRelative(a = 2.93f, b = 2.93f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.86f)
                arcToRelative(a = 2.93f, b = 2.93f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.86f)
                moveToRelative(dx = 6.66f, dy = 1.17f)
                arcToRelative(a = 2.44f, b = 2.44f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.88f)
                arcToRelative(a = 2.44f, b = 2.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.88f)
                moveToRelative(dx = 3.61f, dy = 3.9f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.9f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.9f)
                moveTo(x = 3.94f, y = 10.98f)
                arcToRelative(a = 2.44f, b = 2.44f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.88f)
                arcToRelative(a = 2.44f, b = 2.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.88f)
            }
        }.build().also { _pet = it }
    }

@Suppress("ObjectPropertyName")
private var _pet: ImageVector? = null
