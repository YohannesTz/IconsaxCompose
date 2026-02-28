package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CalendarCircle: ImageVector
    get() {
        val current = _calendarCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CalendarCircle",
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
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.15f, y = 9.44f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.3f, dy1 = -2.06f)
                verticalLineTo(y = 6.59f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = 0.34f, dx2 = -0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 0.59f)
                horizontalLineToRelative(dx = -2.71f)
                verticalLineTo(y = 6.59f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 9.14f, y1 = 6.18f, x2 = 9.14f, y2 = 6.59f)
                verticalLineToRelative(dy = 0.79f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.3f, dy1 = 2.06f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.46f, dy1 = 0.71f)
                horizontalLineToRelative(dx = 9.37f)
                arcToRelative(a = 0.52f, b = 0.52f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.48f, dy1 = -0.71f)
                moveTo(x = 17.0f, y = 11.14f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = 0.5f)
                verticalLineToRelative(dy = 2.53f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.2f, dx2 = -1.5f, dy2 = 4.0f, dx3 = -4.0f, dy3 = 4.0f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -2.5f, dy1 = 0.0f, dx2 = -4.0f, dy2 = -1.8f, dx3 = -4.0f, dy3 = -4.0f)
                verticalLineToRelative(dy = -2.53f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.5f, dy1 = -0.5f)
                close()
            }
        }.build().also { _calendarCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _calendarCircle: ImageVector? = null
