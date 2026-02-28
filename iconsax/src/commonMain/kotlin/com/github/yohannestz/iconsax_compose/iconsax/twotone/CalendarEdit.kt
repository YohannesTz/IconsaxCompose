package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                moveTo(x = 3.5f, y = 9.09f)
                horizontalLineToRelative(dx = 17.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.21f, y = 15.77f)
                lineToRelative(dx = -3.54f, dy = 3.54f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.3f, dy1 = 0.59f)
                lineToRelative(dx = -0.19f, dy = 1.35f)
                curveToRelative(dx1 = -0.07f, dy1 = 0.49f, dx2 = 0.27f, dy2 = 0.83f, dx3 = 0.76f, dy3 = 0.76f)
                lineToRelative(dx = 1.35f, dy = -0.2f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.59f, dy1 = -0.3f)
                lineToRelative(dx = 3.54f, dy = -3.53f)
                curveToRelative(dx1 = 0.61f, dy1 = -0.61f, dx2 = 0.9f, dy2 = -1.32f, dx3 = 0.0f, dy3 = -2.22f)
                curveToRelative(dx1 = -0.89f, dy1 = -0.9f, dx2 = -1.6f, dy2 = -0.6f, dx3 = -2.21f, dy3 = 0.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.7f, y = 16.28f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.22f, dy1 = 2.22f)
                moveTo(x = 12.0f, y = 22.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -3.5f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -2.0f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineTo(y = 8.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 1.5f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 3.5f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 2.0f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineTo(y = 12.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 12.0f, y = 13.7f)
                close()
                moveToRelative(dx = -3.7f, dy = 0.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 3.0f)
                close()
            }
        }.build().also { _calendarEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _calendarEdit: ImageVector? = null
