package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Polyswarm: ImageVector
    get() {
        val current = _polyswarm
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Polyswarm",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 14.5f, y = 18.0f)
                horizontalLineToRelative(dx = -11.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 3.09f, y1 = 16.5f, x2 = 3.5f, y2 = 16.5f)
                horizontalLineToRelative(dx = 11.0f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -12.5f)
                horizontalLineToRelative(dx = -5.0f)
                curveTo(x1 = 9.09f, y1 = 4.0f, x2 = 8.75f, y2 = 3.66f, x3 = 8.75f, y3 = 3.25f)
                reflectiveCurveTo(x1 = 9.09f, y1 = 2.5f, x2 = 9.5f, y2 = 2.5f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 4.27f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 3.48f, dx3 = 7.75f, dy3 = 7.75f)
                reflectiveCurveTo(x1 = 18.77f, y1 = 18.0f, x2 = 14.5f, y2 = 18.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 13.81f, y = 14.9f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.35f, dx3 = -0.75f, dy3 = -0.76f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 13.4f, x2 = 8.0f, y2 = 13.4f)
                horizontalLineToRelative(dx = 5.81f)
                arcToRelative(a = 2.94f, b = 2.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.88f)
                horizontalLineTo(x = 3.17f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 10.64f)
                arcToRelative(a = 4.44f, b = 4.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 8.88f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 8.5f, y = 11.5f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.09f, y1 = 10.0f, x2 = 5.5f, y2 = 10.0f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 8.91f, y1 = 11.5f, x2 = 8.5f, y2 = 11.5f)
                moveToRelative(dx = -2.0f, dy = 10.0f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.09f, y1 = 20.0f, x2 = 2.5f, y2 = 20.0f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 6.91f, y1 = 21.5f, x2 = 6.5f, y2 = 21.5f)
            }
        }.build().also { _polyswarm = it }
    }

@Suppress("ObjectPropertyName")
private var _polyswarm: ImageVector? = null
