package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudMinus: ImageVector
    get() {
        val current = _cloudMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudMinus",
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
                moveTo(x = 21.74f, y = 11.74f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.04f, dy1 = -3.87f)
                curveToRelative(dx1 = -0.56f, dy1 = -2.5f, dx2 = -2.1f, dy2 = -4.29f, dx3 = -4.28f, dy3 = -4.97f)
                arcToRelative(a = 6.9f, b = 6.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.87f, dy1 = 1.79f)
                arcToRelative(a = 6.3f, b = 6.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.44f, dy1 = 6.11f)
                arcTo(horizontalEllipseRadius = 4.1f, verticalEllipseRadius = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 14.86f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.97f, dy1 = 4.18f)
                horizontalLineTo(x = 8.5f)
                verticalLineToRelative(dy = -2.63f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.27f, dx2 = 0.76f, dy2 = -2.03f, dx3 = 2.03f, dy3 = -2.03f)
                horizontalLineToRelative(dx = 2.94f)
                curveToRelative(dx1 = 1.27f, dy1 = 0.0f, dx2 = 2.03f, dy2 = 0.76f, dx3 = 2.03f, dy3 = 2.03f)
                verticalLineToRelative(dy = 2.63f)
                horizontalLineToRelative(dx = 0.85f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.82f, dy1 = -1.48f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.57f, dy1 = -5.82f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.47f, y = 14.39f)
                horizontalLineToRelative(dx = -2.94f)
                curveToRelative(dx1 = -1.27f, dy1 = 0.0f, dx2 = -2.03f, dy2 = 0.76f, dx3 = -2.03f, dy3 = 2.03f)
                verticalLineToRelative(dy = 2.94f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.27f, dx2 = 0.76f, dy2 = 2.03f, dx3 = 2.03f, dy3 = 2.03f)
                horizontalLineToRelative(dx = 2.94f)
                curveToRelative(dx1 = 1.27f, dy1 = 0.0f, dx2 = 2.03f, dy2 = -0.76f, dx3 = 2.03f, dy3 = -2.03f)
                verticalLineToRelative(dy = -2.94f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.27f, dx2 = -0.76f, dy2 = -2.03f, dx3 = -2.03f, dy3 = -2.03f)
                moveToRelative(dx = 0.24f, dy = 4.07f)
                horizontalLineTo(x = 10.3f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.65f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.65f, dy1 = -0.64f)
                horizontalLineToRelative(dx = 3.42f)
                arcToRelative(a = 0.64f, b = 0.64f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.64f, dy1 = 0.64f)
                arcToRelative(a = 0.66f, b = 0.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = 0.65f)
            }
        }.build().also { _cloudMinus = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudMinus: ImageVector? = null
