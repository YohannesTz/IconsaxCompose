package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Brodcast: ImageVector
    get() {
        val current = _brodcast
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Brodcast",
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
                moveTo(x = 12.0f, y = 10.0f)
                curveToRelative(dx1 = -1.1f, dy1 = 0.0f, dx2 = -2.0f, dy2 = 0.9f, dx3 = -2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = 2.0f, dx2 = 2.0f, dy2 = 2.0f)
                reflectiveCurveToRelative(dx1 = 2.0f, dy1 = -0.9f, dx2 = 2.0f, dy2 = -2.0f)
                moveToRelative(dx = 6.0f, dy = 6.0f)
                curveToRelative(dx1 = 1.26f, dy1 = -1.67f, dx2 = 2.0f, dy2 = -3.75f, dx3 = 2.0f, dy3 = -6.0f)
                reflectiveCurveToRelative(dx1 = -0.74f, dy1 = -4.33f, dx2 = -2.0f, dy2 = -6.0f)
                moveTo(x = 4.0f, y = 18.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.98f, dy1 = -6.62f)
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = 1.64f)
                moveToRelative(dx = 13.8f, dy = 7.96f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -7.2f)
                moveToRelative(dx = -9.6f, dy = 0.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 7.2f)
            }
        }.build().also { _brodcast = it }
    }

@Suppress("ObjectPropertyName")
private var _brodcast: ImageVector? = null
