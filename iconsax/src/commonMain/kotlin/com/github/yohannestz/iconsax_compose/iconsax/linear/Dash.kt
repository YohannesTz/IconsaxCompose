package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dash: ImageVector
    get() {
        val current = _dash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.1f, y = 3.5f)
                horizontalLineTo(x = 16.0f)
                curveToRelative(dx1 = 4.0f, dy1 = 0.0f, dx2 = 6.0f, dy2 = 2.5f, dx3 = 6.0f, dy3 = 6.0f)
                verticalLineTo(y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = -3.0f, dy2 = 8.5f, dx3 = -8.5f, dy3 = 8.5f)
                horizontalLineTo(x = 3.9f)
                lineTo(x = 5.0f, y = 16.2f)
                horizontalLineToRelative(dx = 7.4f)
                curveToRelative(dx1 = 3.6f, dy1 = 0.0f, dx2 = 5.3f, dy2 = -2.2f, dx3 = 5.3f, dy3 = -5.3f)
                verticalLineToRelative(dy = -0.2f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.8f, dx2 = -0.8f, dy2 = -3.0f, dx3 = -3.0f, dy3 = -3.0f)
                horizontalLineTo(x = 6.1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.5f, y = 10.5f)
                horizontalLineTo(x = 4.3f)
                curveToRelative(dx1 = -0.9f, dy1 = 0.0f, dx2 = -1.7f, dy2 = 0.6f, dx3 = -1.9f, dy3 = 1.5f)
                lineTo(x = 2.0f, y = 13.5f)
                horizontalLineToRelative(dx = 7.2f)
                curveToRelative(dx1 = 0.9f, dy1 = 0.0f, dx2 = 1.7f, dy2 = -0.6f, dx3 = 1.9f, dy3 = -1.5f)
                close()
            }
        }.build().also { _dash = it }
    }

@Suppress("ObjectPropertyName")
private var _dash: ImageVector? = null
