package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Notepad: ImageVector
    get() {
        val current = _notepad
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Notepad",
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
                moveTo(x = 21.66f, y = 10.44f)
                lineToRelative(dx = -0.98f, dy = 4.18f)
                curveToRelative(dx1 = -0.84f, dy1 = 3.61f, dx2 = -2.5f, dy2 = 5.07f, dx3 = -5.62f, dy3 = 4.77f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.62f, dy1 = -0.27f)
                lineToRelative(dx = -1.68f, dy = -0.4f)
                curveToRelative(dx1 = -4.17f, dy1 = -0.99f, dx2 = -5.46f, dy2 = -3.05f, dx3 = -4.48f, dy3 = -7.23f)
                lineTo(x = 8.26f, y = 7.3f)
                arcTo(horizontalEllipseRadius = 11.0f, verticalEllipseRadius = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 5.1f)
                curveToRelative(dx1 = 1.17f, dy1 = -2.42f, dx2 = 3.16f, dy2 = -3.07f, dx3 = 6.5f, dy3 = -2.28f)
                lineToRelative(dx = 1.67f, dy = 0.39f)
                curveToRelative(dx1 = 4.19f, dy1 = 0.98f, dx2 = 5.47f, dy2 = 3.05f, dx3 = 4.49f, dy3 = 7.23f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.06f, y = 19.39f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.35f, dy1 = 1.08f)
                lineToRelative(dx = -1.58f, dy = 0.52f)
                curveToRelative(dx1 = -3.97f, dy1 = 1.28f, dx2 = -6.06f, dy2 = 0.21f, dx3 = -7.35f, dy3 = -3.76f)
                lineTo(x = 2.5f, y = 13.28f)
                curveTo(x1 = 1.22f, y1 = 9.31f, x2 = 2.28f, y2 = 7.21f, x3 = 6.25f, y3 = 5.93f)
                lineToRelative(dx = 1.58f, dy = -0.52f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 5.1f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.74f, dy1 = 2.2f)
                lineToRelative(dx = -0.98f, dy = 4.19f)
                curveToRelative(dx1 = -0.98f, dy1 = 4.18f, dx2 = 0.31f, dy2 = 6.24f, dx3 = 4.48f, dy3 = 7.23f)
                lineToRelative(dx = 1.68f, dy = 0.4f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.62f, dy1 = 0.27f)
            }
        }.build().also { _notepad = it }
    }

@Suppress("ObjectPropertyName")
private var _notepad: ImageVector? = null
