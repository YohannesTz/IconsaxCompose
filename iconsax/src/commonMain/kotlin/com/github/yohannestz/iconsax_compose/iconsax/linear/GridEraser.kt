package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GridEraser: ImageVector
    get() {
        val current = _gridEraser
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GridEraser",
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
                moveTo(x = 22.0f, y = 11.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 1.0f)
                moveTo(x = 2.03f, y = 8.5f)
                horizontalLineTo(x = 22.0f)
                moveToRelative(dx = -19.97f, dy = 7.0f)
                horizontalLineTo(x = 12.0f)
                moveToRelative(dx = -3.49f, dy = 6.49f)
                verticalLineTo(y = 2.01f)
                moveToRelative(dx = 7.0f, dy = 9.98f)
                verticalLineTo(y = 2.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.8f, y = 19.7f)
                lineToRelative(dx = -1.9f, dy = 1.9f)
                arcToRelative(a = 1.36f, b = 1.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.91f, dy1 = 0.0f)
                lineToRelative(dx = -1.58f, dy = -1.59f)
                arcToRelative(a = 1.36f, b = 1.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.91f)
                lineToRelative(dx = 1.9f, dy = -1.89f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.61f, y = 16.9f)
                lineToRelative(dx = -2.81f, dy = 2.81f)
                lineToRelative(dx = -3.5f, dy = -3.5f)
                lineToRelative(dx = 2.81f, dy = -2.82f)
                arcToRelative(a = 1.36f, b = 1.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.91f, dy1 = 0.0f)
                lineToRelative(dx = 1.58f, dy = 1.59f)
                arcToRelative(a = 1.37f, b = 1.37f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.01f, dy1 = 1.92f)
            }
        }.build().also { _gridEraser = it }
    }

@Suppress("ObjectPropertyName")
private var _gridEraser: ImageVector? = null
