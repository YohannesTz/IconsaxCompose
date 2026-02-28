package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 20.24f, y = 7.22f)
                verticalLineToRelative(dy = 9.57f)
                arcTo(horizontalEllipseRadius = 2.56f, verticalEllipseRadius = 2.56f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.41f, y1 = 19.0f)
                lineToRelative(dx = -4.15f, dy = -2.39f)
                lineToRelative(dx = -4.15f, dy = -2.4f)
                arcToRelative(a = 2.54f, b = 2.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.41f)
                lineToRelative(dx = 4.15f, dy = -2.4f)
                lineToRelative(dx = 4.15f, dy = -2.39f)
                arcToRelative(a = 2.55f, b = 2.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.83f, dy1 = 2.21f)
                moveTo(x = 3.76f, y = 18.93f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 5.82f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 12.36f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
        }.build().also { _previous = it }
    }

@Suppress("ObjectPropertyName")
private var _previous: ImageVector? = null
