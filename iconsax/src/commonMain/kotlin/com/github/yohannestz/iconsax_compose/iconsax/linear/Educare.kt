package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Educare: ImageVector
    get() {
        val current = _educare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Educare",
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
                moveTo(x = 8.5f, y = 5.1f)
                lineToRelative(dx = 2.7f, dy = 2.7f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.4f, dx2 = 1.2f, dy2 = 0.4f, dx3 = 1.6f, dy3 = 0.0f)
                lineToRelative(dx = 2.7f, dy = -2.7f)
                curveToRelative(dx1 = 0.7f, dy1 = -0.7f, dx2 = 0.2f, dy2 = -2.0f, dx3 = -0.8f, dy3 = -2.0f)
                horizontalLineTo(x = 9.3f)
                curveToRelative(dx1 = -1.0f, dy1 = 0.1f, dx2 = -1.5f, dy2 = 1.3f, dx3 = -0.8f, dy3 = 2.0f)
                moveToRelative(dx = 0.0f, dy = 13.8f)
                lineToRelative(dx = 2.7f, dy = -2.7f)
                curveToRelative(dx1 = 0.4f, dy1 = -0.4f, dx2 = 1.2f, dy2 = -0.4f, dx3 = 1.6f, dy3 = 0.0f)
                lineToRelative(dx = 2.7f, dy = 2.7f)
                curveToRelative(dx1 = 0.7f, dy1 = 0.7f, dx2 = 0.2f, dy2 = 2.0f, dx3 = -0.8f, dy3 = 2.0f)
                horizontalLineTo(x = 9.3f)
                curveToRelative(dx1 = -1.0f, dy1 = -0.1f, dx2 = -1.5f, dy2 = -1.3f, dx3 = -0.8f, dy3 = -2.0f)
                moveToRelative(dx = -6.3f, dy = -7.4f)
                lineTo(x = 4.4f, y = 8.0f)
                curveTo(x1 = 4.7f, y1 = 7.4f, x2 = 5.5f, y2 = 7.3f, x3 = 6.0f, y3 = 7.8f)
                lineToRelative(dx = 3.5f, dy = 3.5f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.4f, dx2 = 0.4f, dy2 = 1.0f, dx3 = 0.0f, dy3 = 1.4f)
                lineTo(x = 6.0f, y = 16.2f)
                curveToRelative(dx1 = -0.5f, dy1 = 0.5f, dx2 = -1.2f, dy2 = 0.4f, dx3 = -1.6f, dy3 = -0.2f)
                lineToRelative(dx = -2.2f, dy = -3.5f)
                curveToRelative(dx1 = -0.3f, dy1 = -0.3f, dx2 = -0.3f, dy2 = -0.7f, dx3 = 0.0f, dy3 = -1.0f)
                moveToRelative(dx = 19.6f, dy = 0.0f)
                lineTo(x = 19.6f, y = 8.0f)
                curveToRelative(dx1 = -0.3f, dy1 = -0.5f, dx2 = -1.1f, dy2 = -0.6f, dx3 = -1.6f, dy3 = -0.2f)
                lineToRelative(dx = -3.5f, dy = 3.5f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.4f, dx2 = -0.4f, dy2 = 1.0f, dx3 = 0.0f, dy3 = 1.4f)
                lineToRelative(dx = 3.5f, dy = 3.5f)
                curveToRelative(dx1 = 0.5f, dy1 = 0.5f, dx2 = 1.2f, dy2 = 0.4f, dx3 = 1.6f, dy3 = -0.2f)
                lineToRelative(dx = 2.2f, dy = -3.5f)
                curveToRelative(dx1 = 0.3f, dy1 = -0.3f, dx2 = 0.3f, dy2 = -0.7f, dx3 = 0.0f, dy3 = -1.0f)
            }
        }.build().also { _educare = it }
    }

@Suppress("ObjectPropertyName")
private var _educare: ImageVector? = null
