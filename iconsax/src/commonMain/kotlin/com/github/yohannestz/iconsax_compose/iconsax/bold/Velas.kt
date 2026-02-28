package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Velas: ImageVector
    get() {
        val current = _velas
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Velas",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 21.0f, y = 3.15f)
                horizontalLineTo(x = 3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 2.59f, y1 = 4.65f, x2 = 3.0f, y2 = 4.65f)
                horizontalLineToRelative(dx = 18.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 21.41f, y1 = 3.15f, x2 = 21.0f, y2 = 3.15f)
                moveTo(x = 4.04f, y = 6.24f)
                horizontalLineToRelative(dx = 15.93f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.93f, dy1 = 1.7f)
                lineToRelative(dx = -7.96f, dy = 12.4f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.87f, dy1 = 0.0f)
                lineTo(x = 3.11f, y = 7.94f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.93f, dy1 = -1.7f)
            }
        }.build().also { _velas = it }
    }

@Suppress("ObjectPropertyName")
private var _velas: ImageVector? = null
