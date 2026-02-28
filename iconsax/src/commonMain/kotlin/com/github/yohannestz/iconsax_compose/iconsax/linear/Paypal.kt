package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.0f, y = 7.0f)
                verticalLineToRelative(dy = 0.5f)
                arcToRelative(a = 6.04f, b = 6.04f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.0f, dy1 = 5.5f)
                horizontalLineTo(x = 9.9f)
                curveToRelative(dx1 = -0.5f, dy1 = 0.0f, dx2 = -0.9f, dy2 = 0.4f, dx3 = -1.0f, dy3 = 0.9f)
                lineToRelative(dx = -0.8f, dy = 5.3f)
                curveTo(x1 = 8.0f, y1 = 19.6f, x2 = 7.8f, y2 = 19.9f, x3 = 7.4f, y3 = 20.0f)
                horizontalLineTo(x = 5.2f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -1.2f)
                lineTo(x = 6.6f, y = 4.5f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.5f, y1 = 2.0f)
                horizontalLineTo(x = 14.0f)
                curveToRelative(dx1 = 2.8f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 2.2f, dx3 = 5.0f, dy3 = 5.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.0f, y = 11.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.4f, dx2 = -0.6f, dy2 = 2.6f, dx3 = -1.5f, dy3 = 3.5f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 16.0f)
                horizontalLineToRelative(dx = -2.1f)
                curveToRelative(dx1 = -0.5f, dy1 = 0.0f, dx2 = -0.9f, dy2 = 0.3f, dx3 = -1.0f, dy3 = 0.8f)
                lineToRelative(dx = -0.7f, dy = 4.3f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = 0.8f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -0.6f, dy1 = 0.0f, dx2 = -1.1f, dy2 = -0.6f, dx3 = -1.0f, dy3 = -1.2f)
                lineTo(x = 7.4f, y = 20.0f)
                curveToRelative(dx1 = 0.4f, dy1 = -0.1f, dx2 = 0.7f, dy2 = -0.4f, dx3 = 0.7f, dy3 = -0.8f)
                lineToRelative(dx = 0.8f, dy = -5.3f)
                curveTo(x1 = 9.0f, y1 = 13.4f, x2 = 9.4f, y2 = 13.0f, x3 = 9.9f, y3 = 13.0f)
                horizontalLineTo(x = 13.0f)
                curveToRelative(dx1 = 1.7f, dy1 = 0.0f, dx2 = 3.2f, dy2 = -0.7f, dx3 = 4.2f, dy3 = -1.8f)
                curveToRelative(dx1 = 1.0f, dy1 = -1.0f, dx2 = 1.6f, dy2 = -2.3f, dx3 = 1.7f, dy3 = -3.7f)
                curveToRelative(dx1 = 1.3f, dy1 = 0.7f, dx2 = 2.1f, dy2 = 2.0f, dx3 = 2.1f, dy3 = 3.5f)
                close()
            }
        }.build().also { _paypal = it }
    }

@Suppress("ObjectPropertyName")
private var _paypal: ImageVector? = null
