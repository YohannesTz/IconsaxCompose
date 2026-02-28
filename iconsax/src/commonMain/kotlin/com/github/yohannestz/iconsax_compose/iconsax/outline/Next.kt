package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Next: ImageVector
    get() {
        val current = _next
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Next",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 6.3f, y = 20.09f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.64f, dy1 = -0.45f)
                arcTo(horizontalEllipseRadius = 3.3f, verticalEllipseRadius = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.0f, y1 = 16.78f)
                verticalLineTo(y = 7.2f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.65f, dy1 = -2.86f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.3f, dy1 = 0.0f)
                lineToRelative(dx = 8.29f, dy = 4.78f)
                curveToRelative(dx1 = 1.03f, dy1 = 0.6f, dx2 = 1.65f, dy2 = 1.67f, dx3 = 1.65f, dy3 = 2.86f)
                reflectiveCurveToRelative(dx1 = -0.62f, dy1 = 2.26f, dx2 = -1.65f, dy2 = 2.86f)
                lineToRelative(dx = -8.3f, dy = 4.78f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.64f, dy1 = 0.46f)
                moveToRelative(dx = 0.0f, dy = -14.68f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.8f, dy1 = 1.8f)
                verticalLineToRelative(dy = 9.57f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.7f, dy1 = 1.56f)
                lineToRelative(dx = 8.3f, dy = -4.78f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.12f)
                lineTo(x = 7.2f, y = 5.66f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.3f, y1 = 5.4f)
                moveToRelative(dx = 13.94f, dy = 13.52f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 5.82f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 21.0f, y1 = 5.41f, x2 = 21.0f, y2 = 5.82f)
                verticalLineToRelative(dy = 12.36f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
        }.build().also { _next = it }
    }

@Suppress("ObjectPropertyName")
private var _next: ImageVector? = null
