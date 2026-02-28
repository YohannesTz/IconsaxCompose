package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Drop: ImageVector
    get() {
        val current = _drop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Drop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 8.86f, b = 8.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -8.85f, dy1 = -8.85f)
                curveTo(x1 = 3.12f, y1 = 8.17f, x2 = 8.58f, y2 = 3.4f, x3 = 10.93f, y3 = 1.61f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.14f, dy1 = 0.0f)
                curveToRelative(dx1 = 2.35f, dy1 = 1.82f, dx2 = 7.8f, dy2 = 6.65f, dx3 = 7.78f, dy3 = 12.3f)
                arcTo(horizontalEllipseRadius = 8.86f, verticalEllipseRadius = 8.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.16f, dy1 = 0.06f)
                curveToRelative(dx1 = -1.7f, dy1 = 1.29f, dx2 = -7.21f, dy2 = 5.9f, dx3 = -7.18f, dy3 = 11.09f)
                arcToRelative(a = 7.36f, b = 7.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 14.7f, dy1 = 0.01f)
                curveToRelative(dx1 = 0.03f, dy1 = -5.12f, dx2 = -5.5f, dy2 = -9.79f, dx3 = -7.2f, dy3 = -11.1f)
                arcTo(horizontalEllipseRadius = 0.3f, verticalEllipseRadius = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.75f)
            }
        }.build().also { _drop = it }
    }

@Suppress("ObjectPropertyName")
private var _drop: ImageVector? = null
