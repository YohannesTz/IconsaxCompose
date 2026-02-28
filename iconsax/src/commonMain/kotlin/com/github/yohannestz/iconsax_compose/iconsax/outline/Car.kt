package com.github.yohannestz.iconsax_compose.iconsax.outline

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
            ) {
                moveTo(x = 20.0f, y = 11.75f)
                horizontalLineTo(x = 4.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = -0.28f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.15f, dy1 = -0.63f)
                lineToRelative(dx = 1.13f, dy = -5.4f)
                curveToRelative(dx1 = 0.37f, dy1 = -1.75f, dx2 = 1.12f, dy2 = -3.36f, dx3 = 4.1f, dy3 = -3.36f)
                horizontalLineToRelative(dx = 7.02f)
                curveToRelative(dx1 = 2.97f, dy1 = 0.0f, dx2 = 3.72f, dy2 = 1.62f, dx3 = 4.1f, dy3 = 3.36f)
                lineToRelative(dx = 1.12f, dy = 5.4f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.15f, dy1 = 0.64f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.59f, dy1 = 0.27f)
                moveToRelative(dx = -15.08f, dy = -1.5f)
                horizontalLineToRelative(dx = 14.15f)
                lineToRelative(dx = -0.94f, dy = -4.5f)
                curveToRelative(dx1 = -0.28f, dy1 = -1.31f, dx2 = -0.6f, dy2 = -2.17f, dx3 = -2.62f, dy3 = -2.17f)
                horizontalLineTo(x = 8.5f)
                curveToRelative(dx1 = -2.0f, dy1 = 0.0f, dx2 = -2.34f, dy2 = 0.86f, dx3 = -2.62f, dy3 = 2.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.96f, y = 22.75f)
                horizontalLineToRelative(dx = -1.88f)
                curveToRelative(dx1 = -1.62f, dy1 = 0.0f, dx2 = -1.93f, dy2 = -0.93f, dx3 = -2.13f, dy3 = -1.54f)
                lineToRelative(dx = -0.2f, dy = -0.6f)
                curveToRelative(dx1 = -0.26f, dy1 = -0.76f, dx2 = -0.29f, dy2 = -0.86f, dx3 = -1.19f, dy3 = -0.86f)
                horizontalLineTo(x = 9.44f)
                curveToRelative(dx1 = -0.9f, dy1 = 0.0f, dx2 = -0.96f, dy2 = 0.17f, dx3 = -1.19f, dy3 = 0.86f)
                lineToRelative(dx = -0.2f, dy = 0.6f)
                curveToRelative(dx1 = -0.2f, dy1 = 0.62f, dx2 = -0.5f, dy2 = 1.54f, dx3 = -2.13f, dy3 = 1.54f)
                horizontalLineTo(x = 4.04f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.08f, dy1 = -0.91f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.7f, dy1 = -2.09f)
                lineToRelative(dx = 0.56f, dy = -6.09f)
                curveToRelative(dx1 = 0.15f, dy1 = -1.65f, dx2 = 0.6f, dy2 = -3.41f, dx3 = 3.8f, dy3 = -3.41f)
                horizontalLineToRelative(dx = 12.76f)
                curveToRelative(dx1 = 3.21f, dy1 = 0.0f, dx2 = 3.64f, dy2 = 1.76f, dx3 = 3.8f, dy3 = 3.41f)
                lineToRelative(dx = 0.56f, dy = 6.09f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.7f, dy1 = 2.09f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.08f, dy1 = 0.91f)
                moveToRelative(dx = -10.52f, dy = -4.5f)
                horizontalLineToRelative(dx = 5.12f)
                curveToRelative(dx1 = 1.82f, dy1 = 0.0f, dx2 = 2.25f, dy2 = 0.81f, dx3 = 2.61f, dy3 = 1.87f)
                lineToRelative(dx = 0.21f, dy = 0.62f)
                curveToRelative(dx1 = 0.17f, dy1 = 0.51f, dx2 = 0.17f, dy2 = 0.52f, dx3 = 0.71f, dy3 = 0.52f)
                horizontalLineToRelative(dx = 1.88f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.97f, dy1 = -0.42f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.32f, dy1 = -0.94f)
                lineToRelative(dx = -0.56f, dy = -6.09f)
                curveToRelative(dx1 = -0.13f, dy1 = -1.35f, dx2 = -0.29f, dy2 = -2.05f, dx3 = -2.3f, dy3 = -2.05f)
                horizontalLineTo(x = 5.62f)
                curveToRelative(dx1 = -2.02f, dy1 = 0.0f, dx2 = -2.18f, dy2 = 0.7f, dx3 = -2.3f, dy3 = 2.05f)
                lineTo(x = 2.76f, y = 19.9f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.32f, dy1 = 0.94f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.97f, dy1 = 0.42f)
                horizontalLineToRelative(dx = 1.88f)
                curveToRelative(dx1 = 0.54f, dy1 = 0.0f, dx2 = 0.54f, dy2 = -0.01f, dx3 = 0.71f, dy3 = -0.51f)
                lineToRelative(dx = 0.2f, dy = -0.61f)
                curveToRelative(dx1 = 0.25f, dy1 = -0.8f, dx2 = 0.62f, dy2 = -1.89f, dx3 = 2.6f, dy3 = -1.89f)
                moveTo(x = 4.0f, y = 8.75f)
                horizontalLineTo(x = 3.0f)
                curveTo(x1 = 2.59f, y1 = 8.75f, x2 = 2.25f, y2 = 8.41f, x3 = 2.25f, y3 = 8.0f)
                reflectiveCurveTo(x1 = 2.59f, y1 = 7.25f, x2 = 3.0f, y2 = 7.25f)
                horizontalLineToRelative(dx = 1.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 4.41f, y1 = 8.75f, x2 = 4.0f, y2 = 8.75f)
                moveToRelative(dx = 17.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -1.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 19.59f, y1 = 7.25f, x2 = 20.0f, y2 = 7.25f)
                horizontalLineToRelative(dx = 1.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 21.41f, y1 = 8.75f, x2 = 21.0f, y2 = 8.75f)
                moveToRelative(dx = -9.0f, dy = -3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 5.0f)
                verticalLineTo(y = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 2.59f, x2 = 12.75f, y2 = 3.0f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 5.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.5f, y = 5.75f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -4.5f, dy = 10.0f)
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
