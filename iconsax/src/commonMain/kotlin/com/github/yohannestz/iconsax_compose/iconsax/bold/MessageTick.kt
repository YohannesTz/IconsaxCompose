package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageTick: ImageVector
    get() {
        val current = _messageTick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageTick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.0f, y = 13.5f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.42f, dy1 = 6.06f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.0f, y1 = 21.5f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.42f, dy1 = -1.94f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.0f, y1 = 13.5f)
                moveToRelative(dx = 1.97f, dy = 3.67f)
                lineToRelative(dx = -2.13f, dy = 1.97f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = 0.2f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = -0.99f, dy = -0.99f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 0.48f, dy = 0.48f)
                lineToRelative(dx = 1.6f, dy = -1.48f)
                curveToRelative(dx1 = 0.3f, dy1 = -0.28f, dx2 = 0.78f, dy2 = -0.26f, dx3 = 1.06f, dy3 = 0.04f)
                reflectiveCurveToRelative(dx1 = 0.26f, dy1 = 0.78f, dx2 = -0.04f, dy2 = 1.06f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.25f, y = 2.43f)
                horizontalLineToRelative(dx = -9.5f)
                curveTo(x1 = 4.9f, y1 = 2.43f, x2 = 3.0f, y2 = 4.33f, x3 = 3.0f, y3 = 7.18f)
                verticalLineToRelative(dy = 4.46f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.35f, dx2 = 0.36f, dy2 = 0.6f, dx3 = 0.7f, dy3 = 0.51f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 12.0f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.48f, dy1 = 5.13f)
                arcToRelative(a = 0.53f, b = 0.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.52f, dy1 = 0.5f)
                horizontalLineToRelative(dx = 0.55f)
                lineToRelative(dx = 4.23f, dy = 2.82f)
                curveToRelative(dx1 = 0.62f, dy1 = 0.42f, dx2 = 1.47f, dy2 = -0.04f, dx3 = 1.47f, dy3 = -0.8f)
                verticalLineToRelative(dy = -2.02f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.44f, dy1 = -1.3f)
                arcTo(horizontalEllipseRadius = 4.8f, verticalEllipseRadius = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 12.88f)
                verticalLineToRelative(dy = -5.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.85f, dx2 = -1.9f, dy2 = -4.75f, dx3 = -4.75f, dy3 = -4.75f)
                moveToRelative(dx = -1.42f, dy = 8.38f)
                horizontalLineTo(x = 9.17f)
                arcToRelative(a = 0.72f, b = 0.72f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.43f)
                horizontalLineToRelative(dx = 6.66f)
                arcToRelative(a = 0.72f, b = 0.72f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.43f)
            }
        }.build().also { _messageTick = it }
    }

@Suppress("ObjectPropertyName")
private var _messageTick: ImageVector? = null
