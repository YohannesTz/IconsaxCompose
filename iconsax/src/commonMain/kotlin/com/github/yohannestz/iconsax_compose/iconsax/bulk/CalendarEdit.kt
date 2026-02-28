package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CalendarEdit: ImageVector
    get() {
        val current = _calendarEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CalendarEdit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.75f, y = 3.56f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 15.25f, y1 = 1.59f, x2 = 15.25f, y2 = 2.0f)
                verticalLineToRelative(dy = 1.5f)
                horizontalLineToRelative(dx = -6.5f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.25f, y1 = 1.59f, x2 = 7.25f, y2 = 2.0f)
                verticalLineToRelative(dy = 1.56f)
                curveToRelative(dx1 = -2.7f, dy1 = 0.25f, dx2 = -4.01f, dy2 = 1.86f, dx3 = -4.21f, dy3 = 4.25f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = 0.53f)
                horizontalLineToRelative(dx = 16.92f)
                curveToRelative(dx1 = 0.29f, dy1 = 0.0f, dx2 = 0.53f, dy2 = -0.25f, dx3 = 0.5f, dy3 = -0.53f)
                curveToRelative(dx1 = -0.2f, dy1 = -2.39f, dx2 = -1.51f, dy2 = -4.0f, dx3 = -4.21f, dy3 = -4.25f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.0f, y = 9.84f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
                verticalLineTo(y = 17.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -1.5f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -3.5f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -2.0f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -6.16f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = -1.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.84f, y = 14.99f)
                lineToRelative(dx = -0.5f, dy = 0.51f)
                horizontalLineToRelative(dx = -0.01f)
                lineToRelative(dx = -3.03f, dy = 3.03f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.59f, dy1 = 0.29f)
                lineToRelative(dx = -1.35f, dy = 0.2f)
                curveToRelative(dx1 = -0.49f, dy1 = 0.07f, dx2 = -0.83f, dy2 = -0.28f, dx3 = -0.76f, dy3 = -0.76f)
                lineToRelative(dx = 0.19f, dy = -1.36f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = -0.59f)
                lineToRelative(dx = 3.04f, dy = -3.03f)
                lineToRelative(dx = 0.5f, dy = -0.51f)
                curveToRelative(dx1 = 0.33f, dy1 = -0.33f, dx2 = 0.7f, dy2 = -0.57f, dx3 = 1.1f, dy3 = -0.57f)
                curveToRelative(dx1 = 0.34f, dy1 = 0.0f, dx2 = 0.71f, dy2 = 0.16f, dx3 = 1.12f, dy3 = 0.57f)
                curveToRelative(dx1 = 0.9f, dy1 = 0.9f, dx2 = 0.61f, dy2 = 1.61f, dx3 = 0.0f, dy3 = 2.22f)
            }
        }.build().also { _calendarEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _calendarEdit: ImageVector? = null
