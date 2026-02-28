package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BrushBig: ImageVector
    get() {
        val current = _brushBig
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BrushBig",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.5f, y = 19.5f)
                verticalLineTo(y = 18.0f)
                horizontalLineToRelative(dx = -5.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.41f, dy1 = -0.59f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.5f, y1 = 16.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.03f, dx2 = 0.8f, dy2 = -1.89f, dx3 = 1.81f, dy3 = -1.99f)
                lineTo(x = 4.5f, y = 14.0f)
                horizontalLineToRelative(dx = 15.0f)
                lineToRelative(dx = 0.19f, dy = 0.01f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.22f, dy1 = 0.58f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.58f, dy1 = 1.59f)
                curveTo(x1 = 21.4f, y1 = 17.23f, x2 = 20.45f, y2 = 18.0f, x3 = 19.39f, y3 = 18.0f)
                horizontalLineTo(x = 14.5f)
                verticalLineToRelative(dy = 1.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = 0.0f)
                moveTo(x = 17.19f, y = 2.0f)
                horizontalLineToRelative(dx = -3.94f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = 0.5f)
                verticalLineTo(y = 4.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 4.75f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.25f, dy1 = -0.05f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = -0.7f)
                verticalLineTo(y = 2.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = -0.5f)
                horizontalLineTo(x = 9.24f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = 0.5f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 7.24f, y1 = 7.41f, x2 = 7.24f, y2 = 7.0f)
                verticalLineTo(y = 2.5f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.77f, y1 = 2.0f)
                horizontalLineTo(x = 6.74f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.91f, dy1 = 3.3f)
                lineToRelative(dx = 0.37f, dy = 6.75f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 0.95f)
                horizontalLineToRelative(dx = 13.6f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -0.95f)
                lineToRelative(dx = 0.37f, dy = -6.75f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.19f, y1 = 2.0f)
            }
        }.build().also { _brushBig = it }
    }

@Suppress("ObjectPropertyName")
private var _brushBig: ImageVector? = null
