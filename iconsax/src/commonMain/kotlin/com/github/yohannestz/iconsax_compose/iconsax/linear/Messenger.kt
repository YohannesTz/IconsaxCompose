package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Messenger: ImageVector
    get() {
        val current = _messenger
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Messenger",
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
                moveTo(x = 5.7f, y = 18.4f)
                verticalLineTo(y = 22.0f)
                lineTo(x = 9.0f, y = 20.1f)
                curveToRelative(dx1 = 0.9f, dy1 = 0.3f, dx2 = 1.9f, dy2 = 0.4f, dx3 = 3.0f, dy3 = 0.4f)
                curveToRelative(dx1 = 5.5f, dy1 = 0.0f, dx2 = 10.0f, dy2 = -4.1f, dx3 = 10.0f, dy3 = -9.3f)
                curveTo(x1 = 22.0f, y1 = 6.1f, x2 = 17.5f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 2.0f, y1 = 6.1f, x2 = 2.0f, y2 = 11.3f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.9f, dx2 = 1.4f, dy2 = 5.4f, dx3 = 3.7f, dy3 = 7.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.3f, y = 9.2f)
                lineToRelative(dx = -3.8f, dy = 4.5f)
                lineToRelative(dx = 3.7f, dy = -0.9f)
                lineToRelative(dx = 1.5f, dy = 0.9f)
                lineToRelative(dx = 3.8f, dy = -4.5f)
                lineToRelative(dx = -3.5f, dy = 0.9f)
                close()
            }
        }.build().also { _messenger = it }
    }

@Suppress("ObjectPropertyName")
private var _messenger: ImageVector? = null
