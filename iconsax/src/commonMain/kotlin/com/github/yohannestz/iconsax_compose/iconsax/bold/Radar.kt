package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radar: ImageVector
    get() {
        val current = _radar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Radar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = 0.0f, dy = 17.75f)
                arcTo(horizontalEllipseRadius = 7.76f, verticalEllipseRadius = 7.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.28f, y1 = 8.14f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.3f, y1 = 7.86f)
                lineToRelative(dx = 6.07f, dy = 3.49f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.28f, dy1 = 1.02f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.02f, dy1 = 0.28f)
                lineTo(x = 6.24f, y = 9.56f)
                arcTo(horizontalEllipseRadius = 6.25f, verticalEllipseRadius = 6.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 18.25f, y1 = 12.0f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -10.0f, dy1 = -5.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = -1.2f)
                arcTo(horizontalEllipseRadius = 7.7f, verticalEllipseRadius = 7.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 4.25f)
                curveToRelative(dx1 = 4.27f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 3.48f, dx3 = 7.75f, dy3 = 7.75f)
                reflectiveCurveToRelative(dx1 = -3.48f, dy1 = 7.75f, dx2 = -7.75f, dy2 = 7.75f)
            }
        }.build().also { _radar = it }
    }

@Suppress("ObjectPropertyName")
private var _radar: ImageVector? = null
