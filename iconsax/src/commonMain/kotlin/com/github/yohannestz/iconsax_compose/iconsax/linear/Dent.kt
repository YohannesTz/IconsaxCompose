package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dent: ImageVector
    get() {
        val current = _dent
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dent",
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
                moveTo(x = 12.0f, y = 18.1f)
                curveToRelative(dx1 = -0.7f, dy1 = 0.0f, dx2 = -1.3f, dy2 = -0.6f, dx3 = -1.3f, dy3 = -1.3f)
                verticalLineTo(y = 7.2f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.7f, dx2 = 0.6f, dy2 = -1.3f, dx3 = 1.3f, dy3 = -1.3f)
                reflectiveCurveToRelative(dx1 = 1.3f, dy1 = 0.6f, dx2 = 1.3f, dy2 = 1.3f)
                verticalLineToRelative(dy = 9.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.7f, dx2 = -0.6f, dy2 = 1.2f, dx3 = -1.3f, dy3 = 1.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.7f, y = 8.9f)
                curveTo(x1 = 7.0f, y1 = 8.3f, x2 = 7.8f, y2 = 8.1f, x3 = 8.5f, y3 = 8.4f)
                lineToRelative(dx = 8.4f, dy = 4.8f)
                curveToRelative(dx1 = 0.6f, dy1 = 0.4f, dx2 = 0.8f, dy2 = 1.2f, dx3 = 0.5f, dy3 = 1.8f)
                arcToRelative(a = 1.44f, b = 1.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.8f, dy1 = 0.5f)
                lineToRelative(dx = -8.4f, dy = -4.8f)
                curveToRelative(dx1 = -0.7f, dy1 = -0.3f, dx2 = -0.9f, dy2 = -1.1f, dx3 = -0.5f, dy3 = -1.8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.7f, y = 15.1f)
                curveToRelative(dx1 = -0.4f, dy1 = -0.6f, dx2 = -0.1f, dy2 = -1.4f, dx3 = 0.5f, dy3 = -1.8f)
                lineToRelative(dx = 8.4f, dy = -4.8f)
                curveTo(x1 = 16.2f, y1 = 8.1f, x2 = 17.0f, y2 = 8.4f, x3 = 17.4f, y3 = 9.0f)
                reflectiveCurveToRelative(dx1 = 0.1f, dy1 = 1.4f, dx2 = -0.5f, dy2 = 1.8f)
                lineToRelative(dx = -8.4f, dy = 4.8f)
                curveToRelative(dx1 = -0.7f, dy1 = 0.3f, dx2 = -1.5f, dy2 = 0.1f, dx3 = -1.8f, dy3 = -0.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                close()
            }
        }.build().also { _dent = it }
    }

@Suppress("ObjectPropertyName")
private var _dent: ImageVector? = null
