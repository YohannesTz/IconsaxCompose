package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EthereumClassic: ImageVector
    get() {
        val current = _ethereumClassic
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.EthereumClassic",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.9f, y = 9.1f)
                lineToRelative(dx = 4.77f, dy = -2.12f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.65f, dy1 = 0.0f)
                lineToRelative(dx = 4.77f, dy = 2.12f)
                curveToRelative(dx1 = 0.42f, dy1 = 0.2f, dx2 = 0.81f, dy2 = -0.32f, dx3 = 0.52f, dy3 = -0.68f)
                lineToRelative(dx = -5.0f, dy = -6.1f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.24f, dy1 = 0.0f)
                lineToRelative(dx = -5.0f, dy = 6.1f)
                curveTo(x1 = 6.09f, y1 = 8.78f, x2 = 6.48f, y2 = 9.3f, x3 = 6.9f, y3 = 9.1f)
                moveToRelative(dx = 0.0f, dy = 5.8f)
                lineToRelative(dx = 4.78f, dy = 2.12f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.65f, dy1 = 0.0f)
                lineToRelative(dx = 4.78f, dy = -2.12f)
                curveToRelative(dx1 = 0.42f, dy1 = -0.19f, dx2 = 0.81f, dy2 = 0.32f, dx3 = 0.52f, dy3 = 0.68f)
                lineToRelative(dx = -5.0f, dy = 6.11f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.24f, dy1 = 0.0f)
                lineToRelative(dx = -5.0f, dy = -6.11f)
                curveToRelative(dx1 = -0.3f, dy1 = -0.36f, dx2 = 0.08f, dy2 = -0.87f, dx3 = 0.51f, dy3 = -0.68f)
                moveToRelative(dx = 9.11f, dy = -2.28f)
                lineTo(x = 17.24f, y = 12.0f)
                lineTo(x = 12.0f, y = 9.38f)
                lineTo(x = 6.76f, y = 12.0f)
                lineTo(x = 12.0f, y = 14.62f)
                lineToRelative(dx = 0.8f, dy = -0.4f)
            }
        }.build().also { _ethereumClassic = it }
    }

@Suppress("ObjectPropertyName")
private var _ethereumClassic: ImageVector? = null
