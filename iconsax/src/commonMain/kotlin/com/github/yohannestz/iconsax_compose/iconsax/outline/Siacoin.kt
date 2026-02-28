package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Siacoin: ImageVector
    get() {
        val current = _siacoin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Siacoin",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 10.76f, verticalEllipseRadius = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.14f, y1 = 7.72f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.99f, dy1 = -0.39f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.39f, dy1 = 0.99f)
                arcToRelative(a = 9.25f, b = 9.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 4.77f, dy1 = -4.79f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = -1.37f)
                arcTo(horizontalEllipseRadius = 10.76f, verticalEllipseRadius = 10.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 16.0f, y = 17.0f)
                horizontalLineToRelative(dx = -4.25f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 5.0f, dy1 = -5.0f)
                verticalLineToRelative(dy = 4.25f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 17.0f)
                moveToRelative(dx = -4.25f, dy = -8.5f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 7.0f)
                horizontalLineToRelative(dx = 3.5f)
                verticalLineTo(y = 12.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.5f, dy1 = -3.5f)
                moveTo(x = 5.0f, y = 7.25f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.5f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                curveTo(x1 = 4.59f, y1 = 4.25f, x2 = 4.25f, y2 = 4.59f, x3 = 4.25f, y3 = 5.0f)
                reflectiveCurveTo(x1 = 4.59f, y1 = 5.75f, x2 = 5.0f, y2 = 5.75f)
                reflectiveCurveTo(x1 = 5.75f, y1 = 5.41f, x2 = 5.75f, y2 = 5.0f)
                reflectiveCurveTo(x1 = 5.41f, y1 = 4.25f, x2 = 5.0f, y2 = 4.25f)
            }
        }.build().also { _siacoin = it }
    }

@Suppress("ObjectPropertyName")
private var _siacoin: ImageVector? = null
