package com.github.yohannestz.iconsax_compose.iconsax.twotone

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
                moveTo(x = 10.9f, y = 19.87f)
                horizontalLineToRelative(dx = 6.47f)
                curveToRelative(dx1 = 3.7f, dy1 = 0.0f, dx2 = 4.62f, dy2 = -0.92f, dx3 = 4.62f, dy3 = -4.62f)
                arcToRelative(a = 2.31f, b = 2.31f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.63f)
                verticalLineTo(y = 9.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.7f, dx2 = -0.92f, dy2 = -4.62f, dx3 = -4.62f, dy3 = -4.62f)
                horizontalLineTo(x = 11.0f)
                verticalLineToRelative(dy = 6.79f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.0f, y = 16.87f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineTo(x = 8.21f)
                curveToRelative(dx1 = -1.48f, dy1 = 0.0f, dx2 = -2.35f, dy2 = -1.01f, dx3 = -3.3f, dy3 = -3.33f)
                lineToRelative(dx = -0.19f, dy = -0.45f)
                arcTo(horizontalEllipseRadius = 2.35f, verticalEllipseRadius = 2.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.03f, y1 = 13.0f)
                arcToRelative(a = 2.37f, b = 2.37f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.1f, dy1 = -1.29f)
                lineToRelative(dx = -0.18f, dy = -0.43f)
                curveToRelative(dx1 = -1.44f, dy1 = -3.52f, dx2 = -0.94f, dy2 = -4.75f, dx3 = 2.58f, dy3 = -6.2f)
                lineTo(x = 7.97f, y = 4.0f)
                lineTo(x = 11.0f, y = 11.32f)
                verticalLineToRelative(dy = 2.55f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.16f, y = 19.87f)
                horizontalLineTo(x = 8.0f)
            }
        }.build().also { _ticketExpired = it }
    }

@Suppress("ObjectPropertyName")
private var _ticketExpired: ImageVector? = null
