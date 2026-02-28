package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Aquarius: ImageVector
    get() {
        val current = _aquarius
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Aquarius",
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
                moveTo(x = 12.0f, y = 16.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -7.0f, dy1 = -7.0f)
                moveToRelative(dx = 7.0f, dy = 7.0f)
                verticalLineToRelative(dy = 6.0f)
                moveToRelative(dx = 3.0f, dy = -3.0f)
                horizontalLineTo(x = 9.0f)
            }
        }.build().also { _aquarius = it }
    }

@Suppress("ObjectPropertyName")
private var _aquarius: ImageVector? = null
