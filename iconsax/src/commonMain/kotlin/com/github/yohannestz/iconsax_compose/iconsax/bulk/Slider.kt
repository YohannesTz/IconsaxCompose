package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Slider: ImageVector
    get() {
        val current = _slider
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Slider",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.0f, y = 16.01f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.2f, dx2 = -1.5f, dy2 = 4.0f, dx3 = -4.0f, dy3 = 4.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -2.5f, dy1 = 0.0f, dx2 = -4.0f, dy2 = -1.8f, dx3 = -4.0f, dy3 = -4.0f)
                verticalLineToRelative(dy = -2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 19.0f, y = 6.0f)
                verticalLineToRelative(dy = 10.01f)
                horizontalLineTo(x = 5.0f)
                verticalLineTo(y = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.2f, dx2 = 1.5f, dy2 = -4.0f, dx3 = 4.0f, dy3 = -4.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 2.5f, dy1 = 0.0f, dx2 = 4.0f, dy2 = 1.8f, dx3 = 4.0f, dy3 = 4.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 3.0f, y = 20.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.25f, y1 = 20.0f)
                verticalLineTo(y = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 3.75f, y1 = 3.59f, x2 = 3.75f, y2 = 4.0f)
                verticalLineToRelative(dy = 16.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.0f, y1 = 20.75f)
                moveToRelative(dx = 18.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.25f, y1 = 20.0f)
                verticalLineTo(y = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 21.75f, y1 = 3.59f, x2 = 21.75f, y2 = 4.0f)
                verticalLineToRelative(dy = 16.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.0f, y1 = 20.75f)
            }
        }.build().also { _slider = it }
    }

@Suppress("ObjectPropertyName")
private var _slider: ImageVector? = null
