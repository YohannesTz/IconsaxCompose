package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                moveTo(x = 15.0f, y = 8.37f)
                verticalLineTo(y = 7.41f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.98f, dx2 = -2.07f, dy2 = -4.12f, dx3 = -4.59f, dy3 = -2.54f)
                lineTo(x = 7.49f, y = 6.7f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.43f, y1 = 7.0f)
                horizontalLineTo(x = 5.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 4.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 3.0f, dy2 = 3.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = 3.41f, dy = 2.13f)
                curveToRelative(dx1 = 2.52f, dy1 = 1.58f, dx2 = 4.59f, dy2 = 0.43f, dx3 = 4.59f, dy3 = -2.54f)
                verticalLineToRelative(dy = -3.64f)
                moveToRelative(dx = 3.81f, dy = -3.53f)
                arcTo(horizontalEllipseRadius = 6.7f, verticalEllipseRadius = 6.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 16.0f)
                moveToRelative(dx = 3.15f, dy = -8.2f)
                arcToRelative(a = 10.8f, b = 10.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.32f, dy1 = 10.7f)
                moveTo(x = 22.0f, y = 2.0f)
                lineTo(x = 2.0f, y = 22.0f)
            }
        }.build().also { _volumeSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _volumeSlash: ImageVector? = null
