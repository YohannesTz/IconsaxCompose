package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeSlash: ImageVector
    get() {
        val current = _volumeSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VolumeSlash",
            defaultWidth = 22.0.dp,
            defaultHeight = 22.0.dp,
            viewportWidth = 22.0f,
            viewportHeight = 22.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.0f, y = 7.37f)
                verticalLineTo(y = 6.41f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.98f, dx2 = -2.07f, dy2 = -4.12f, dx3 = -4.59f, dy3 = -2.54f)
                lineTo(x = 6.49f, y = 5.7f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.43f, y1 = 6.0f)
                horizontalLineTo(x = 4.0f)
                quadTo(x1 = 1.0f, y1 = 6.0f, x2 = 1.0f, y2 = 9.0f)
                verticalLineToRelative(dy = 4.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 3.0f, dy2 = 3.0f)
                horizontalLineToRelative(dx = 2.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.41f, y = 18.13f)
                curveToRelative(dx1 = 2.52f, dy1 = 1.58f, dx2 = 4.59f, dy2 = 0.43f, dx3 = 4.59f, dy3 = -2.54f)
                verticalLineToRelative(dy = -3.64f)
                moveToRelative(dx = 3.81f, dy = -3.53f)
                arcTo(horizontalEllipseRadius = 6.7f, verticalEllipseRadius = 6.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 15.0f)
                moveToRelative(dx = 3.15f, dy = -8.2f)
                arcToRelative(a = 10.8f, b = 10.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.32f, dy1 = 10.7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.0f, y = 1.0f)
                lineTo(x = 1.0f, y = 21.0f)
            }
        }.build().also { _volumeSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _volumeSlash: ImageVector? = null
