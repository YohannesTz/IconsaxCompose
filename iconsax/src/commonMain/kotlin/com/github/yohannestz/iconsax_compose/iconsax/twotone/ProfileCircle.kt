package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProfileCircle: ImageVector
    get() {
        val current = _profileCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ProfileCircle",
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
                moveTo(x = 12.12f, y = 12.78f)
                horizontalLineToRelative(dx = -0.24f)
                arcToRelative(a = 3.27f, b = 3.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.16f, dy1 = -3.27f)
                arcTo(horizontalEllipseRadius = 3.3f, verticalEllipseRadius = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 6.23f)
                arcToRelative(a = 3.28f, b = 3.28f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.12f, dy1 = 6.55f)
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.74f, y = 19.38f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.74f, dy1 = -2.62f)
                curveToRelative(dx1 = 0.1f, dy1 = -0.94f, dx2 = 0.7f, dy2 = -1.86f, dx3 = 1.77f, dy3 = -2.58f)
                curveToRelative(dx1 = 2.74f, dy1 = -1.82f, dx2 = 7.22f, dy2 = -1.82f, dx3 = 9.94f, dy3 = 0.0f)
                curveToRelative(dx1 = 1.07f, dy1 = 0.72f, dx2 = 1.67f, dy2 = 1.64f, dx3 = 1.77f, dy3 = 2.58f)
            }
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
        }.build().also { _profileCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _profileCircle: ImageVector? = null
