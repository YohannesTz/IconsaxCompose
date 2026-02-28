package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Edit: ImageVector
    get() {
        val current = _edit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Edit",
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
                moveTo(x = 22.0f, y = 13.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = -2.0f, dy2 = 7.0f, dx3 = -7.0f, dy3 = 7.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -7.0f, dy2 = -2.0f, dx3 = -7.0f, dy3 = -7.0f)
                verticalLineToRelative(dy = -1.52f)
                moveTo(x = 11.0f, y = 2.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.93f, y = 9.01f)
                lineToRelative(dx = 1.05f, dy = -1.05f)
                curveToRelative(dx1 = 1.36f, dy1 = -1.36f, dx2 = 2.0f, dy2 = -2.94f, dx3 = 0.0f, dy3 = -4.94f)
                reflectiveCurveToRelative(dx1 = -3.58f, dy1 = -1.36f, dx2 = -4.94f, dy2 = 0.0f)
                lineTo(x = 8.16f, y = 10.9f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.66f, dy1 = 1.32f)
                lineToRelative(dx = -0.43f, dy = 3.01f)
                curveToRelative(dx1 = -0.16f, dy1 = 1.1f, dx2 = 0.61f, dy2 = 1.85f, dx3 = 1.7f, dy3 = 1.7f)
                lineToRelative(dx = 3.01f, dy = -0.43f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.32f, dy1 = -0.66f)
                lineToRelative(dx = 3.18f, dy = -3.18f)
                lineToRelative(dx = 0.73f, dy = -0.73f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.91f, y = 4.15f)
                arcToRelative(a = 7.1f, b = 7.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.94f, dy1 = 4.94f)
            }
        }.build().also { _edit = it }
    }

@Suppress("ObjectPropertyName")
private var _edit: ImageVector? = null
