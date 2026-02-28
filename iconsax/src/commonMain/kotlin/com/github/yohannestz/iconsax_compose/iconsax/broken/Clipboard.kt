package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Clipboard: ImageVector
    get() {
        val current = _clipboard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Clipboard",
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
                moveTo(x = 13.89f, y = 2.88f)
                curveToRelative(dx1 = 3.14f, dy1 = 0.49f, dx2 = 4.61f, dy2 = 1.77f, dx3 = 4.74f, dy3 = 4.27f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.13f, dy1 = 2.07f)
                lineToRelative(dx = -0.73f, dy = 4.69f)
                curveToRelative(dx1 = -0.62f, dy1 = 3.9f, dx2 = -2.43f, dy2 = 5.23f, dx3 = -6.34f, dy3 = 4.62f)
                lineToRelative(dx = -4.69f, dy = -0.74f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.15f, dy1 = -1.11f)
                curveTo(x1 = 2.14f, y1 = 15.67f, x2 = 1.72f, y2 = 14.0f, x3 = 2.12f, y3 = 11.45f)
                lineToRelative(dx = 0.74f, dy = -4.7f)
                curveToRelative(dx1 = 0.62f, dy1 = -3.9f, dx2 = 2.43f, dy2 = -5.22f, dx3 = 6.34f, dy3 = -4.61f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.5f, y = 13.47f)
                lineToRelative(dx = -1.5f, dy = 4.5f)
                curveToRelative(dx1 = -1.25f, dy1 = 3.77f, dx2 = -3.25f, dy2 = 4.77f, dx3 = -7.01f, dy3 = 3.52f)
                lineToRelative(dx = -4.51f, dy = -1.5f)
                curveToRelative(dx1 = -2.27f, dy1 = -0.75f, dx2 = -3.53f, dy2 = -1.8f, dx3 = -3.89f, dy3 = -3.31f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.15f, dy1 = 1.1f)
                lineToRelative(dx = 4.69f, dy = 0.75f)
                curveToRelative(dx1 = 3.91f, dy1 = 0.6f, dx2 = 5.72f, dy2 = -0.71f, dx3 = 6.34f, dy3 = -4.62f)
                lineToRelative(dx = 0.73f, dy = -4.7f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.13f, dy1 = -2.06f)
                curveToRelative(dx1 = 2.39f, dy1 = 1.27f, dx2 = 2.91f, dy2 = 3.19f, dx3 = 1.87f, dy3 = 6.32f)
                moveTo(x = 8.24f, y = 8.98f)
                arcToRelative(a = 1.74f, b = 1.74f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.48f)
                arcToRelative(a = 1.74f, b = 1.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.48f)
            }
        }.build().also { _clipboard = it }
    }

@Suppress("ObjectPropertyName")
private var _clipboard: ImageVector? = null
