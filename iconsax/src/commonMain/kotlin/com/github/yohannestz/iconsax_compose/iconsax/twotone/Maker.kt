package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Maker: ImageVector
    get() {
        val current = _maker
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Maker",
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
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
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
                moveTo(x = 6.58f, y = 14.5f)
                verticalLineToRelative(dy = -5.0f)
                lineToRelative(dx = 4.17f, dy = 2.5f)
                verticalLineToRelative(dy = 2.5f)
                moveToRelative(dx = 6.67f, dy = 0.0f)
                verticalLineToRelative(dy = -5.0f)
                lineTo(x = 13.25f, y = 12.0f)
                verticalLineToRelative(dy = 2.5f)
            }
        }.build().also { _maker = it }
    }

@Suppress("ObjectPropertyName")
private var _maker: ImageVector? = null
