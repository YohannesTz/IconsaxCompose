package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Monero: ImageVector
    get() {
        val current = _monero
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Monero",
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
                moveTo(x = 21.54f, y = 15.0f)
                arcToRelative(a = 10.01f, b = 10.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -19.07f, dy1 = 0.04f)
                lineTo(x = 7.0f, y = 15.0f)
                verticalLineTo(y = 9.0f)
                lineToRelative(dx = 5.0f, dy = 6.0f)
                lineToRelative(dx = 5.0f, dy = -6.0f)
                verticalLineToRelative(dy = 6.0f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 12.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.46f, dy1 = 3.0f)
                horizontalLineTo(x = 17.0f)
                verticalLineTo(y = 9.0f)
                lineToRelative(dx = -5.0f, dy = 6.0f)
                lineToRelative(dx = -5.0f, dy = -6.0f)
                verticalLineToRelative(dy = 6.0f)
                lineToRelative(dx = -4.53f, dy = 0.04f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 22.0f, y1 = 12.0f)
            }
        }.build().also { _monero = it }
    }

@Suppress("ObjectPropertyName")
private var _monero: ImageVector? = null
