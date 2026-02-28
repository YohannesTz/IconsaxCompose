package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartTwentyOne: ImageVector
    get() {
        val current = _chartTwentyOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ChartTwentyOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 22.0f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 20.5f, x2 = 2.0f, y2 = 20.5f)
                horizontalLineToRelative(dx = 20.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 22.41f, y1 = 22.0f, x2 = 22.0f, y2 = 22.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.75f, y = 4.0f)
                verticalLineToRelative(dy = 18.0f)
                horizontalLineToRelative(dx = 4.5f)
                verticalLineTo(y = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.1f, dx2 = -0.45f, dy2 = -2.0f, dx3 = -1.8f, dy3 = -2.0f)
                horizontalLineToRelative(dx = -0.9f)
                curveToRelative(dx1 = -1.35f, dy1 = 0.0f, dx2 = -1.8f, dy2 = 0.9f, dx3 = -1.8f, dy3 = 2.0f)
                moveTo(x = 3.0f, y = 10.0f)
                verticalLineToRelative(dy = 12.0f)
                horizontalLineToRelative(dx = 4.0f)
                verticalLineTo(y = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.1f, dx2 = -0.4f, dy2 = -2.0f, dx3 = -1.6f, dy3 = -2.0f)
                horizontalLineTo(x = 4.6f)
                curveTo(x1 = 3.4f, y1 = 8.0f, x2 = 3.0f, y2 = 8.9f, x3 = 3.0f, y3 = 10.0f)
                moveToRelative(dx = 14.0f, dy = 5.0f)
                verticalLineToRelative(dy = 7.0f)
                horizontalLineToRelative(dx = 4.0f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.1f, dx2 = -0.4f, dy2 = -2.0f, dx3 = -1.6f, dy3 = -2.0f)
                horizontalLineToRelative(dx = -0.8f)
                curveToRelative(dx1 = -1.2f, dy1 = 0.0f, dx2 = -1.6f, dy2 = 0.9f, dx3 = -1.6f, dy3 = 2.0f)
            }
        }.build().also { _chartTwentyOne = it }
    }

@Suppress("ObjectPropertyName")
private var _chartTwentyOne: ImageVector? = null
