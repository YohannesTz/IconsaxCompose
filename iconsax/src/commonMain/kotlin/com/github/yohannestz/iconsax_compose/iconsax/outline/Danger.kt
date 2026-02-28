package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Danger: ImageVector
    get() {
        val current = _danger
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Danger",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 14.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 14.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 8.59f, x2 = 12.75f, y2 = 9.0f)
                verticalLineToRelative(dy = 5.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 14.75f)
                moveTo(x = 12.0f, y = 18.0f)
                lineToRelative(dx = -0.2f, dy = -0.02f)
                lineToRelative(dx = -0.18f, dy = -0.06f)
                lineToRelative(dx = -0.18f, dy = -0.1f)
                lineToRelative(dx = -0.15f, dy = -0.11f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.0f, y1 = 17.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = -0.71f)
                lineToRelative(dx = 0.15f, dy = -0.12f)
                lineToRelative(dx = 0.18f, dy = -0.1f)
                lineToRelative(dx = 0.18f, dy = -0.05f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.39f, dy1 = 0.0f)
                lineToRelative(dx = 0.19f, dy = 0.06f)
                lineToRelative(dx = 0.18f, dy = 0.09f)
                lineToRelative(dx = 0.15f, dy = 0.12f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = 0.7f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = 0.72f)
                lineToRelative(dx = -0.15f, dy = 0.12f)
                lineToRelative(dx = -0.18f, dy = 0.09f)
                lineToRelative(dx = -0.19f, dy = 0.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.06f, y = 22.16f)
                horizontalLineTo(x = 5.94f)
                curveToRelative(dx1 = -1.95f, dy1 = 0.0f, dx2 = -3.44f, dy2 = -0.71f, dx3 = -4.2f, dy3 = -1.99f)
                curveToRelative(dx1 = -0.75f, dy1 = -1.28f, dx2 = -0.65f, dy2 = -2.93f, dx3 = 0.3f, dy3 = -4.64f)
                lineTo(x = 8.1f, y = 4.63f)
                curveToRelative(dx1 = 1.0f, dy1 = -1.8f, dx2 = 2.38f, dy2 = -2.79f, dx3 = 3.9f, dy3 = -2.79f)
                reflectiveCurveToRelative(dx1 = 2.9f, dy1 = 0.99f, dx2 = 3.9f, dy2 = 2.79f)
                lineToRelative(dx = 6.06f, dy = 10.91f)
                curveToRelative(dx1 = 0.95f, dy1 = 1.71f, dx2 = 1.06f, dy2 = 3.35f, dx3 = 0.3f, dy3 = 4.64f)
                curveToRelative(dx1 = -0.76f, dy1 = 1.27f, dx2 = -2.25f, dy2 = 1.98f, dx3 = -4.2f, dy3 = 1.98f)
                moveTo(x = 12.0f, y = 3.34f)
                curveToRelative(dx1 = -0.94f, dy1 = 0.0f, dx2 = -1.86f, dy2 = 0.72f, dx3 = -2.59f, dy3 = 2.02f)
                lineTo(x = 3.36f, y = 16.27f)
                curveToRelative(dx1 = -0.68f, dy1 = 1.22f, dx2 = -0.79f, dy2 = 2.34f, dx3 = -0.32f, dy3 = 3.15f)
                reflectiveCurveToRelative(dx1 = 1.51f, dy1 = 1.25f, dx2 = 2.91f, dy2 = 1.25f)
                horizontalLineToRelative(dx = 12.12f)
                curveToRelative(dx1 = 1.4f, dy1 = 0.0f, dx2 = 2.43f, dy2 = -0.44f, dx3 = 2.91f, dy3 = -1.25f)
                reflectiveCurveToRelative(dx1 = 0.36f, dy1 = -1.92f, dx2 = -0.32f, dy2 = -3.15f)
                lineTo(x = 14.59f, y = 5.36f)
                curveToRelative(dx1 = -0.73f, dy1 = -1.3f, dx2 = -1.65f, dy2 = -2.02f, dx3 = -2.59f, dy3 = -2.02f)
            }
        }.build().also { _danger = it }
    }

@Suppress("ObjectPropertyName")
private var _danger: ImageVector? = null
