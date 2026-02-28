package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeUp: ImageVector
    get() {
        val current = _volumeUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VolumeUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 9.96f)
                verticalLineToRelative(dy = 4.08f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.06f, dx2 = 3.06f, dy2 = 3.06f)
                horizontalLineToRelative(dx = 1.46f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.08f, dy1 = 0.31f)
                lineToRelative(dx = 2.98f, dy = 1.86f)
                curveToRelative(dx1 = 2.58f, dy1 = 1.61f, dx2 = 4.68f, dy2 = 0.44f, dx3 = 4.68f, dy3 = -2.6f)
                verticalLineTo(y = 7.32f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.04f, dx2 = -2.11f, dy2 = -4.21f, dx3 = -4.68f, dy3 = -2.6f)
                lineTo(x = 7.6f, y = 6.59f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.52f, y1 = 6.9f)
                horizontalLineTo(x = 5.06f)
                quadTo(x1 = 2.0f, y1 = 6.9f, x2 = 2.0f, y2 = 9.96f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.0f, y = 12.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = -2.0f, dy = 2.0f)
                verticalLineToRelative(dy = -4.0f)
            }
        }.build().also { _volumeUp = it }
    }

@Suppress("ObjectPropertyName")
private var _volumeUp: ImageVector? = null
