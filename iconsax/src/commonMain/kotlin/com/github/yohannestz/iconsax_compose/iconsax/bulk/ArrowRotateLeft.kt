package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowRotateLeft: ImageVector
    get() {
        val current = _arrowRotateLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowRotateLeft",
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
                moveTo(x = 7.81f, y = 2.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveTo(x1 = 19.83f, y1 = 2.0f, x2 = 22.0f, y2 = 4.17f, x3 = 22.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = -2.17f, dy2 = 5.81f, dx3 = -5.81f, dy3 = 5.81f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 22.0f, x2 = 2.0f, y2 = 19.83f, x3 = 2.0f, y3 = 16.19f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 2.0f, y1 = 4.17f, x2 = 4.17f, y2 = 2.0f, x3 = 7.81f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 18.58f)
                arcToRelative(a = 5.76f, b = 5.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.78f, dy1 = -8.94f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.04f, dy1 = -0.21f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = 1.04f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.54f, dy1 = 6.61f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.25f, dy1 = -4.25f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.94f, dy1 = -4.24f)
                lineToRelative(dx = 0.41f, dy = 0.3f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.16f, dy1 = 1.05f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.05f, dy1 = 0.16f)
                lineTo(x = 9.9f, y = 8.69f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.18f, dy1 = -0.18f)
                lineTo(x = 9.69f, y = 8.47f)
                lineTo(x = 9.6f, y = 8.24f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.01f, dy1 = -0.29f)
                lineToRelative(dx = 0.03f, dy = -0.12f)
                quadToRelative(dx1 = 0.04f, dy1 = -0.1f, dx2 = 0.1f, dy2 = -0.2f)
                lineToRelative(dx = 0.06f, dy = -0.05f)
                lineToRelative(dx = 1.66f, dy = -1.9f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = -0.07f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.07f, dy1 = 1.06f)
                lineTo(x = 12.2f, y = 7.1f)
                arcToRelative(a = 5.76f, b = 5.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.56f, dy1 = 5.75f)
                arcTo(horizontalEllipseRadius = 5.77f, verticalEllipseRadius = 5.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.58f)
            }
        }.build().also { _arrowRotateLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowRotateLeft: ImageVector? = null
