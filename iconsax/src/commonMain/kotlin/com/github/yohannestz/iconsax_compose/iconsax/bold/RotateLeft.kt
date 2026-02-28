package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RotateLeft: ImageVector
    get() {
        val current = _rotateLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RotateLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.25f, y = 22.0f)
                horizontalLineToRelative(dx = 4.5f)
                curveTo(x1 = 15.5f, y1 = 22.0f, x2 = 17.0f, y2 = 20.5f, x3 = 17.0f, y3 = 16.75f)
                verticalLineToRelative(dy = -4.5f)
                curveTo(x1 = 17.0f, y1 = 8.5f, x2 = 15.5f, y2 = 7.0f, x3 = 11.75f, y3 = 7.0f)
                horizontalLineToRelative(dx = -4.5f)
                curveTo(x1 = 3.5f, y1 = 7.0f, x2 = 2.0f, y2 = 8.5f, x3 = 2.0f, y3 = 12.25f)
                verticalLineToRelative(dy = 4.5f)
                curveTo(x1 = 2.0f, y1 = 20.5f, x2 = 3.5f, y2 = 22.0f, x3 = 7.25f, y3 = 22.0f)
                moveToRelative(dx = 14.0f, dy = -11.5f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                arcToRelative(a = 6.26f, b = 6.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.83f, dy1 = -6.09f)
                lineToRelative(dx = 0.27f, dy = 0.45f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.26f, dy1 = 1.03f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.03f, dy1 = -0.26f)
                lineTo(x = 13.6f, y = 3.13f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.01f, dy1 = -0.75f)
                arcTo(horizontalEllipseRadius = 0.8f, verticalEllipseRadius = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.25f, y1 = 2.0f)
                arcTo(horizontalEllipseRadius = 7.76f, verticalEllipseRadius = 7.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 9.75f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
        }.build().also { _rotateLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _rotateLeft: ImageVector? = null
