package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RotateRight: ImageVector
    get() {
        val current = _rotateRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RotateRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.75f, y = 22.0f)
                horizontalLineToRelative(dx = -4.5f)
                curveTo(x1 = 8.5f, y1 = 22.0f, x2 = 7.0f, y2 = 20.5f, x3 = 7.0f, y3 = 16.75f)
                verticalLineToRelative(dy = -4.5f)
                curveTo(x1 = 7.0f, y1 = 8.5f, x2 = 8.5f, y2 = 7.0f, x3 = 12.25f, y3 = 7.0f)
                horizontalLineToRelative(dx = 4.5f)
                curveTo(x1 = 20.5f, y1 = 7.0f, x2 = 22.0f, y2 = 8.5f, x3 = 22.0f, y3 = 12.25f)
                verticalLineToRelative(dy = 4.5f)
                curveTo(x1 = 22.0f, y1 = 20.5f, x2 = 20.5f, y2 = 22.0f, x3 = 16.75f, y3 = 22.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 2.75f, y = 10.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.5f, y1 = 9.75f)
                arcToRelative(a = 6.26f, b = 6.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.83f, dy1 = -6.09f)
                lineTo(x = 8.06f, y = 4.11f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.26f, dy1 = 1.03f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.03f, dy1 = -0.26f)
                lineToRelative(dx = 1.05f, dy = -1.75f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.01f, dy1 = -0.75f)
                arcTo(horizontalEllipseRadius = 0.8f, verticalEllipseRadius = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.75f, y1 = 2.0f)
                arcTo(horizontalEllipseRadius = 7.76f, verticalEllipseRadius = 7.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 9.75f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = 0.75f)
            }
        }.build().also { _rotateRight = it }
    }

@Suppress("ObjectPropertyName")
private var _rotateRight: ImageVector? = null
