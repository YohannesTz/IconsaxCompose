package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuoteUpSquare: ImageVector
    get() {
        val current = _quoteUpSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.QuoteUpSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.43f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -2.32f, dx3 = -7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.43f, dx2 = 2.32f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.43f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 2.32f, dx3 = 7.75f, dy3 = 7.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.32f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 4.39f, y1 = 2.75f, x2 = 2.75f, y2 = 4.39f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.61f, dx2 = -1.64f, dy2 = -6.25f, dx3 = -6.25f, dy3 = -6.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 12.59f)
                horizontalLineToRelative(dx = -2.68f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.94f, dy1 = -1.94f)
                verticalLineToRelative(dy = -1.5f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.94f, dy1 = -1.93f)
                horizontalLineToRelative(dx = 1.49f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.94f, dy1 = 1.94f)
                verticalLineToRelative(dy = 2.67f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 12.59f)
                moveToRelative(dx = -2.68f, dy = -3.87f)
                curveToRelative(dx1 = -0.32f, dy1 = 0.0f, dx2 = -0.44f, dy2 = 0.24f, dx3 = -0.44f, dy3 = 0.44f)
                verticalLineToRelative(dy = 1.49f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.2f, dx2 = 0.1f, dy2 = 0.44f, dx3 = 0.44f, dy3 = 0.44f)
                horizontalLineToRelative(dx = 1.93f)
                verticalLineTo(y = 9.17f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.24f, dx2 = -0.2f, dy2 = -0.44f, dx3 = -0.44f, dy3 = -0.44f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.91f, y = 16.78f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.37f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.26f, dy1 = -1.03f)
                curveToRelative(dx1 = 1.36f, dy1 = -0.81f, dx2 = 1.73f, dy2 = -1.02f, dx3 = 1.73f, dy3 = -3.54f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.08f, dx2 = -0.67f, dy2 = 3.77f, dx3 = -2.46f, dy3 = 4.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = 0.11f)
                moveToRelative(dx = -4.05f, dy = -4.2f)
                horizontalLineTo(x = 8.18f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.94f, dy1 = -1.93f)
                verticalLineToRelative(dy = -1.5f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.94f, dy1 = -1.93f)
                horizontalLineToRelative(dx = 1.5f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.93f, dy1 = 1.94f)
                verticalLineToRelative(dy = 2.67f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.76f)
                moveTo(x = 8.2f, y = 8.73f)
                curveToRelative(dx1 = -0.32f, dy1 = 0.0f, dx2 = -0.44f, dy2 = 0.24f, dx3 = -0.44f, dy3 = 0.44f)
                verticalLineToRelative(dy = 1.49f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.2f, dx2 = 0.11f, dy2 = 0.44f, dx3 = 0.44f, dy3 = 0.44f)
                horizontalLineToRelative(dx = 1.93f)
                verticalLineTo(y = 9.17f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.24f, dx2 = -0.2f, dy2 = -0.44f, dx3 = -0.44f, dy3 = -0.44f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.77f, y = 16.78f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.37f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.26f, dy1 = -1.03f)
                curveToRelative(dx1 = 1.36f, dy1 = -0.81f, dx2 = 1.73f, dy2 = -1.02f, dx3 = 1.73f, dy3 = -3.54f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.08f, dx2 = -0.67f, dy2 = 3.77f, dx3 = -2.46f, dy3 = 4.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = 0.11f)
            }
        }.build().also { _quoteUpSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _quoteUpSquare: ImageVector? = null
