package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bluetooth: ImageVector
    get() {
        val current = _bluetooth
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bluetooth",
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
                moveTo(x = 14.95f, y = 3.39f)
                lineToRelative(dx = -1.13f, dy = -0.95f)
                curveTo(x1 = 12.82f, y1 = 1.61f, x2 = 12.0f, y2 = 1.99f, x3 = 12.0f, y3 = 3.29f)
                verticalLineToRelative(dy = 17.42f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.3f, dx2 = 0.82f, dy2 = 1.68f, dx3 = 1.82f, dy3 = 0.85f)
                lineToRelative(dx = 3.85f, dy = -3.21f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.04f, dy1 = -1.67f)
                lineTo(x = 5.36f, y = 5.36f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.36f, y = 18.64f)
                lineTo(x = 17.71f, y = 7.32f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.04f, dy1 = -1.67f)
            }
        }.build().also { _bluetooth = it }
    }

@Suppress("ObjectPropertyName")
private var _bluetooth: ImageVector? = null
