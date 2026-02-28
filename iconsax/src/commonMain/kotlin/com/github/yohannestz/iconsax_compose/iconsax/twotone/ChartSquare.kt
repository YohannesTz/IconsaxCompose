package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartSquare: ImageVector
    get() {
        val current = _chartSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ChartSquare",
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
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.11f, y = 11.15f)
                horizontalLineTo(x = 7.46f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = 1.14f)
                verticalLineToRelative(dy = 5.12f)
                horizontalLineToRelative(dx = 3.79f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.76f, y = 6.6f)
                horizontalLineToRelative(dx = -1.52f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = 1.14f)
                verticalLineToRelative(dy = 9.66f)
                horizontalLineToRelative(dx = 3.8f)
                verticalLineTo(y = 7.74f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.63f, dx2 = -0.5f, dy2 = -1.14f, dx3 = -1.14f, dy3 = -1.14f)
                moveToRelative(dx = 3.79f, dy = 6.25f)
                horizontalLineTo(x = 13.9f)
                verticalLineToRelative(dy = 4.55f)
                horizontalLineToRelative(dx = 3.79f)
                verticalLineTo(y = 14.0f)
                arcToRelative(a = 1.15f, b = 1.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = -1.15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
            }
        }.build().also { _chartSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _chartSquare: ImageVector? = null
