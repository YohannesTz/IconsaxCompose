package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ForwardFifteenSeconds: ImageVector
    get() {
        val current = _forwardFifteenSeconds
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ForwardFifteenSeconds",
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
                moveTo(x = 15.96f, y = 10.83f)
                horizontalLineTo(x = 12.9f)
                lineToRelative(dx = -0.76f, dy = 2.29f)
                horizontalLineToRelative(dx = 2.29f)
                arcToRelative(a = 1.53f, b = 1.53f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 3.06f)
                horizontalLineToRelative(dx = -2.29f)
                moveToRelative(dx = -2.6f, dy = -0.01f)
                verticalLineToRelative(dy = -5.34f)
                lineToRelative(dx = -1.5f, dy = 1.67f)
                moveToRelative(dx = 5.94f, dy = -8.03f)
                lineTo(x = 12.0f, y = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.09f, y = 7.8f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.8f, dy1 = 5.31f)
                arcTo(horizontalEllipseRadius = 8.9f, verticalEllipseRadius = 8.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 8.9f, b = 8.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -8.89f, dy1 = -8.89f)
                arcTo(horizontalEllipseRadius = 8.9f, verticalEllipseRadius = 8.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 4.22f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.98f, dy1 = 0.24f)
            }
        }.build().also { _forwardFifteenSeconds = it }
    }

@Suppress("ObjectPropertyName")
private var _forwardFifteenSeconds: ImageVector? = null
