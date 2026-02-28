package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pointer: ImageVector
    get() {
        val current = _pointer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Pointer",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.31f, y = 18.0f)
                horizontalLineTo(x = 11.3f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.23f, dy1 = -1.65f)
                lineToRelative(dx = -1.95f, dy = -6.28f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.6f, dy1 = -2.38f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.35f, dy1 = -0.58f)
                lineToRelative(dx = 6.3f, dy = 1.95f)
                arcTo(horizontalEllipseRadius = 2.3f, verticalEllipseRadius = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 11.3f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.6f, dy1 = 2.25f)
                lineToRelative(dx = -1.73f, dy = 0.58f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.54f, dy1 = 0.53f)
                lineToRelative(dx = -0.59f, dy = 1.73f)
                arcTo(horizontalEllipseRadius = 2.3f, verticalEllipseRadius = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.31f, y1 = 18.0f)
                moveTo(x = 9.34f, y = 8.5f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.5f, dy2 = 0.16f, dx3 = -0.59f, dy3 = 0.25f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.2f, dy1 = 0.87f)
                lineToRelative(dx = 1.94f, dy = 6.28f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.81f, dy1 = 0.6f)
                curveToRelative(dx1 = 0.12f, dy1 = 0.0f, dx2 = 0.63f, dy2 = -0.04f, dx3 = 0.81f, dy3 = -0.59f)
                lineToRelative(dx = 0.6f, dy = -1.73f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.47f, dy1 = -1.48f)
                lineToRelative(dx = 1.72f, dy = -0.58f)
                horizontalLineToRelative(dx = 0.01f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.6f, dy1 = -0.8f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.6f, dy1 = -0.82f)
                lineTo(x = 9.6f, y = 8.55f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.34f, y1 = 8.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
        }.build().also { _pointer = it }
    }

@Suppress("ObjectPropertyName")
private var _pointer: ImageVector? = null
