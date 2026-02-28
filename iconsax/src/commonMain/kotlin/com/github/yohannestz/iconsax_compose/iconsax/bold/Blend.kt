package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Blend: ImageVector
    get() {
        val current = _blend
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Blend",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.97f, y = 12.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -8.12f, dy1 = 5.61f)
                curveToRelative(dx1 = -0.32f, dy1 = -0.12f, dx2 = -0.38f, dy2 = -0.52f, dx3 = -0.16f, dy3 = -0.78f)
                arcTo(horizontalEllipseRadius = 7.4f, verticalEllipseRadius = 7.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.47f, y1 = 12.0f)
                arcToRelative(a = 7.4f, b = 7.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.77f, dy1 = -4.82f)
                curveToRelative(dx1 = -0.22f, dy1 = -0.26f, dx2 = -0.16f, dy2 = -0.67f, dx3 = 0.15f, dy3 = -0.8f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.97f, y1 = 12.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.97f, y = 12.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = 4.46f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.0f, dy1 = 1.54f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 6.0f, dy1 = -6.0f)
            }
        }.build().also { _blend = it }
    }

@Suppress("ObjectPropertyName")
private var _blend: ImageVector? = null
