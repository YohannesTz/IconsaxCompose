package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Airpods: ImageVector
    get() {
        val current = _airpods
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Airpods",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.72f, y = 9.56f)
                horizontalLineTo(x = 5.78f)
                arcTo(horizontalEllipseRadius = 3.8f, verticalEllipseRadius = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 5.78f)
                curveTo(x1 = 2.0f, y1 = 3.7f, x2 = 3.7f, y2 = 2.0f, x3 = 5.78f, y3 = 2.0f)
                horizontalLineToRelative(dx = 1.89f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.83f, dy1 = 2.83f)
                verticalLineTo(y = 17.1f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.04f, dx2 = -0.85f, dy2 = 1.89f, dx3 = -1.89f, dy3 = 1.89f)
                reflectiveCurveToRelative(dx1 = -1.89f, dy1 = -0.85f, dx2 = -1.89f, dy2 = -1.89f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.78f, y = 6.72f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.88f)
                moveToRelative(dx = 11.5f, dy = 8.68f)
                verticalLineTo(y = 9.56f)
                horizontalLineToRelative(dx = 0.94f)
                curveToRelative(dx1 = 2.08f, dy1 = 0.0f, dx2 = 3.78f, dy2 = -1.7f, dx3 = 3.78f, dy3 = -3.78f)
                reflectiveCurveTo(x1 = 20.3f, y1 = 2.0f, x2 = 18.22f, y2 = 2.0f)
                horizontalLineToRelative(dx = -1.89f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.83f, dy1 = 2.83f)
                verticalLineTo(y = 17.1f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.04f, dx2 = 0.85f, dy2 = 1.89f, dx3 = 1.89f, dy3 = 1.89f)
                reflectiveCurveToRelative(dx1 = 1.89f, dy1 = -0.85f, dx2 = 1.89f, dy2 = -1.89f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.22f, y = 6.72f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.88f)
                moveTo(x = 8.5f, y = 22.0f)
                verticalLineToRelative(dy = -3.0f)
                moveToRelative(dx = 7.0f, dy = 3.0f)
                verticalLineToRelative(dy = -3.0f)
            }
        }.build().also { _airpods = it }
    }

@Suppress("ObjectPropertyName")
private var _airpods: ImageVector? = null
