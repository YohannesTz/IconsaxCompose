package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaximizeOne: ImageVector
    get() {
        val current = _maximizeOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MaximizeOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.0f, y = 16.15f)
                verticalLineToRelative(dy = 2.7f)
                curveTo(x1 = 11.0f, y1 = 21.1f, x2 = 10.1f, y2 = 22.0f, x3 = 7.85f, y3 = 22.0f)
                horizontalLineToRelative(dx = -2.7f)
                curveTo(x1 = 2.9f, y1 = 22.0f, x2 = 2.0f, y2 = 21.1f, x3 = 2.0f, y3 = 18.85f)
                verticalLineToRelative(dy = -2.7f)
                curveTo(x1 = 2.0f, y1 = 13.9f, x2 = 2.9f, y2 = 13.0f, x3 = 5.15f, y3 = 13.0f)
                horizontalLineToRelative(dx = 2.7f)
                curveTo(x1 = 10.1f, y1 = 13.0f, x2 = 11.0f, y2 = 13.9f, x3 = 11.0f, y3 = 16.15f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.48f, y = 2.0f)
                horizontalLineTo(x = 8.52f)
                arcTo(horizontalEllipseRadius = 5.5f, verticalEllipseRadius = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.0f, y1 = 7.52f)
                verticalLineToRelative(dy = 2.98f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 4.5f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.0f, dy1 = 4.0f)
                verticalLineTo(y = 20.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 2.98f)
                curveToRelative(dx1 = 3.45f, dy1 = 0.0f, dx2 = 5.52f, dy2 = -2.06f, dx3 = 5.52f, dy3 = -5.52f)
                verticalLineTo(y = 7.52f)
                arcTo(horizontalEllipseRadius = 5.5f, verticalEllipseRadius = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.48f, y1 = 2.0f)
                moveToRelative(dx = 2.28f, dy = 7.99f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -2.2f)
                lineToRelative(dx = -3.73f, dy = 3.74f)
                quadTo(x1 = 13.3f, y1 = 11.75f, x2 = 13.0f, y2 = 11.75f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 3.73f, dy = -3.75f)
                horizontalLineTo(x = 14.0f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.0f, y1 = 5.22f)
                horizontalLineToRelative(dx = 4.01f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.26f, dy1 = 0.06f)
                lineToRelative(dx = 0.07f, dy = 0.03f)
                lineToRelative(dx = 0.16f, dy = 0.11f)
                lineToRelative(dx = 0.06f, dy = 0.05f)
                lineToRelative(dx = 0.13f, dy = 0.19f)
                lineToRelative(dx = 0.01f, dy = 0.03f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.05f, dy1 = 0.26f)
                lineToRelative(dx = 0.01f, dy = 0.02f)
                close()
            }
        }.build().also { _maximizeOne = it }
    }

@Suppress("ObjectPropertyName")
private var _maximizeOne: ImageVector? = null
