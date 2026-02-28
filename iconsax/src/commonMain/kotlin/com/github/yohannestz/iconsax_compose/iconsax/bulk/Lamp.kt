package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.78f, y = 14.18f)
                verticalLineToRelative(dy = 2.94f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = 2.0f)
                horizontalLineTo(x = 5.22f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = -2.0f)
                verticalLineToRelative(dy = -2.94f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.82f, dx2 = 3.9f, dy2 = -8.72f, dx3 = 8.72f, dy3 = -8.72f)
                horizontalLineToRelative(dx = 0.12f)
                arcToRelative(a = 8.7f, b = 8.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.72f, dy1 = 8.72f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.75f, y = 2.53f)
                verticalLineTo(y = 5.5f)
                lineToRelative(dx = -0.69f, dy = -0.03f)
                horizontalLineToRelative(dx = -0.12f)
                lineTo(x = 11.25f, y = 5.5f)
                verticalLineTo(y = 2.53f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                moveToRelative(dx = 2.57f, dy = 16.58f)
                arcToRelative(a = 3.33f, b = 3.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.64f, dy1 = 0.0f)
                close()
            }
        }.build().also { _lamp = it }
    }

@Suppress("ObjectPropertyName")
private var _lamp: ImageVector? = null
