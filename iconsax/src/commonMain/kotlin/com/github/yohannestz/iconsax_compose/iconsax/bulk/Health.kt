package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Health: ImageVector
    get() {
        val current = _health
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Health",
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
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineTo(y = 14.0f)
                horizontalLineToRelative(dx = -4.08f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.77f, dy1 = -1.07f)
                lineToRelative(dx = -1.04f, dy = -1.97f)
                curveToRelative(dx1 = -0.28f, dy1 = -0.53f, dx2 = -0.68f, dy2 = -0.5f, dx3 = -0.9f, dy3 = 0.05f)
                lineToRelative(dx = -2.3f, dy = 5.81f)
                curveToRelative(dx1 = -0.25f, dy1 = 0.65f, dx2 = -0.67f, dy2 = 0.65f, dx3 = -0.93f, dy3 = 0.0f)
                lineToRelative(dx = -1.14f, dy = -2.88f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.86f, dy1 = -1.27f)
                lineTo(x = 2.0f, y = 12.7f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 2.0f, y1 = 4.17f, x2 = 4.17f, y2 = 2.0f, x3 = 7.81f, y3 = 2.0f)
                horizontalLineToRelative(dx = 8.38f)
                curveTo(x1 = 19.83f, y1 = 2.0f, x2 = 22.0f, y2 = 4.17f, x3 = 22.0f, y3 = 7.81f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 16.19f)
                verticalLineToRelative(dy = -2.2f)
                horizontalLineToRelative(dx = -4.08f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.77f, dy1 = -1.06f)
                lineToRelative(dx = -1.04f, dy = -1.97f)
                curveToRelative(dx1 = -0.28f, dy1 = -0.53f, dx2 = -0.68f, dy2 = -0.5f, dx3 = -0.9f, dy3 = 0.05f)
                lineToRelative(dx = -2.3f, dy = 5.8f)
                curveToRelative(dx1 = -0.25f, dy1 = 0.66f, dx2 = -0.67f, dy2 = 0.66f, dx3 = -0.93f, dy3 = 0.0f)
                lineToRelative(dx = -1.14f, dy = -2.87f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.86f, dy1 = -1.27f)
                lineTo(x = 2.0f, y = 12.7f)
                verticalLineToRelative(dy = 3.49f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.58f, dx2 = 2.1f, dy2 = 5.74f, dx3 = 5.63f, dy3 = 5.8f)
                horizontalLineToRelative(dx = 8.78f)
                curveToRelative(dx1 = 3.51f, dy1 = -0.08f, dx2 = 5.59f, dy2 = -2.23f, dx3 = 5.59f, dy3 = -5.8f)
                moveTo(x = 2.0f, y = 12.7f)
                verticalLineToRelative(dy = 3.31f)
                lineTo(x = 1.97f, y = 15.0f)
                verticalLineToRelative(dy = -2.3f)
                close()
            }
        }.build().also { _health = it }
    }

@Suppress("ObjectPropertyName")
private var _health: ImageVector? = null
