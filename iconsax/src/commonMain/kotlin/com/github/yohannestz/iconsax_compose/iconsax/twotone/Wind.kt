package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wind: ImageVector
    get() {
        val current = _wind
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Wind",
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
                moveTo(x = 2.0f, y = 15.0f)
                horizontalLineToRelative(dx = 16.5f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -3.5f, dy1 = 3.5f)
                verticalLineTo(y = 18.0f)
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
                moveTo(x = 2.0f, y = 12.0f)
                horizontalLineToRelative(dx = 16.5f)
                curveToRelative(dx1 = 1.92f, dy1 = 0.0f, dx2 = 3.5f, dy2 = -1.57f, dx3 = 3.5f, dy3 = -3.5f)
                curveTo(x1 = 22.0f, y1 = 6.58f, x2 = 20.42f, y2 = 5.0f, x3 = 18.5f, y3 = 5.0f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.0f, y1 = 8.5f)
                verticalLineTo(y = 9.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 9.0f)
                horizontalLineToRelative(dx = 7.31f)
                arcToRelative(a = 2.69f, b = 2.69f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -2.69f, dy1 = -2.69f)
                verticalLineTo(y = 6.7f)
            }
        }.build().also { _wind = it }
    }

@Suppress("ObjectPropertyName")
private var _wind: ImageVector? = null
