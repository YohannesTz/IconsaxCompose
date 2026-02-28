package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeartSlash: ImageVector
    get() {
        val current = _heartSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HeartSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 8.7f)
                quadToRelative(dx1 = -0.01f, dy1 = 1.77f, dx2 = -0.52f, dy2 = 3.3f)
                curveToRelative(dx1 = -1.58f, dy1 = 5.0f, dx2 = -6.45f, dy2 = 8.0f, dx3 = -8.86f, dy3 = 8.81f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.24f, dy1 = 0.0f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.32f, dy1 = -1.1f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.19f, dy1 = -1.58f)
                lineTo(x = 20.15f, y = 6.85f)
                curveToRelative(dx1 = 0.54f, dy1 = -0.54f, dx2 = 1.49f, dy2 = -0.3f, dx3 = 1.68f, dy3 = 0.43f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 8.7f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.53f, y = 1.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineToRelative(dx = -2.34f, dy = 2.34f)
                arcTo(horizontalEllipseRadius = 5.55f, verticalEllipseRadius = 5.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 5.33f)
                arcTo(horizontalEllipseRadius = 5.6f, verticalEllipseRadius = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.56f, y1 = 3.1f)
                arcTo(horizontalEllipseRadius = 5.57f, verticalEllipseRadius = 5.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 8.7f)
                quadToRelative(dx1 = 0.01f, dy1 = 1.77f, dx2 = 0.52f, dy2 = 3.3f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.25f, dy1 = 5.17f)
                lineToRelative(dx = -4.3f, dy = 4.3f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                quadTo(x1 = 1.71f, y1 = 22.75f, x2 = 2.0f, y2 = 22.75f)
                curveToRelative(dx1 = 0.29f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                lineToRelative(dx = 20.0f, dy = -20.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
            }
        }.build().also { _heartSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _heartSlash: ImageVector? = null
