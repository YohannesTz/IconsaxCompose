package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Solana: ImageVector
    get() {
        val current = _solana
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Solana",
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
                moveTo(x = 20.0f, y = 3.5f)
                horizontalLineTo(x = 5.5f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = 0.4f)
                lineToRelative(dx = -1.5f, dy = 2.0f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.0f, y1 = 7.5f)
                horizontalLineToRelative(dx = 14.5f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.6f, dy2 = -0.1f, dx3 = 0.8f, dy3 = -0.4f)
                lineToRelative(dx = 1.5f, dy = -2.0f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 20.0f, y1 = 3.5f)
                close()
                moveTo(x = 4.0f, y = 10.0f)
                horizontalLineToRelative(dx = 14.5f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.6f, dy2 = 0.1f, dx3 = 0.8f, dy3 = 0.4f)
                lineToRelative(dx = 1.5f, dy = 2.0f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.0f, y1 = 14.0f)
                horizontalLineTo(x = 5.5f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.8f, dy1 = -0.4f)
                lineToRelative(dx = -1.5f, dy = -2.0f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.0f, y1 = 10.0f)
                close()
                moveToRelative(dx = 16.0f, dy = 6.5f)
                horizontalLineTo(x = 5.5f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = 0.4f)
                lineToRelative(dx = -1.5f, dy = 2.0f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.0f, y1 = 20.5f)
                horizontalLineToRelative(dx = 14.5f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.6f, dy2 = -0.1f, dx3 = 0.8f, dy3 = -0.4f)
                lineToRelative(dx = 1.5f, dy = -2.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = -1.6f)
                close()
            }
        }.build().also { _solana = it }
    }

@Suppress("ObjectPropertyName")
private var _solana: ImageVector? = null
