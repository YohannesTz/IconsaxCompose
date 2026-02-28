package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CandleTwo: ImageVector
    get() {
        val current = _candleTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CandleTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.75f, y = 17.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 18.25f)
                horizontalLineToRelative(dx = -7.0f)
                verticalLineToRelative(dy = 0.25f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = -0.9f, dy2 = 2.0f, dx3 = -2.0f, dy3 = 2.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.5f, dx3 = -2.0f, dy3 = -2.0f)
                verticalLineToRelative(dy = -0.25f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 16.75f, x2 = 2.0f, y2 = 16.75f)
                horizontalLineToRelative(dx = 3.0f)
                verticalLineTo(y = 16.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = 0.9f, dy2 = -2.0f, dx3 = 2.0f, dy3 = -2.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.5f, dx3 = 2.0f, dy3 = 2.0f)
                verticalLineToRelative(dy = 0.25f)
                horizontalLineToRelative(dx = 7.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.75f, y = 6.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 7.25f)
                horizontalLineToRelative(dx = -3.0f)
                verticalLineTo(y = 7.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = -0.9f, dy2 = 2.0f, dx3 = -2.0f, dy3 = 2.0f)
                horizontalLineToRelative(dx = -6.0f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.5f, dx3 = -2.0f, dy3 = -2.0f)
                verticalLineTo(y = 7.25f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 5.75f, x2 = 2.0f, y2 = 5.75f)
                horizontalLineToRelative(dx = 7.0f)
                verticalLineTo(y = 5.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.5f, dx2 = 0.9f, dy2 = -2.0f, dx3 = 2.0f, dy3 = -2.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.5f, dx3 = 2.0f, dy3 = 2.0f)
                verticalLineToRelative(dy = 0.25f)
                horizontalLineToRelative(dx = 3.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
            }
        }.build().also { _candleTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _candleTwo: ImageVector? = null
