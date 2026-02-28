package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BrushBig: ImageVector
    get() {
        val current = _brushBig
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BrushBig",
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
                moveTo(x = 9.5f, y = 19.5f)
                verticalLineTo(y = 18.0f)
                horizontalLineToRelative(dx = -5.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.41f, dy1 = -0.59f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.5f, y1 = 16.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.03f, dx2 = 0.8f, dy2 = -1.89f, dx3 = 1.81f, dy3 = -1.99f)
                lineTo(x = 4.5f, y = 14.0f)
                horizontalLineToRelative(dx = 15.0f)
                lineToRelative(dx = 0.19f, dy = 0.01f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.22f, dy1 = 0.58f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.58f, dy1 = 1.59f)
                curveTo(x1 = 21.4f, y1 = 17.23f, x2 = 20.45f, y2 = 18.0f, x3 = 19.39f, y3 = 18.0f)
                horizontalLineTo(x = 14.5f)
                verticalLineToRelative(dy = 1.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = 0.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.17f, y = 5.3f)
                lineToRelative(dx = -0.48f, dy = 8.71f)
                lineTo(x = 19.5f, y = 14.0f)
                horizontalLineToRelative(dx = -15.0f)
                lineToRelative(dx = -0.19f, dy = 0.01f)
                lineTo(x = 3.83f, y = 5.3f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.81f, y1 = 2.0f)
                horizontalLineToRelative(dx = 10.38f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.98f, dy1 = 3.3f)
                moveTo(x = 7.99f, y = 2.0f)
                verticalLineToRelative(dy = 5.0f)
                moveTo(x = 12.0f, y = 2.0f)
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _brushBig = it }
    }

@Suppress("ObjectPropertyName")
private var _brushBig: ImageVector? = null
