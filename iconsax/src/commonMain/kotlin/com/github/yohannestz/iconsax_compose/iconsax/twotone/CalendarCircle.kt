package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.89f, y = 5.83f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = 4.22f, dy = -2.0f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = -6.58f, dy = 2.3f)
                horizontalLineToRelative(dx = 8.94f)
                moveToRelative(dx = -2.97f, dy = 7.54f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -2.5f, dy1 = 0.0f, dx2 = -4.0f, dy2 = -1.8f, dx3 = -4.0f, dy3 = -4.0f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.2f, dx2 = 1.5f, dy2 = -4.0f, dx3 = 4.0f, dy3 = -4.0f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 2.5f, dy1 = 0.0f, dx2 = 4.0f, dy2 = 1.8f, dx3 = 4.0f, dy3 = 4.0f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.2f, dx2 = -1.5f, dy2 = 4.0f, dx3 = -4.0f, dy3 = 4.0f)
            }
        }.build().also { _calendarCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _calendarCircle: ImageVector? = null
