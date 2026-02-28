package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Candle: ImageVector
    get() {
        val current = _candle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Candle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.5f, y = 4.5f)
                horizontalLineTo(x = 7.25f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.75f, y1 = 1.59f, x2 = 5.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 2.5f)
                horizontalLineTo(x = 5.5f)
                curveTo(x1 = 3.91f, y1 = 4.5f, x2 = 3.0f, y2 = 5.41f, x3 = 3.0f, y3 = 7.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.59f, dx2 = 0.91f, dy2 = 2.5f, dx3 = 2.5f, dy3 = 2.5f)
                horizontalLineToRelative(dx = 0.25f)
                verticalLineTo(y = 22.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 7.25f, y1 = 22.41f, x2 = 7.25f, y2 = 22.0f)
                verticalLineToRelative(dy = -6.5f)
                horizontalLineTo(x = 7.5f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.5f, dy2 = -0.91f, dx3 = 2.5f, dy3 = -2.5f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.59f, dx2 = -0.91f, dy2 = -2.5f, dx3 = -2.5f, dy3 = -2.5f)
                moveToRelative(dx = 11.0f, dy = 4.0f)
                horizontalLineToRelative(dx = -0.25f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 16.75f, y1 = 1.59f, x2 = 16.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 6.5f)
                horizontalLineTo(x = 16.5f)
                curveTo(x1 = 14.91f, y1 = 8.5f, x2 = 14.0f, y2 = 9.41f, x3 = 14.0f, y3 = 11.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.59f, dx2 = 0.91f, dy2 = 2.5f, dx3 = 2.5f, dy3 = 2.5f)
                horizontalLineToRelative(dx = 0.25f)
                verticalLineTo(y = 22.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -2.5f)
                horizontalLineToRelative(dx = 0.25f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.5f, dy2 = -0.91f, dx3 = 2.5f, dy3 = -2.5f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.59f, dx2 = -0.91f, dy2 = -2.5f, dx3 = -2.5f, dy3 = -2.5f)
            }
        }.build().also { _candle = it }
    }

@Suppress("ObjectPropertyName")
private var _candle: ImageVector? = null
