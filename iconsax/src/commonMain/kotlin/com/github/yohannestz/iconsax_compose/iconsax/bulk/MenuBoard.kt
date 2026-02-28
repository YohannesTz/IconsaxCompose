package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MenuBoard: ImageVector
    get() {
        val current = _menuBoard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MenuBoard",
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
                moveTo(x = 21.99f, y = 6.02f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.06f, dy1 = 0.74f)
                lineToRelative(dx = -3.37f, dy = 13.53f)
                arcTo(horizontalEllipseRadius = 2.2f, verticalEllipseRadius = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.38f, y1 = 22.0f)
                horizontalLineTo(x = 3.24f)
                arcToRelative(a = 2.26f, b = 2.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.14f, dy1 = -2.93f)
                lineTo(x = 5.31f, y = 5.54f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.14f, dy1 = -1.58f)
                horizontalLineToRelative(dx = 12.3f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.07f, dy1 = 1.37f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.17f, dy1 = 0.69f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.99f, y = 19.62f)
                arcTo(horizontalEllipseRadius = 2.2f, verticalEllipseRadius = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.78f, y1 = 22.0f)
                horizontalLineToRelative(dx = -4.4f)
                curveToRelative(dx1 = 1.04f, dy1 = 0.0f, dx2 = 1.94f, dy2 = -0.7f, dx3 = 2.18f, dy3 = -1.71f)
                lineToRelative(dx = 3.37f, dy = -13.53f)
                quadToRelative(dx1 = 0.09f, dy1 = -0.38f, dx2 = 0.06f, dy2 = -0.74f)
                lineTo(x = 22.0f, y = 6.0f)
                close()
                moveTo(x = 9.68f, y = 7.13f)
                quadToRelative(dx1 = -0.09f, dy1 = 0.0f, dx2 = -0.18f, dy2 = -0.02f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.55f, dy1 = -0.9f)
                lineToRelative(dx = 1.04f, dy = -4.33f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.46f, dy1 = 0.36f)
                lineToRelative(dx = -1.04f, dy = 4.32f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = 0.57f)
                moveToRelative(dx = 6.7f, dy = 0.01f)
                quadToRelative(dx1 = -0.08f, dy1 = 0.0f, dx2 = -0.16f, dy2 = -0.02f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = -0.89f)
                lineToRelative(dx = 0.94f, dy = -4.34f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.89f, dy1 = -0.58f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.58f, dy1 = 0.9f)
                lineToRelative(dx = -0.94f, dy = 4.33f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = 0.6f)
                moveToRelative(dx = -0.68f, dy = 5.61f)
                horizontalLineToRelative(dx = -8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -1.0f, dy = 4.0f)
                horizontalLineToRelative(dx = -8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _menuBoard = it }
    }

@Suppress("ObjectPropertyName")
private var _menuBoard: ImageVector? = null
