package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Arrow: ImageVector
    get() {
        val current = _arrow
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Arrow",
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
                moveTo(x = 12.0f, y = 22.0f)
                verticalLineToRelative(dy = -2.0f)
                moveToRelative(dx = 0.0f, dy = -2.0f)
                verticalLineToRelative(dy = -2.0f)
                moveToRelative(dx = 0.0f, dy = -2.0f)
                verticalLineToRelative(dy = -3.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = -7.0f)
                horizontalLineToRelative(dx = 3.0f)
                moveTo(x = 2.0f, y = 4.0f)
                horizontalLineToRelative(dx = 3.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = 7.0f)
                verticalLineToRelative(dy = 3.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 2.0f)
                lineTo(x = 2.0f, y = 4.0f)
                lineToRelative(dx = 2.0f, dy = 2.0f)
                moveToRelative(dx = 16.0f, dy = -4.0f)
                lineToRelative(dx = 2.0f, dy = 2.0f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
            }
        }.build().also { _arrow = it }
    }

@Suppress("ObjectPropertyName")
private var _arrow: ImageVector? = null
