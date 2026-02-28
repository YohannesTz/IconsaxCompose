package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Moon: ImageVector
    get() {
        val current = _moon
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Moon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.0f, y = 19.0f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.37f, dy1 = 2.42f)
                arcToRelative(a = 10.5f, b = 10.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.04f, dy1 = -8.99f)
                arcTo(horizontalEllipseRadius = 10.3f, verticalEllipseRadius = 10.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.65f, y1 = 2.22f)
                curveToRelative(dx1 = 1.06f, dy1 = -0.44f, dx2 = 1.6f, dy2 = -0.12f, dx3 = 1.83f, dy3 = 0.11f)
                reflectiveCurveTo(x1 = 11.0f, y1 = 3.08f, x2 = 10.57f, y2 = 4.09f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.9f, y1 = 7.37f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.1f, dy1 = 5.38f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 19.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.21f, y = 17.72f)
                arcToRelative(a = 10.5f, b = 10.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -8.47f, dy1 = 4.27f)
                lineToRelative(dx = -0.48f, dy = -0.02f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.89f, dy1 = -0.55f)
                arcToRelative(a = 8.1f, b = 8.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.64f, dy1 = -8.67f)
                arcToRelative(a = 8.4f, b = 8.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.91f, dy1 = 2.82f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.88f, dy1 = -0.13f)
                curveToRelative(dx1 = 1.12f, dy1 = -0.2f, dx2 = 1.57f, dy2 = 0.22f, dx3 = 1.73f, dy3 = 0.49f)
                curveToRelative(dx1 = 0.17f, dy1 = 0.27f, dx2 = 0.35f, dy2 = 0.86f, dx3 = -0.32f, dy3 = 1.79f)
            }
        }.build().also { _moon = it }
    }

@Suppress("ObjectPropertyName")
private var _moon: ImageVector? = null
