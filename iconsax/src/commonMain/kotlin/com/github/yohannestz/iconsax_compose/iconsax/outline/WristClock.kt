package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WristClock: ImageVector
    get() {
        val current = _wristClock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WristClock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.4f, y = 14.6f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = -1.4f, dy = -1.4f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.22f, dy1 = -0.53f)
                verticalLineTo(y = 9.66f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.48f)
                lineToRelative(dx = 1.18f, dy = 1.18f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 19.25f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.35f, dy1 = -1.45f)
                lineToRelative(dx = -0.08f, dy = -0.05f)
                arcTo(horizontalEllipseRadius = 7.2f, verticalEllipseRadius = 7.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.75f, y1 = 12.0f)
                arcToRelative(a = 7.26f, b = 7.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 14.5f, dy1 = 0.0f)
                arcToRelative(a = 7.2f, b = 7.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.79f, dy1 = 5.72f)
                lineToRelative(dx = -0.08f, dy = 0.06f)
                arcTo(horizontalEllipseRadius = 7.2f, verticalEllipseRadius = 7.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 19.25f)
                moveToRelative(dx = -3.57f, dy = -2.74f)
                lineToRelative(dx = 0.07f, dy = 0.05f)
                arcToRelative(a = 5.8f, b = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.1f, dy1 = -0.07f)
                arcTo(horizontalEllipseRadius = 5.7f, verticalEllipseRadius = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.75f, y1 = 12.0f)
                arcToRelative(a = 5.76f, b = 5.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -9.32f, dy1 = 4.51f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.55f, y = 22.75f)
                horizontalLineToRelative(dx = -1.09f)
                quadToRelative(dx1 = -2.92f, dy1 = 0.02f, dx2 = -3.67f, dy2 = -2.98f)
                lineToRelative(dx = -0.5f, dy = -2.47f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.16f, dy1 = -0.62f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.58f, dy1 = -0.27f)
                horizontalLineToRelative(dx = 0.01f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.46f, dy1 = 0.16f)
                arcToRelative(a = 5.8f, b = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.03f, dy1 = -0.02f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = 0.12f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.16f, dy1 = 0.62f)
                lineToRelative(dx = -0.51f, dy = 2.47f)
                quadToRelative(dx1 = -0.78f, dy1 = 3.01f, dx2 = -3.68f, dy2 = 2.99f)
                moveToRelative(dx = -3.46f, dy = -4.11f)
                lineToRelative(dx = 0.16f, dy = 0.8f)
                curveToRelative(dx1 = 0.38f, dy1 = 1.5f, dx2 = 1.16f, dy2 = 1.81f, dx3 = 2.21f, dy3 = 1.81f)
                horizontalLineToRelative(dx = 1.09f)
                curveToRelative(dx1 = 1.04f, dy1 = 0.0f, dx2 = 1.82f, dy2 = -0.31f, dx3 = 2.21f, dy3 = -1.83f)
                lineToRelative(dx = 0.16f, dy = -0.78f)
                arcToRelative(a = 7.3f, b = 7.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.83f, dy1 = 0.0f)
                moveTo(x = 16.0f, y = 7.62f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.47f, dy1 = -0.16f)
                arcTo(horizontalEllipseRadius = 5.8f, verticalEllipseRadius = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.5f, y1 = 7.44f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.04f, dy1 = -0.11f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.16f, dy1 = -0.62f)
                lineToRelative(dx = 0.49f, dy = -2.44f)
                curveTo(x1 = 8.3f, y1 = 2.22f, x2 = 9.5f, y2 = 1.25f, x3 = 11.46f, y3 = 1.25f)
                horizontalLineToRelative(dx = 1.09f)
                quadToRelative(dx1 = 2.91f, dy1 = -0.01f, dx2 = 3.66f, dy2 = 2.96f)
                lineToRelative(dx = 0.52f, dy = 2.51f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.15f, dy1 = 0.62f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 7.62f)
                moveToRelative(dx = -4.0f, dy = -2.87f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.92f, dy1 = 0.61f)
                lineToRelative(dx = -0.17f, dy = -0.81f)
                curveToRelative(dx1 = -0.39f, dy1 = -1.48f, dx2 = -1.16f, dy2 = -1.8f, dx3 = -2.2f, dy3 = -1.8f)
                horizontalLineToRelative(dx = -1.09f)
                curveToRelative(dx1 = -1.05f, dy1 = 0.0f, dx2 = -1.83f, dy2 = 0.31f, dx3 = -2.21f, dy3 = 1.85f)
                lineTo(x = 9.09f, y = 5.36f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 4.75f)
            }
        }.build().also { _wristClock = it }
    }

@Suppress("ObjectPropertyName")
private var _wristClock: ImageVector? = null
