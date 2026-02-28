package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CrownOne: ImageVector
    get() {
        val current = _crownOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CrownOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 5.71f)
                verticalLineToRelative(dy = 9.58f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = 5.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.33f, dy1 = -0.18f)
                arcToRelative(a = 0.85f, b = 0.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.36f, dy1 = -1.42f)
                lineTo(x = 15.94f, y = 8.06f)
                curveToRelative(dx1 = 0.22f, dy1 = -0.22f, dx2 = 0.55f, dy2 = -0.27f, dx3 = 0.86f, dy3 = -0.21f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.92f, dy1 = -0.27f)
                lineTo(x = 20.29f, y = 5.0f)
                curveTo(x1 = 21.23f, y1 = 4.06f, x2 = 22.0f, y2 = 4.37f, x3 = 22.0f, y3 = 5.71f)
                moveToRelative(dx = -7.36f, dy = 1.65f)
                lineTo(x = 4.17f, y = 17.83f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.6f, dy1 = -0.24f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 15.29f)
                verticalLineTo(y = 5.71f)
                curveTo(x1 = 2.0f, y1 = 4.37f, x2 = 2.77f, y2 = 4.06f, x3 = 3.71f, y3 = 5.0f)
                lineToRelative(dx = 2.58f, dy = 2.59f)
                arcToRelative(a = 1.03f, b = 1.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.42f, dy1 = 0.0f)
                lineTo(x = 11.29f, y = 4.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.42f, dy1 = 0.0f)
                lineToRelative(dx = 1.94f, dy = 1.94f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.01f, dy1 = 1.42f)
            }
        }.build().also { _crownOne = it }
    }

@Suppress("ObjectPropertyName")
private var _crownOne: ImageVector? = null
