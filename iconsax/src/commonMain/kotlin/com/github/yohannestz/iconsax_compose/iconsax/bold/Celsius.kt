package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Celsius: ImageVector
    get() {
        val current = _celsius
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Celsius",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = 4.93f, dy = 13.74f)
                arcTo(horizontalEllipseRadius = 6.1f, verticalEllipseRadius = 6.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.19f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 3.72f, dy1 = -11.14f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = 1.2f)
                arcTo(horizontalEllipseRadius = 4.7f, verticalEllipseRadius = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.31f, y1 = 12.0f)
                arcToRelative(a = 4.69f, b = 4.69f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 8.43f, dy1 = 2.83f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.19f, dy1 = 0.91f)
                moveToRelative(dx = 0.49f, dy = -4.4f)
                arcToRelative(a = 1.17f, b = 1.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.17f, dy1 = -1.17f)
                arcTo(horizontalEllipseRadius = 1.17f, verticalEllipseRadius = 1.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.42f, y1 = 9.0f)
                arcToRelative(a = 1.17f, b = 1.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.17f, dy1 = 1.17f)
                arcToRelative(a = 1.17f, b = 1.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.17f, dy1 = 1.17f)
            }
        }.build().also { _celsius = it }
    }

@Suppress("ObjectPropertyName")
private var _celsius: ImageVector? = null
