package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ForwardItem: ImageVector
    get() {
        val current = _forwardItem
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ForwardItem",
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
                moveTo(x = 6.73f, y = 14.97f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.12f, dy1 = -1.36f)
                verticalLineToRelative(dy = -3.23f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.69f, dx2 = 1.08f, dy2 = -3.77f, dx3 = 3.77f, dy3 = -3.77f)
                horizontalLineToRelative(dx = 3.23f)
                curveToRelative(dx1 = 2.69f, dy1 = 0.0f, dx2 = 3.77f, dy2 = 1.08f, dx3 = 3.77f, dy3 = 3.77f)
                verticalLineToRelative(dy = 3.23f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.69f, dx2 = -1.08f, dy2 = 3.77f, dx3 = -3.77f, dy3 = 3.77f)
                horizontalLineToRelative(dx = -3.23f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 5.77f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.69f, dx2 = -1.08f, dy2 = 3.77f, dx3 = -3.77f, dy3 = 3.77f)
                horizontalLineToRelative(dx = -0.85f)
                verticalLineToRelative(dy = -2.38f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.69f, dx2 = -1.08f, dy2 = -3.77f, dx3 = -3.77f, dy3 = -3.77f)
                horizontalLineToRelative(dx = -2.38f)
                verticalLineTo(y = 5.77f)
                curveTo(x1 = 11.23f, y1 = 3.08f, x2 = 12.31f, y2 = 2.0f, x3 = 15.0f, y3 = 2.0f)
                horizontalLineToRelative(dx = 3.23f)
                curveTo(x1 = 20.92f, y1 = 2.0f, x2 = 22.0f, y2 = 3.08f, x3 = 22.0f, y3 = 5.77f)
                moveToRelative(dx = -9.23f, dy = 11.61f)
                verticalLineToRelative(dy = 0.85f)
                curveTo(x1 = 12.77f, y1 = 20.92f, x2 = 11.69f, y2 = 22.0f, x3 = 9.0f, y3 = 22.0f)
                horizontalLineTo(x = 5.77f)
                curveTo(x1 = 3.08f, y1 = 22.0f, x2 = 2.0f, y2 = 20.92f, x3 = 2.0f, y3 = 18.23f)
                verticalLineTo(y = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.69f, dx2 = 1.08f, dy2 = -3.77f, dx3 = 3.77f, dy3 = -3.77f)
                horizontalLineToRelative(dx = 0.85f)
            }
        }.build().also { _forwardItem = it }
    }

@Suppress("ObjectPropertyName")
private var _forwardItem: ImageVector? = null
