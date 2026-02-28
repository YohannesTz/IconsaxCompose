package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BackwardItem: ImageVector
    get() {
        val current = _backwardItem
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BackwardItem",
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
                moveTo(x = 22.0f, y = 5.15f)
                verticalLineToRelative(dy = 2.7f)
                curveTo(x1 = 22.0f, y1 = 10.1f, x2 = 21.1f, y2 = 11.0f, x3 = 18.85f, y3 = 11.0f)
                horizontalLineToRelative(dx = -2.7f)
                curveTo(x1 = 13.9f, y1 = 11.0f, x2 = 13.0f, y2 = 10.1f, x3 = 13.0f, y3 = 7.85f)
                verticalLineToRelative(dy = -2.7f)
                curveTo(x1 = 13.0f, y1 = 2.9f, x2 = 13.9f, y2 = 2.0f, x3 = 16.15f, y3 = 2.0f)
                horizontalLineToRelative(dx = 2.7f)
                curveTo(x1 = 21.1f, y1 = 2.0f, x2 = 22.0f, y2 = 2.9f, x3 = 22.0f, y3 = 5.15f)
                moveToRelative(dx = -11.0f, dy = 11.0f)
                verticalLineToRelative(dy = 2.7f)
                curveTo(x1 = 11.0f, y1 = 21.1f, x2 = 10.1f, y2 = 22.0f, x3 = 7.85f, y3 = 22.0f)
                horizontalLineToRelative(dx = -2.7f)
                curveTo(x1 = 2.9f, y1 = 22.0f, x2 = 2.0f, y2 = 21.1f, x3 = 2.0f, y3 = 18.85f)
                verticalLineToRelative(dy = -2.7f)
                curveTo(x1 = 2.0f, y1 = 13.9f, x2 = 2.9f, y2 = 13.0f, x3 = 5.15f, y3 = 13.0f)
                horizontalLineToRelative(dx = 2.7f)
                curveTo(x1 = 10.1f, y1 = 13.0f, x2 = 11.0f, y2 = 13.9f, x3 = 11.0f, y3 = 16.15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.96f, y = 6.75f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.42f, dy1 = -0.13f)
                horizontalLineTo(x = 13.0f)
                verticalLineToRelative(dy = 1.23f)
                curveTo(x1 = 13.0f, y1 = 10.1f, x2 = 13.9f, y2 = 11.0f, x3 = 16.15f, y3 = 11.0f)
                horizontalLineToRelative(dx = 1.23f)
                verticalLineToRelative(dy = 2.62f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.7f, dx2 = -1.07f, dy2 = 3.76f, dx3 = -3.76f, dy3 = 3.76f)
                horizontalLineTo(x = 11.0f)
                verticalLineToRelative(dy = -1.23f)
                curveTo(x1 = 11.0f, y1 = 13.9f, x2 = 10.1f, y2 = 13.0f, x3 = 7.85f, y3 = 13.0f)
                horizontalLineTo(x = 6.62f)
                verticalLineToRelative(dy = -2.62f)
            }
        }.build().also { _backwardItem = it }
    }

@Suppress("ObjectPropertyName")
private var _backwardItem: ImageVector? = null
