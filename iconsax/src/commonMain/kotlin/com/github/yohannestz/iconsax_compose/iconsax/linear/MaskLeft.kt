package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaskLeft: ImageVector
    get() {
        val current = _maskLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MaskLeft",
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
                moveTo(x = 21.97f, y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.94f, dx2 = -1.28f, dy2 = 5.6f, dx3 = -3.32f, dy3 = 7.41f)
                arcTo(horizontalEllipseRadius = 9.8f, verticalEllipseRadius = 9.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 21.97f)
                arcToRelative(a = 9.98f, b = 9.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -19.94f)
                arcToRelative(a = 9.8f, b = 9.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.65f, dy1 = 2.56f)
                arcTo(horizontalEllipseRadius = 9.9f, verticalEllipseRadius = 9.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.97f, y1 = 12.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.97f, y = 16.39f)
                curveToRelative(dx1 = -0.02f, dy1 = 1.65f, dx2 = -1.25f, dy2 = 2.05f, dx3 = -2.4f, dy3 = 1.59f)
                arcTo(horizontalEllipseRadius = 6.4f, verticalEllipseRadius = 6.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.53f, y1 = 12.0f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.04f, dy1 = -5.99f)
                curveToRelative(dx1 = 1.15f, dy1 = -0.46f, dx2 = 2.38f, dy2 = -0.05f, dx3 = 2.4f, dy3 = 1.59f)
                close()
            }
        }.build().also { _maskLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _maskLeft: ImageVector? = null
