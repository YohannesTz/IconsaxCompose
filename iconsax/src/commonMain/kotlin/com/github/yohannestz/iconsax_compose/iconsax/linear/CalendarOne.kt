package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = 8.0f, dy = -3.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = 0.0f, dy = -1.5f)
                curveToRelative(dx1 = 3.33f, dy1 = 0.18f, dx2 = 5.0f, dy2 = 1.45f, dx3 = 5.0f, dy3 = 6.15f)
                verticalLineToRelative(dy = 6.18f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.12f, dx2 = -1.0f, dy2 = 6.18f, dx3 = -6.0f, dy3 = 6.18f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -6.0f, dy2 = -2.06f, dx3 = -6.0f, dy3 = -6.18f)
                verticalLineTo(y = 9.65f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.7f, dx2 = 1.67f, dy2 = -5.96f, dx3 = 5.0f, dy3 = -6.15f)
                close()
                moveToRelative(dx = 4.75f, dy = 14.1f)
                horizontalLineTo(x = 3.25f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 8.25f)
                curveToRelative(dx1 = -1.23f, dy1 = 0.0f, dx2 = -2.27f, dy2 = 0.67f, dx3 = -2.27f, dy3 = 1.97f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.73f, dy1 = 1.39f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.96f, dy1 = 1.62f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.24f, dx2 = 0.95f, dy2 = 2.01f, dx3 = 2.5f, dy3 = 2.01f)
                curveToRelative(dx1 = 1.54f, dy1 = 0.0f, dx2 = 2.5f, dy2 = -0.77f, dx3 = 2.5f, dy3 = -2.01f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.97f, dy1 = -1.62f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.73f, dy1 = -1.39f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.3f, dx2 = -1.03f, dy2 = -1.97f, dx3 = -2.26f, dy3 = -1.97f)
                moveToRelative(dx = 0.0f, dy = 2.84f)
                curveToRelative(dx1 = -0.52f, dy1 = 0.0f, dx2 = -0.9f, dy2 = -0.31f, dx3 = -0.9f, dy3 = -0.8f)
                reflectiveCurveTo(x1 = 11.48f, y1 = 9.5f, x2 = 12.0f, y2 = 9.5f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = 0.29f, dx2 = 0.9f, dy2 = 0.79f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.49f, dx2 = -0.38f, dy2 = 0.8f, dx3 = -0.9f, dy3 = 0.8f)
                moveTo(x = 12.0f, y = 14.0f)
                curveToRelative(dx1 = -0.66f, dy1 = 0.0f, dx2 = -1.14f, dy2 = -0.33f, dx3 = -1.14f, dy3 = -0.93f)
                reflectiveCurveToRelative(dx1 = 0.48f, dy1 = -0.92f, dx2 = 1.14f, dy2 = -0.92f)
                reflectiveCurveToRelative(dx1 = 1.14f, dy1 = 0.33f, dx2 = 1.14f, dy2 = 0.92f)
                reflectiveCurveTo(x1 = 12.66f, y1 = 14.0f, x2 = 12.0f, y2 = 14.0f)
            }
        }.build().also { _calendarOne = it }
    }

@Suppress("ObjectPropertyName")
private var _calendarOne: ImageVector? = null
