package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Nem: ImageVector
    get() {
        val current = _nem
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Nem",
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
                moveTo(x = 4.03f, y = 13.7f)
                arcTo(horizontalEllipseRadius = 19.0f, verticalEllipseRadius = 19.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 5.0f)
                reflectiveCurveToRelative(dx1 = 10.0f, dy1 = -6.0f, dx2 = 20.0f, dy2 = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.0f, dx2 = 0.0f, dy2 = 11.0f, dx3 = -10.0f, dy3 = 17.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.0f, dx2 = -2.73f, dy2 = -1.37f, dx3 = -5.34f, dy3 = -4.38f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.1f, y = 7.07f)
                curveTo(x1 = 5.21f, y1 = 17.15f, x2 = 12.0f, y2 = 10.0f, x3 = 12.0f, y3 = 10.0f)
                curveToRelative(dx1 = -1.0f, dy1 = -6.0f, dx2 = 4.07f, dy2 = -7.06f, dx3 = 4.07f, dy3 = -7.06f)
                lineToRelative(dx = 0.59f, dy = -0.11f)
                moveTo(x = 16.35f, y = 18.5f)
                reflectiveCurveTo(x1 = 19.0f, y1 = 13.0f, x2 = 12.0f, y2 = 10.0f)
            }
        }.build().also { _nem = it }
    }

@Suppress("ObjectPropertyName")
private var _nem: ImageVector? = null
