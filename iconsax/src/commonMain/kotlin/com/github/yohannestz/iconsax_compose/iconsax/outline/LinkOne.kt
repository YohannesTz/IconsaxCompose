package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LinkOne: ImageVector
    get() {
        val current = _linkOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LinkOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.5f, y = 14.75f)
                horizontalLineTo(x = 10.0f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 9.6f, y1 = 13.25f, x2 = 10.0f, y2 = 13.25f)
                horizontalLineToRelative(dx = 2.5f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -9.5f)
                horizontalLineToRelative(dx = -5.0f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.66f, dy1 = 7.77f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.1f, dy1 = 1.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -0.1f)
                arcTo(horizontalEllipseRadius = 6.2f, verticalEllipseRadius = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.24f, y1 = 8.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.45f, dx2 = 2.8f, dy2 = -6.25f, dx3 = 6.25f, dy3 = -6.25f)
                horizontalLineToRelative(dx = 5.0f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.01f, dy1 = 12.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.5f, y = 21.75f)
                horizontalLineToRelative(dx = -5.0f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -12.5f)
                horizontalLineTo(x = 14.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = -2.5f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 9.5f)
                horizontalLineToRelative(dx = 5.0f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.66f, dy1 = -7.77f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.1f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.1f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.44f, dy1 = 3.98f)
                arcToRelative(a = 6.27f, b = 6.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.26f, dy1 = 6.25f)
            }
        }.build().also { _linkOne = it }
    }

@Suppress("ObjectPropertyName")
private var _linkOne: ImageVector? = null
