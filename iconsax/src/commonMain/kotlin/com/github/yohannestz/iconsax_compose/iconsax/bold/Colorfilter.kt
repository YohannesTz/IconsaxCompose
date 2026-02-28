package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Colorfilter: ImageVector
    get() {
        val current = _colorfilter
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Colorfilter",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.0f, y = 16.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = 4.46f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.0f, y1 = 22.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.0f, dy1 = -6.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.56f, dy1 = -4.9f)
                curveToRelative(dx1 = 0.24f, dy1 = -0.18f, dx2 = 0.58f, dy2 = -0.06f, dx3 = 0.71f, dy3 = 0.21f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.75f, dy1 = 3.92f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.39f, dy1 = 0.14f)
                curveToRelative(dx1 = 0.29f, dy1 = -0.06f, dx2 = 0.57f, dy2 = 0.13f, dx3 = 0.58f, dy3 = 0.42f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.0f, y = 8.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.42f, dy1 = 5.79f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.16f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 8.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 12.0f, dy1 = 0.0f)
                moveToRelative(dx = 4.0f, dy = 8.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -8.12f, dy1 = 5.61f)
                curveToRelative(dx1 = -0.32f, dy1 = -0.12f, dx2 = -0.38f, dy2 = -0.53f, dx3 = -0.16f, dy3 = -0.78f)
                arcTo(horizontalEllipseRadius = 7.4f, verticalEllipseRadius = 7.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.5f, y1 = 16.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.08f, dy1 = -1.0f)
                arcToRelative(a = 0.44f, b = 0.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.23f, dy1 = -0.46f)
                arcToRelative(a = 7.5f, b = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.08f, dy1 = -3.22f)
                curveToRelative(dx1 = 0.13f, dy1 = -0.28f, dx2 = 0.47f, dy2 = -0.4f, dx3 = 0.71f, dy3 = -0.22f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 16.0f)
            }
        }.build().also { _colorfilter = it }
    }

@Suppress("ObjectPropertyName")
private var _colorfilter: ImageVector? = null
