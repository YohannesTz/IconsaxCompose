package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Car: ImageVector
    get() {
        val current = _car
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Car",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.18f, y = 13.66f)
                curveToRelative(dx1 = -0.15f, dy1 = -1.65f, dx2 = -0.59f, dy2 = -3.41f, dx3 = -3.8f, dy3 = -3.41f)
                horizontalLineTo(x = 5.62f)
                curveToRelative(dx1 = -3.2f, dy1 = 0.0f, dx2 = -3.64f, dy2 = 1.76f, dx3 = -3.8f, dy3 = 3.41f)
                lineToRelative(dx = -0.56f, dy = 6.09f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = 2.09f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.08f, dy1 = 0.91f)
                horizontalLineToRelative(dx = 1.88f)
                curveToRelative(dx1 = 1.62f, dy1 = 0.0f, dx2 = 1.93f, dy2 = -0.93f, dx3 = 2.13f, dy3 = -1.54f)
                lineToRelative(dx = 0.2f, dy = -0.6f)
                curveToRelative(dx1 = 0.23f, dy1 = -0.69f, dx2 = 0.3f, dy2 = -0.86f, dx3 = 1.2f, dy3 = -0.86f)
                horizontalLineToRelative(dx = 5.11f)
                curveToRelative(dx1 = 0.9f, dy1 = 0.0f, dx2 = 0.93f, dy2 = 0.1f, dx3 = 1.2f, dy3 = 0.86f)
                lineToRelative(dx = 0.2f, dy = 0.6f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.61f, dx2 = 0.5f, dy2 = 1.54f, dx3 = 2.12f, dy3 = 1.54f)
                horizontalLineToRelative(dx = 1.88f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.08f, dy1 = -0.91f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = -2.09f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.0f, y = 7.25f)
                horizontalLineToRelative(dx = -1.02f)
                lineTo(x = 19.6f, y = 5.44f)
                curveToRelative(dx1 = -0.36f, dy1 = -1.75f, dx2 = -1.11f, dy2 = -3.36f, dx3 = -4.09f, dy3 = -3.36f)
                horizontalLineTo(x = 8.49f)
                curveToRelative(dx1 = -2.98f, dy1 = 0.0f, dx2 = -3.73f, dy2 = 1.6f, dx3 = -4.09f, dy3 = 3.36f)
                lineToRelative(dx = -0.38f, dy = 1.8f)
                horizontalLineTo(x = 3.0f)
                curveTo(x1 = 2.59f, y1 = 7.25f, x2 = 2.25f, y2 = 7.6f, x3 = 2.25f, y3 = 8.0f)
                reflectiveCurveTo(x1 = 2.59f, y1 = 8.75f, x2 = 3.0f, y2 = 8.75f)
                horizontalLineToRelative(dx = 0.71f)
                lineToRelative(dx = -0.42f, dy = 2.0f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.33f, dy1 = -0.5f)
                horizontalLineToRelative(dx = 12.76f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.33f, dy1 = 0.5f)
                lineToRelative(dx = -0.42f, dy = -2.0f)
                horizontalLineTo(x = 21.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 21.41f, y1 = 7.25f, x2 = 21.0f, y2 = 7.25f)
                moveToRelative(dx = -12.0f, dy = 8.5f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.59f, y1 = 14.25f, x2 = 6.0f, y2 = 14.25f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.41f, y1 = 15.75f, x2 = 9.0f, y2 = 15.75f)
                moveToRelative(dx = 9.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _car = it }
    }

@Suppress("ObjectPropertyName")
private var _car: ImageVector? = null
