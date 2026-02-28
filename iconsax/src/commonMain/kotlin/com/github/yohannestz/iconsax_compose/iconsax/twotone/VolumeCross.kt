package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeCross: ImageVector
    get() {
        val current = _volumeCross
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VolumeCross",
            defaultWidth = 22.0.dp,
            defaultHeight = 18.0.dp,
            viewportWidth = 22.0f,
            viewportHeight = 18.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 1.0f, y = 7.0f)
                verticalLineToRelative(dy = 4.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 3.0f, dy2 = 3.0f)
                horizontalLineToRelative(dx = 1.43f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.3f)
                lineToRelative(dx = 2.92f, dy = 1.83f)
                curveTo(x1 = 11.93f, y1 = 17.71f, x2 = 14.0f, y2 = 16.56f, x3 = 14.0f, y3 = 13.6f)
                verticalLineTo(y = 4.41f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.98f, dx2 = -2.07f, dy2 = -4.12f, dx3 = -4.59f, dy3 = -2.54f)
                lineTo(x = 6.49f, y = 3.7f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.43f, y1 = 4.0f)
                horizontalLineTo(x = 4.0f)
                quadTo(x1 = 1.0f, y1 = 4.0f, x2 = 1.0f, y2 = 7.0f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.0f, y = 10.96f)
                lineTo(x = 17.04f, y = 7.0f)
                moveToRelative(dx = 3.92f, dy = 0.04f)
                lineTo(x = 17.0f, y = 11.0f)
            }
        }.build().also { _volumeCross = it }
    }

@Suppress("ObjectPropertyName")
private var _volumeCross: ImageVector? = null
