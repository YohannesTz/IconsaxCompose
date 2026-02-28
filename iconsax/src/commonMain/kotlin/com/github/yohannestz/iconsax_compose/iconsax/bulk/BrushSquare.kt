package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BrushSquare: ImageVector
    get() {
        val current = _brushSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BrushSquare",
            defaultWidth = 20.0.dp,
            defaultHeight = 20.0.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 14.19f, y = 0.0f)
                horizontalLineTo(x = 5.81f)
                curveTo(x1 = 2.17f, y1 = 0.0f, x2 = 0.0f, y2 = 2.17f, x3 = 0.0f, y3 = 5.81f)
                verticalLineToRelative(dy = 8.37f)
                curveTo(x1 = 0.0f, y1 = 17.83f, x2 = 2.17f, y2 = 20.0f, x3 = 5.81f, y3 = 20.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 5.81f)
                curveTo(x1 = 20.0f, y1 = 2.17f, x2 = 17.83f, y2 = 0.0f, x3 = 14.19f, y3 = 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.83f, y = 1.55f)
                arcToRelative(a = 28.0f, b = 28.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.71f, dy1 = 8.25f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.05f, dy1 = -3.96f)
                arcToRelative(a = 28.0f, b = 28.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.29f, dy1 = -5.76f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.21f, dy1 = 0.25f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.26f, dy1 = 1.22f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 14.12f, y = 9.8f)
                arcToRelative(a = 15.0f, b = 15.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.18f, dy1 = 1.04f)
                lineToRelative(dx = -1.57f, dy = 1.26f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.62f, dy1 = 0.36f)
                lineTo(x = 10.72f, y = 12.0f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.93f, dy1 = -1.83f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.88f, dy1 = -0.94f)
                quadTo(x1 = 7.66f, y1 = 9.21f, x2 = 7.43f, y2 = 9.21f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.39f, dy1 = -0.67f)
                lineToRelative(dx = 1.25f, dy = -1.57f)
                arcToRelative(a = 15.0f, b = 15.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.01f, dy1 = -1.14f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.04f, dy1 = 3.96f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.75f, y = 12.47f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.91f, dy1 = 3.28f)
                lineToRelative(dx = -1.96f, dy = 0.22f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.87f, dy1 = -1.88f)
                lineToRelative(dx = 0.22f, dy = -1.96f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.56f, dy1 = -1.94f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.93f, dy1 = 1.83f)
                close()
            }
        }.build().also { _brushSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _brushSquare: ImageVector? = null
