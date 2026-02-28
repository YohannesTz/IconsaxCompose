package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ForwardItem: ImageVector
    get() {
        val current = _forwardItem
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ForwardItem",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.25f, y = 5.77f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.12f, dx2 = -0.7f, dy2 = 2.9f, dx3 = -2.62f, dy3 = 3.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = -0.48f)
                verticalLineToRelative(dy = -1.14f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.12f, dx2 = -1.39f, dy2 = -4.51f, dx3 = -4.5f, dy3 = -4.51f)
                horizontalLineToRelative(dx = -1.15f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 5.37f)
                curveTo(x1 = 12.1f, y1 = 3.46f, x2 = 12.9f, y2 = 2.75f, x3 = 15.0f, y3 = 2.75f)
                horizontalLineToRelative(dx = 3.23f)
                curveToRelative(dx1 = 2.3f, dy1 = 0.0f, dx2 = 3.02f, dy2 = 0.73f, dx3 = 3.02f, dy3 = 3.02f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.63f, y = 10.38f)
                verticalLineToRelative(dy = 3.24f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.28f, dx2 = -0.73f, dy2 = 3.01f, dx3 = -3.01f, dy3 = 3.01f)
                horizontalLineToRelative(dx = -3.24f)
                curveToRelative(dx1 = -2.28f, dy1 = 0.0f, dx2 = -3.01f, dy2 = -0.73f, dx3 = -3.01f, dy3 = -3.0f)
                verticalLineToRelative(dy = -3.25f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.28f, dx2 = 0.73f, dy2 = -3.0f, dx3 = 3.01f, dy3 = -3.0f)
                horizontalLineToRelative(dx = 3.24f)
                curveToRelative(dx1 = 2.28f, dy1 = 0.0f, dx2 = 3.01f, dy2 = 0.72f, dx3 = 3.01f, dy3 = 3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.52f, y = 18.13f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.49f, dy1 = 0.5f)
                curveToRelative(dx1 = -0.11f, dy1 = 1.91f, dx2 = -0.9f, dy2 = 2.62f, dx3 = -3.01f, dy3 = 2.62f)
                horizontalLineTo(x = 5.77f)
                curveToRelative(dx1 = -2.29f, dy1 = 0.0f, dx2 = -3.02f, dy2 = -0.73f, dx3 = -3.02f, dy3 = -3.02f)
                verticalLineTo(y = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.12f, dx2 = 0.7f, dy2 = -2.9f, dx3 = 2.62f, dy3 = -3.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = 0.48f)
                verticalLineToRelative(dy = 1.14f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.12f, dx2 = 1.39f, dy2 = 4.5f, dx3 = 4.51f, dy3 = 4.5f)
                close()
            }
        }.build().also { _forwardItem = it }
    }

@Suppress("ObjectPropertyName")
private var _forwardItem: ImageVector? = null
