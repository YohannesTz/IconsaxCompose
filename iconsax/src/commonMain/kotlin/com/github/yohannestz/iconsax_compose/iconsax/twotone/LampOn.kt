package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LampOn: ImageVector
    get() {
        val current = _lampOn
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LampOn",
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
                moveTo(x = 8.3f, y = 18.04f)
                verticalLineToRelative(dy = -1.16f)
                curveTo(x1 = 6.0f, y1 = 15.49f, x2 = 4.11f, y2 = 12.78f, x3 = 4.11f, y3 = 9.9f)
                arcToRelative(a = 7.92f, b = 7.92f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 14.96f, dy1 = -3.64f)
                curveToRelative(dx1 = 2.09f, dy1 = 4.2f, dx2 = -0.11f, dy2 = 8.66f, dx3 = -3.34f, dy3 = 10.61f)
                verticalLineToRelative(dy = 1.16f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.29f, dx2 = 0.11f, dy2 = 0.96f, dx3 = -0.96f, dy3 = 0.96f)
                horizontalLineTo(x = 9.26f)
                curveTo(x1 = 8.16f, y1 = 19.0f, x2 = 8.3f, y2 = 18.57f, x3 = 8.3f, y3 = 18.04f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.5f, y = 22.0f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = 0.0f)
            }
        }.build().also { _lampOn = it }
    }

@Suppress("ObjectPropertyName")
private var _lampOn: ImageVector? = null
