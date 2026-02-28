package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                quadToRelative(dx1 = -1.97f, dy1 = 0.0f, dx2 = -3.35f, dy2 = -0.41f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.54f, dy1 = -0.78f)
                curveToRelative(dx1 = 0.25f, dy1 = -3.0f, dx2 = 3.28f, dy2 = -5.34f, dx3 = 6.89f, dy3 = -5.34f)
                reflectiveCurveToRelative(dx1 = 6.63f, dy1 = 2.34f, dx2 = 6.89f, dy2 = 5.34f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.54f, dy1 = 0.78f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.35f, dy1 = 0.4f)
                moveToRelative(dx = -8.28f, dy = -1.7f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 21.26f)
                horizontalLineToRelative(dx = 6.0f)
                quadToRelative(dx1 = 1.3f, dy1 = 0.0f, dx2 = 2.28f, dy2 = -0.2f)
                curveToRelative(dx1 = -0.53f, dy1 = -1.91f, dx2 = -2.72f, dy2 = -3.33f, dx3 = -5.28f, dy3 = -3.33f)
                reflectiveCurveToRelative(dx1 = -4.75f, dy1 = 1.42f, dx2 = -5.28f, dy2 = 3.34f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.0f, y = 2.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.78f, dx2 = 1.14f, dy2 = 5.85f, dx3 = 3.86f, dy3 = 6.62f)
                curveToRelative(dx1 = 0.22f, dy1 = -2.6f, dx2 = 2.89f, dy2 = -4.65f, dx3 = 6.14f, dy3 = -4.65f)
                reflectiveCurveToRelative(dx1 = 5.92f, dy1 = 2.05f, dx2 = 6.14f, dy2 = 4.65f)
                curveTo(x1 = 20.86f, y1 = 20.85f, x2 = 22.0f, y2 = 18.78f, x3 = 22.0f, y3 = 15.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                moveToRelative(dx = -3.0f, dy = 12.17f)
                arcTo(horizontalEllipseRadius = 3.58f, verticalEllipseRadius = 3.58f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 12.01f, y1 = 7.0f)
                arcTo(horizontalEllipseRadius = 3.58f, verticalEllipseRadius = 3.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 14.17f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 14.92f)
                arcToRelative(a = 4.34f, b = 4.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.33f, dy1 = -4.34f)
                arcToRelative(a = 4.33f, b = 4.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.66f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 4.34f, verticalEllipseRadius = 4.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 14.92f)
                moveToRelative(dx = 0.0f, dy = -7.17f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.67f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.67f)
            }
        }.build().also { _userSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _userSquare: ImageVector? = null
