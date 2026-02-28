package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.2f, y = 10.0f)
                reflectiveCurveTo(x1 = 16.0f, y1 = 11.0f, x2 = 13.0f, y2 = 15.0f)
                curveToRelative(dx1 = -2.9f, dy1 = 3.8f, dx2 = 1.3f, dy2 = 6.6f, dx3 = 1.8f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 0.1f)
                curveToRelative(dx1 = 0.6f, dy1 = -0.5f, dx2 = 8.2f, dy2 = -5.3f, dx3 = 1.3f, dy3 = -12.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.8f, y = 7.8f)
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
