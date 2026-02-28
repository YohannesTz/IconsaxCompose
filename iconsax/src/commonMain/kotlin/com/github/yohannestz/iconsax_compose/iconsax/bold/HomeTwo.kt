package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HomeTwo: ImageVector
    get() {
        val current = _homeTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HomeTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.04f, y = 6.82f)
                lineTo(x = 14.28f, y = 2.8f)
                arcToRelative(a = 4.85f, b = 4.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.49f, dy1 = 0.13f)
                lineTo(x = 3.78f, y = 6.83f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.79f, dy1 = 3.64f)
                verticalLineToRelative(dy = 6.9f)
                arcTo(horizontalEllipseRadius = 4.63f, verticalEllipseRadius = 4.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.61f, y1 = 22.0f)
                horizontalLineToRelative(dx = 10.78f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.62f, dy1 = -4.62f)
                verticalLineTo(y = 10.6f)
                arcToRelative(a = 5.1f, b = 5.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.97f, dy1 = -3.78f)
                moveTo(x = 12.75f, y = 18.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                close()
            }
        }.build().also { _homeTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _homeTwo: ImageVector? = null
