package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Discover: ImageVector
    get() {
        val current = _discover
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Discover",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 4.91f, y = 22.82f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.7f, dy1 = -1.03f)
                curveToRelative(dx1 = -0.97f, dy1 = -0.97f, dx2 = -1.27f, dy2 = -2.45f, dx3 = -0.84f, dy3 = -4.17f)
                lineToRelative(dx = 2.48f, dy = -9.93f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.82f, dy1 = -3.82f)
                lineToRelative(dx = 9.93f, dy = -2.48f)
                curveToRelative(dx1 = 1.72f, dy1 = -0.43f, dx2 = 3.2f, dy2 = -0.13f, dx3 = 4.17f, dy3 = 0.84f)
                reflectiveCurveToRelative(dx1 = 1.27f, dy1 = 2.45f, dx2 = 0.84f, dy2 = 4.17f)
                lineToRelative(dx = -2.48f, dy = 9.93f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.82f, dy1 = 3.82f)
                lineToRelative(dx = -9.93f, dy = 2.48f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.47f, dy1 = 0.19f)
                moveTo(x = 17.98f, y = 2.83f)
                lineTo(x = 8.05f, y = 5.32f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.74f, dy1 = 2.73f)
                lineToRelative(dx = -2.48f, dy = 9.93f)
                curveToRelative(dx1 = -0.3f, dy1 = 1.19f, dx2 = -0.14f, dy2 = 2.16f, dx3 = 0.44f, dy3 = 2.75f)
                reflectiveCurveToRelative(dx1 = 1.56f, dy1 = 0.74f, dx2 = 2.75f, dy2 = 0.44f)
                lineToRelative(dx = 9.93f, dy = -2.48f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.73f, dy1 = -2.73f)
                lineToRelative(dx = 2.48f, dy = -9.93f)
                curveToRelative(dx1 = 0.3f, dy1 = -1.19f, dx2 = 0.14f, dy2 = -2.16f, dx3 = -0.44f, dy3 = -2.75f)
                reflectiveCurveToRelative(dx1 = -1.55f, dy1 = -0.74f, dx2 = -2.74f, dy2 = -0.45f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 16.25f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.75f, y1 = 12.0f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 7.75f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.25f, y1 = 12.0f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 16.25f)
                moveToRelative(dx = 0.0f, dy = -7.0f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.5f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.5f)
            }
        }.build().also { _discover = it }
    }

@Suppress("ObjectPropertyName")
private var _discover: ImageVector? = null
