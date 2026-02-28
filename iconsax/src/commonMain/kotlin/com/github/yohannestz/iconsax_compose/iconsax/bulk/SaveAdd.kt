package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SaveAdd: ImageVector
    get() {
        val current = _saveAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SaveAdd",
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
                moveTo(x = 16.0f, y = 8.99f)
                verticalLineToRelative(dy = 11.36f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.45f, dx2 = -1.04f, dy2 = 2.06f, dx3 = -2.31f, dy3 = 1.36f)
                lineToRelative(dx = -3.93f, dy = -2.2f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.52f, dy1 = 0.0f)
                lineToRelative(dx = -3.93f, dy = 2.2f)
                curveTo(x1 = 3.04f, y1 = 22.4f, x2 = 2.0f, y2 = 21.8f, x3 = 2.0f, y3 = 20.35f)
                verticalLineTo(y = 8.99f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.71f, dx2 = 1.4f, dy2 = -3.11f, dx3 = 3.11f, dy3 = -3.11f)
                horizontalLineToRelative(dx = 7.78f)
                curveToRelative(dx1 = 1.71f, dy1 = 0.0f, dx2 = 3.11f, dy2 = 1.4f, dx3 = 3.11f, dy3 = 3.1f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 5.11f)
                verticalLineToRelative(dy = 11.36f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.45f, dx2 = -1.04f, dy2 = 2.06f, dx3 = -2.31f, dy3 = 1.36f)
                lineTo(x = 16.0f, y = 15.77f)
                verticalLineTo(y = 8.99f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.71f, dx2 = -1.4f, dy2 = -3.11f, dx3 = -3.11f, dy3 = -3.11f)
                horizontalLineTo(x = 8.0f)
                verticalLineTo(y = 5.11f)
                curveTo(x1 = 8.0f, y1 = 3.4f, x2 = 9.4f, y2 = 2.0f, x3 = 11.11f, y3 = 2.0f)
                horizontalLineToRelative(dx = 7.78f)
                curveTo(x1 = 20.6f, y1 = 2.0f, x2 = 22.0f, y2 = 3.4f, x3 = 22.0f, y3 = 5.11f)
                moveToRelative(dx = -11.0f, dy = 6.14f)
                horizontalLineTo(x = 9.75f)
                verticalLineTo(y = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.25f, y1 = 9.59f, x2 = 8.25f, y2 = 10.0f)
                verticalLineToRelative(dy = 1.25f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 12.75f, x2 = 7.0f, y2 = 12.75f)
                horizontalLineToRelative(dx = 1.25f)
                verticalLineTo(y = 14.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.75f, y1 = 14.41f, x2 = 9.75f, y2 = 14.0f)
                verticalLineToRelative(dy = -1.25f)
                horizontalLineTo(x = 11.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
            }
        }.build().also { _saveAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _saveAdd: ImageVector? = null
