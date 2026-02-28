package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 14.72f, y = 19.0f)
                curveToRelative(dx1 = 0.4f, dy1 = -0.16f, dx2 = 0.86f, dy2 = 0.18f, dx3 = 0.77f, dy3 = 0.6f)
                curveTo(x1 = 15.0f, y1 = 21.5f, x2 = 13.9f, y2 = 22.0f, x3 = 12.55f, y3 = 22.0f)
                horizontalLineToRelative(dx = -1.09f)
                curveToRelative(dx1 = -1.35f, dy1 = 0.0f, dx2 = -2.46f, dy2 = -0.5f, dx3 = -2.94f, dy3 = -2.41f)
                curveToRelative(dx1 = -0.08f, dy1 = -0.42f, dx2 = 0.38f, dy2 = -0.75f, dx3 = 0.77f, dy3 = -0.6f)
                arcToRelative(a = 7.4f, b = 7.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.43f, dy1 = 0.0f)
                close()
                moveToRelative(dx = 0.77f, dy = -14.6f)
                curveToRelative(dx1 = 0.09f, dy1 = 0.42f, dx2 = -0.38f, dy2 = 0.77f, dx3 = -0.78f, dy3 = 0.6f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.7f, dy1 = -0.5f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.72f, dy1 = 0.51f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.16f, dx2 = -0.85f, dy2 = -0.18f, dx3 = -0.77f, dy3 = -0.6f)
                curveTo(x1 = 9.0f, y1 = 2.5f, x2 = 10.11f, y2 = 2.0f, x3 = 11.46f, y3 = 2.0f)
                horizontalLineToRelative(dx = 1.09f)
                curveTo(x1 = 13.9f, y1 = 2.0f, x2 = 15.0f, y2 = 2.5f, x3 = 15.49f, y3 = 4.4f)
                moveTo(x = 12.0f, y = 5.5f)
                arcTo(horizontalEllipseRadius = 6.5f, verticalEllipseRadius = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.5f, y1 = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.1f, dx2 = 0.99f, dy2 = 3.96f, dx3 = 2.53f, dy3 = 5.15f)
                horizontalLineToRelative(dx = 0.01f)
                arcToRelative(a = 6.44f, b = 6.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.95f, dy1 = -0.02f)
                horizontalLineTo(x = 16.0f)
                arcTo(horizontalEllipseRadius = 6.5f, verticalEllipseRadius = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.5f, y1 = 12.0f)
                arcTo(horizontalEllipseRadius = 6.5f, verticalEllipseRadius = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 5.5f)
                moveToRelative(dx = 1.93f, dy = 8.88f)
                quadToRelative(dx1 = -0.24f, dy1 = 0.22f, dx2 = -0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = -0.29f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                lineToRelative(dx = -1.4f, dy = -1.4f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.22f, dy1 = -0.53f)
                verticalLineTo(y = 9.66f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.48f)
                lineToRelative(dx = 1.18f, dy = 1.18f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _wristClock = it }
    }

@Suppress("ObjectPropertyName")
private var _wristClock: ImageVector? = null
