package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WanchainOne: ImageVector
    get() {
        val current = _wanchainOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WanchainOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.7f, y = 3.0f)
                horizontalLineTo(x = 8.9f)
                curveTo(x1 = 8.5f, y1 = 3.0f, x2 = 8.2f, y2 = 3.4f, x3 = 8.4f, y3 = 3.8f)
                lineTo(x = 11.5f, y = 9.0f)
                horizontalLineTo(x = 5.3f)
                curveTo(x1 = 5.1f, y1 = 9.0f, x2 = 4.9f, y2 = 9.1f, x3 = 4.9f, y3 = 9.2f)
                lineToRelative(dx = -3.7f, dy = 5.5f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.6f)
                lineToRelative(dx = 3.4f, dy = 5.1f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.3f, dx2 = 0.7f, dy2 = 0.3f, dx3 = 0.8f, dy3 = 0.0f)
                lineToRelative(dx = 2.5f, dy = -4.2f)
                curveToRelative(dx1 = 0.2f, dy1 = -0.3f, dx2 = 0.6f, dy2 = -0.3f, dx3 = 0.8f, dy3 = 0.0f)
                lineToRelative(dx = 3.1f, dy = 4.7f)
                curveToRelative(dx1 = 0.1f, dy1 = 0.1f, dx2 = 0.2f, dy2 = 0.2f, dx3 = 0.4f, dy3 = 0.2f)
                horizontalLineToRelative(dx = 6.5f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.0f, dx2 = 0.3f, dy2 = -0.1f, dx3 = 0.4f, dy3 = -0.2f)
                lineToRelative(dx = 3.7f, dy = -5.5f)
                curveToRelative(dx1 = 0.1f, dy1 = -0.2f, dx2 = 0.1f, dy2 = -0.4f, dx3 = 0.0f, dy3 = -0.5f)
                lineTo(x = 16.1f, y = 3.2f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.1f, dx2 = -0.2f, dy2 = -0.2f, dx3 = -0.4f, dy3 = -0.2f)
                close()
                moveTo(x = 8.5f, y = 15.0f)
                lineToRelative(dx = 3.2f, dy = -5.6f)
                lineToRelative(dx = 2.8f, dy = 4.8f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.3f, dx2 = 0.0f, dy2 = 0.8f, dx3 = -0.4f, dy3 = 0.8f)
                close()
            }
        }.build().also { _wanchainOne = it }
    }

@Suppress("ObjectPropertyName")
private var _wanchainOne: ImageVector? = null
