package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Js: ImageVector
    get() {
        val current = _js
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Js",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.51f, y = 2.27f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.97f, dy1 = 0.0f)
                lineToRelative(dx = 8.0f, dy = 4.44f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.51f, dy1 = 0.87f)
                verticalLineToRelative(dy = 8.82f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = 0.87f)
                lineToRelative(dx = -8.0f, dy = 4.44f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.97f, dy1 = 0.0f)
                lineTo(x = 10.0f, y = 21.0f)
                moveTo(x = 9.0f, y = 9.0f)
                lineToRelative(dx = -0.01f, dy = 7.93f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.97f, dy1 = 1.75f)
                lineTo(x = 3.51f, y = 17.3f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.0f, y1 = 16.42f)
                verticalLineTo(y = 7.6f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.51f, dy1 = -0.87f)
                lineToRelative(dx = 3.7f, dy = -2.06f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 10.75f)
                arcTo(horizontalEllipseRadius = 1.75f, verticalEllipseRadius = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.25f, y1 = 9.0f)
                horizontalLineTo(x = 13.5f)
                curveToRelative(dx1 = -0.97f, dy1 = 0.0f, dx2 = -1.75f, dy2 = 0.78f, dx3 = -1.75f, dy3 = 1.75f)
                reflectiveCurveToRelative(dx1 = 0.78f, dy1 = 1.75f, dx2 = 1.75f, dy2 = 1.75f)
                horizontalLineToRelative(dx = 1.75f)
                curveToRelative(dx1 = 0.97f, dy1 = 0.0f, dx2 = 1.75f, dy2 = 0.78f, dx3 = 1.75f, dy3 = 1.75f)
                reflectiveCurveTo(x1 = 16.22f, y1 = 16.0f, x2 = 15.25f, y2 = 16.0f)
                horizontalLineTo(x = 13.5f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.75f, dy1 = -1.75f)
            }
        }.build().also { _js = it }
    }

@Suppress("ObjectPropertyName")
private var _js: ImageVector? = null
