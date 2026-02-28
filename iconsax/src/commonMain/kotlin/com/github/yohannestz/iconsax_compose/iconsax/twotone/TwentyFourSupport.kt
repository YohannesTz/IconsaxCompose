package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TwentyFourSupport: ImageVector
    get() {
        val current = _twentyFourSupport
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TwentyFourSupport",
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
                moveTo(x = 18.0f, y = 18.86f)
                horizontalLineToRelative(dx = -0.76f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = 0.87f)
                lineToRelative(dx = -1.71f, dy = 1.7f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.83f, dy1 = 0.0f)
                lineToRelative(dx = -1.71f, dy = -1.7f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = -0.87f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -1.66f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -1.33f, dx3 = -3.0f, dy3 = -2.97f)
                verticalLineTo(y = 5.0f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 2.0f)
                horizontalLineToRelative(dx = 12.0f)
                curveToRelative(dx1 = 1.66f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 1.33f, dx3 = 3.0f, dy3 = 2.97f)
                verticalLineTo(y = 15.9f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 2.97f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.0f, y = 9.16f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.69f, dy1 = -1.7f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.69f, dy1 = 1.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.88f, dx2 = -2.67f, dy2 = 2.08f, dx3 = -3.26f, dy3 = 3.87f)
                curveTo(x1 = 7.0f, y1 = 13.4f, x2 = 7.31f, y2 = 13.77f, x3 = 7.7f, y3 = 13.77f)
                horizontalLineToRelative(dx = 2.68f)
                moveToRelative(dx = 5.66f, dy = -0.01f)
                verticalLineTo(y = 8.05f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.42f, dy1 = -0.56f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.66f, dy1 = 0.25f)
                curveToRelative(dx1 = -0.72f, dy1 = 1.16f, dx2 = -1.5f, dy2 = 2.48f, dx3 = -2.18f, dy3 = 3.64f)
                curveToRelative(dx1 = -0.11f, dy1 = 0.19f, dx2 = -0.11f, dy2 = 0.44f, dx3 = 0.0f, dy3 = 0.63f)
                reflectiveCurveToRelative(dx1 = 0.32f, dy1 = 0.31f, dx2 = 0.55f, dy2 = 0.31f)
                horizontalLineTo(x = 17.0f)
            }
        }.build().also { _twentyFourSupport = it }
    }

@Suppress("ObjectPropertyName")
private var _twentyFourSupport: ImageVector? = null
