package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Google: ImageVector
    get() {
        val current = _google
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Google",
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
                moveTo(x = 21.6f, y = 10.2f)
                horizontalLineToRelative(dx = -9.4f)
                verticalLineToRelative(dy = 3.7f)
                horizontalLineToRelative(dx = 5.5f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = 3.2f)
                curveToRelative(dx1 = -0.8f, dy1 = 0.6f, dx2 = -2.0f, dy2 = 1.0f, dx3 = -3.5f, dy3 = 1.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.7f, dy1 = -4.2f)
                curveToRelative(dx1 = -0.2f, dy1 = -0.6f, dx2 = -0.3f, dy2 = -1.3f, dx3 = -0.3f, dy3 = -2.0f)
                reflectiveCurveToRelative(dx1 = 0.1f, dy1 = -1.4f, dx2 = 0.3f, dy2 = -2.0f)
                curveToRelative(dx1 = 0.1f, dy1 = -0.2f, dx2 = 0.1f, dy2 = -0.4f, dx3 = 0.2f, dy3 = -0.5f)
                arcToRelative(a = 5.96f, b = 5.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.4f, dy1 = -2.1f)
                lineToRelative(dx = 2.8f, dy = -2.8f)
                curveTo(x1 = 17.2f, y1 = 3.0f, x2 = 14.9f, y2 = 2.0f, x3 = 12.2f, y3 = 2.0f)
                curveTo(x1 = 8.3f, y1 = 2.0f, x2 = 4.9f, y2 = 4.2f, x3 = 3.3f, y3 = 7.5f)
                curveTo(x1 = 2.6f, y1 = 8.9f, x2 = 2.2f, y2 = 10.4f, x3 = 2.2f, y3 = 12.0f)
                reflectiveCurveToRelative(dx1 = 0.4f, dy1 = 3.1f, dx2 = 1.1f, dy2 = 4.5f)
                curveToRelative(dx1 = 1.6f, dy1 = 3.3f, dx2 = 5.0f, dy2 = 5.5f, dx3 = 8.9f, dy3 = 5.5f)
                curveToRelative(dx1 = 2.7f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -0.9f, dx3 = 6.6f, dy3 = -2.4f)
                curveToRelative(dx1 = 1.9f, dy1 = -1.7f, dx2 = 3.0f, dy2 = -4.3f, dx3 = 3.0f, dy3 = -7.4f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.8f, dx2 = -0.1f, dy2 = -1.4f, dx3 = -0.2f, dy3 = -2.0f)
            }
        }.build().also { _google = it }
    }

@Suppress("ObjectPropertyName")
private var _google: ImageVector? = null
