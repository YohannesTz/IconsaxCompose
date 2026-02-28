package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TicketExpired: ImageVector
    get() {
        val current = _ticketExpired
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TicketExpired",
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
                moveTo(x = 22.0f, y = 10.75f)
                verticalLineTo(y = 9.83f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.7f, dx2 = -0.92f, dy2 = -4.62f, dx3 = -4.62f, dy3 = -4.62f)
                horizontalLineTo(x = 11.0f)
                verticalLineTo(y = 12.0f)
                moveToRelative(dx = -0.09f, dy = 8.0f)
                horizontalLineToRelative(dx = 6.47f)
                curveToRelative(dx1 = 3.7f, dy1 = 0.0f, dx2 = 4.62f, dy2 = -0.92f, dx3 = 4.62f, dy3 = -4.62f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.31f, dy1 = -2.31f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.0f, y = 17.0f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineTo(x = 8.23f)
                curveToRelative(dx1 = -1.48f, dy1 = 0.0f, dx2 = -2.35f, dy2 = -1.01f, dx3 = -3.3f, dy3 = -3.33f)
                lineToRelative(dx = -0.19f, dy = -0.45f)
                arcToRelative(a = 2.35f, b = 2.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.3f, dy1 = -3.1f)
                arcToRelative(a = 2.37f, b = 2.37f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.1f, dy1 = -1.28f)
                lineTo(x = 2.75f, y = 11.4f)
                curveTo(x1 = 1.32f, y1 = 7.89f, x2 = 1.82f, y2 = 6.66f, x3 = 5.34f, y3 = 5.2f)
                lineToRelative(dx = 2.64f, dy = -1.08f)
                lineTo(x = 11.0f, y = 11.45f)
                verticalLineTo(y = 14.0f)
                moveToRelative(dx = -2.83f, dy = 6.0f)
                horizontalLineTo(x = 8.0f)
            }
        }.build().also { _ticketExpired = it }
    }

@Suppress("ObjectPropertyName")
private var _ticketExpired: ImageVector? = null
