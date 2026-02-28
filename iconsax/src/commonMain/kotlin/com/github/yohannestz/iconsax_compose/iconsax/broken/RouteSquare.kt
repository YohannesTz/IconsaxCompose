package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RouteSquare: ImageVector
    get() {
        val current = _routeSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RouteSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 13.05f)
                verticalLineTo(y = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.35f, y = 9.05f)
                lineToRelative(dx = -2.34f, dy = 7.54f)
                arcToRelative(a = 1.92f, b = 1.92f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.66f, dy1 = 0.04f)
                lineToRelative(dx = -0.7f, dy = -2.07f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = -1.21f)
                lineToRelative(dx = -2.09f, dy = -0.7f)
                curveTo(x1 = 5.6f, y1 = 12.06f, x2 = 5.62f, y2 = 9.53f, x3 = 7.41f, y3 = 8.99f)
                lineToRelative(dx = 7.54f, dy = -2.35f)
                arcToRelative(a = 1.92f, b = 1.92f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.4f, dy1 = 2.41f)
                close()
            }
        }.build().also { _routeSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _routeSquare: ImageVector? = null
