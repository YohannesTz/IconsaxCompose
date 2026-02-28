package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.2f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveToRelative(dx1 = -3.64f, dy1 = 0.0f, dx2 = -5.8f, dy2 = 2.17f, dx3 = -5.8f, dy3 = 5.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.16f, dy2 = 5.81f, dx3 = 5.8f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.2f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.8f, y = 7.22f)
                horizontalLineToRelative(dx = -1.48f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.94f, dy1 = 1.94f)
                verticalLineToRelative(dy = 1.49f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.94f, dy1 = 1.94f)
                horizontalLineToRelative(dx = 1.9f)
                curveToRelative(dx1 = -0.07f, dy1 = 1.8f, dx2 = -0.5f, dy2 = 2.08f, dx3 = -1.7f, dy3 = 2.79f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.26f, dy1 = 1.03f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.65f, dy1 = 0.37f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.38f, dy1 = -0.1f)
                curveToRelative(dx1 = 1.79f, dy1 = -1.06f, dx2 = 2.46f, dy2 = -1.75f, dx3 = 2.46f, dy3 = -4.83f)
                verticalLineTo(y = 9.18f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.94f, dy1 = -1.96f)
                moveToRelative(dx = -6.12f, dy = 0.0f)
                horizontalLineTo(x = 8.19f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.94f, dy1 = 1.94f)
                verticalLineToRelative(dy = 1.49f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.94f, dy1 = 1.94f)
                horizontalLineToRelative(dx = 1.91f)
                curveToRelative(dx1 = -0.08f, dy1 = 1.8f, dx2 = -0.5f, dy2 = 2.08f, dx3 = -1.71f, dy3 = 2.79f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.26f, dy1 = 1.03f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.65f, dy1 = 0.37f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.38f, dy1 = -0.1f)
                curveToRelative(dx1 = 1.79f, dy1 = -1.06f, dx2 = 2.46f, dy2 = -1.75f, dx3 = 2.46f, dy3 = -4.83f)
                verticalLineTo(y = 9.18f)
                arcToRelative(a = 1.96f, b = 1.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.94f, dy1 = -1.96f)
            }
        }.build().also { _quoteUpSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _quoteUpSquare: ImageVector? = null
