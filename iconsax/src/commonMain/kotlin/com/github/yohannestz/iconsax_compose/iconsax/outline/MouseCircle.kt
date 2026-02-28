package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MouseCircle: ImageVector
    get() {
        val current = _mouseCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MouseCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.37f, y = 22.77f)
                horizontalLineToRelative(dx = -0.02f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.15f, dy1 = -1.6f)
                lineToRelative(dx = -1.85f, dy = -5.95f)
                arcToRelative(a = 2.27f, b = 2.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.84f, dy1 = -2.85f)
                lineToRelative(dx = 5.96f, dy = 1.85f)
                arcToRelative(a = 2.24f, b = 2.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.6f, dy1 = 2.15f)
                curveToRelative(dx1 = 0.01f, dy1 = 1.0f, dx2 = -0.6f, dy2 = 1.85f, dx3 = -1.56f, dy3 = 2.17f)
                lineToRelative(dx = -1.63f, dy = 0.55f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.48f, dy1 = 0.48f)
                lineToRelative(dx = -0.56f, dy = 1.64f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.15f, dy1 = 1.56f)
                moveToRelative(dx = -1.86f, dy = -9.0f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.72f, dy1 = 1.01f)
                lineToRelative(dx = 1.85f, dy = 5.95f)
                curveToRelative(dx1 = 0.16f, dy1 = 0.51f, dx2 = 0.6f, dy2 = 0.53f, dx3 = 0.74f, dy3 = 0.54f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.73f, dy1 = -0.53f)
                lineToRelative(dx = 0.56f, dy = -1.64f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.43f, dy1 = -1.43f)
                lineToRelative(dx = 1.63f, dy = -0.55f)
                curveToRelative(dx1 = 0.5f, dy1 = -0.16f, dx2 = 0.53f, dy2 = -0.6f, dx3 = 0.53f, dy3 = -0.73f)
                reflectiveCurveToRelative(dx1 = -0.04f, dy1 = -0.57f, dx2 = -0.54f, dy2 = -0.73f)
                lineToRelative(dx = -5.96f, dy = -1.85f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                curveToRelative(dx1 = 5.93f, dy1 = 0.0f, dx2 = 10.75f, dy2 = 4.82f, dx3 = 10.75f, dy3 = 10.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -18.5f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.1f, dx2 = 4.15f, dy2 = 9.25f, dx3 = 9.25f, dy3 = 9.25f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _mouseCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _mouseCircle: ImageVector? = null
