package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlashSlash: ImageVector
    get() {
        val current = _flashSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FlashSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.99f, y = 22.75f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.48f, dy1 = -0.09f)
                curveToRelative(dx1 = -0.4f, dy1 = -0.15f, dx2 = -1.08f, dy2 = -0.64f, dx3 = -1.08f, dy3 = -2.19f)
                verticalLineToRelative(dy = -2.44f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.44f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.5f, dx2 = 0.09f, dy2 = 0.72f, dx3 = 0.13f, dy3 = 0.78f)
                curveToRelative(dx1 = 0.03f, dy1 = -0.04f, dx2 = 0.24f, dy2 = -0.14f, dx3 = 0.57f, dy3 = -0.52f)
                lineToRelative(dx = 7.57f, dy = -8.6f)
                curveToRelative(dx1 = 0.28f, dy1 = -0.32f, dx2 = 0.32f, dy2 = -0.52f, dx3 = 0.32f, dy3 = -0.56f)
                curveToRelative(dx1 = -0.02f, dy1 = -0.01f, dx2 = -0.2f, dy2 = -0.11f, dx3 = -0.62f, dy3 = -0.11f)
                horizontalLineToRelative(dx = -0.93f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 0.93f)
                curveToRelative(dx1 = 1.34f, dy1 = 0.0f, dx2 = 1.82f, dy2 = 0.63f, dx3 = 1.99f, dy3 = 1.0f)
                curveToRelative(dx1 = 0.17f, dy1 = 0.38f, dx2 = 0.32f, dy2 = 1.15f, dx3 = -0.56f, dy3 = 2.16f)
                lineToRelative(dx = -7.57f, dy = 8.6f)
                curveToRelative(dx1 = -0.71f, dy1 = 0.82f, dx2 = -1.33f, dy2 = 1.03f, dx3 = -1.77f, dy3 = 1.03f)
                moveToRelative(dx = -0.81f, dy = -7.53f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -0.43f)
                horizontalLineTo(x = 6.09f)
                curveToRelative(dx1 = -1.34f, dy1 = 0.0f, dx2 = -1.82f, dy2 = -0.63f, dx3 = -1.99f, dy3 = -1.0f)
                curveToRelative(dx1 = -0.17f, dy1 = -0.38f, dx2 = -0.32f, dy2 = -1.15f, dx3 = 0.56f, dy3 = -2.16f)
                lineToRelative(dx = 7.57f, dy = -8.6f)
                curveToRelative(dx1 = 1.02f, dy1 = -1.16f, dx2 = 1.85f, dy2 = -1.08f, dx3 = 2.25f, dy3 = -0.93f)
                reflectiveCurveToRelative(dx1 = 1.08f, dy1 = 0.64f, dx2 = 1.08f, dy2 = 2.19f)
                verticalLineToRelative(dy = 5.31f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineTo(y = 3.52f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.5f, dx2 = -0.09f, dy2 = -0.72f, dx3 = -0.13f, dy3 = -0.78f)
                curveToRelative(dx1 = -0.03f, dy1 = 0.04f, dx2 = -0.24f, dy2 = 0.14f, dx3 = -0.57f, dy3 = 0.52f)
                lineToRelative(dx = -7.57f, dy = 8.6f)
                curveToRelative(dx1 = -0.28f, dy1 = 0.32f, dx2 = -0.32f, dy2 = 0.52f, dx3 = -0.32f, dy3 = 0.56f)
                curveToRelative(dx1 = 0.02f, dy1 = 0.01f, dx2 = 0.2f, dy2 = 0.11f, dx3 = 0.62f, dy3 = 0.11f)
                horizontalLineToRelative(dx = 3.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 1.18f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.76f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 2.0f, y = 22.75f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 20.0f, dy = -20.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -20.0f, dy = 20.0f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 22.75f)
            }
        }.build().also { _flashSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _flashSlash: ImageVector? = null
