package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Building: ImageVector
    get() {
        val current = _building
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Building",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.5f, y = 22.75f)
                horizontalLineTo(x = 4.08f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.86f, dy1 = -2.82f)
                verticalLineTo(y = 5.09f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.53f, dx2 = 0.57f, dy2 = -2.72f, dx3 = 1.61f, dy3 = -3.37f)
                curveToRelative(dx1 = 1.05f, dy1 = -0.66f, dx2 = 2.41f, dy2 = -0.64f, dx3 = 3.82f, dy3 = 0.06f)
                lineToRelative(dx = 4.44f, dy = 2.18f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.16f, dy1 = 3.45f)
                verticalLineTo(y = 22.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = -7.94f, dy = -20.0f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.62f, y1 = 3.0f)
                curveToRelative(dx1 = -0.58f, dy1 = 0.36f, dx2 = -0.9f, dy2 = 1.1f, dx3 = -0.9f, dy3 = 2.09f)
                verticalLineToRelative(dy = 14.84f)
                arcToRelative(a = 1.34f, b = 1.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.36f, dy1 = 1.32f)
                horizontalLineToRelative(dx = 7.67f)
                verticalLineTo(y = 7.4f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.33f, dy1 = -2.1f)
                lineTo(x = 5.98f, y = 3.13f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.42f, dy1 = -0.38f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.81f, y = 22.75f)
                horizontalLineTo(x = 12.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.75f, y1 = 22.0f)
                verticalLineTo(y = 10.42f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.36f, dx2 = 0.28f, dy2 = -0.58f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.63f, dy1 = -0.15f)
                lineToRelative(dx = 0.47f, dy = 0.1f)
                lineToRelative(dx = 6.54f, dy = 1.46f)
                curveToRelative(dx1 = 1.99f, dy1 = 0.44f, dx2 = 2.99f, dy2 = 1.61f, dx3 = 3.05f, dy3 = 3.6f)
                lineToRelative(dx = 0.01f, dy = 0.21f)
                verticalLineToRelative(dy = 3.78f)
                curveToRelative(dx1 = -0.01f, dy1 = 2.56f, dx2 = -1.36f, dy2 = 3.91f, dx3 = -3.92f, dy3 = 3.91f)
                moveToRelative(dx = -5.56f, dy = -1.5f)
                horizontalLineToRelative(dx = 5.56f)
                curveToRelative(dx1 = 1.76f, dy1 = 0.0f, dx2 = 2.41f, dy2 = -0.65f, dx3 = 2.41f, dy3 = -2.41f)
                verticalLineToRelative(dy = -3.86f)
                curveToRelative(dx1 = -0.05f, dy1 = -1.37f, dx2 = -0.57f, dy2 = -1.98f, dx3 = -1.88f, dy3 = -2.27f)
                lineToRelative(dx = -6.09f, dy = -1.36f)
                close()
                moveTo(x = 8.97f, y = 9.75f)
                horizontalLineTo(x = 5.5f)
                curveTo(x1 = 5.09f, y1 = 9.75f, x2 = 4.75f, y2 = 9.41f, x3 = 4.75f, y3 = 9.0f)
                reflectiveCurveTo(x1 = 5.09f, y1 = 8.25f, x2 = 5.5f, y2 = 8.25f)
                horizontalLineToRelative(dx = 3.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = 0.0f, dy = 4.0f)
                horizontalLineTo(x = 5.5f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.22f, y = 17.75f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = -3.0f)
                verticalLineToRelative(dy = -4.23f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.36f, dx2 = 0.28f, dy2 = -0.59f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.63f, dy1 = -0.15f)
                lineToRelative(dx = 4.5f, dy = 1.01f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.59f, dy1 = 0.73f)
                verticalLineToRelative(dy = 3.22f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 3.01f)
                moveToRelative(dx = -1.5f, dy = -6.29f)
                verticalLineToRelative(dy = 3.29f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.0f, dy1 = 0.0f)
                verticalLineToRelative(dy = -2.62f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.72f, y = 17.75f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = -3.0f)
                verticalLineToRelative(dy = -3.22f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.36f, dx2 = 0.28f, dy2 = -0.58f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.63f, dy1 = -0.15f)
                lineToRelative(dx = 2.03f, dy = 0.45f)
                curveToRelative(dx1 = 1.99f, dy1 = 0.44f, dx2 = 2.99f, dy2 = 1.6f, dx3 = 3.05f, dy3 = 3.6f)
                verticalLineToRelative(dy = 0.06f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.99f, dy1 = 2.84f)
                moveToRelative(dx = -1.5f, dy = -5.3f)
                verticalLineToRelative(dy = 2.3f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.99f, dy1 = 0.1f)
                curveToRelative(dx1 = -0.05f, dy1 = -1.25f, dx2 = -0.57f, dy2 = -1.85f, dx3 = -1.87f, dy3 = -2.14f)
                close()
            }
        }.build().also { _building = it }
    }

@Suppress("ObjectPropertyName")
private var _building: ImageVector? = null
