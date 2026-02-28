package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lamp: ImageVector
    get() {
        val current = _lamp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Lamp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.5f, y = 5.48f)
                lineToRelative(dx = 0.25f, dy = 0.01f)
                verticalLineTo(y = 2.53f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = 0.34f, dx2 = -0.75f, dy2 = 0.75f)
                verticalLineTo(y = 5.5f)
                horizontalLineToRelative(dx = 0.25f)
                arcToRelative(a = 8.7f, b = 8.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -8.28f, dy1 = 8.7f)
                verticalLineToRelative(dy = 1.93f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.0f, dy1 = 2.0f)
                horizontalLineToRelative(dx = 13.56f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.0f, dy1 = -2.0f)
                verticalLineToRelative(dy = -1.94f)
                arcToRelative(a = 8.7f, b = 8.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -8.28f, dy1 = -8.7f)
                moveToRelative(dx = 2.23f, dy = 13.63f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.49f, dy1 = 0.63f)
                arcTo(horizontalEllipseRadius = 3.34f, verticalEllipseRadius = 3.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.22f)
                arcToRelative(a = 3.34f, b = 3.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.22f, dy1 = -2.48f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.49f, dy1 = -0.63f)
                close()
            }
        }.build().also { _lamp = it }
    }

@Suppress("ObjectPropertyName")
private var _lamp: ImageVector? = null
