package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CalendarOne: ImageVector
    get() {
        val current = _calendarOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CalendarOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 8.0f, y = 1.25f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.75f, y1 = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = 0.0f)
                verticalLineTo(y = 2.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.0f, y1 = 1.25f)
                moveToRelative(dx = 8.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.75f, y1 = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.5f, dy1 = 0.0f)
                verticalLineTo(y = 2.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 1.25f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 21.5f, y = 8.37f)
                verticalLineToRelative(dy = 8.76f)
                lineToRelative(dx = -0.02f, dy = 0.47f)
                horizontalLineTo(x = 2.52f)
                lineTo(x = 2.5f, y = 17.13f)
                verticalLineTo(y = 8.37f)
                arcTo(horizontalEllipseRadius = 4.87f, verticalEllipseRadius = 4.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.37f, y1 = 3.5f)
                horizontalLineToRelative(dx = 9.26f)
                arcToRelative(a = 4.87f, b = 4.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.87f, dy1 = 4.87f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.48f, y = 17.6f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.85f, dy1 = 4.4f)
                horizontalLineTo(x = 7.37f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.85f, dy1 = -4.4f)
                close()
                moveToRelative(dx = -7.95f, dy = -5.98f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.73f, dy1 = -1.39f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.3f, dx2 = -1.04f, dy2 = -1.97f, dx3 = -2.26f, dy3 = -1.97f)
                reflectiveCurveToRelative(dx1 = -2.27f, dy1 = 0.67f, dx2 = -2.27f, dy2 = 1.97f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.73f, dy1 = 1.4f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.96f, dy1 = 1.61f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.24f, dx2 = 0.95f, dy2 = 2.01f, dx3 = 2.5f, dy3 = 2.01f)
                curveToRelative(dx1 = 1.54f, dy1 = 0.0f, dx2 = 2.5f, dy2 = -0.77f, dx3 = 2.5f, dy3 = -2.0f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.97f, dy1 = -1.63f)
                moveTo(x = 12.0f, y = 9.5f)
                curveToRelative(dx1 = 0.52f, dy1 = 0.0f, dx2 = 0.9f, dy2 = 0.3f, dx3 = 0.9f, dy3 = 0.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.48f, dx2 = -0.38f, dy2 = 0.8f, dx3 = -0.9f, dy3 = 0.8f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = -0.32f, dx2 = -0.9f, dy2 = -0.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.5f, dx2 = 0.38f, dy2 = -0.8f, dx3 = 0.9f, dy3 = -0.8f)
                moveToRelative(dx = 0.0f, dy = 4.5f)
                curveToRelative(dx1 = -0.66f, dy1 = 0.0f, dx2 = -1.14f, dy2 = -0.33f, dx3 = -1.14f, dy3 = -0.93f)
                reflectiveCurveToRelative(dx1 = 0.48f, dy1 = -0.92f, dx2 = 1.14f, dy2 = -0.92f)
                reflectiveCurveToRelative(dx1 = 1.14f, dy1 = 0.33f, dx2 = 1.14f, dy2 = 0.92f)
                reflectiveCurveTo(x1 = 12.66f, y1 = 14.0f, x2 = 12.0f, y2 = 14.0f)
            }
        }.build().also { _calendarOne = it }
    }

@Suppress("ObjectPropertyName")
private var _calendarOne: ImageVector? = null
