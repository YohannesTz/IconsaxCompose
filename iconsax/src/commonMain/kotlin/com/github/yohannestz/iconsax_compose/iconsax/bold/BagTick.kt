package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BagTick: ImageVector
    get() {
        val current = _bagTick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BagTick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.24f, y = 5.58f)
                horizontalLineToRelative(dx = -0.4f)
                lineTo(x = 15.46f, y = 2.2f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = 0.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.99f)
                lineToRelative(dx = 2.39f, dy = 2.39f)
                horizontalLineTo(x = 7.14f)
                lineToRelative(dx = 2.39f, dy = -2.4f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -0.98f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = 0.0f)
                lineTo(x = 5.17f, y = 5.58f)
                horizontalLineToRelative(dx = -0.4f)
                curveToRelative(dx1 = -0.9f, dy1 = 0.0f, dx2 = -2.77f, dy2 = 0.0f, dx3 = -2.77f, dy3 = 2.56f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.97f, dx2 = 0.2f, dy2 = 1.6f, dx3 = 0.62f, dy3 = 2.03f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.84f, dy1 = 0.45f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.9f, dy1 = 0.08f)
                horizontalLineToRelative(dx = 15.28f)
                quadToRelative(dx1 = 0.46f, dy1 = 0.0f, dx2 = 0.88f, dy2 = -0.08f)
                curveToRelative(dx1 = 0.84f, dy1 = -0.2f, dx2 = 1.48f, dy2 = -0.8f, dx3 = 1.48f, dy3 = -2.48f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.56f, dx2 = -1.87f, dy2 = -2.56f, dx3 = -2.76f, dy3 = -2.56f)
                moveTo(x = 19.09f, y = 12.0f)
                horizontalLineTo(x = 4.91f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = 1.16f)
                lineToRelative(dx = 0.84f, dy = 5.14f)
                curveTo(x1 = 5.04f, y1 = 20.02f, x2 = 5.79f, y2 = 22.0f, x3 = 9.12f, y3 = 22.0f)
                horizontalLineToRelative(dx = 5.61f)
                curveToRelative(dx1 = 3.37f, dy1 = 0.0f, dx2 = 3.97f, dy2 = -1.69f, dx3 = 4.33f, dy3 = -3.58f)
                lineToRelative(dx = 1.01f, dy = -5.23f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 19.09f, y1 = 12.0f)
                moveToRelative(dx = -4.21f, dy = 4.05f)
                lineToRelative(dx = -3.25f, dy = 3.0f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.04f, dy1 = -0.02f)
                lineToRelative(dx = -1.5f, dy = -1.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.07f, dy1 = 0.0f)
                lineToRelative(dx = 0.99f, dy = 0.99f)
                lineToRelative(dx = 2.72f, dy = -2.51f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.01f, dy1 = 1.1f)
            }
        }.build().also { _bagTick = it }
    }

@Suppress("ObjectPropertyName")
private var _bagTick: ImageVector? = null
