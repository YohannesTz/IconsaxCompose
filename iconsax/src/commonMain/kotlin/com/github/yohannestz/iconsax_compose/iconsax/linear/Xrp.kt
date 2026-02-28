package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Xrp: ImageVector
    get() {
        val current = _xrp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Xrp",
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
                moveTo(x = 5.5f, y = 2.0f)
                horizontalLineTo(x = 4.1f)
                curveToRelative(dx1 = -1.0f, dy1 = 0.0f, dx2 = -1.5f, dy2 = 1.1f, dx3 = -0.8f, dy3 = 1.8f)
                lineTo(x = 9.0f, y = 9.5f)
                curveToRelative(dx1 = 1.6f, dy1 = 1.6f, dx2 = 4.3f, dy2 = 1.6f, dx3 = 5.9f, dy3 = 0.0f)
                lineToRelative(dx = 5.7f, dy = -5.7f)
                curveTo(x1 = 21.4f, y1 = 3.1f, x2 = 20.9f, y2 = 2.0f, x3 = 19.9f, y3 = 2.0f)
                horizontalLineToRelative(dx = -1.4f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.2f, dy1 = 0.9f)
                lineToRelative(dx = -3.6f, dy = 3.6f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = 0.0f)
                lineTo(x = 7.7f, y = 2.9f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.5f, y1 = 2.0f)
                moveToRelative(dx = 0.0f, dy = 20.0f)
                horizontalLineTo(x = 4.1f)
                curveToRelative(dx1 = -0.9f, dy1 = 0.0f, dx2 = -1.4f, dy2 = -1.1f, dx3 = -0.7f, dy3 = -1.8f)
                lineTo(x = 9.0f, y = 14.5f)
                curveToRelative(dx1 = 1.6f, dy1 = -1.6f, dx2 = 4.3f, dy2 = -1.6f, dx3 = 5.9f, dy3 = 0.0f)
                lineToRelative(dx = 5.7f, dy = 5.7f)
                curveToRelative(dx1 = 0.7f, dy1 = 0.7f, dx2 = 0.2f, dy2 = 1.8f, dx3 = -0.7f, dy3 = 1.8f)
                horizontalLineToRelative(dx = -1.4f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.2f, dy1 = -0.9f)
                lineToRelative(dx = -3.6f, dy = -3.6f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.5f, dy1 = 0.0f)
                lineToRelative(dx = -3.6f, dy = 3.6f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.5f, y1 = 22.0f)
            }
        }.build().also { _xrp = it }
    }

@Suppress("ObjectPropertyName")
private var _xrp: ImageVector? = null
