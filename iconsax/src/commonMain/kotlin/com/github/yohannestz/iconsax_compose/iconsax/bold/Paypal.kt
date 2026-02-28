package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Paypal: ImageVector
    get() {
        val current = _paypal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Paypal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 19.0f, y = 7.0f)
                lineToRelative(dx = -0.03f, dy = 0.52f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.73f, dy1 = 3.72f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 13.0f, y1 = 13.0f)
                horizontalLineTo(x = 9.87f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = 0.86f)
                lineToRelative(dx = -0.76f, dy = 5.28f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = 0.81f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.13f, y1 = 20.0f)
                horizontalLineTo(x = 5.18f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.99f, dy1 = -1.16f)
                lineTo(x = 6.58f, y = 4.51f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.54f, y1 = 2.0f)
                horizontalLineTo(x = 14.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.0f, dy1 = 5.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 21.0f, y = 11.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = 5.0f)
                horizontalLineToRelative(dx = -2.15f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = 0.84f)
                lineToRelative(dx = -0.72f, dy = 4.32f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.15f, y1 = 22.0f)
                horizontalLineTo(x = 8.22f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.48f, dy1 = -0.12f)
                curveToRelative(dx1 = -0.22f, dy1 = -0.12f, dx2 = -0.08f, dy2 = -0.41f, dx3 = 0.16f, dy3 = -0.51f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.7f, dy1 = -2.02f)
                lineToRelative(dx = 0.64f, dy = -4.42f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.49f, dy1 = -0.43f)
                horizontalLineTo(x = 13.0f)
                arcToRelative(a = 7.4f, b = 7.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.11f, dy1 = -5.11f)
                curveToRelative(dx1 = 0.08f, dy1 = -0.25f, dx2 = 0.41f, dy2 = -0.3f, dx3 = 0.52f, dy3 = -0.07f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.0f, y1 = 11.0f)
            }
        }.build().also { _paypal = it }
    }

@Suppress("ObjectPropertyName")
private var _paypal: ImageVector? = null
