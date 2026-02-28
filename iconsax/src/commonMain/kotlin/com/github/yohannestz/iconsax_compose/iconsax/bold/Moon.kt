package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 21.53f, y = 15.93f)
                curveToRelative(dx1 = -0.16f, dy1 = -0.27f, dx2 = -0.61f, dy2 = -0.69f, dx3 = -1.73f, dy3 = -0.49f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.88f, dy1 = 0.13f)
                arcTo(horizontalEllipseRadius = 8.4f, verticalEllipseRadius = 8.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 12.75f)
                arcToRelative(a = 8.1f, b = 8.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.44f, dy1 = -8.66f)
                curveToRelative(dx1 = 0.44f, dy1 = -1.01f, dx2 = 0.13f, dy2 = -1.54f, dx3 = -0.1f, dy3 = -1.76f)
                curveToRelative(dx1 = -0.22f, dy1 = -0.23f, dx2 = -0.76f, dy2 = -0.55f, dx3 = -1.82f, dy3 = -0.11f)
                arcToRelative(a = 10.3f, b = 10.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.32f, dy1 = 10.21f)
                curveToRelative(dx1 = 0.3f, dy1 = 4.13f, dx2 = 3.2f, dy2 = 7.66f, dx3 = 7.04f, dy3 = 8.99f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.89f, dy1 = 0.55f)
                lineToRelative(dx = 0.48f, dy = 0.02f)
                arcToRelative(a = 10.5f, b = 10.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 8.47f, dy1 = -4.27f)
                curveToRelative(dx1 = 0.67f, dy1 = -0.93f, dx2 = 0.49f, dy2 = -1.52f, dx3 = 0.32f, dy3 = -1.79f)
            }
        }.build().also { _moon = it }
    }

@Suppress("ObjectPropertyName")
private var _moon: ImageVector? = null
