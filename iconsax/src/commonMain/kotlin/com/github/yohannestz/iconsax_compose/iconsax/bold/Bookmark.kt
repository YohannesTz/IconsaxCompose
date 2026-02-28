package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bookmark: ImageVector
    get() {
        val current = _bookmark
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bookmark",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineToRelative(dy = 8.38f)
                arcTo(horizontalEllipseRadius = 5.8f, verticalEllipseRadius = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.19f, y1 = 22.0f)
                horizontalLineTo(x = 7.81f)
                arcTo(horizontalEllipseRadius = 5.8f, verticalEllipseRadius = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 16.19f)
                verticalLineTo(y = 7.81f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.49f, dx2 = 1.02f, dy2 = -4.3f, dx3 = 2.83f, dy3 = -5.18f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.42f, dy1 = 0.91f)
                verticalLineToRelative(dy = 8.88f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.19f, dx2 = 0.46f, dy2 = 2.14f, dx3 = 1.29f, dy3 = 2.62f)
                curveToRelative(dx1 = 0.84f, dy1 = 0.47f, dx2 = 1.9f, dy2 = 0.37f, dx3 = 2.98f, dy3 = -0.28f)
                lineToRelative(dx = 1.3f, dy = -0.78f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.34f, dy1 = -0.01f)
                lineToRelative(dx = 1.32f, dy = 0.79f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.84f, dy1 = 0.57f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.16f, dy1 = -0.3f)
                curveToRelative(dx1 = 0.81f, dy1 = -0.47f, dx2 = 1.27f, dy2 = -1.42f, dx3 = 1.27f, dy3 = -2.61f)
                verticalLineTo(y = 3.54f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.73f, dx2 = 0.77f, dy2 = -1.23f, dx3 = 1.42f, dy3 = -0.91f)
                curveTo(x1 = 20.98f, y1 = 3.51f, x2 = 22.0f, y2 = 5.32f, x3 = 22.0f, y3 = 7.81f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.25f, y = 2.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
                verticalLineToRelative(dy = 9.42f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.64f, dx2 = -0.19f, dy2 = 1.12f, dx3 = -0.52f, dy3 = 1.31f)
                curveToRelative(dx1 = -0.34f, dy1 = 0.2f, dx2 = -0.88f, dy2 = 0.1f, dx3 = -1.48f, dy3 = -0.26f)
                lineToRelative(dx = -1.32f, dy = -0.79f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.86f, dy1 = 0.0f)
                lineToRelative(dx = -1.32f, dy = 0.79f)
                curveToRelative(dx1 = -0.6f, dy1 = 0.36f, dx2 = -1.14f, dy2 = 0.45f, dx3 = -1.48f, dy3 = 0.26f)
                curveToRelative(dx1 = -0.33f, dy1 = -0.19f, dx2 = -0.52f, dy2 = -0.67f, dx3 = -0.52f, dy3 = -1.31f)
                verticalLineTo(y = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = -1.0f)
                close()
            }
        }.build().also { _bookmark = it }
    }

@Suppress("ObjectPropertyName")
private var _bookmark: ImageVector? = null
