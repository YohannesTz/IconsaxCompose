package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeartTick: ImageVector
    get() {
        val current = _heartTick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HeartTick",
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
                moveTo(x = 7.56f, y = 3.1f)
                arcTo(horizontalEllipseRadius = 5.6f, verticalEllipseRadius = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 5.33f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.44f, dy1 = -2.23f)
                curveTo(x1 = 19.51f, y1 = 3.1f, x2 = 22.0f, y2 = 5.6f, x3 = 22.0f, y3 = 8.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.96f, dx2 = -0.51f, dy2 = 3.7f, dx3 = -1.31f, dy3 = 5.21f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.49f, dy1 = -1.5f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.57f, dy1 = 8.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = 0.4f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.24f, dy1 = 0.0f)
                curveTo(x1 = 8.48f, y1 = 19.82f, x2 = 2.0f, y2 = 15.7f, x3 = 2.0f, y3 = 8.7f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.63f, dy1 = -3.96f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 17.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.9f, dx2 = -0.25f, dy2 = 1.75f, dx3 = -0.7f, dy3 = 2.47f)
                arcTo(horizontalEllipseRadius = 4.8f, verticalEllipseRadius = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.2f, y1 = 22.0f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.1f, dy1 = -2.33f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.7f, dy1 = -2.47f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.6f, dy1 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.33f, y = 17.2f)
                lineToRelative(dx = 1.18f, dy = 1.18f)
                lineToRelative(dx = 2.56f, dy = -2.36f)
            }
        }.build().also { _heartTick = it }
    }

@Suppress("ObjectPropertyName")
private var _heartTick: ImageVector? = null
