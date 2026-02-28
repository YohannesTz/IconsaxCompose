package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KyberNetwork: ImageVector
    get() {
        val current = _kyberNetwork
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.KyberNetwork",
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
                moveTo(x = 11.0f, y = 2.6f)
                lineTo(x = 6.0f, y = 5.4f)
                curveToRelative(dx1 = -0.6f, dy1 = 0.4f, dx2 = -1.0f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.7f)
                verticalLineTo(y = 16.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.6f, dx2 = 0.3f, dy2 = 1.3f, dx3 = 0.8f, dy3 = 1.6f)
                lineToRelative(dx = 5.0f, dy = 3.6f)
                curveToRelative(dx1 = 0.7f, dy1 = 0.5f, dx2 = 1.6f, dy2 = 0.5f, dx3 = 2.3f, dy3 = 0.0f)
                lineToRelative(dx = 5.0f, dy = -3.6f)
                curveToRelative(dx1 = 0.5f, dy1 = -0.4f, dx2 = 0.8f, dy2 = -1.0f, dx3 = 0.8f, dy3 = -1.6f)
                verticalLineTo(y = 7.2f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.7f, dx2 = -0.4f, dy2 = -1.4f, dx3 = -1.0f, dy3 = -1.7f)
                lineToRelative(dx = -5.0f, dy = -2.9f)
                curveToRelative(dx1 = -0.5f, dy1 = -0.4f, dx2 = -1.3f, dy2 = -0.4f, dx3 = -1.9f, dy3 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 3.0f)
                lineToRelative(dx = -2.0f, dy = 9.0f)
                lineToRelative(dx = 1.8f, dy = 9.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.2f, y = 16.9f)
                lineTo(x = 10.0f, y = 12.0f)
                lineToRelative(dx = 8.5f, dy = -4.7f)
            }
        }.build().also { _kyberNetwork = it }
    }

@Suppress("ObjectPropertyName")
private var _kyberNetwork: ImageVector? = null
