package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Diamonds: ImageVector
    get() {
        val current = _diamonds
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Diamonds",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.21f, y = 13.24f)
                lineToRelative(dx = -6.85f, dy = 7.54f)
                arcToRelative(a = 3.13f, b = 3.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.72f, dy1 = 0.0f)
                lineToRelative(dx = -6.85f, dy = -7.54f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.23f, y1 = 9.8f)
                lineTo(x = 3.03f, y = 8.0f)
                horizontalLineToRelative(dx = 17.94f)
                lineToRelative(dx = 0.8f, dy = 1.8f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.56f, dy1 = 3.44f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.97f, y = 8.0f)
                horizontalLineTo(x = 3.03f)
                lineToRelative(dx = 1.76f, dy = -3.96f)
                curveTo(x1 = 5.26f, y1 = 3.0f, x2 = 6.0f, y2 = 2.14f, x3 = 7.7f, y3 = 2.14f)
                horizontalLineToRelative(dx = 8.6f)
                curveToRelative(dx1 = 1.7f, dy1 = 0.0f, dx2 = 2.44f, dy2 = 0.86f, dx3 = 2.91f, dy3 = 1.9f)
                close()
            }
        }.build().also { _diamonds = it }
    }

@Suppress("ObjectPropertyName")
private var _diamonds: ImageVector? = null
