package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Apple: ImageVector
    get() {
        val current = _apple
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Apple",
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
                moveTo(x = 15.4f, y = 2.0f)
                curveToRelative(dx1 = 0.2f, dy1 = 1.1f, dx2 = -0.3f, dy2 = 2.2f, dx3 = -0.9f, dy3 = 3.0f)
                reflectiveCurveToRelative(dx1 = -1.7f, dy1 = 1.5f, dx2 = -2.8f, dy2 = 1.4f)
                curveToRelative(dx1 = -0.2f, dy1 = -1.1f, dx2 = 0.3f, dy2 = -2.1f, dx3 = 0.9f, dy3 = -2.9f)
                curveToRelative(dx1 = 0.7f, dy1 = -0.8f, dx2 = 1.8f, dy2 = -1.4f, dx3 = 2.8f, dy3 = -1.5f)
                moveToRelative(dx = 3.2f, dy = 17.4f)
                curveToRelative(dx1 = 0.5f, dy1 = -0.8f, dx2 = 0.8f, dy2 = -1.3f, dx3 = 1.2f, dy3 = -2.2f)
                curveToRelative(dx1 = -3.1f, dy1 = -1.2f, dx2 = -3.6f, dy2 = -5.6f, dx3 = -0.5f, dy3 = -7.2f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.5f, dy1 = -1.8f)
                curveToRelative(dx1 = -0.9f, dy1 = 0.0f, dx2 = -1.5f, dy2 = 0.2f, dx3 = -2.1f, dy3 = 0.4f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.4f, dy1 = 0.3f)
                curveToRelative(dx1 = -0.6f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.2f, dx3 = -1.6f, dy3 = -0.4f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.9f, dy1 = -0.4f)
                curveToRelative(dx1 = -1.4f, dy1 = 0.0f, dx2 = -2.9f, dy2 = 0.8f, dx3 = -3.8f, dy3 = 2.3f)
                curveToRelative(dx1 = -1.3f, dy1 = 2.0f, dx2 = -1.1f, dy2 = 5.9f, dx3 = 1.0f, dy3 = 9.1f)
                curveToRelative(dx1 = 0.9f, dy1 = 1.2f, dx2 = 1.9f, dy2 = 2.5f, dx3 = 3.2f, dy3 = 2.5f)
                curveToRelative(dx1 = 0.6f, dy1 = 0.0f, dx2 = 0.9f, dy2 = -0.2f, dx3 = 1.3f, dy3 = -0.3f)
                curveToRelative(dx1 = 0.5f, dy1 = -0.2f, dx2 = 1.0f, dy2 = -0.4f, dx3 = 1.8f, dy3 = -0.4f)
                curveToRelative(dx1 = 0.9f, dy1 = 0.0f, dx2 = 1.3f, dy2 = 0.2f, dx3 = 1.8f, dy3 = 0.4f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.3f, dy1 = 0.3f)
                curveToRelative(dx1 = 1.4f, dy1 = 0.0f, dx2 = 2.4f, dy2 = -1.5f, dx3 = 3.2f, dy3 = -2.6f)
            }
        }.build().also { _apple = it }
    }

@Suppress("ObjectPropertyName")
private var _apple: ImageVector? = null
