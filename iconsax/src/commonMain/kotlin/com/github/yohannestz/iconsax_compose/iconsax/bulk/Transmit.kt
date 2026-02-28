package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Transmit: ImageVector
    get() {
        val current = _transmit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Transmit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.5f, y = 22.8f)
                horizontalLineToRelative(dx = -17.0f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.0f, dx2 = -0.8f, dy2 = -0.3f, dx3 = -0.8f, dy3 = -0.8f)
                reflectiveCurveToRelative(dx1 = 0.3f, dy1 = -0.8f, dx2 = 0.8f, dy2 = -0.8f)
                horizontalLineToRelative(dx = 17.0f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.8f, dy2 = 0.3f, dx3 = 0.8f, dy3 = 0.8f)
                reflectiveCurveToRelative(dx1 = -0.4f, dy1 = 0.8f, dx2 = -0.8f, dy2 = 0.8f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.0f, y = 18.2f)
                curveToRelative(dx1 = -0.2f, dy1 = 0.0f, dx2 = -0.4f, dy2 = -0.1f, dx3 = -0.5f, dy3 = -0.2f)
                lineTo(x = 4.5f, y = 4.0f)
                curveToRelative(dx1 = -0.3f, dy1 = -0.3f, dx2 = -0.3f, dy2 = -0.7f, dx3 = 0.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.8f, dy1 = -0.3f, dx2 = 1.1f, dy2 = 0.0f)
                lineToRelative(dx = 14.0f, dy = 14.0f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.3f, dx2 = 0.3f, dy2 = 0.8f, dx3 = 0.0f, dy3 = 1.1f)
                curveToRelative(dx1 = -0.2f, dy1 = 0.1f, dx2 = -0.4f, dy2 = 0.1f, dx3 = -0.6f, dy3 = 0.1f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.0f, y = 14.5f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.0f, dx2 = -0.8f, dy2 = -0.3f, dx3 = -0.8f, dy3 = -0.8f)
                verticalLineTo(y = 3.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.3f, dy2 = -0.8f, dx3 = 0.8f, dy3 = -0.8f)
                horizontalLineToRelative(dx = 10.3f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.8f, dy2 = 0.3f, dx3 = 0.8f, dy3 = 0.8f)
                reflectiveCurveToRelative(dx1 = -0.3f, dy1 = 0.8f, dx2 = -0.8f, dy2 = 0.8f)
                horizontalLineTo(x = 5.8f)
                verticalLineToRelative(dy = 9.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.4f, dy2 = 0.7f, dx3 = -0.8f, dy3 = 0.7f)
            }
        }.build().also { _transmit = it }
    }

@Suppress("ObjectPropertyName")
private var _transmit: ImageVector? = null
