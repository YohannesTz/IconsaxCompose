package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrushSquare: ImageVector
    get() {
        val current = _trushSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TrushSquare",
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
                moveTo(x = 16.86f, y = 8.46f)
                quadToRelative(dx1 = -1.25f, dy1 = -0.11f, dx2 = -2.36f, dy2 = -0.18f)
                lineTo(x = 14.42f, y = 7.8f)
                curveToRelative(dx1 = -0.07f, dy1 = -0.48f, dx2 = -0.22f, dy2 = -1.47f, dx3 = -1.73f, dy3 = -1.47f)
                horizontalLineTo(x = 11.3f)
                curveToRelative(dx1 = -1.49f, dy1 = 0.0f, dx2 = -1.65f, dy2 = 0.95f, dx3 = -1.73f, dy3 = 1.46f)
                lineTo(x = 9.49f, y = 8.26f)
                lineTo(x = 8.21f, y = 8.35f)
                lineToRelative(dx = -1.09f, dy = 0.1f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.61f, dy1 = 0.76f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.68f, dy1 = 0.62f)
                horizontalLineToRelative(dx = 0.07f)
                lineToRelative(dx = 1.08f, dy = -0.11f)
                quadToRelative(dx1 = 0.9f, dy1 = -0.08f, dx2 = 1.81f, dy2 = -0.13f)
                arcToRelative(a = 55.8f, b = 55.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.57f, dy1 = 0.24f)
                horizontalLineToRelative(dx = 0.06f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.68f, dy1 = -0.62f)
                arcToRelative(a = 0.66f, b = 0.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.6f, dy1 = -0.75f)
                moveToRelative(dx = -1.03f, dy = 2.64f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.67f, dy1 = -0.3f)
                horizontalLineTo(x = 8.84f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.67f, dy1 = 0.3f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.24f, dy1 = 0.69f)
                lineToRelative(dx = 0.31f, dy = 3.96f)
                curveToRelative(dx1 = 0.06f, dy1 = 0.85f, dx2 = 0.13f, dy2 = 1.9f, dx3 = 2.05f, dy3 = 1.9f)
                horizontalLineToRelative(dx = 3.42f)
                curveToRelative(dx1 = 1.92f, dy1 = 0.0f, dx2 = 1.99f, dy2 = -1.05f, dx3 = 2.05f, dy3 = -1.9f)
                lineToRelative(dx = 0.31f, dy = -3.96f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.24f, dy1 = -0.7f)
            }
        }.build().also { _trushSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _trushSquare: ImageVector? = null
