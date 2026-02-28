package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuoteDown: ImageVector
    get() {
        val current = _quoteDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.QuoteDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 12.4f)
                horizontalLineToRelative(dx = -5.8f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.33f, dy1 = -3.33f)
                verticalLineTo(y = 5.85f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.9f, dx2 = 1.43f, dy2 = -3.33f, dx3 = 3.33f, dy3 = -3.33f)
                horizontalLineToRelative(dx = 3.22f)
                arcToRelative(a = 3.34f, b = 3.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.33f, dy1 = 3.33f)
                verticalLineToRelative(dy = 5.8f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 12.4f)
                moveToRelative(dx = -5.8f, dy = -8.37f)
                arcToRelative(a = 1.77f, b = 1.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.83f, dy1 = 1.83f)
                verticalLineToRelative(dy = 3.22f)
                arcToRelative(a = 1.77f, b = 1.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.83f, dy1 = 1.83f)
                horizontalLineToRelative(dx = 5.05f)
                verticalLineTo(y = 5.86f)
                arcToRelative(a = 1.83f, b = 1.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.83f, dy1 = -1.83f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.47f, y = 21.47f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.37f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.26f, dy1 = -1.03f)
                curveToRelative(dx1 = 3.23f, dy1 = -1.92f, dx2 = 4.17f, dy2 = -2.72f, dx3 = 4.17f, dy3 = -8.42f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 6.25f, dx2 = -1.27f, dy2 = 7.56f, dx3 = -4.9f, dy3 = 9.7f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = 0.12f)
                moveToRelative(dx = -7.1f, dy = -9.07f)
                horizontalLineToRelative(dx = -5.8f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.33f, dy1 = -3.33f)
                verticalLineTo(y = 5.85f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.9f, dx2 = 1.43f, dy2 = -3.33f, dx3 = 3.33f, dy3 = -3.33f)
                horizontalLineTo(x = 7.8f)
                arcToRelative(a = 3.34f, b = 3.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.33f, dy1 = 3.33f)
                verticalLineToRelative(dy = 5.8f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.76f, dy1 = 0.75f)
                moveTo(x = 4.58f, y = 4.03f)
                arcToRelative(a = 1.77f, b = 1.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.83f, dy1 = 1.83f)
                verticalLineToRelative(dy = 3.22f)
                arcToRelative(a = 1.77f, b = 1.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.83f, dy1 = 1.83f)
                horizontalLineToRelative(dx = 5.05f)
                verticalLineTo(y = 5.86f)
                arcTo(horizontalEllipseRadius = 1.83f, verticalEllipseRadius = 1.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.8f, y1 = 4.03f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.84f, y = 21.47f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.37f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.26f, dy1 = -1.03f)
                curveToRelative(dx1 = 3.23f, dy1 = -1.92f, dx2 = 4.17f, dy2 = -2.72f, dx3 = 4.17f, dy3 = -8.42f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 6.25f, dx2 = -1.27f, dy2 = 7.56f, dx3 = -4.9f, dy3 = 9.7f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = 0.12f)
            }
        }.build().also { _quoteDown = it }
    }

@Suppress("ObjectPropertyName")
private var _quoteDown: ImageVector? = null
