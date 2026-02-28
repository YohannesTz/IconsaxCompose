package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tether: ImageVector
    get() {
        val current = _tether
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Tether",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 21.4f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.59f, dy1 = -0.97f)
                lineToRelative(dx = -6.93f, dy = -6.29f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.86f, dy1 = -4.57f)
                lineToRelative(dx = 2.4f, dy = -4.82f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.45f, dy1 = -2.14f)
                horizontalLineToRelative(dx = 9.06f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.45f, dy1 = 2.14f)
                lineToRelative(dx = 2.4f, dy = 4.82f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.86f, dy1 = 4.57f)
                lineToRelative(dx = -6.93f, dy = 6.29f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 21.4f)
                moveTo(x = 7.47f, y = 4.1f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.11f, dy1 = 1.31f)
                lineToRelative(dx = -2.4f, dy = 4.82f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.53f, dy1 = 2.79f)
                lineToRelative(dx = 6.93f, dy = 6.29f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.16f, dy1 = 0.0f)
                lineToRelative(dx = 6.93f, dy = -6.29f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.53f, dy1 = -2.79f)
                lineToRelative(dx = -2.4f, dy = -4.82f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.11f, dy1 = -1.3f)
                horizontalLineTo(x = 7.47f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 15.25f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 6.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 15.25f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 16.0f, y = 9.25f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 7.75f, x2 = 8.0f, y2 = 7.75f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 16.41f, y1 = 9.25f, x2 = 16.0f, y2 = 9.25f)
            }
        }.build().also { _tether = it }
    }

@Suppress("ObjectPropertyName")
private var _tether: ImageVector? = null
