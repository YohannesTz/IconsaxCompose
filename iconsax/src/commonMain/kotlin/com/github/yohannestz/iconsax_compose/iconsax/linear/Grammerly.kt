package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Grammerly: ImageVector
    get() {
        val current = _grammerly
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Grammerly",
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
                moveTo(x = 19.07f, y = 4.95f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.2f, dy1 = 14.34f)
                arcToRelative(a = 10.1f, b = 10.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -13.74f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 19.07f, y1 = 4.95f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.84f, y = 16.07f)
                curveToRelative(dx1 = -2.12f, dy1 = 2.0f, dx2 = -5.56f, dy2 = 2.0f, dx3 = -7.67f, dy3 = 0.0f)
            }
        }.build().also { _grammerly = it }
    }

@Suppress("ObjectPropertyName")
private var _grammerly: ImageVector? = null
