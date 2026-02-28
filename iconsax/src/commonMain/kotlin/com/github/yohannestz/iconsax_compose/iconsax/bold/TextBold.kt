package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextBold: ImageVector
    get() {
        val current = _textBold
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TextBold",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.75f, y = 12.75f)
                horizontalLineTo(x = 8.5f)
                verticalLineToRelative(dy = 3.99f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.51f, dy1 = 0.51f)
                horizontalLineToRelative(dx = 4.74f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.5f)
                moveTo(x = 14.5f, y = 9.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.25f, dy1 = -2.25f)
                horizontalLineTo(x = 9.01f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.5f, y1 = 7.26f)
                verticalLineToRelative(dy = 3.99f)
                horizontalLineToRelative(dx = 3.75f)
                arcTo(horizontalEllipseRadius = 2.25f, verticalEllipseRadius = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.5f, y1 = 9.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.95f, y = 4.13f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.08f, dy1 = -1.08f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.19f, y1 = 2.0f)
                horizontalLineTo(x = 7.81f)
                quadToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.59f, dy2 = 0.03f)
                curveTo(x1 = 3.94f, y1 = 2.24f, x2 = 2.0f, y2 = 4.37f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.38f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.05f, dy1 = 3.68f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = 1.08f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.09f, dy1 = 1.03f)
                lineTo(x = 7.81f, y = 22.0f)
                horizontalLineToRelative(dx = 8.38f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.05f, dy1 = -3.68f)
                moveToRelative(dx = -7.2f, dy = 14.62f)
                horizontalLineTo(x = 9.01f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 16.74f)
                verticalLineTo(y = 7.26f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.11f, dx2 = 0.9f, dy2 = -2.01f, dx3 = 2.01f, dy3 = -2.01f)
                horizontalLineToRelative(dx = 3.24f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 9.0f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.97f, dy1 = 2.49f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.28f, dy1 = 7.26f)
            }
        }.build().also { _textBold = it }
    }

@Suppress("ObjectPropertyName")
private var _textBold: ImageVector? = null
