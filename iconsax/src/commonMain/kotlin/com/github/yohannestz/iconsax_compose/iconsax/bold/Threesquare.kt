package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Threesquare: ImageVector
    get() {
        val current = _threesquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Threesquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 18.5f)
                verticalLineToRelative(dy = 0.88f)
                curveTo(x1 = 12.0f, y1 = 21.25f, x2 = 11.25f, y2 = 22.0f, x3 = 9.37f, y3 = 22.0f)
                horizontalLineTo(x = 4.62f)
                arcTo(horizontalEllipseRadius = 2.6f, verticalEllipseRadius = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 19.38f)
                verticalLineToRelative(dy = -4.75f)
                curveTo(x1 = 2.0f, y1 = 12.75f, x2 = 2.75f, y2 = 12.0f, x3 = 4.62f, y3 = 12.0f)
                horizontalLineTo(x = 5.5f)
                verticalLineToRelative(dy = 3.5f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 13.5f)
                verticalLineToRelative(dy = 0.87f)
                arcTo(horizontalEllipseRadius = 2.63f, verticalEllipseRadius = 2.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.37f, y1 = 17.0f)
                horizontalLineTo(x = 9.62f)
                curveTo(x1 = 7.75f, y1 = 17.0f, x2 = 7.0f, y2 = 16.25f, x3 = 7.0f, y3 = 14.37f)
                verticalLineTo(y = 9.62f)
                arcTo(horizontalEllipseRadius = 2.6f, verticalEllipseRadius = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.62f, y1 = 7.0f)
                horizontalLineToRelative(dx = 0.88f)
                verticalLineToRelative(dy = 3.5f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 4.62f)
                verticalLineToRelative(dy = 4.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.88f, dx2 = -0.75f, dy2 = 2.63f, dx3 = -2.63f, dy3 = 2.63f)
                horizontalLineToRelative(dx = -4.75f)
                curveTo(x1 = 12.75f, y1 = 12.0f, x2 = 12.0f, y2 = 11.25f, x3 = 12.0f, y3 = 9.37f)
                verticalLineTo(y = 4.62f)
                curveTo(x1 = 12.0f, y1 = 2.75f, x2 = 12.75f, y2 = 2.0f, x3 = 14.62f, y3 = 2.0f)
                horizontalLineToRelative(dx = 4.75f)
                curveTo(x1 = 21.25f, y1 = 2.0f, x2 = 22.0f, y2 = 2.75f, x3 = 22.0f, y3 = 4.62f)
            }
        }.build().also { _threesquare = it }
    }

@Suppress("ObjectPropertyName")
private var _threesquare: ImageVector? = null
