package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Global: ImageVector
    get() {
        val current = _global
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Global",
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
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 3.0f)
                horizontalLineToRelative(dx = 1.0f)
                arcToRelative(a = 28.4f, b = 28.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.0f)
                horizontalLineTo(x = 8.0f)
                moveToRelative(dx = 7.0f, dy = -18.0f)
                arcToRelative(a = 28.4f, b = 28.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 18.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.0f, y = 16.0f)
                verticalLineToRelative(dy = -1.0f)
                arcToRelative(a = 28.4f, b = 28.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 18.0f, dy1 = 0.0f)
                verticalLineToRelative(dy = 1.0f)
                moveTo(x = 3.0f, y = 9.0f)
                arcToRelative(a = 28.4f, b = 28.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 18.0f, dy1 = 0.0f)
            }
        }.build().also { _global = it }
    }

@Suppress("ObjectPropertyName")
private var _global: ImageVector? = null
