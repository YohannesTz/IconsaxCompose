package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeartSlash: ImageVector
    get() {
        val current = _heartSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HeartSlash",
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
                moveTo(x = 6.11f, y = 17.5f)
                curveTo(x1 = 3.9f, y1 = 15.43f, x2 = 2.0f, y2 = 12.48f, x3 = 2.0f, y3 = 8.68f)
                arcToRelative(a = 5.57f, b = 5.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.56f, dy1 = -5.59f)
                arcTo(horizontalEllipseRadius = 5.5f, verticalEllipseRadius = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 5.33f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.44f, dy1 = -2.24f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.11f, dy1 = 0.96f)
                moveTo(x = 21.74f, y = 7.0f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 8.69f)
                curveToRelative(dx1 = 0.0f, dy1 = 7.0f, dx2 = -6.48f, dy2 = 11.13f, dx3 = -9.38f, dy3 = 12.13f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.24f, dy1 = 0.0f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.36f, dy1 = -1.13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 2.0f)
                lineTo(x = 2.0f, y = 22.0f)
            }
        }.build().also { _heartSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _heartSlash: ImageVector? = null
