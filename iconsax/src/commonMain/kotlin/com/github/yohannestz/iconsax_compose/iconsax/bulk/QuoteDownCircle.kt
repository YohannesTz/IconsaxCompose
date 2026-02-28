package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuoteDownCircle: ImageVector
    get() {
        val current = _quoteDownCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.QuoteDownCircle",
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
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.19f, y = 16.78f)
                horizontalLineToRelative(dx = 1.49f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.94f, dy1 = -1.94f)
                verticalLineToRelative(dy = -1.5f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.94f, dy1 = -1.93f)
                horizontalLineTo(x = 7.77f)
                curveToRelative(dx1 = 0.08f, dy1 = -1.81f, dx2 = 0.5f, dy2 = -2.08f, dx3 = 1.71f, dy3 = -2.8f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.74f, y1 = 7.6f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.65f, dy1 = -0.37f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.38f, dy1 = 0.1f)
                curveToRelative(dx1 = -1.79f, dy1 = 1.06f, dx2 = -2.46f, dy2 = 1.75f, dx3 = -2.46f, dy3 = 4.83f)
                verticalLineToRelative(dy = 2.67f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.94f, dy1 = 1.96f)
                moveToRelative(dx = 6.13f, dy = 0.0f)
                horizontalLineToRelative(dx = 1.49f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.94f, dy1 = -1.94f)
                verticalLineToRelative(dy = -1.5f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.94f, dy1 = -1.93f)
                horizontalLineTo(x = 13.9f)
                curveToRelative(dx1 = 0.08f, dy1 = -1.81f, dx2 = 0.5f, dy2 = -2.08f, dx3 = 1.7f, dy3 = -2.8f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.27f, dy1 = -1.02f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.65f, dy1 = -0.37f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.38f, dy1 = 0.1f)
                curveToRelative(dx1 = -1.8f, dy1 = 1.06f, dx2 = -2.46f, dy2 = 1.75f, dx3 = -2.46f, dy3 = 4.83f)
                verticalLineToRelative(dy = 2.67f)
                arcToRelative(a = 1.96f, b = 1.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.94f, dy1 = 1.96f)
            }
        }.build().also { _quoteDownCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _quoteDownCircle: ImageVector? = null
