package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Diamonds: ImageVector
    get() {
        val current = _diamonds
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Diamonds",
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
                moveTo(x = 16.29f, y = 2.15f)
                horizontalLineTo(x = 7.7f)
                curveTo(x1 = 6.0f, y1 = 2.15f, x2 = 5.25f, y2 = 3.0f, x3 = 4.79f, y3 = 4.04f)
                lineTo(x = 2.23f, y = 9.8f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.56f, dy1 = 3.43f)
                lineToRelative(dx = 6.86f, dy = 7.54f)
                arcToRelative(a = 3.14f, b = 3.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.71f, dy1 = 0.0f)
                lineToRelative(dx = 6.85f, dy = -7.55f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.55f, dy1 = -3.43f)
                lineTo(x = 19.2f, y = 4.03f)
                curveTo(x1 = 18.74f, y1 = 3.0f, x2 = 17.99f, y2 = 2.15f, x3 = 16.29f, y3 = 2.15f)
                moveTo(x = 3.5f, y = 8.0f)
                horizontalLineToRelative(dx = 17.0f)
            }
        }.build().also { _diamonds = it }
    }

@Suppress("ObjectPropertyName")
private var _diamonds: ImageVector? = null
