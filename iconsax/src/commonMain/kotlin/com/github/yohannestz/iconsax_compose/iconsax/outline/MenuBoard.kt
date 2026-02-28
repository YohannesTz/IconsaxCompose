package com.github.yohannestz.iconsax_compose.iconsax.outline

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
            ) {
                moveTo(x = 16.38f, y = 22.75f)
                horizontalLineTo(x = 3.24f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.4f, dy1 = -1.21f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.46f, dy1 = -2.69f)
                lineTo(x = 4.59f, y = 5.32f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.45f, y1 = 3.2f)
                horizontalLineToRelative(dx = 12.3f)
                curveToRelative(dx1 = 1.21f, dy1 = 0.0f, dx2 = 2.3f, dy2 = 0.72f, dx3 = 2.76f, dy3 = 1.84f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.15f, dy1 = 1.89f)
                lineToRelative(dx = -3.37f, dy = 13.53f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.91f, dy1 = 2.29f)
                moveTo(x = 7.46f, y = 4.71f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.43f, dy1 = 1.06f)
                lineTo(x = 1.82f, y = 19.3f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.43f, dy1 = 1.96f)
                horizontalLineToRelative(dx = 13.14f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.45f, dy1 = -1.14f)
                lineToRelative(dx = 3.37f, dy = -13.54f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.07f, dy1 = -0.95f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.38f, dy1 = -0.93f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.78f, y = 22.75f)
                horizontalLineTo(x = 16.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 4.78f)
                arcToRelative(a = 1.46f, b = 1.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.46f, dy1 = -1.58f)
                lineTo(x = 21.25f, y = 6.05f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.69f, dy1 = -0.8f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.8f, dy1 = 0.7f)
                lineToRelative(dx = 0.99f, dy = 13.61f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.95f, dy1 = 3.2f)
                close()
                moveTo(x = 9.68f, y = 7.13f)
                lineTo(x = 9.5f, y = 7.11f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.95f, y1 = 6.2f)
                lineToRelative(dx = 1.04f, dy = -4.32f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.46f, dy1 = 0.36f)
                lineToRelative(dx = -1.04f, dy = 4.32f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = 0.57f)
                moveToRelative(dx = 6.7f, dy = 0.01f)
                quadToRelative(dx1 = -0.08f, dy1 = 0.0f, dx2 = -0.16f, dy2 = -0.02f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = -0.89f)
                lineToRelative(dx = 0.94f, dy = -4.34f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.89f, dy1 = -0.58f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.58f, dy1 = 0.9f)
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
