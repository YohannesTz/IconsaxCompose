package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudSnow: ImageVector
    get() {
        val current = _cloudSnow
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudSnow",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.61f, y = 20.0f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.62f, dy1 = -1.4f)
                curveToRelative(dx1 = 3.27f, dy1 = -2.85f, dx2 = 1.52f, dy2 = -8.6f, dx3 = -2.79f, dy3 = -9.13f)
                curveToRelative(dx1 = -1.54f, dy1 = -9.34f, dx2 = -15.01f, dy2 = -5.8f, dx3 = -11.82f, dy3 = 3.09f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.28f, y = 12.97f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.71f, dy1 = -0.4f)
                curveToRelative(dx1 = -4.66f, dy1 = 0.33f, dx2 = -4.65f, dy2 = 7.11f, dx3 = 0.0f, dy3 = 7.44f)
                moveTo(x = 15.82f, y = 9.89f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.66f, dy1 = -0.41f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 13.0f, y = 18.5f)
                close()
                moveToRelative(dx = -4.0f, dy = 0.0f)
                close()
                moveToRelative(dx = 2.0f, dy = 3.0f)
                close()
            }
        }.build().also { _cloudSnow = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudSnow: ImageVector? = null
