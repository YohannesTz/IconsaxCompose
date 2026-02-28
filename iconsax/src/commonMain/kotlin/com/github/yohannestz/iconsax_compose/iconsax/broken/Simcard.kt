package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Simcard: ImageVector
    get() {
        val current = _simcard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Simcard",
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
                moveTo(x = 3.0f, y = 11.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 2.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -6.93f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.33f, dx2 = -0.53f, dy2 = -2.6f, dx3 = -1.46f, dy3 = -3.54f)
                lineToRelative(dx = -3.07f, dy = -3.07f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.93f, y1 = 2.0f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 5.0f, y1 = 2.0f, x2 = 3.0f, y2 = 4.0f, x3 = 3.0f, y3 = 7.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.5f, y = 14.0f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
                lineToRelative(dx = 2.0f, dy = 2.0f)
                moveToRelative(dx = 5.0f, dy = -4.0f)
                lineToRelative(dx = 2.0f, dy = 2.0f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
            }
        }.build().also { _simcard = it }
    }

@Suppress("ObjectPropertyName")
private var _simcard: ImageVector? = null
