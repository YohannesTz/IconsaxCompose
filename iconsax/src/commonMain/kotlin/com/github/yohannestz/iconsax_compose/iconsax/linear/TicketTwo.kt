package com.github.yohannestz.iconsax_compose.iconsax.linear

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
                moveTo(x = 18.91f, y = 14.7f)
                arcToRelative(a = 2.35f, b = 2.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.35f, dy1 = 2.33f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.75f, dx2 = -0.94f, dy2 = 4.7f, dx3 = -4.69f, dy3 = 4.7f)
                horizontalLineTo(x = 7.19f)
                curveToRelative(dx1 = -3.75f, dy1 = 0.0f, dx2 = -4.69f, dy2 = -0.95f, dx3 = -4.69f, dy3 = -4.7f)
                verticalLineToRelative(dy = -0.46f)
                arcToRelative(a = 2.36f, b = 2.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.35f, dy1 = -2.35f)
                arcToRelative(a = 2.36f, b = 2.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.35f, dy1 = -2.35f)
                verticalLineToRelative(dy = -0.46f)
                curveToRelative(dx1 = 0.01f, dy1 = -3.75f, dx2 = 0.94f, dy2 = -4.69f, dx3 = 4.69f, dy3 = -4.69f)
                horizontalLineToRelative(dx = 9.37f)
                curveToRelative(dx1 = 3.75f, dy1 = 0.0f, dx2 = 4.69f, dy2 = 0.94f, dx3 = 4.69f, dy3 = 4.7f)
                verticalLineToRelative(dy = 0.93f)
                arcToRelative(a = 2.34f, b = 2.34f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.34f, dy1 = 2.34f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.21f, y = 6.72f)
                horizontalLineTo(x = 7.12f)
                lineToRelative(dx = 2.93f, dy = -2.93f)
                curveToRelative(dx1 = 2.4f, dy1 = -2.39f, dx2 = 3.6f, dy2 = -2.39f, dx3 = 5.98f, dy3 = 0.0f)
                lineToRelative(dx = 0.6f, dy = 0.6f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.42f, dy1 = 2.33f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.88f, y = 6.72f)
                verticalLineToRelative(dy = 15.0f)
            }
        }.build().also { _ticketTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _ticketTwo: ImageVector? = null
