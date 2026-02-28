package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Direct: ImageVector
    get() {
        val current = _direct
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Direct",
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
                moveTo(x = 2.69f, y = 19.01f)
                curveTo(x1 = 3.65f, y1 = 21.1f, x2 = 5.65f, y2 = 22.0f, x3 = 9.0f, y3 = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 13.0f)
                horizontalLineToRelative(dx = 3.76f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.79f, dy1 = 1.1f)
                lineToRelative(dx = 0.89f, dy = 1.8f)
                curveTo(x1 = 9.0f, y1 = 17.0f, x2 = 10.0f, y2 = 17.0f, x3 = 10.24f, y3 = 17.0f)
                horizontalLineToRelative(dx = 3.53f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.79f, dy1 = -1.11f)
                lineToRelative(dx = 0.89f, dy = -1.8f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.79f, dy1 = -1.1f)
                horizontalLineToRelative(dx = 3.74f)
                moveTo(x = 13.66f, y = 10.0f)
                horizontalLineToRelative(dx = 0.84f)
                moveToRelative(dx = -5.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 1.58f)
                moveToRelative(dx = -0.74f, dy = -3.0f)
                horizontalLineToRelative(dx = 3.33f)
            }
        }.build().also { _direct = it }
    }

@Suppress("ObjectPropertyName")
private var _direct: ImageVector? = null
