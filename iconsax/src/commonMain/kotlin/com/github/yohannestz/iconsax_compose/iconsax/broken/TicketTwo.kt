package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TicketTwo: ImageVector
    get() {
        val current = _ticketTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TicketTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.03f, y = 14.97f)
                arcToRelative(a = 2.35f, b = 2.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.35f, dy1 = 2.34f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.75f, dx2 = -0.94f, dy2 = 4.69f, dx3 = -4.69f, dy3 = 4.69f)
                horizontalLineTo(x = 7.31f)
                curveToRelative(dx1 = -3.75f, dy1 = 0.0f, dx2 = -4.69f, dy2 = -0.94f, dx3 = -4.69f, dy3 = -4.69f)
                verticalLineToRelative(dy = -0.46f)
                arcToRelative(a = 2.36f, b = 2.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.35f, dy1 = -2.35f)
                arcToRelative(a = 2.36f, b = 2.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.35f, dy1 = -2.35f)
                verticalLineToRelative(dy = -0.46f)
                curveTo(x1 = 2.63f, y1 = 7.94f, x2 = 3.56f, y2 = 7.0f, x3 = 7.32f, y3 = 7.0f)
                horizontalLineToRelative(dx = 9.36f)
                curveToRelative(dx1 = 3.75f, dy1 = 0.0f, dx2 = 4.7f, dy2 = 0.94f, dx3 = 4.7f, dy3 = 4.69f)
                verticalLineToRelative(dy = 0.94f)
                moveTo(x = 16.32f, y = 7.0f)
                horizontalLineToRelative(dx = -9.1f)
                lineToRelative(dx = 2.94f, dy = -2.93f)
                curveToRelative(dx1 = 2.39f, dy1 = -2.39f, dx2 = 3.59f, dy2 = -2.39f, dx3 = 5.98f, dy3 = 0.0f)
                lineToRelative(dx = 0.6f, dy = 0.6f)
                arcTo(horizontalEllipseRadius = 2.1f, verticalEllipseRadius = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.33f, y1 = 7.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.0f, y = 7.0f)
                verticalLineToRelative(dy = 15.0f)
            }
        }.build().also { _ticketTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _ticketTwo: ImageVector? = null
