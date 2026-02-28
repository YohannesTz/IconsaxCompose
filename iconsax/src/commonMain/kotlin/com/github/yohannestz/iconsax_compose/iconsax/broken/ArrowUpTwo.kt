package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowUpTwo: ImageVector
    get() {
        val current = _arrowUpTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowUpTwo",
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
                moveTo(x = 16.01f, y = 11.15f)
                lineTo(x = 13.4f, y = 8.53f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.8f, dy1 = 0.0f)
                lineToRelative(dx = -6.52f, dy = 6.52f)
                moveToRelative(dx = 15.84f, dy = 0.0f)
                lineToRelative(dx = -1.04f, dy = -1.04f)
            }
        }.build().also { _arrowUpTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowUpTwo: ImageVector? = null
