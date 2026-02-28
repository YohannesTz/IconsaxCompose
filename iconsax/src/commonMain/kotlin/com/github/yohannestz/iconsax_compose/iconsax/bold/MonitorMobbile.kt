package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MonitorMobbile: ImageVector
    get() {
        val current = _monitorMobbile
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MonitorMobbile",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.99f, y = 9.71f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.35f, dy1 = -0.21f)
                horizontalLineToRelative(dx = -5.28f)
                curveToRelative(dx1 = -1.74f, dy1 = 0.0f, dx2 = -2.36f, dy2 = 0.62f, dx3 = -2.36f, dy3 = 2.38f)
                verticalLineToRelative(dy = 7.74f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.22f, y1 = 21.0f)
                curveToRelative(dx1 = 0.31f, dy1 = 0.72f, dx2 = 0.97f, dy2 = 1.0f, dx3 = 2.14f, dy3 = 1.0f)
                horizontalLineToRelative(dx = 5.28f)
                curveToRelative(dx1 = 1.74f, dy1 = 0.0f, dx2 = 2.36f, dy2 = -0.63f, dx3 = 2.36f, dy3 = -2.38f)
                verticalLineToRelative(dy = -7.74f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.19f, dx2 = -0.28f, dy2 = -1.86f, dx3 = -1.01f, dy3 = -2.17f)
                moveTo(x = 18.0f, y = 19.75f)
                horizontalLineToRelative(dx = -2.0f)
                lineToRelative(dx = -0.07f, dy = -0.01f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.39f, dy1 = -0.16f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = -0.58f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = -0.75f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.99f, y = 6.19f)
                verticalLineTo(y = 7.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = -5.63f)
                quadToRelative(dx1 = -3.85f, dy1 = 0.01f, dx2 = -3.86f, dy2 = 3.88f)
                verticalLineTo(y = 21.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = 1.0f)
                horizontalLineTo(x = 7.55f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.42f)
                horizontalLineTo(x = 9.5f)
                verticalLineToRelative(dy = -3.83f)
                horizontalLineTo(x = 6.0f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.99f, dy1 = -4.19f)
                verticalLineTo(y = 6.19f)
                arcTo(horizontalEllipseRadius = 4.2f, verticalEllipseRadius = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.21f, y1 = 2.0f)
                horizontalLineTo(x = 16.8f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.19f, dy1 = 4.19f)
            }
        }.build().also { _monitorMobbile = it }
    }

@Suppress("ObjectPropertyName")
private var _monitorMobbile: ImageVector? = null
