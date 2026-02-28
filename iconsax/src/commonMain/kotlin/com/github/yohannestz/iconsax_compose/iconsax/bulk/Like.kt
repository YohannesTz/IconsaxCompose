package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Like: ImageVector
    get() {
        val current = _like
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Like",
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
                moveTo(x = 18.0f, y = 18.86f)
                horizontalLineToRelative(dx = -0.76f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = 0.87f)
                lineToRelative(dx = -1.71f, dy = 1.7f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.83f, dy1 = 0.0f)
                lineToRelative(dx = -1.71f, dy = -1.7f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = -0.87f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -1.66f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -1.33f, dx3 = -3.0f, dy3 = -2.97f)
                verticalLineTo(y = 5.0f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 2.0f)
                horizontalLineToRelative(dx = 12.0f)
                curveToRelative(dx1 = 1.66f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 1.33f, dx3 = 3.0f, dy3 = 2.97f)
                verticalLineTo(y = 15.9f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 2.97f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.28f, y = 14.96f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.56f, dy1 = 0.0f)
                curveToRelative(dx1 = -1.3f, dy1 = -0.45f, dx2 = -4.22f, dy2 = -2.3f, dx3 = -4.22f, dy3 = -5.45f)
                arcTo(horizontalEllipseRadius = 2.5f, verticalEllipseRadius = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 8.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.5f, dy1 = 1.51f)
                curveToRelative(dx1 = -0.01f, dy1 = 3.15f, dx2 = -2.92f, dy2 = 5.0f, dx3 = -4.22f, dy3 = 5.45f)
            }
        }.build().also { _like = it }
    }

@Suppress("ObjectPropertyName")
private var _like: ImageVector? = null
