package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CrownOne: ImageVector
    get() {
        val current = _crownOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CrownOne",
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
                moveTo(x = 2.0f, y = 10.99f)
                verticalLineTo(y = 5.71f)
                curveTo(x1 = 2.0f, y1 = 4.38f, x2 = 2.77f, y2 = 4.06f, x3 = 3.71f, y3 = 5.0f)
                lineTo(x = 6.3f, y = 7.59f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.41f, dy1 = 0.0f)
                lineTo(x = 11.29f, y = 4.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.41f, dy1 = 0.0f)
                lineToRelative(dx = 3.59f, dy = 3.59f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.41f, dy1 = 0.0f)
                lineTo(x = 20.29f, y = 5.0f)
                curveTo(x1 = 21.23f, y1 = 4.06f, x2 = 22.0f, y2 = 4.38f, x3 = 22.0f, y3 = 5.71f)
                verticalLineToRelative(dy = 9.59f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -2.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = -5.0f)
            }
        }.build().also { _crownOne = it }
    }

@Suppress("ObjectPropertyName")
private var _crownOne: ImageVector? = null
