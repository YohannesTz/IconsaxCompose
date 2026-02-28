package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BackwardFifteenSeconds: ImageVector
    get() {
        val current = _backwardFifteenSeconds
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BackwardFifteenSeconds",
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
                moveTo(x = 10.02f, y = 4.47f)
                lineTo(x = 12.0f, y = 2.0f)
                moveTo(x = 3.99f, y = 16.96f)
                arcToRelative(a = 8.89f, b = 8.89f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 16.9f, dy1 = -3.85f)
                arcToRelative(a = 8.9f, b = 8.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -8.9f, dy1 = -8.9f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.97f, dy1 = 0.25f)
                moveTo(x = 4.9f, y = 7.8f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.8f, dy1 = 5.31f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.96f, y = 10.83f)
                horizontalLineTo(x = 12.9f)
                lineToRelative(dx = -0.76f, dy = 2.29f)
                horizontalLineToRelative(dx = 2.29f)
                arcToRelative(a = 1.53f, b = 1.53f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 3.06f)
                horizontalLineToRelative(dx = -2.29f)
                moveToRelative(dx = -2.6f, dy = -0.01f)
                verticalLineToRelative(dy = -5.34f)
                lineToRelative(dx = -1.5f, dy = 1.67f)
            }
        }.build().also { _backwardFifteenSeconds = it }
    }

@Suppress("ObjectPropertyName")
private var _backwardFifteenSeconds: ImageVector? = null
