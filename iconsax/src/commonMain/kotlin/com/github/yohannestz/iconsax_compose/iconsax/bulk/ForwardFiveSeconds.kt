package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ForwardFiveSeconds: ImageVector
    get() {
        val current = _forwardFiveSeconds
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ForwardFiveSeconds",
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
                moveTo(x = 19.48f, y = 7.09f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -1.16f, dy1 = 0.94f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.82f, dy1 = 4.8f)
                arcToRelative(a = 8.13f, b = 8.13f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -6.59f, dy1 = -7.7f)
                quadToRelative(dx1 = 0.06f, dy1 = 0.01f, dx2 = 0.12f, dy2 = 0.0f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.0f, y1 = 5.23f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.47f, dy1 = -0.17f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.59f, y1 = 4.0f)
                lineToRelative(dx = -1.98f, dy = -2.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.05f, dy1 = -0.12f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.12f, dy1 = 1.05f)
                lineToRelative(dx = 0.83f, dy = 1.03f)
                lineToRelative(dx = -0.58f, dy = -0.01f)
                arcToRelative(a = 9.64f, b = 9.64f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 9.97f, dy1 = 9.29f)
                arcToRelative(a = 9.7f, b = 9.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.18f, dy1 = -5.68f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.38f, y = 16.92f)
                horizontalLineToRelative(dx = -2.29f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 2.29f)
                arcToRelative(a = 0.78f, b = 0.78f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.56f)
                horizontalLineToRelative(dx = -2.29f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = -0.31f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.1f, dy1 = -0.68f)
                lineToRelative(dx = 0.76f, dy = -2.29f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.71f, dy1 = -0.51f)
                horizontalLineToRelative(dx = 3.06f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = -2.52f)
                lineToRelative(dx = -0.26f, dy = 0.79f)
                horizontalLineToRelative(dx = 1.25f)
                arcToRelative(a = 2.28f, b = 2.28f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.56f)
            }
        }.build().also { _forwardFiveSeconds = it }
    }

@Suppress("ObjectPropertyName")
private var _forwardFiveSeconds: ImageVector? = null
