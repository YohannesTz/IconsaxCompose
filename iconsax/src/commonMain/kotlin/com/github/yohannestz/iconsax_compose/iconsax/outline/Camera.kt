package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Camera: ImageVector
    get() {
        val current = _camera
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Camera",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.24f, y = 22.75f)
                horizontalLineTo(x = 6.76f)
                curveToRelative(dx1 = -2.8f, dy1 = 0.0f, dx2 = -4.58f, dy2 = -1.67f, dx3 = -4.74f, dy3 = -4.46f)
                lineTo(x = 1.5f, y = 10.04f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.21f, dy1 = -3.36f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.3f, dy1 = -1.43f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.77f, dy1 = -0.49f)
                lineTo(x = 7.5f, y = 3.33f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.36f, dy1 = -2.08f)
                horizontalLineToRelative(dx = 2.3f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.34f, dy1 = 2.07f)
                lineToRelative(dx = 0.72f, dy = 1.46f)
                arcTo(horizontalEllipseRadius = 0.9f, verticalEllipseRadius = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.0f, y1 = 5.25f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.5f, dy1 = 4.79f)
                lineToRelative(dx = -0.52f, dy = 8.26f)
                curveToRelative(dx1 = -0.18f, dy1 = 2.83f, dx2 = -1.9f, dy2 = 4.45f, dx3 = -4.74f, dy3 = 4.45f)
                moveToRelative(dx = -6.38f, dy = -20.0f)
                arcTo(horizontalEllipseRadius = 2.6f, verticalEllipseRadius = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.84f, y1 = 4.0f)
                lineTo(x = 8.12f, y = 5.44f)
                arcTo(horizontalEllipseRadius = 2.4f, verticalEllipseRadius = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 6.75f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.0f, dy1 = 3.19f)
                lineToRelative(dx = 0.52f, dy = 8.26f)
                quadToRelative(dx1 = 0.19f, dy1 = 3.04f, dx2 = 3.24f, dy2 = 3.05f)
                horizontalLineToRelative(dx = 10.48f)
                quadToRelative(dx1 = 3.04f, dy1 = -0.01f, dx2 = 3.24f, dy2 = -3.05f)
                lineTo(x = 21.0f, y = 9.94f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = -2.24f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.0f, y1 = 6.75f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.12f, dy1 = -1.29f)
                lineTo(x = 15.15f, y = 4.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = -1.24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.5f, y = 8.75f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -1.5f, dy = 10.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -8.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 8.0f)
                moveToRelative(dx = 0.0f, dy = -6.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.0f)
            }
        }.build().also { _camera = it }
    }

@Suppress("ObjectPropertyName")
private var _camera: ImageVector? = null
