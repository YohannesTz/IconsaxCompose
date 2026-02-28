package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Triangle: ImageVector
    get() {
        val current = _triangle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Triangle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.06f, y = 22.16f)
                horizontalLineTo(x = 5.94f)
                curveToRelative(dx1 = -1.95f, dy1 = 0.0f, dx2 = -3.44f, dy2 = -0.71f, dx3 = -4.2f, dy3 = -1.99f)
                curveToRelative(dx1 = -0.75f, dy1 = -1.28f, dx2 = -0.65f, dy2 = -2.93f, dx3 = 0.3f, dy3 = -4.63f)
                lineTo(x = 8.1f, y = 4.63f)
                curveToRelative(dx1 = 1.0f, dy1 = -1.8f, dx2 = 2.38f, dy2 = -2.79f, dx3 = 3.9f, dy3 = -2.79f)
                reflectiveCurveToRelative(dx1 = 2.9f, dy1 = 0.99f, dx2 = 3.9f, dy2 = 2.79f)
                lineToRelative(dx = 6.06f, dy = 10.91f)
                curveToRelative(dx1 = 0.95f, dy1 = 1.71f, dx2 = 1.06f, dy2 = 3.35f, dx3 = 0.3f, dy3 = 4.63f)
                reflectiveCurveToRelative(dx1 = -2.25f, dy1 = 1.99f, dx2 = -4.2f, dy2 = 1.99f)
                moveTo(x = 12.0f, y = 3.34f)
                curveToRelative(dx1 = -0.94f, dy1 = 0.0f, dx2 = -1.86f, dy2 = 0.72f, dx3 = -2.59f, dy3 = 2.02f)
                lineTo(x = 3.36f, y = 16.27f)
                curveToRelative(dx1 = -0.68f, dy1 = 1.22f, dx2 = -0.79f, dy2 = 2.34f, dx3 = -0.32f, dy3 = 3.15f)
                curveToRelative(dx1 = 0.47f, dy1 = 0.8f, dx2 = 1.51f, dy2 = 1.25f, dx3 = 2.91f, dy3 = 1.25f)
                horizontalLineToRelative(dx = 12.12f)
                curveToRelative(dx1 = 1.4f, dy1 = 0.0f, dx2 = 2.43f, dy2 = -0.44f, dx3 = 2.91f, dy3 = -1.25f)
                curveToRelative(dx1 = 0.47f, dy1 = -0.81f, dx2 = 0.36f, dy2 = -1.92f, dx3 = -0.32f, dy3 = -3.15f)
                lineTo(x = 14.59f, y = 5.36f)
                curveToRelative(dx1 = -0.73f, dy1 = -1.3f, dx2 = -1.65f, dy2 = -2.02f, dx3 = -2.59f, dy3 = -2.02f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.44f, y = 20.75f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.43f, dy1 = -0.14f)
                lineTo(x = 12.0f, y = 14.3f)
                lineToRelative(dx = -9.01f, dy = 6.31f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.04f, dy1 = -0.18f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.18f, dy1 = -1.04f)
                lineToRelative(dx = 9.44f, dy = -6.61f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.86f, dy1 = 0.0f)
                lineToRelative(dx = 9.44f, dy = 6.61f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.18f, dy1 = 1.04f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = 0.32f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 14.14f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 2.59f, x2 = 12.75f, y2 = 3.0f)
                verticalLineToRelative(dy = 10.39f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 14.14f)
            }
        }.build().also { _triangle = it }
    }

@Suppress("ObjectPropertyName")
private var _triangle: ImageVector? = null
