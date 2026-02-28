package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Celo: ImageVector
    get() {
        val current = _celo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Celo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 9.0f, y = 22.0f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 9.0f, y1 = 8.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 14.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 22.0f, y = 9.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.86f, dy1 = 6.25f)
                curveToRelative(dx1 = -0.31f, dy1 = 0.16f, dx2 = -0.66f, dy2 = -0.09f, dx3 = -0.69f, dy3 = -0.43f)
                arcToRelative(a = 8.96f, b = 8.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -8.27f, dy1 = -8.27f)
                curveTo(x1 = 8.83f, y1 = 6.52f, x2 = 8.59f, y2 = 6.17f, x3 = 8.75f, y3 = 5.86f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 2.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = 7.0f)
            }
        }.build().also { _celo = it }
    }

@Suppress("ObjectPropertyName")
private var _celo: ImageVector? = null
