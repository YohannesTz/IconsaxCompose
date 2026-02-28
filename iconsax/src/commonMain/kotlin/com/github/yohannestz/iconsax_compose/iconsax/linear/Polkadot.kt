package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Polkadot: ImageVector
    get() {
        val current = _polkadot
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Polkadot",
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
                moveTo(x = 5.4f, y = 13.0f)
                curveToRelative(dx1 = -0.6f, dy1 = -1.0f, dx2 = -0.9f, dy2 = -2.2f, dx3 = -0.9f, dy3 = -3.5f)
                curveTo(x1 = 4.5f, y1 = 5.4f, x2 = 7.9f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 7.5f, dy1 = 3.4f, dx2 = 7.5f, dy2 = 7.5f)
                reflectiveCurveTo(x1 = 16.1f, y1 = 17.0f, x2 = 12.0f, y2 = 17.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.0f, dx2 = -2.7f, dy2 = 0.0f, dx3 = -3.7f, dy3 = 2.2f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.0f, y1 = 21.0f)
                lineToRelative(dx = 2.0f, dy = -14.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 14.0f, y = 21.0f)
            }
        }.build().also { _polkadot = it }
    }

@Suppress("ObjectPropertyName")
private var _polkadot: ImageVector? = null
