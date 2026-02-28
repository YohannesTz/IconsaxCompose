package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lovely: ImageVector
    get() {
        val current = _lovely
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Lovely",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.86f, y = 8.1f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.08f, dy1 = 1.21f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.46f, dy1 = 1.18f)
                arcToRelative(a = 3.72f, b = 3.72f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.69f, dy1 = 2.25f)
                arcToRelative(a = 8.2f, b = 8.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 6.12f)
                lineToRelative(dx = -0.15f, dy = 0.06f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.1f, dy1 = 0.0f)
                curveTo(x1 = 7.79f, y1 = 18.03f, x2 = 2.0f, y2 = 14.35f, x3 = 2.0f, y3 = 8.1f)
                arcToRelative(a = 4.97f, b = 4.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.93f, dy1 = -3.0f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.9f, y1 = 3.1f)
                arcToRelative(a = 4.97f, b = 4.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.96f, dy1 = 5.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 12.74f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.68f, dx2 = -4.33f, dy2 = 7.44f, dx3 = -6.27f, dy3 = 8.1f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.83f, dy1 = 0.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.27f, dy1 = -1.98f)
                arcToRelative(a = 8.2f, b = 8.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = -6.12f)
                arcToRelative(a = 3.72f, b = 3.72f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.69f, dy1 = -2.25f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.46f, dy1 = -1.18f)
                arcTo(horizontalEllipseRadius = 3.7f, verticalEllipseRadius = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 12.74f)
            }
        }.build().also { _lovely = it }
    }

@Suppress("ObjectPropertyName")
private var _lovely: ImageVector? = null
