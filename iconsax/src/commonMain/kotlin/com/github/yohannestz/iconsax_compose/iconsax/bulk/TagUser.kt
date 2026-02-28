package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TagUser: ImageVector
    get() {
        val current = _tagUser
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TagUser",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.07f, y = 8.95f)
                horizontalLineToRelative(dx = -0.15f)
                arcTo(horizontalEllipseRadius = 1.95f, verticalEllipseRadius = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.04f, y1 = 7.0f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 3.9f, dy1 = 0.0f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.87f, dy1 = 1.95f)
                moveToRelative(dx = -2.82f, dy = 3.01f)
                curveToRelative(dx1 = -1.33f, dy1 = 0.89f, dx2 = -1.33f, dy2 = 2.34f, dx3 = 0.0f, dy3 = 3.23f)
                arcToRelative(a = 5.4f, b = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.5f, dy1 = 0.0f)
                curveToRelative(dx1 = 1.33f, dy1 = -0.89f, dx2 = 1.33f, dy2 = -2.34f, dx3 = 0.0f, dy3 = -3.23f)
                curveToRelative(dx1 = -1.5f, dy1 = -1.0f, dx2 = -3.98f, dy2 = -1.0f, dx3 = -5.5f, dy3 = 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.0f, y = 2.0f)
                horizontalLineTo(x = 6.0f)
                curveTo(x1 = 4.34f, y1 = 2.0f, x2 = 3.0f, y2 = 3.33f, x3 = 3.0f, y3 = 4.97f)
                verticalLineToRelative(dy = 10.91f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 2.97f)
                horizontalLineToRelative(dx = 0.76f)
                curveToRelative(dx1 = 0.8f, dy1 = 0.0f, dx2 = 1.56f, dy2 = 0.31f, dx3 = 2.12f, dy3 = 0.87f)
                lineToRelative(dx = 1.71f, dy = 1.69f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.83f, dy1 = 0.0f)
                lineToRelative(dx = 1.71f, dy = -1.69f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.12f, dy1 = -0.87f)
                horizontalLineTo(x = 18.0f)
                curveToRelative(dx1 = 1.66f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -1.33f, dx3 = 3.0f, dy3 = -2.97f)
                verticalLineTo(y = 4.97f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.0f, y1 = 2.0f)
                moveToRelative(dx = -6.0f, dy = 3.05f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.07f, dy1 = 3.9f)
                horizontalLineToRelative(dx = -0.15f)
                arcTo(horizontalEllipseRadius = 1.95f, verticalEllipseRadius = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.04f, y1 = 7.0f)
                arcTo(horizontalEllipseRadius = 1.97f, verticalEllipseRadius = 1.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 5.05f)
                moveToRelative(dx = 2.75f, dy = 10.14f)
                arcToRelative(a = 5.4f, b = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.5f, dy1 = 0.0f)
                curveToRelative(dx1 = -1.33f, dy1 = -0.88f, dx2 = -1.33f, dy2 = -2.34f, dx3 = 0.0f, dy3 = -3.23f)
                arcToRelative(a = 5.4f, b = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.5f, dy1 = 0.0f)
                curveToRelative(dx1 = 1.33f, dy1 = 0.89f, dx2 = 1.33f, dy2 = 2.34f, dx3 = 0.0f, dy3 = 3.23f)
            }
        }.build().also { _tagUser = it }
    }

@Suppress("ObjectPropertyName")
private var _tagUser: ImageVector? = null
