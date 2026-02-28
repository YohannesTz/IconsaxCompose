package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BagTimer: ImageVector
    get() {
        val current = _bagTimer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BagTimer",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 19.75f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -9.5f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 9.5f)
                moveToRelative(dx = 0.0f, dy = -8.0f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.5f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.0f, y = 16.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = -1.39f)
                lineToRelative(dx = 0.76f, dy = -0.46f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.12f, dy1 = -0.2f)
                verticalLineToRelative(dy = -0.94f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 13.0f, y1 = 13.34f, x2 = 13.0f, y2 = 13.75f)
                verticalLineToRelative(dy = 0.93f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.85f, dy1 = 1.5f)
                lineToRelative(dx = -0.77f, dy = 0.46f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.0f, y1 = 16.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -4.62f, dy1 = 0.0f, dx2 = -5.48f, dy2 = -2.15f, dx3 = -5.7f, dy3 = -4.24f)
                lineToRelative(dx = -0.75f, dy = -5.99f)
                curveToRelative(dx1 = -0.11f, dy1 = -1.08f, dx2 = -0.15f, dy2 = -2.63f, dx3 = 0.9f, dy3 = -3.79f)
                curveToRelative(dx1 = 0.9f, dy1 = -1.0f, dx2 = 2.39f, dy2 = -1.48f, dx3 = 4.55f, dy3 = -1.48f)
                horizontalLineToRelative(dx = 8.0f)
                quadToRelative(dx1 = 3.24f, dy1 = 0.0f, dx2 = 4.55f, dy2 = 1.48f)
                curveToRelative(dx1 = 1.04f, dy1 = 1.16f, dx2 = 1.01f, dy2 = 2.71f, dx3 = 0.9f, dy3 = 3.77f)
                lineToRelative(dx = -0.75f, dy = 6.01f)
                curveToRelative(dx1 = -0.22f, dy1 = 2.09f, dx2 = -1.08f, dy2 = 4.24f, dx3 = -5.7f, dy3 = 4.24f)
                moveToRelative(dx = -7.0f, dy = -14.0f)
                quadToRelative(dx1 = -2.54f, dy1 = 0.0f, dx2 = -3.44f, dy2 = 0.99f)
                curveToRelative(dx1 = -0.49f, dy1 = 0.54f, dx2 = -0.65f, dy2 = 1.37f, dx3 = -0.52f, dy3 = 2.61f)
                lineToRelative(dx = 0.75f, dy = 5.99f)
                curveToRelative(dx1 = 0.17f, dy1 = 1.6f, dx2 = 0.61f, dy2 = 2.92f, dx3 = 4.21f, dy3 = 2.92f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 3.6f, dy1 = 0.0f, dx2 = 4.04f, dy2 = -1.31f, dx3 = 4.21f, dy3 = -2.9f)
                lineToRelative(dx = 0.75f, dy = -6.01f)
                curveToRelative(dx1 = 0.13f, dy1 = -1.22f, dx2 = -0.03f, dy2 = -2.05f, dx3 = -0.52f, dy3 = -2.6f)
                quadToRelative(dx1 = -0.9f, dy1 = -1.0f, dx2 = -3.44f, dy2 = -1.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.5f, y = 8.63f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 6.5f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.23f, dy1 = -2.78f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.89f, dy1 = -0.95f)
                curveTo(x1 = 9.83f, y1 = 2.94f, x2 = 8.25f, y2 = 4.78f, x3 = 8.25f, y3 = 6.7f)
                verticalLineToRelative(dy = 0.97f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 6.75f, y1 = 8.08f, x2 = 6.75f, y2 = 7.67f)
                verticalLineTo(y = 6.69f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.69f, dx2 = 2.17f, dy2 = -5.17f, dx3 = 4.74f, dy3 = -5.42f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.04f, dy1 = 1.34f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.72f, dy1 = 3.89f)
                verticalLineToRelative(dy = 1.38f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
        }.build().also { _bagTimer = it }
    }

@Suppress("ObjectPropertyName")
private var _bagTimer: ImageVector? = null
