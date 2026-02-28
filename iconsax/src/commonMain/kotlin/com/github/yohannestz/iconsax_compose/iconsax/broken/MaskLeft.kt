package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                moveTo(x = 11.97f, y = 11.86f)
                verticalLineToRelative(dy = 4.53f)
                curveToRelative(dx1 = -0.02f, dy1 = 1.65f, dx2 = -1.25f, dy2 = 2.05f, dx3 = -2.4f, dy3 = 1.59f)
                arcTo(horizontalEllipseRadius = 6.4f, verticalEllipseRadius = 6.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.53f, y1 = 12.0f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.04f, dy1 = -6.0f)
                curveToRelative(dx1 = 1.15f, dy1 = -0.45f, dx2 = 2.38f, dy2 = -0.04f, dx3 = 2.4f, dy3 = 1.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _maskLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _maskLeft: ImageVector? = null
