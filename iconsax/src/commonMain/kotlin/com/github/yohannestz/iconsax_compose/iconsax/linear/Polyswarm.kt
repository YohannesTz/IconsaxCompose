package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.5f, y = 3.2f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 3.8f, dy1 = 0.0f, dx2 = 7.0f, dy2 = 3.1f, dx3 = 7.0f, dy3 = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.8f, dx2 = -3.1f, dy2 = 7.0f, dx3 = -7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = -11.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.2f, y = 6.8f)
                horizontalLineToRelative(dx = 10.6f)
                curveToRelative(dx1 = 2.0f, dy1 = 0.0f, dx2 = 3.7f, dy2 = 1.7f, dx3 = 3.7f, dy3 = 3.7f)
                reflectiveCurveToRelative(dx1 = -1.7f, dy1 = 3.7f, dx2 = -3.7f, dy2 = 3.7f)
                horizontalLineTo(x = 8.0f)
                moveToRelative(dx = 0.5f, dy = -3.4f)
                horizontalLineToRelative(dx = -3.0f)
                moveToRelative(dx = 1.0f, dy = 10.0f)
                horizontalLineToRelative(dx = -4.0f)
            }
        }.build().also { _polyswarm = it }
    }

@Suppress("ObjectPropertyName")
private var _polyswarm: ImageVector? = null
