package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Magicpen: ImageVector
    get() {
        val current = _magicpen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Magicpen",
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
                moveTo(x = 3.5f, y = 20.5f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 0.0f)
                lineToRelative(dx = 13.0f, dy = -13.0f)
                arcToRelative(a = 2.12f, b = 2.12f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -3.0f, dy1 = -3.0f)
                lineToRelative(dx = -13.0f, dy = 13.0f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.01f, y = 8.99f)
                lineToRelative(dx = -3.0f, dy = -3.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(x = 8.5f, y = 2.44f)
                lineTo(x = 10.0f, y = 2.0f)
                lineTo(x = 9.56f, y = 3.5f)
                lineTo(x = 10.0f, y = 5.0f)
                lineTo(x = 8.5f, y = 4.56f)
                lineTo(x = 7.0f, y = 5.0f)
                lineToRelative(dx = 0.44f, dy = -1.5f)
                lineTo(x = 7.0f, y = 2.0f)
                close()
                moveToRelative(dx = -4.0f, dy = 6.0f)
                lineTo(x = 6.0f, y = 8.0f)
                lineTo(x = 5.56f, y = 9.5f)
                lineTo(x = 6.0f, y = 11.0f)
                lineToRelative(dx = -1.5f, dy = -0.44f)
                lineTo(x = 3.0f, y = 11.0f)
                lineToRelative(dx = 0.44f, dy = -1.5f)
                lineTo(x = 3.0f, y = 8.0f)
                close()
                moveToRelative(dx = 15.0f, dy = 5.0f)
                lineTo(x = 21.0f, y = 13.0f)
                lineToRelative(dx = -0.44f, dy = 1.5f)
                lineTo(x = 21.0f, y = 16.0f)
                lineToRelative(dx = -1.5f, dy = -0.44f)
                lineTo(x = 18.0f, y = 16.0f)
                lineToRelative(dx = 0.44f, dy = -1.5f)
                lineTo(x = 18.0f, y = 13.0f)
                close()
            }
        }.build().also { _magicpen = it }
    }

@Suppress("ObjectPropertyName")
private var _magicpen: ImageVector? = null
