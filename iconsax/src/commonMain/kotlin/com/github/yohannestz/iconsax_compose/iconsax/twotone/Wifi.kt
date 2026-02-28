package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wifi: ImageVector
    get() {
        val current = _wifi
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Wifi",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.91f, y = 11.84f)
                arcToRelative(a = 11.35f, b = 11.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 14.19f, dy1 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 8.36f)
                arcToRelative(a = 16.0f, b = 16.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 20.0f, dy1 = 0.0f)
                moveTo(x = 6.79f, y = 15.5f)
                arcToRelative(a = 8.3f, b = 8.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 10.41f, dy1 = 0.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.4f, y = 19.15f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.21f, dy1 = 0.0f)
            }
        }.build().also { _wifi = it }
    }

@Suppress("ObjectPropertyName")
private var _wifi: ImageVector? = null
