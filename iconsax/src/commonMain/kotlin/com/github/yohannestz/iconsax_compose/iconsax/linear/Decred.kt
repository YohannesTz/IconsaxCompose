package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Decred: ImageVector
    get() {
        val current = _decred
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Decred",
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
                moveTo(x = 5.7f, y = 7.7f)
                lineTo(x = 2.0f, y = 4.0f)
                horizontalLineToRelative(dx = 5.0f)
                lineToRelative(dx = 6.0f, dy = 6.0f)
                horizontalLineTo(x = 8.5f)
                curveTo(x1 = 6.6f, y1 = 10.0f, x2 = 5.0f, y2 = 11.6f, x3 = 5.0f, y3 = 13.5f)
                reflectiveCurveTo(x1 = 6.6f, y1 = 17.0f, x2 = 8.5f, y2 = 17.0f)
                horizontalLineTo(x = 10.0f)
                lineToRelative(dx = 3.0f, dy = 3.0f)
                horizontalLineTo(x = 8.5f)
                curveTo(x1 = 4.9f, y1 = 20.0f, x2 = 2.0f, y2 = 17.1f, x3 = 2.0f, y3 = 13.5f)
                curveTo(x1 = 2.0f, y1 = 11.0f, x2 = 3.4f, y2 = 8.8f, x3 = 5.5f, y3 = 7.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.3f, y = 16.3f)
                lineTo(x = 22.0f, y = 20.0f)
                horizontalLineToRelative(dx = -5.0f)
                lineToRelative(dx = -6.0f, dy = -6.0f)
                horizontalLineToRelative(dx = 4.5f)
                curveToRelative(dx1 = 1.9f, dy1 = 0.0f, dx2 = 3.5f, dy2 = -1.6f, dx3 = 3.5f, dy3 = -3.5f)
                reflectiveCurveTo(x1 = 17.4f, y1 = 7.0f, x2 = 15.5f, y2 = 7.0f)
                horizontalLineTo(x = 14.0f)
                lineToRelative(dx = -3.0f, dy = -3.0f)
                horizontalLineToRelative(dx = 4.5f)
                curveToRelative(dx1 = 3.6f, dy1 = 0.0f, dx2 = 6.5f, dy2 = 2.9f, dx3 = 6.5f, dy3 = 6.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.5f, dx2 = -1.4f, dy2 = 4.7f, dx3 = -3.5f, dy3 = 5.8f)
                close()
            }
        }.build().also { _decred = it }
    }

@Suppress("ObjectPropertyName")
private var _decred: ImageVector? = null
