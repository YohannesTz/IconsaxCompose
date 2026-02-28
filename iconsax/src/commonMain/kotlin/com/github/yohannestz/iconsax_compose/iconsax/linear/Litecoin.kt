package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Litecoin: ImageVector
    get() {
        val current = _litecoin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Litecoin",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.6f, y = 6.4f)
                horizontalLineToRelative(dx = 2.5f)
                lineTo(x = 12.0f, y = 14.3f)
                horizontalLineToRelative(dx = 4.2f)
                lineToRelative(dx = -0.5f, dy = 2.8f)
                horizontalLineTo(x = 8.0f)
                lineToRelative(dx = 3.0f, dy = -10.7f)
                close()
                moveTo(x = 15.0f, y = 11.0f)
                lineToRelative(dx = -7.7f, dy = 1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
        }.build().also { _litecoin = it }
    }

@Suppress("ObjectPropertyName")
private var _litecoin: ImageVector? = null
