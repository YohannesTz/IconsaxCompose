package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RefreshSquare: ImageVector
    get() {
        val current = _refreshSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RefreshSquare",
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
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
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
                moveTo(x = 18.0f, y = 11.27f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 0.75f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.53f, dy1 = 3.69f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.71f, dy1 = 1.54f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.71f, dy1 = -1.54f)
                lineToRelative(dx = -0.08f, dy = -0.09f)
                horizontalLineToRelative(dx = 0.83f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
                horizontalLineTo(x = 6.4f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 2.65f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -0.85f)
                lineToRelative(dx = 0.09f, dy = 0.11f)
                arcToRelative(a = 6.7f, b = 6.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.77f, dy1 = 1.98f)
                curveToRelative(dx1 = 1.8f, dy1 = 0.0f, dx2 = 3.5f, dy2 = -0.7f, dx3 = 4.77f, dy3 = -1.98f)
                arcToRelative(a = 6.7f, b = 6.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.97f, dy1 = -4.75f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = -0.76f)
                moveTo(x = 6.0f, y = 12.65f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = -0.74f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.53f, dy1 = -3.63f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.71f, dy1 = -1.54f)
                curveToRelative(dx1 = 1.4f, dy1 = 0.0f, dx2 = 2.72f, dy2 = 0.55f, dx3 = 3.71f, dy3 = 1.54f)
                lineToRelative(dx = 0.08f, dy = 0.09f)
                horizontalLineToRelative(dx = -0.83f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = 0.75f, dx2 = 0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = 2.65f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = -0.75f)
                verticalLineTo(y = 6.48f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = 0.34f, dx2 = -0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 0.86f)
                lineToRelative(dx = -0.09f, dy = -0.11f)
                arcToRelative(a = 6.7f, b = 6.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.77f, dy1 = -1.98f)
                curveToRelative(dx1 = -1.8f, dy1 = 0.0f, dx2 = -3.5f, dy2 = 0.7f, dx3 = -4.77f, dy3 = 1.98f)
                arcToRelative(a = 6.6f, b = 6.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.97f, dy1 = 4.66f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.74f, dy1 = 0.76f)
                close()
            }
        }.build().also { _refreshSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _refreshSquare: ImageVector? = null
