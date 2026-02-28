package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Youtube: ImageVector
    get() {
        val current = _youtube
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Youtube",
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
                moveTo(x = 17.0f, y = 20.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -2.0f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 2.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 2.0f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -2.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.4f, y = 9.5f)
                lineToRelative(dx = 2.5f, dy = 1.5f)
                curveToRelative(dx1 = 0.9f, dy1 = 0.6f, dx2 = 0.9f, dy2 = 1.5f, dx3 = 0.0f, dy3 = 2.1f)
                lineToRelative(dx = -2.5f, dy = 1.5f)
                curveToRelative(dx1 = -1.0f, dy1 = 0.6f, dx2 = -1.8f, dy2 = 0.1f, dx3 = -1.8f, dy3 = -1.0f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.3f, dx2 = 0.8f, dy2 = -1.7f, dx3 = 1.8f, dy3 = -1.1f)
            }
        }.build().also { _youtube = it }
    }

@Suppress("ObjectPropertyName")
private var _youtube: ImageVector? = null
