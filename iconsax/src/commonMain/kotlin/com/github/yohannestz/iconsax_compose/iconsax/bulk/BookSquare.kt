package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BookSquare: ImageVector
    get() {
        val current = _bookSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BookSquare",
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
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.82f)
                curveTo(x1 = 4.18f, y1 = 2.0f, x2 = 2.01f, y2 = 4.17f, x3 = 2.01f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.17f, dy2 = 5.81f, dx3 = 5.81f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.5f, y = 8.09f)
                verticalLineToRelative(dy = 9.16f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.69f, dy1 = 0.46f)
                curveToRelative(dx1 = -1.21f, dy1 = -0.52f, dx2 = -2.79f, dy2 = -1.0f, dx3 = -3.89f, dy3 = -1.14f)
                lineToRelative(dx = -0.19f, dy = -0.02f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.11f, dy1 = -1.27f)
                verticalLineToRelative(dy = -7.7f)
                arcTo(horizontalEllipseRadius = 1.26f, verticalEllipseRadius = 1.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 6.3f)
                curveToRelative(dx1 = 1.25f, dy1 = 0.1f, dx2 = 3.1f, dy2 = 0.7f, dx3 = 4.26f, dy3 = 1.36f)
                curveToRelative(dx1 = 0.15f, dy1 = 0.07f, dx2 = 0.24f, dy2 = 0.24f, dx3 = 0.24f, dy3 = 0.42f)
                moveToRelative(dx = 6.88f, dy = -0.39f)
                verticalLineToRelative(dy = 7.57f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.62f, dx2 = -0.5f, dy2 = 1.19f, dx3 = -1.11f, dy3 = 1.27f)
                lineToRelative(dx = -0.21f, dy = 0.02f)
                arcToRelative(a = 17.0f, b = 17.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.87f, dy1 = 1.13f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.69f, dy1 = -0.46f)
                verticalLineTo(y = 8.08f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.25f, dy1 = -0.44f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.2f, dy1 = -1.34f)
                horizontalLineToRelative(dx = 0.04f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.39f, dy1 = 1.4f)
            }
        }.build().also { _bookSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _bookSquare: ImageVector? = null
