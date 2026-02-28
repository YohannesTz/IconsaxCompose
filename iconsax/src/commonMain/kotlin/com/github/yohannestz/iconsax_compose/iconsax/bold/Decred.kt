package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Decred: ImageVector
    get() {
        val current = _decred
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Decred",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 5.65f, y = 7.65f)
                lineToRelative(dx = -2.8f, dy = -2.8f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.2f, y1 = 4.0f)
                horizontalLineToRelative(dx = 3.59f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.35f, dy1 = 0.15f)
                lineToRelative(dx = 5.0f, dy = 5.0f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.79f, y1 = 10.0f)
                horizontalLineTo(x = 8.5f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 7.0f)
                horizontalLineTo(x = 10.0f)
                lineToRelative(dx = 2.15f, dy = 2.15f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.8f, y1 = 20.0f)
                horizontalLineTo(x = 8.51f)
                arcTo(horizontalEllipseRadius = 6.5f, verticalEllipseRadius = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.48f, y1 = 7.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 18.35f, y = 16.35f)
                lineToRelative(dx = 2.8f, dy = 2.8f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.8f, y1 = 20.0f)
                horizontalLineToRelative(dx = -3.59f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.35f, dy1 = -0.15f)
                lineToRelative(dx = -5.0f, dy = -5.0f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.21f, y1 = 14.0f)
                horizontalLineToRelative(dx = 3.29f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -7.0f)
                horizontalLineTo(x = 14.0f)
                lineToRelative(dx = -2.15f, dy = -2.15f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.2f, y1 = 4.0f)
                horizontalLineToRelative(dx = 3.29f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.03f, dy1 = 12.25f)
                close()
            }
        }.build().also { _decred = it }
    }

@Suppress("ObjectPropertyName")
private var _decred: ImageVector? = null
