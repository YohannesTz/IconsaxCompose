package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thorchain: ImageVector
    get() {
        val current = _thorchain
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Thorchain",
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
                moveTo(x = 12.68f, y = 11.7f)
                lineToRelative(dx = 6.49f, dy = -7.93f)
                curveToRelative(dx1 = 0.71f, dy1 = -0.87f, dx2 = -0.22f, dy2 = -2.12f, dx3 = -1.26f, dy3 = -1.68f)
                lineTo(x = 8.97f, y = 5.84f)
                arcTo(horizontalEllipseRadius = 1.08f, verticalEllipseRadius = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.62f, y1 = 7.6f)
                lineTo(x = 9.9f, y = 8.9f)
                moveTo(x = 6.08f, y = 21.91f)
                lineToRelative(dx = 10.3f, dy = -4.34f)
                arcToRelative(a = 1.08f, b = 1.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.35f, dy1 = -1.76f)
                lineToRelative(dx = -4.06f, dy = -4.1f)
                lineToRelative(dx = -7.81f, dy = 8.47f)
                curveToRelative(dx1 = -0.78f, dy1 = 0.85f, dx2 = 0.15f, dy2 = 2.18f, dx3 = 1.22f, dy3 = 1.73f)
            }
        }.build().also { _thorchain = it }
    }

@Suppress("ObjectPropertyName")
private var _thorchain: ImageVector? = null
