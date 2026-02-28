package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Messenger: ImageVector
    get() {
        val current = _messenger
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Messenger",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                curveTo(x1 = 6.48f, y1 = 2.0f, x2 = 2.0f, y2 = 6.15f, x3 = 2.0f, y3 = 11.26f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.9f, dx2 = 1.44f, dy2 = 5.48f, dx3 = 3.68f, dy3 = 7.18f)
                verticalLineToRelative(dy = 1.85f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.49f, dy1 = 0.87f)
                lineToRelative(dx = 1.86f, dy = -1.05f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.96f, dy1 = 0.41f)
                curveToRelative(dx1 = 5.52f, dy1 = 0.0f, dx2 = 10.0f, dy2 = -4.15f, dx3 = 10.0f, dy3 = -9.26f)
                curveTo(x1 = 22.0f, y1 = 6.15f, x2 = 17.52f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                moveToRelative(dx = 3.51f, dy = 8.44f)
                lineToRelative(dx = -2.5f, dy = 2.99f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.63f, dy1 = 0.11f)
                lineToRelative(dx = -1.01f, dy = -0.59f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 11.0f, y1 = 12.9f)
                lineToRelative(dx = -2.01f, dy = 0.49f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = -0.81f)
                lineToRelative(dx = 2.54f, dy = -3.02f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.62f, dy1 = -0.12f)
                lineToRelative(dx = 1.18f, dy = 0.62f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.36f, dy1 = 0.04f)
                lineToRelative(dx = 1.82f, dy = -0.47f)
                curveToRelative(dx1 = 0.46f, dy1 = -0.12f, dx2 = 0.81f, dy2 = 0.44f, dx3 = 0.5f, dy3 = 0.81f)
            }
        }.build().also { _messenger = it }
    }

@Suppress("ObjectPropertyName")
private var _messenger: ImageVector? = null
