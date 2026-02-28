package com.github.yohannestz.iconsax_compose.iconsax.outline

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
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.89f, y = 8.58f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = 4.22f, dy = 0.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = 2.36f, dy = 2.31f)
                horizontalLineTo(x = 7.52f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 8.95f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.5f, y = 18.42f)
                horizontalLineToRelative(dx = -3.0f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.75f, dy1 = -4.75f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.75f, dx2 = 2.0f, dy2 = -4.75f, dx3 = 4.75f, dy3 = -4.75f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 2.75f, dy1 = 0.0f, dx2 = 4.75f, dy2 = 2.0f, dx3 = 4.75f, dy3 = 4.75f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.75f, dx2 = -2.0f, dy2 = 4.75f, dx3 = -4.75f, dy3 = 4.75f)
                moveToRelative(dx = -3.0f, dy = -11.0f)
                curveToRelative(dx1 = -2.25f, dy1 = 0.0f, dx2 = -3.25f, dy2 = 1.63f, dx3 = -3.25f, dy3 = 3.25f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.62f, dx2 = 1.0f, dy2 = 3.25f, dx3 = 3.25f, dy3 = 3.25f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 2.25f, dy1 = 0.0f, dx2 = 3.25f, dy2 = -1.63f, dx3 = 3.25f, dy3 = -3.25f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.62f, dx2 = -1.0f, dy2 = -3.25f, dx3 = -3.25f, dy3 = -3.25f)
                close()
            }
        }.build().also { _calendarCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _calendarCircle: ImageVector? = null
