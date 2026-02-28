package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Be: ImageVector
    get() {
        val current = _be
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Be",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 9.0f, y = 18.75f)
                horizontalLineTo(x = 3.0f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.25f, y1 = 17.0f)
                verticalLineTo(y = 7.0f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.0f, y1 = 5.25f)
                horizontalLineToRelative(dx = 5.0f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.66f, dy1 = 6.39f)
                arcTo(horizontalEllipseRadius = 3.74f, verticalEllipseRadius = 3.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 18.75f)
                moveToRelative(dx = -6.25f, dy = -6.0f)
                verticalLineTo(y = 17.0f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.0f, y1 = 17.25f)
                horizontalLineToRelative(dx = 6.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.5f)
                close()
                moveToRelative(dx = 0.0f, dy = -1.5f)
                horizontalLineTo(x = 8.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.5f)
                horizontalLineTo(x = 3.0f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.75f, y1 = 7.0f)
                close()
                moveToRelative(dx = 16.92f, dy = 7.5f)
                horizontalLineTo(x = 18.0f)
                arcTo(horizontalEllipseRadius = 4.75f, verticalEllipseRadius = 4.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 22.75f, y1 = 14.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 14.75f)
                horizontalLineToRelative(dx = -7.16f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.16f, dy1 = 2.5f)
                horizontalLineToRelative(dx = 1.67f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -4.83f, dy = -5.5f)
                horizontalLineToRelative(dx = 6.33f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.16f, dy1 = -2.5f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.17f, dy1 = 2.5f)
                moveToRelative(dx = 4.66f, dy = -5.0f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _be = it }
    }

@Suppress("ObjectPropertyName")
private var _be: ImageVector? = null
