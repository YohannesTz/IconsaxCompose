package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoSlash: ImageVector
    get() {
        val current = _videoSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoSlash",
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
                moveTo(x = 16.63f, y = 7.58f)
                reflectiveCurveToRelative(dx1 = 0.03f, dy1 = -0.95f, dx2 = 0.0f, dy2 = -1.26f)
                curveToRelative(dx1 = -0.17f, dy1 = -2.04f, dx2 = -1.5f, dy2 = -2.74f, dx3 = -4.11f, dy3 = -2.74f)
                horizontalLineTo(x = 6.21f)
                curveTo(x1 = 3.05f, y1 = 3.58f, x2 = 2.0f, y2 = 4.63f, x3 = 2.0f, y3 = 7.79f)
                verticalLineToRelative(dy = 8.42f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.37f, dy1 = 3.34f)
                lineTo(x = 4.0f, y = 20.0f)
                moveToRelative(dx = 12.74f, dy = -9.05f)
                verticalLineToRelative(dy = 5.26f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.16f, dx2 = -1.05f, dy2 = 4.21f, dx3 = -4.21f, dy3 = 4.21f)
                horizontalLineTo(x = 7.26f)
                moveTo(x = 22.0f, y = 6.74f)
                verticalLineToRelative(dy = 9.07f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.67f, dx2 = -1.12f, dy2 = 2.25f, dx3 = -2.48f, dy3 = 1.29f)
                lineToRelative(dx = -2.78f, dy = -1.95f)
                moveToRelative(dx = 5.28f, dy = -12.96f)
                lineToRelative(dx = -20.0f, dy = 20.0f)
            }
        }.build().also { _videoSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _videoSlash: ImageVector? = null
