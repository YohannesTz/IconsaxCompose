package com.github.yohannestz.iconsax_compose.iconsax.twotone

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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.37f, y = 13.0f)
                arcTo(horizontalEllipseRadius = 7.5f, verticalEllipseRadius = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.5f, y1 = 9.5f)
                arcTo(horizontalEllipseRadius = 7.5f, verticalEllipseRadius = 7.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 12.0f, y1 = 17.0f)
                reflectiveCurveToRelative(dx1 = -2.69f, dy1 = 0.0f, dx2 = -3.66f, dy2 = 2.2f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.0f, y1 = 21.0f)
                lineToRelative(dx = 2.0f, dy = -14.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 13.0f, y = 21.0f)
            }
        }.build().also { _polkadot = it }
    }

@Suppress("ObjectPropertyName")
private var _polkadot: ImageVector? = null
