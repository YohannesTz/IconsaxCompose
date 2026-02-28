package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Celsius: ImageVector
    get() {
        val current = _celsius
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Celsius",
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
                moveTo(x = 16.3f, y = 15.3f)
                curveToRelative(dx1 = -1.0f, dy1 = 1.3f, dx2 = -2.6f, dy2 = 2.2f, dx3 = -4.3f, dy3 = 2.2f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.4f, dy2 = -2.4f, dx3 = -5.4f, dy3 = -5.4f)
                reflectiveCurveTo(x1 = 9.0f, y1 = 6.6f, x2 = 12.0f, y2 = 6.6f)
                curveToRelative(dx1 = 1.2f, dy1 = 0.0f, dx2 = 2.4f, dy2 = 0.4f, dx3 = 3.3f, dy3 = 1.1f)
                moveToRelative(dx = 2.1f, dy = 3.7f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.4f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
        }.build().also { _celsius = it }
    }

@Suppress("ObjectPropertyName")
private var _celsius: ImageVector? = null
