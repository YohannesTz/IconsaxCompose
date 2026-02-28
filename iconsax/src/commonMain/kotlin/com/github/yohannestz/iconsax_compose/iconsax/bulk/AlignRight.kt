package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignRight: ImageVector
    get() {
        val current = _alignRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 4.62f, y = 15.98f)
                verticalLineToRelative(dy = 1.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.59f, dx2 = 0.6f, dy2 = 2.23f, dx3 = 2.12f, dy3 = 2.23f)
                horizontalLineToRelative(dx = 11.88f)
                verticalLineToRelative(dy = -5.5f)
                horizontalLineTo(x = 6.74f)
                curveToRelative(dx1 = -1.52f, dy1 = 0.0f, dx2 = -2.12f, dy2 = 0.64f, dx3 = -2.12f, dy3 = 2.23f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 9.62f, y = 7.48f)
                verticalLineToRelative(dy = 1.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.59f, dx2 = 0.61f, dy2 = 2.23f, dx3 = 2.12f, dy3 = 2.23f)
                horizontalLineToRelative(dx = 6.88f)
                verticalLineToRelative(dy = -5.5f)
                horizontalLineToRelative(dx = -6.88f)
                curveToRelative(dx1 = -1.51f, dy1 = 0.0f, dx2 = -2.12f, dy2 = 0.64f, dx3 = -2.12f, dy3 = 2.23f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.62f, y = 22.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.75f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 18.5f)
                arcTo(horizontalEllipseRadius = 0.74f, verticalEllipseRadius = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.62f, y1 = 22.0f)
            }
        }.build().also { _alignRight = it }
    }

@Suppress("ObjectPropertyName")
private var _alignRight: ImageVector? = null
