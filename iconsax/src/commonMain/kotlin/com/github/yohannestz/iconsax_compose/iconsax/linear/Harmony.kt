package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Harmony: ImageVector
    get() {
        val current = _harmony
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Harmony",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 5.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.7f, dx2 = -0.8f, dy2 = 3.3f, dx3 = -2.3f, dy3 = 4.2f)
                curveToRelative(dx1 = -1.3f, dy1 = 0.8f, dx2 = -3.2f, dy2 = 1.6f, dx3 = -5.7f, dy3 = 1.9f)
                verticalLineTo(y = 5.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.0f, dx2 = 1.7f, dy2 = -3.7f, dx3 = 3.7f, dy3 = -3.7f)
                horizontalLineToRelative(dx = 0.5f)
                curveTo(x1 = 20.3f, y1 = 2.0f, x2 = 22.0f, y2 = 3.7f, x3 = 22.0f, y3 = 5.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 8.0f)
                verticalLineToRelative(dy = 10.3f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.1f, dx2 = -1.7f, dy2 = 3.7f, dx3 = -3.7f, dy3 = 3.7f)
                horizontalLineToRelative(dx = -0.5f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.7f, dy1 = -3.7f)
                verticalLineToRelative(dy = -6.4f)
                curveTo(x1 = 19.6f, y1 = 11.2f, x2 = 22.0f, y2 = 8.0f, x3 = 22.0f, y3 = 8.0f)
                close()
                moveTo(x = 2.0f, y = 18.3f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.7f, dx2 = 0.8f, dy2 = -3.3f, dx3 = 2.3f, dy3 = -4.2f)
                curveToRelative(dx1 = 1.3f, dy1 = -0.8f, dx2 = 3.2f, dy2 = -1.6f, dx3 = 5.7f, dy3 = -1.9f)
                verticalLineToRelative(dy = 6.1f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.1f, dx2 = -1.7f, dy2 = 3.7f, dx3 = -3.7f, dy3 = 3.7f)
                horizontalLineTo(x = 5.7f)
                curveToRelative(dx1 = -2.0f, dy1 = 0.0f, dx2 = -3.7f, dy2 = -1.7f, dx3 = -3.7f, dy3 = -3.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 16.0f)
                verticalLineTo(y = 5.7f)
                curveTo(x1 = 2.0f, y1 = 3.7f, x2 = 3.7f, y2 = 2.0f, x3 = 5.7f, y3 = 2.0f)
                horizontalLineToRelative(dx = 0.5f)
                curveTo(x1 = 8.3f, y1 = 2.0f, x2 = 10.0f, y2 = 3.7f, x3 = 10.0f, y3 = 5.7f)
                verticalLineToRelative(dy = 6.4f)
                curveTo(x1 = 4.4f, y1 = 12.8f, x2 = 2.0f, y2 = 16.0f, x3 = 2.0f, y3 = 16.0f)
                close()
                moveToRelative(dx = 8.0f, dy = -3.9f)
                curveToRelative(dx1 = 0.6f, dy1 = -0.1f, dx2 = 1.3f, dy2 = -0.1f, dx3 = 2.0f, dy3 = -0.1f)
                reflectiveCurveToRelative(dx1 = 1.4f, dy1 = 0.0f, dx2 = 2.0f, dy2 = -0.1f)
            }
        }.build().also { _harmony = it }
    }

@Suppress("ObjectPropertyName")
private var _harmony: ImageVector? = null
