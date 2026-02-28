package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Mask: ImageVector
    get() {
        val current = _mask
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Mask",
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
                moveTo(x = 2.0f, y = 12.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.93f, dy1 = 7.07f)
                lineTo(x = 19.07f, y = 4.93f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.0f)
                curveTo(x1 = 8.07f, y1 = 2.0f, x2 = 4.67f, y2 = 4.27f, x3 = 3.03f, y3 = 7.57f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 12.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -17.07f, dy1 = 7.07f)
                lineTo(x = 19.07f, y = 4.93f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 12.0f)
                moveTo(x = 7.76f, y = 16.24f)
                lineToRelative(dx = 5.65f, dy = 5.66f)
                moveToRelative(dx = -2.12f, dy = -9.19f)
                lineToRelative(dx = 6.58f, dy = 6.57f)
                moveToRelative(dx = -3.04f, dy = -10.1f)
                lineToRelative(dx = 6.29f, dy = 6.3f)
            }
        }.build().also { _mask = it }
    }

@Suppress("ObjectPropertyName")
private var _mask: ImageVector? = null
