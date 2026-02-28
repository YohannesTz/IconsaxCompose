package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HuobiToken: ImageVector
    get() {
        val current = _huobiToken
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HuobiToken",
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
                moveTo(x = 17.85f, y = 12.0f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.69f, dy1 = -2.0f)
                reflectiveCurveToRelative(dx1 = -0.15f, dy1 = 1.0f, dx2 = -3.25f, dy2 = 5.0f)
                curveToRelative(dx1 = -2.91f, dy1 = 3.77f, dx2 = 1.3f, dy2 = 6.64f, dx3 = 1.8f, dy3 = 6.97f)
                quadToRelative(dx1 = 0.04f, dy1 = 0.03f, dx2 = 0.1f, dy2 = 0.0f)
                curveToRelative(dx1 = 0.46f, dy1 = -0.29f, dx2 = 4.03f, dy2 = -2.58f, dx3 = 4.22f, dy3 = -6.09f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.76f, y = 7.79f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.3f, dx2 = -0.9f, dy2 = -4.4f, dx3 = -1.8f, dy3 = -5.6f)
                curveToRelative(dx1 = -0.3f, dy1 = -0.3f, dx2 = -0.8f, dy2 = -0.2f, dx3 = -0.9f, dy3 = 0.2f)
                curveToRelative(dx1 = -0.4f, dy1 = 1.5f, dx2 = -1.6f, dy2 = 4.7f, dx3 = -4.5f, dy3 = 8.5f)
                curveToRelative(dx1 = -3.7f, dy1 = 4.8f, dx2 = -0.3f, dy2 = 10.0f, dx3 = 3.2f, dy3 = 11.0f)
                curveToRelative(dx1 = 1.9f, dy1 = 0.5f, dx2 = -0.5f, dy2 = -1.0f, dx3 = -0.8f, dy3 = -4.1f)
                curveToRelative(dx1 = -0.3f, dy1 = -3.9f, dx2 = 4.8f, dy2 = -6.8f, dx3 = 4.8f, dy3 = -10.0f)
            }
        }.build().also { _huobiToken = it }
    }

@Suppress("ObjectPropertyName")
private var _huobiToken: ImageVector? = null
