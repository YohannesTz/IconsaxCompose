package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Polyswarm: ImageVector
    get() {
        val current = _polyswarm
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Polyswarm",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.5f, y = 3.25f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 3.85f, dy1 = 0.0f, dx2 = 7.0f, dy2 = 3.15f, dx3 = 7.0f, dy3 = 7.0f)
                reflectiveCurveToRelative(dx1 = -3.15f, dy1 = 7.0f, dx2 = -7.0f, dy2 = 7.0f)
                horizontalLineToRelative(dx = -11.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.17f, y = 6.75f)
                horizontalLineToRelative(dx = 10.64f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.69f, dy1 = 3.69f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.69f, dy1 = 3.69f)
                horizontalLineTo(x = 8.0f)
                moveToRelative(dx = 0.5f, dy = -3.38f)
                horizontalLineToRelative(dx = -3.0f)
                moveToRelative(dx = 1.0f, dy = 10.0f)
                horizontalLineToRelative(dx = -4.0f)
            }
        }.build().also { _polyswarm = it }
    }

@Suppress("ObjectPropertyName")
private var _polyswarm: ImageVector? = null
