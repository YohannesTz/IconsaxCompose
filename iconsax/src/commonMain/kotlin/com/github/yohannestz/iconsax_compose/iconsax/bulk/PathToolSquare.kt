package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PathToolSquare: ImageVector
    get() {
        val current = _pathToolSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PathToolSquare",
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
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.66f, y = 11.25f)
                lineToRelative(dx = -1.62f, dy = 1.02f)
                lineToRelative(dx = -3.3f, dy = -3.29f)
                lineToRelative(dx = 1.03f, dy = -1.63f)
                curveToRelative(dx1 = 0.47f, dy1 = -0.74f, dx2 = 1.43f, dy2 = -0.78f, dx3 = 2.13f, dy3 = -0.08f)
                lineToRelative(dx = 1.85f, dy = 1.85f)
                curveToRelative(dx1 = 0.66f, dy1 = 0.65f, dx2 = 0.62f, dy2 = 1.68f, dx3 = -0.09f, dy3 = 2.13f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.6f,
                strokeAlpha = 0.6f,
            ) {
                moveTo(x = 13.58f, y = 16.62f)
                lineToRelative(dx = -5.07f, dy = 0.6f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = -0.04f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -1.06f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.04f, dy1 = -0.6f)
                lineToRelative(dx = 0.59f, dy = -5.08f)
                curveToRelative(dx1 = 0.16f, dy1 = -1.27f, dx2 = 0.62f, dy2 = -1.68f, dx3 = 1.96f, dy3 = -1.6f)
                lineToRelative(dx = 2.39f, dy = 0.14f)
                lineToRelative(dx = 3.3f, dy = 3.3f)
                lineToRelative(dx = 0.14f, dy = 2.4f)
                curveToRelative(dx1 = 0.13f, dy1 = 1.33f, dx2 = -0.33f, dy2 = 1.8f, dx3 = -1.6f, dy3 = 1.94f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.88f, y = 15.2f)
                lineTo(x = 7.9f, y = 17.18f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -1.06f)
                lineToRelative(dx = 1.97f, dy = -1.98f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.07f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _pathToolSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _pathToolSquare: ImageVector? = null
