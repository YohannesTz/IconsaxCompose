package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TicketStar: ImageVector
    get() {
        val current = _ticketStar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TicketStar",
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
                moveTo(x = 3.24f, y = 15.27f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.23f, dy1 = 0.22f)
                curveToRelative(dx1 = 0.1f, dy1 = 3.59f, dx2 = 1.16f, dy2 = 4.51f, dx3 = 5.0f, dy3 = 4.51f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 4.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -1.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.0f, dx2 = -1.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 3.16f, y1 = 4.0f, x2 = 2.1f, y2 = 4.92f, x3 = 2.0f, y3 = 8.5f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.5f, dy1 = 3.5f)
                moveTo(x = 9.0f, y = 4.0f)
                verticalLineToRelative(dy = 3.5f)
                moveToRelative(dx = 0.0f, dy = 9.0f)
                verticalLineTo(y = 20.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.86f, y = 14.2f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.39f, dy1 = 0.0f)
                lineToRelative(dx = -1.23f, dy = 0.66f)
                arcToRelative(a = 0.41f, b = 0.41f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = -0.44f)
                lineToRelative(dx = 0.24f, dy = -1.37f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.12f, dy1 = -0.37f)
                lineToRelative(dx = -0.99f, dy = -0.97f)
                arcTo(horizontalEllipseRadius = 0.42f, verticalEllipseRadius = 0.42f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 11.0f)
                lineToRelative(dx = 1.38f, dy = -0.2f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.31f, dy1 = -0.23f)
                lineToRelative(dx = 0.61f, dy = -1.25f)
                arcToRelative(a = 0.41f, b = 0.41f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.74f, dy1 = 0.0f)
                lineToRelative(dx = 0.62f, dy = 1.25f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.31f, dy1 = 0.23f)
                lineToRelative(dx = 1.38f, dy = 0.2f)
                arcToRelative(a = 0.42f, b = 0.42f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.23f, dy1 = 0.7f)
                lineToRelative(dx = -1.0f, dy = 0.98f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.12f, dy1 = 0.37f)
            }
        }.build().also { _ticketStar = it }
    }

@Suppress("ObjectPropertyName")
private var _ticketStar: ImageVector? = null
