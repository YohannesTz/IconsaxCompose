package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Brush: ImageVector
    get() {
        val current = _brush
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Brush",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.0f, y = 9.07f)
                horizontalLineTo(x = 4.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 4.0f)
                arcTo(horizontalEllipseRadius = 2.75f, verticalEllipseRadius = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 1.25f)
                horizontalLineToRelative(dx = 12.0f)
                arcTo(horizontalEllipseRadius = 2.75f, verticalEllipseRadius = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.75f, y1 = 4.0f)
                verticalLineToRelative(dy = 4.32f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.0f, y1 = 9.07f)
                moveTo(x = 4.75f, y = 7.57f)
                horizontalLineToRelative(dx = 14.5f)
                verticalLineTo(y = 4.0f)
                arcTo(horizontalEllipseRadius = 1.25f, verticalEllipseRadius = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.0f, y1 = 2.75f)
                horizontalLineTo(x = 6.0f)
                arcTo(horizontalEllipseRadius = 1.25f, verticalEllipseRadius = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.75f, y1 = 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.5f, y = 22.75f)
                horizontalLineToRelative(dx = -1.0f)
                arcTo(horizontalEllipseRadius = 2.75f, verticalEllipseRadius = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.75f, y1 = 20.0f)
                verticalLineToRelative(dy = -2.1f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.64f, dy1 = -1.1f)
                lineToRelative(dx = -2.96f, dy = -1.66f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.91f, dy1 = -3.27f)
                verticalLineTo(y = 8.3f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = -0.75f)
                horizontalLineToRelative(dx = 16.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
                verticalLineToRelative(dy = 3.56f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.35f, dx2 = -0.73f, dy2 = 2.6f, dx3 = -1.91f, dy3 = 3.27f)
                lineToRelative(dx = -2.96f, dy = 1.67f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.64f, dy1 = 1.09f)
                verticalLineTo(y = 20.0f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.73f, dy1 = 2.75f)
                moveTo(x = 4.75f, y = 9.07f)
                verticalLineToRelative(dy = 2.8f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.14f, dy1 = 1.97f)
                lineToRelative(dx = 2.96f, dy = 1.67f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.4f, dy1 = 2.39f)
                verticalLineTo(y = 20.0f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.25f, dy1 = 1.25f)
                horizontalLineToRelative(dx = 1.0f)
                arcTo(horizontalEllipseRadius = 1.25f, verticalEllipseRadius = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 13.75f, y1 = 20.0f)
                verticalLineToRelative(dy = -2.1f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.4f, dy1 = -2.4f)
                lineToRelative(dx = 2.96f, dy = -1.66f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.14f, dy1 = -1.96f)
                verticalLineTo(y = 9.07f)
                close()
            }
        }.build().also { _brush = it }
    }

@Suppress("ObjectPropertyName")
private var _brush: ImageVector? = null
