package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Drop: ImageVector
    get() {
        val current = _drop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Drop",
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
                moveTo(x = 3.9f, y = 13.9f)
                arcToRelative(a = 8.11f, b = 8.11f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 16.2f, dy1 = 0.01f)
                curveToRelative(dx1 = 0.03f, dy1 = -5.43f, dx2 = -5.6f, dy2 = -10.24f, dx3 = -7.5f, dy3 = -11.7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.61f, y = 2.21f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.22f, dy1 = 0.0f)
                curveTo(x1 = 10.01f, y1 = 3.26f, x2 = 6.67f, y2 = 6.04f, x3 = 4.96f, y3 = 9.6f)
            }
        }.build().also { _drop = it }
    }

@Suppress("ObjectPropertyName")
private var _drop: ImageVector? = null
