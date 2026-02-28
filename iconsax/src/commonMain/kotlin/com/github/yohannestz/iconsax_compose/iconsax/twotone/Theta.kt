package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Theta: ImageVector
    get() {
        val current = _theta
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Theta",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.15f, y = 18.0f)
                horizontalLineToRelative(dx = -6.3f)
                arcTo(horizontalEllipseRadius = 1.85f, verticalEllipseRadius = 1.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 16.15f)
                verticalLineToRelative(dy = -8.3f)
                arcTo(horizontalEllipseRadius = 1.85f, verticalEllipseRadius = 1.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.85f, y1 = 6.0f)
                horizontalLineToRelative(dx = 6.3f)
                arcTo(horizontalEllipseRadius = 1.85f, verticalEllipseRadius = 1.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 7.85f)
                verticalLineToRelative(dy = 8.3f)
                arcTo(horizontalEllipseRadius = 1.85f, verticalEllipseRadius = 1.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.15f, y1 = 18.0f)
                moveTo(x = 12.0f, y = 8.5f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = -2.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = -2.0f, dy = 5.0f)
                verticalLineToRelative(dy = -2.0f)
                moveToRelative(dx = -2.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.0f, y = 22.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -7.0f, dy2 = -2.0f, dx3 = -7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = 2.0f, dy2 = -7.0f, dx3 = 7.0f, dy3 = -7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = 2.0f, dx3 = 7.0f, dy3 = 7.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = -2.0f, dy2 = 7.0f, dx3 = -7.0f, dy3 = 7.0f)
            }
        }.build().also { _theta = it }
    }

@Suppress("ObjectPropertyName")
private var _theta: ImageVector? = null
