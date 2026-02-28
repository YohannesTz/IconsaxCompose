package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoreCircle: ImageVector
    get() {
        val current = _moreCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MoreCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                curveToRelative(dx1 = 5.5f, dy1 = 0.0f, dx2 = 10.0f, dy2 = -4.5f, dx3 = 10.0f, dy3 = -10.0f)
                reflectiveCurveTo(x1 = 17.5f, y1 = 2.0f, x2 = 12.0f, y2 = 2.0f)
                reflectiveCurveTo(x1 = 2.0f, y1 = 6.5f, x2 = 2.0f, y2 = 12.0f)
                reflectiveCurveToRelative(dx1 = 4.5f, dy1 = 10.0f, dx2 = 10.0f, dy2 = 10.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 16.0f, y = 12.0f)
                close()
                moveToRelative(dx = -4.0f, dy = 0.0f)
                close()
                moveToRelative(dx = -4.0f, dy = 0.0f)
                close()
            }
        }.build().also { _moreCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _moreCircle: ImageVector? = null
