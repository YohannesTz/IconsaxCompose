package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Js: ImageVector
    get() {
        val current = _js
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Js",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 9.0f)
                verticalLineToRelative(dy = 7.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = -1.6f, dy2 = 2.5f, dx3 = -3.0f, dy3 = 1.7f)
                lineToRelative(dx = -2.5f, dy = -1.4f)
                curveTo(x1 = 3.2f, y1 = 17.1f, x2 = 3.0f, y2 = 16.8f, x3 = 3.0f, y3 = 16.4f)
                verticalLineTo(y = 7.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.2f, dy2 = -0.7f, dx3 = 0.5f, dy3 = -0.9f)
                lineToRelative(dx = 8.0f, dy = -4.4f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 0.0f)
                lineToRelative(dx = 8.0f, dy = 4.4f)
                curveTo(x1 = 20.8f, y1 = 6.9f, x2 = 21.0f, y2 = 7.2f, x3 = 21.0f, y3 = 7.6f)
                verticalLineToRelative(dy = 8.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.2f, dy2 = 0.7f, dx3 = -0.5f, dy3 = 0.9f)
                lineToRelative(dx = -8.0f, dy = 4.4f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = 0.0f)
                lineTo(x = 10.0f, y = 21.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 10.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.0f, dx2 = -0.8f, dy2 = -1.8f, dx3 = -1.7f, dy3 = -1.8f)
                horizontalLineToRelative(dx = -1.8f)
                curveToRelative(dx1 = -1.0f, dy1 = 0.0f, dx2 = -1.7f, dy2 = 0.8f, dx3 = -1.7f, dy3 = 1.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.0f, dx2 = 0.8f, dy2 = 1.7f, dx3 = 1.7f, dy3 = 1.7f)
                horizontalLineToRelative(dx = 1.8f)
                curveToRelative(dx1 = 1.0f, dy1 = 0.0f, dx2 = 1.7f, dy2 = 0.8f, dx3 = 1.7f, dy3 = 1.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.0f, dx2 = -0.8f, dy2 = 1.7f, dx3 = -1.7f, dy3 = 1.7f)
                horizontalLineToRelative(dx = -1.8f)
                curveToRelative(dx1 = -1.0f, dy1 = 0.0f, dx2 = -1.7f, dy2 = -0.8f, dx3 = -1.7f, dy3 = -1.7f)
            }
        }.build().also { _js = it }
    }

@Suppress("ObjectPropertyName")
private var _js: ImageVector? = null
