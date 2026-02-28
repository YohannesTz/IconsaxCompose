package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Coffee: ImageVector
    get() {
        val current = _coffee
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Coffee",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 6.0f, y = 5.12f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.62f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 1.75f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 5.12f)
                moveToRelative(dx = 4.0f, dy = 0.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.62f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 1.75f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.0f, y1 = 5.12f)
                moveToRelative(dx = 4.0f, dy = 0.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.62f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 1.75f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.0f, y1 = 5.12f)
                moveToRelative(dx = 8.25f, dy = 8.13f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.59f, dy1 = -4.96f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.58f, dy1 = -2.03f)
                horizontalLineTo(x = 6.71f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.21f, dy1 = 4.21f)
                verticalLineTo(y = 11.0f)
                horizontalLineToRelative(dx = 15.79f)
                verticalLineToRelative(dy = -0.53f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.06f, dy1 = -0.56f)
                arcToRelative(a = 3.48f, b = 3.48f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.06f, dy1 = 6.66f)
                verticalLineTo(y = 12.0f)
                horizontalLineTo(x = 2.5f)
                verticalLineToRelative(dy = 5.8f)
                arcTo(horizontalEllipseRadius = 4.2f, verticalEllipseRadius = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.71f, y1 = 22.0f)
                horizontalLineToRelative(dx = 7.37f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.17f, dy1 = -3.86f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.0f, dy1 = -4.89f)
            }
        }.build().also { _coffee = it }
    }

@Suppress("ObjectPropertyName")
private var _coffee: ImageVector? = null
