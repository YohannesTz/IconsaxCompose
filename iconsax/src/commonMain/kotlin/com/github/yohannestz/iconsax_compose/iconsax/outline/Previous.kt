package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Previous: ImageVector
    get() {
        val current = _previous
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Previous",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.7f, y = 20.09f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.66f, dy1 = -0.45f)
                lineToRelative(dx = -8.29f, dy = -4.78f)
                arcTo(horizontalEllipseRadius = 3.3f, verticalEllipseRadius = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.1f, y1 = 12.0f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.65f, dy1 = -2.86f)
                lineToRelative(dx = 8.3f, dy = -4.78f)
                curveToRelative(dx1 = 1.02f, dy1 = -0.6f, dx2 = 2.25f, dy2 = -0.6f, dx3 = 3.3f, dy3 = 0.0f)
                reflectiveCurveToRelative(dx1 = 1.64f, dy1 = 1.66f, dx2 = 1.64f, dy2 = 2.86f)
                verticalLineToRelative(dy = 9.57f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.3f, dy1 = 3.3f)
                moveToRelative(dx = 0.0f, dy = -14.68f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = 0.24f)
                lineToRelative(dx = -8.3f, dy = 4.78f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.12f)
                lineToRelative(dx = 8.3f, dy = 4.78f)
                curveToRelative(dx1 = 0.55f, dy1 = 0.33f, dx2 = 1.23f, dy2 = 0.33f, dx3 = 1.8f, dy3 = 0.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = -0.91f, dx2 = 0.9f, dy2 = -1.56f)
                verticalLineTo(y = 7.2f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = -1.56f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = -0.23f)
                moveTo(x = 3.75f, y = 18.93f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.0f, y1 = 18.18f)
                verticalLineTo(y = 5.82f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 4.5f, y1 = 5.41f, x2 = 4.5f, y2 = 5.82f)
                verticalLineToRelative(dy = 12.36f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
        }.build().also { _previous = it }
    }

@Suppress("ObjectPropertyName")
private var _previous: ImageVector? = null
