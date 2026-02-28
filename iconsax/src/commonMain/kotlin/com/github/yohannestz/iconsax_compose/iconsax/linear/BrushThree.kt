package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BrushThree: ImageVector
    get() {
        val current = _brushThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BrushThree",
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
                moveTo(x = 10.0f, y = 16.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.66f, dx2 = 0.0f, dy2 = -3.0f, dx3 = 3.0f, dy3 = -3.0f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -1.0f, dx3 = 3.0f, dy3 = -3.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.0f, dx2 = 0.0f, dy2 = -3.0f, dx3 = -3.0f, dy3 = -3.0f)
                horizontalLineToRelative(dx = -1.0f)
                moveToRelative(dx = -4.0f, dy = -3.0f)
                horizontalLineTo(x = 8.0f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.0f)
                horizontalLineToRelative(dx = 4.0f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 2.0f)
                horizontalLineTo(x = 7.0f)
                quadTo(x1 = 4.0f, y1 = 2.0f, x2 = 4.0f, y2 = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 1.0f, dy2 = 3.0f, dx3 = 3.0f, dy3 = 3.0f)
                horizontalLineToRelative(dx = 1.0f)
                quadTo(x1 = 6.5f, y1 = 5.0f, x2 = 8.0f, y2 = 2.0f)
                moveToRelative(dx = 5.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -1.0f)
                quadToRelative(dx1 = 1.5f, dy1 = 3.0f, dx2 = 0.0f, dy2 = 6.0f)
                horizontalLineToRelative(dx = 1.0f)
                quadToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -1.0f, dy2 = -3.0f, dx3 = -3.0f, dy3 = -3.0f)
                moveTo(x = 9.5f, y = 22.0f)
                horizontalLineToRelative(dx = 1.0f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 1.5f, dy2 = -1.0f, dx3 = 1.5f, dy3 = -1.5f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.5f, dx2 = 0.0f, dy2 = -1.5f, dx3 = -1.5f, dy3 = -1.5f)
                horizontalLineToRelative(dx = -1.0f)
                curveTo(x1 = 8.0f, y1 = 16.0f, x2 = 8.0f, y2 = 17.0f, x3 = 8.0f, y3 = 17.5f)
                verticalLineToRelative(dy = 3.0f)
                curveTo(x1 = 8.0f, y1 = 21.0f, x2 = 8.0f, y2 = 22.0f, x3 = 9.5f, y3 = 22.0f)
            }
        }.build().also { _brushThree = it }
    }

@Suppress("ObjectPropertyName")
private var _brushThree: ImageVector? = null
