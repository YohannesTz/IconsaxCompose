package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Drop: ImageVector
    get() {
        val current = _drop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Drop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.59f, y = 7.41f)
                lineTo(x = 6.3f, y = 17.69f)
                curveToRelative(dx1 = -0.48f, dy1 = 0.48f, dx2 = -1.3f, dy2 = 0.37f, dx3 = -1.6f, dy3 = -0.24f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.9f, y1 = 13.9f)
                curveTo(x1 = 3.88f, y1 = 8.38f, x2 = 9.48f, y2 = 3.66f, x3 = 11.38f, y3 = 2.21f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.23f, dy1 = 0.0f)
                arcToRelative(a = 27.0f, b = 27.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.03f, dy1 = 3.83f)
                curveToRelative(dx1 = 0.34f, dy1 = 0.4f, dx2 = 0.32f, dy2 = 1.0f, dx3 = -0.05f, dy3 = 1.37f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.1f, y = 13.91f)
                arcTo(horizontalEllipseRadius = 8.1f, verticalEllipseRadius = 8.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.81f, dy1 = -1.58f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.1f, dy1 = -1.51f)
                lineTo(x = 17.16f, y = 8.84f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.58f, dy1 = 0.21f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.36f, dy1 = 4.86f)
            }
        }.build().also { _drop = it }
    }

@Suppress("ObjectPropertyName")
private var _drop: ImageVector? = null
