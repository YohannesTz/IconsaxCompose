package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CommandSquare: ImageVector
    get() {
        val current = _commandSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CommandSquare",
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
                moveTo(x = 2.0f, y = 13.02f)
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
                moveTo(x = 14.4f, y = 9.6f)
                horizontalLineTo(x = 9.6f)
                verticalLineToRelative(dy = 4.8f)
                horizontalLineToRelative(dx = 4.8f)
                close()
                moveTo(x = 7.8f, y = 18.0f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.8f, dy1 = -1.8f)
                verticalLineToRelative(dy = -1.8f)
                horizontalLineTo(x = 7.8f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.6f)
                moveToRelative(dx = 0.0f, dy = -8.4f)
                horizontalLineToRelative(dx = 1.8f)
                verticalLineTo(y = 7.8f)
                curveTo(x1 = 9.6f, y1 = 6.81f, x2 = 8.79f, y2 = 6.0f, x3 = 7.8f, y3 = 6.0f)
                reflectiveCurveTo(x1 = 6.0f, y1 = 6.81f, x2 = 6.0f, y2 = 7.8f)
                reflectiveCurveToRelative(dx1 = 0.81f, dy1 = 1.8f, dx2 = 1.8f, dy2 = 1.8f)
                moveToRelative(dx = 6.6f, dy = 0.0f)
                horizontalLineToRelative(dx = 1.8f)
                curveToRelative(dx1 = 0.99f, dy1 = 0.0f, dx2 = 1.8f, dy2 = -0.81f, dx3 = 1.8f, dy3 = -1.8f)
                reflectiveCurveTo(x1 = 17.19f, y1 = 6.0f, x2 = 16.2f, y2 = 6.0f)
                reflectiveCurveToRelative(dx1 = -1.8f, dy1 = 0.81f, dx2 = -1.8f, dy2 = 1.8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.2f, y = 18.0f)
                curveToRelative(dx1 = 0.99f, dy1 = 0.0f, dx2 = 1.8f, dy2 = -0.81f, dx3 = 1.8f, dy3 = -1.8f)
                reflectiveCurveToRelative(dx1 = -0.81f, dy1 = -1.8f, dx2 = -1.8f, dy2 = -1.8f)
                horizontalLineToRelative(dx = -1.8f)
                verticalLineToRelative(dy = 1.8f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.8f, dy1 = 1.8f)
            }
        }.build().also { _commandSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _commandSquare: ImageVector? = null
