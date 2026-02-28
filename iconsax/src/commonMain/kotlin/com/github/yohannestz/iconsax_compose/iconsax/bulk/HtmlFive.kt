package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HtmlFive: ImageVector
    get() {
        val current = _htmlFive
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HtmlFive",
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
                moveTo(x = 4.12f, y = 2.0f)
                horizontalLineToRelative(dx = 15.77f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.99f, dy1 = 1.11f)
                lineToRelative(dx = -1.8f, dy = 16.22f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.72f, dy1 = 0.85f)
                lineToRelative(dx = -6.08f, dy = 1.74f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.55f, dy1 = 0.0f)
                lineToRelative(dx = -6.08f, dy = -1.74f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.72f, dy1 = -0.85f)
                lineTo(x = 3.13f, y = 3.11f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.12f, y1 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.75f, y = 18.0f)
                lineToRelative(dx = -0.21f, dy = -0.03f)
                lineToRelative(dx = -3.5f, dy = -1.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.54f, dy1 = -0.72f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 9.0f, y1 = 13.84f, x2 = 9.0f, y2 = 14.25f)
                verticalLineToRelative(dy = 1.43f)
                lineToRelative(dx = 2.75f, dy = 0.79f)
                lineToRelative(dx = 2.8f, dy = -0.8f)
                lineToRelative(dx = 0.37f, dy = -3.67f)
                horizontalLineTo(x = 8.25f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.67f)
                lineTo(x = 7.0f, y = 6.83f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.19f, dy1 = -0.58f)
                arcTo(horizontalEllipseRadius = 0.8f, verticalEllipseRadius = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.75f, y1 = 6.0f)
                horizontalLineToRelative(dx = 8.5f)
                curveTo(x1 = 16.66f, y1 = 6.0f, x2 = 17.0f, y2 = 6.34f, x3 = 17.0f, y3 = 6.75f)
                reflectiveCurveTo(x1 = 16.66f, y1 = 7.5f, x2 = 16.25f, y2 = 7.5f)
                horizontalLineTo(x = 8.59f)
                lineToRelative(dx = 0.33f, dy = 3.0f)
                horizontalLineToRelative(dx = 6.83f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.56f, dy1 = 0.25f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.19f, dy1 = 0.58f)
                lineToRelative(dx = -0.5f, dy = 5.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.54f, dy1 = 0.65f)
                lineToRelative(dx = -3.5f, dy = 1.0f)
                close()
            }
        }.build().also { _htmlFive = it }
    }

@Suppress("ObjectPropertyName")
private var _htmlFive: ImageVector? = null
