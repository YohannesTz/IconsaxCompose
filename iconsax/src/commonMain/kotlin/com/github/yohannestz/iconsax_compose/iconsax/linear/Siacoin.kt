package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Siacoin: ImageVector
    get() {
        val current = _siacoin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Siacoin",
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
                moveTo(x = 8.0f, y = 2.8f)
                arcTo(horizontalEllipseRadius = 10.03f, verticalEllipseRadius = 10.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.5f, dx2 = -4.5f, dy2 = 10.0f, dx3 = -10.0f, dy3 = 10.0f)
                arcTo(horizontalEllipseRadius = 10.03f, verticalEllipseRadius = 10.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.8f, y1 = 8.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.0f, y = 16.2f)
                verticalLineTo(y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.3f, dx2 = -1.9f, dy2 = -4.2f, dx3 = -4.2f, dy3 = -4.2f)
                reflectiveCurveTo(x1 = 7.6f, y1 = 9.7f, x2 = 7.6f, y2 = 12.0f)
                reflectiveCurveToRelative(dx1 = 1.9f, dy1 = 4.2f, dx2 = 4.2f, dy2 = 4.2f)
                close()
                moveTo(x = 5.0f, y = 6.5f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.0f)
            }
        }.build().also { _siacoin = it }
    }

@Suppress("ObjectPropertyName")
private var _siacoin: ImageVector? = null
