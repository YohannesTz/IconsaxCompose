package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserSquare: ImageVector
    get() {
        val current = _userSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.UserSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.14f, y = 21.62f)
                arcTo(horizontalEllipseRadius = 11.0f, verticalEllipseRadius = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 22.0f)
                horizontalLineTo(x = 9.0f)
                quadToRelative(dx1 = -1.83f, dy1 = 0.0f, dx2 = -3.14f, dy2 = -0.38f)
                curveToRelative(dx1 = 0.22f, dy1 = -2.6f, dx2 = 2.89f, dy2 = -4.65f, dx3 = 6.14f, dy3 = -4.65f)
                reflectiveCurveToRelative(dx1 = 5.92f, dy1 = 2.05f, dx2 = 6.14f, dy2 = 4.65f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.78f, dx2 = -1.14f, dy2 = 5.85f, dx3 = -3.86f, dy3 = 6.62f)
                arcTo(horizontalEllipseRadius = 11.0f, verticalEllipseRadius = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 22.0f)
                horizontalLineTo(x = 9.0f)
                quadToRelative(dx1 = -1.83f, dy1 = 0.0f, dx2 = -3.14f, dy2 = -0.38f)
                curveTo(x1 = 3.14f, y1 = 20.85f, x2 = 2.0f, y2 = 18.78f, x3 = 2.0f, y3 = 15.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = 2.0f, dy2 = -7.0f, dx3 = 7.0f, dy3 = -7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = 2.0f, dx3 = 7.0f, dy3 = 7.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.58f, y = 10.58f)
                arcToRelative(a = 3.58f, b = 3.58f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -7.17f, dy1 = 0.01f)
                arcToRelative(a = 3.58f, b = 3.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.17f, dy1 = -0.01f)
            }
        }.build().also { _userSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _userSquare: ImageVector? = null
