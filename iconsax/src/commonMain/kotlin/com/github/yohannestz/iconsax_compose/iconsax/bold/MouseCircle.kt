package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 20.96f, y = 17.84f)
                lineToRelative(dx = -1.63f, dy = 0.55f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.96f, dy1 = 0.96f)
                lineToRelative(dx = -0.55f, dy = 1.63f)
                arcToRelative(a = 1.52f, b = 1.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.89f, dy1 = -0.03f)
                lineTo(x = 13.08f, y = 15.0f)
                arcToRelative(a = 1.52f, b = 1.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.9f, dy1 = -1.91f)
                lineToRelative(dx = 5.96f, dy = 1.85f)
                curveToRelative(dx1 = 1.4f, dy1 = 0.44f, dx2 = 1.42f, dy2 = 2.43f, dx3 = 0.02f, dy3 = 2.9f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.0f, y = 11.5f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.65f, dx2 = -0.08f, dy2 = 1.28f)
                curveToRelative(dx1 = -0.04f, dy1 = 0.3f, dx2 = -0.35f, dy2 = 0.48f, dx3 = -0.64f, dy3 = 0.39f)
                lineToRelative(dx = -4.85f, dy = -1.51f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.03f, dy1 = 0.74f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 3.05f)
                lineToRelative(dx = 1.5f, dy = 4.83f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.4f, dy1 = 0.64f)
                arcTo(horizontalEllipseRadius = 9.5f, verticalEllipseRadius = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 11.23f)
                arcTo(horizontalEllipseRadius = 9.6f, verticalEllipseRadius = 9.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.23f, y1 = 2.0f)
                arcTo(horizontalEllipseRadius = 9.5f, verticalEllipseRadius = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.0f, y1 = 11.5f)
            }
        }.build().also { _mouseCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _mouseCircle: ImageVector? = null
