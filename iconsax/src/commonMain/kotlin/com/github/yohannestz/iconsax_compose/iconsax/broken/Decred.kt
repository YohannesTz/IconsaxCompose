package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Decred: ImageVector
    get() {
        val current = _decred
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Decred",
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
                moveTo(x = 3.82f, y = 8.99f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.65f, dy1 = -1.24f)
                lineToRelative(dx = 0.19f, dy = -0.1f)
                lineTo(x = 2.0f, y = 4.0f)
                horizontalLineToRelative(dx = 5.0f)
                lineToRelative(dx = 6.0f, dy = 6.0f)
                horizontalLineTo(x = 8.5f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 7.0f)
                horizontalLineTo(x = 10.0f)
                lineToRelative(dx = 3.0f, dy = 3.0f)
                horizontalLineTo(x = 8.5f)
                arcTo(horizontalEllipseRadius = 6.5f, verticalEllipseRadius = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 13.5f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.07f, dy1 = -0.96f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.35f, y = 16.35f)
                lineTo(x = 22.0f, y = 20.0f)
                horizontalLineToRelative(dx = -5.0f)
                lineToRelative(dx = -6.0f, dy = -6.0f)
                horizontalLineToRelative(dx = 4.5f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -7.0f)
                horizontalLineTo(x = 14.0f)
                lineToRelative(dx = -3.0f, dy = -3.0f)
                horizontalLineToRelative(dx = 4.5f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.03f, dy1 = 12.25f)
                close()
            }
        }.build().also { _decred = it }
    }

@Suppress("ObjectPropertyName")
private var _decred: ImageVector? = null
