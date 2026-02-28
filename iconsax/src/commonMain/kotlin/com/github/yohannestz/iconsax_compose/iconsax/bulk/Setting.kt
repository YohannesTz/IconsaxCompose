package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Setting: ImageVector
    get() {
        val current = _setting
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Setting",
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
                moveTo(x = 18.94f, y = 5.42f)
                lineToRelative(dx = -5.17f, dy = -2.99f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.53f, dy1 = 0.0f)
                lineTo(x = 5.02f, y = 5.44f)
                curveToRelative(dx1 = -2.07f, dy1 = 1.4f, dx2 = -2.19f, dy2 = 1.61f, dx3 = -2.19f, dy3 = 3.84f)
                verticalLineToRelative(dy = 5.43f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.23f, dx2 = 0.12f, dy2 = 2.45f, dx3 = 2.23f, dy3 = 3.87f)
                lineToRelative(dx = 5.17f, dy = 3.0f)
                arcTo(horizontalEllipseRadius = 3.6f, verticalEllipseRadius = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.76f, dy1 = -0.43f)
                lineToRelative(dx = 5.22f, dy = -3.0f)
                curveToRelative(dx1 = 2.07f, dy1 = -1.4f, dx2 = 2.19f, dy2 = -1.62f, dx3 = 2.19f, dy3 = -3.85f)
                verticalLineTo(y = 9.28f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.23f, dx2 = -0.12f, dy2 = -2.44f, dx3 = -2.23f, dy3 = -3.86f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.25f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.5f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.5f)
            }
        }.build().also { _setting = it }
    }

@Suppress("ObjectPropertyName")
private var _setting: ImageVector? = null
