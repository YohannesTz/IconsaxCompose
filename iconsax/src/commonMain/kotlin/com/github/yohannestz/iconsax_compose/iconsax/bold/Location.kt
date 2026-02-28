package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Location: ImageVector
    get() {
        val current = _location
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Location",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.62f, y = 8.45f)
                curveToRelative(dx1 = -1.05f, dy1 = -4.62f, dx2 = -5.08f, dy2 = -6.7f, dx3 = -8.62f, dy3 = -6.7f)
                reflectiveCurveTo(x1 = 4.41f, y1 = 3.82f, x2 = 3.36f, y2 = 8.44f)
                curveToRelative(dx1 = -1.17f, dy1 = 5.16f, dx2 = 2.0f, dy2 = 9.53f, dx3 = 4.85f, dy3 = 12.28f)
                arcTo(horizontalEllipseRadius = 5.4f, verticalEllipseRadius = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 22.25f)
                arcToRelative(a = 5.4f, b = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.77f, dy1 = -1.53f)
                curveToRelative(dx1 = 2.86f, dy1 = -2.75f, dx2 = 6.02f, dy2 = -7.11f, dx3 = 4.85f, dy3 = -12.27f)
                moveTo(x = 12.0f, y = 13.46f)
                arcToRelative(a = 3.15f, b = 3.15f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.3f)
                arcToRelative(a = 3.15f, b = 3.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.3f)
            }
        }.build().also { _location = it }
    }

@Suppress("ObjectPropertyName")
private var _location: ImageVector? = null
