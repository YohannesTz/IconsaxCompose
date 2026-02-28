package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeviceMessage: ImageVector
    get() {
        val current = _deviceMessage
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DeviceMessage",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.0f, y = 12.2f)
                verticalLineToRelative(dy = 1.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.15f, dx2 = -1.8f, dy2 = 4.5f, dx3 = -4.5f, dy3 = 4.5f)
                horizontalLineToRelative(dx = -9.0f)
                curveToRelative(dx1 = -2.7f, dy1 = 0.0f, dx2 = -4.5f, dy2 = -1.35f, dx3 = -4.5f, dy3 = -4.5f)
                verticalLineTo(y = 8.5f)
                curveTo(x1 = 2.0f, y1 = 5.35f, x2 = 3.8f, y2 = 4.0f, x3 = 6.5f, y3 = 4.0f)
                horizontalLineToRelative(dx = 2.7f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 5.25f)
                verticalLineToRelative(dy = 3.9f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.89f, dy1 = 2.36f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.36f, dy1 = 0.89f)
                verticalLineToRelative(dy = 1.39f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.01f, dy1 = 0.54f)
                lineToRelative(dx = 2.89f, dy = -1.93f)
                horizontalLineToRelative(dx = 2.6f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 20.0f, y1 = 12.2f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 5.25f)
                verticalLineToRelative(dy = 3.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.49f, dx2 = -0.76f, dy2 = 2.61f, dx3 = -2.0f, dy3 = 3.05f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.25f, dy1 = 0.2f)
                horizontalLineToRelative(dx = -2.6f)
                lineToRelative(dx = -2.89f, dy = 1.93f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = -0.54f)
                verticalLineTo(y = 12.4f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.36f, dy1 = -0.89f)
                arcTo(horizontalEllipseRadius = 3.3f, verticalEllipseRadius = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 9.15f)
                verticalLineToRelative(dy = -3.9f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.2f, y1 = 4.0f)
                curveToRelative(dx1 = 0.44f, dy1 = -1.24f, dx2 = 1.56f, dy2 = -2.0f, dx3 = 3.05f, dy3 = -2.0f)
                horizontalLineToRelative(dx = 6.5f)
                curveTo(x1 = 20.7f, y1 = 2.0f, x2 = 22.0f, y2 = 3.3f, x3 = 22.0f, y3 = 5.25f)
                moveToRelative(dx = -7.4f, dy = 16.0f)
                horizontalLineToRelative(dx = -2.85f)
                verticalLineTo(y = 18.4f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = 0.34f, dx2 = -0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.85f)
                horizontalLineTo(x = 7.4f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = 0.75f, dx2 = 0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = 7.2f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 15.0f, y1 = 21.25f, x2 = 14.6f, y2 = 21.25f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.44f, y = 8.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = 2.81f, dy = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = -5.63f, dy = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _deviceMessage = it }
    }

@Suppress("ObjectPropertyName")
private var _deviceMessage: ImageVector? = null
