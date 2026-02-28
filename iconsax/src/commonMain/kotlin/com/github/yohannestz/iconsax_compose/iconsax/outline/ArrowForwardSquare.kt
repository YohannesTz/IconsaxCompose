package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowForwardSquare: ImageVector
    get() {
        val current = _arrowForwardSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowForwardSquare",
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
                moveTo(x = 15.0f, y = 16.13f)
                horizontalLineToRelative(dx = -4.92f)
                arcToRelative(a = 3.84f, b = 3.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -7.66f)
                horizontalLineToRelative(dx = 6.77f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = -6.77f)
                arcToRelative(a = 2.33f, b = 2.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.66f)
                horizontalLineTo(x = 15.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.43f, y = 11.52f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 1.04f, dy = -1.04f)
                lineToRelative(dx = -1.04f, dy = -1.04f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 1.57f, dy = 1.57f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -1.57f, dy = 1.57f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
            }
        }.build().also { _arrowForwardSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowForwardSquare: ImageVector? = null
