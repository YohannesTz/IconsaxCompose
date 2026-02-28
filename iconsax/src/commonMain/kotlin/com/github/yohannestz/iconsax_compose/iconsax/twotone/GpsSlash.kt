package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GpsSlash: ImageVector
    get() {
        val current = _gpsSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GpsSlash",
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
                moveTo(x = 17.21f, y = 6.6f)
                arcTo(horizontalEllipseRadius = 7.5f, verticalEllipseRadius = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.58f, y1 = 17.19f)
                moveTo(x = 12.0f, y = 4.0f)
                verticalLineTo(y = 2.0f)
                moveTo(x = 4.0f, y = 12.0f)
                horizontalLineTo(x = 2.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 18.88f)
                arcTo(horizontalEllipseRadius = 7.5f, verticalEllipseRadius = 7.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.88f, y1 = 9.0f)
                moveTo(x = 12.0f, y = 20.0f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = 8.0f, dy = -10.0f)
                horizontalLineToRelative(dx = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.12f, y = 9.88f)
                lineToRelative(dx = -4.24f, dy = 4.24f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 4.24f, dy1 = -4.24f)
                moveTo(x = 22.0f, y = 2.0f)
                lineTo(x = 2.0f, y = 22.0f)
            }
        }.build().also { _gpsSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _gpsSlash: ImageVector? = null
