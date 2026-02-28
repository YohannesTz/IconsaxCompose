package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Receive: ImageVector
    get() {
        val current = _receive
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Receive",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.0f, y = 18.2f)
                curveToRelative(dx1 = -0.2f, dy1 = 0.0f, dx2 = -0.4f, dy2 = -0.1f, dx3 = -0.5f, dy3 = -0.2f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.1f)
                lineToRelative(dx = 14.0f, dy = -14.0f)
                curveToRelative(dx1 = 0.3f, dy1 = -0.3f, dx2 = 0.8f, dy2 = -0.3f, dx3 = 1.1f, dy3 = 0.0f)
                reflectiveCurveToRelative(dx1 = 0.3f, dy1 = 0.8f, dx2 = 0.0f, dy2 = 1.1f)
                lineToRelative(dx = -14.0f, dy = 14.0f)
                curveToRelative(dx1 = -0.2f, dy1 = 0.2f, dx2 = -0.4f, dy2 = 0.2f, dx3 = -0.6f, dy3 = 0.2f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.3f, y = 18.2f)
                horizontalLineTo(x = 5.0f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.0f, dx2 = -0.8f, dy2 = -0.3f, dx3 = -0.8f, dy3 = -0.8f)
                verticalLineTo(y = 7.2f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.3f, dy2 = -0.8f, dx3 = 0.8f, dy3 = -0.8f)
                reflectiveCurveToRelative(dx1 = 0.8f, dy1 = 0.3f, dx2 = 0.8f, dy2 = 0.8f)
                verticalLineToRelative(dy = 9.5f)
                horizontalLineToRelative(dx = 9.5f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.8f, dy2 = 0.3f, dx3 = 0.8f, dy3 = 0.8f)
                reflectiveCurveToRelative(dx1 = -0.4f, dy1 = 0.7f, dx2 = -0.8f, dy2 = 0.7f)
            }
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
        }.build().also { _receive = it }
    }

@Suppress("ObjectPropertyName")
private var _receive: ImageVector? = null
