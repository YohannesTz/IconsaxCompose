package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
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
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 20.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -4.25f, dy1 = 0.0f, dx2 = -5.64f, dy2 = -1.27f, dx3 = -5.74f, dy3 = -5.23f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.31f, dx2 = 0.2f, dy2 = -0.54f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.55f, dy1 = -0.23f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.5f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.54f, dy1 = -0.23f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.21f, dy1 = -0.54f)
                curveTo(x1 = 1.36f, y1 = 4.52f, x2 = 2.75f, y2 = 3.25f, x3 = 7.0f, y3 = 3.25f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 4.4f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 1.34f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.41f, dx2 = -1.34f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
                moveTo(x = 2.79f, y = 16.18f)
                curveToRelative(dx1 = 0.17f, dy1 = 2.54f, dx2 = 1.03f, dy2 = 3.07f, dx3 = 4.2f, dy3 = 3.07f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.59f, dy1 = 0.0f, dx2 = 4.26f, dy2 = -0.68f, dx3 = 4.26f, dy3 = -4.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.57f, dx2 = -0.67f, dy2 = -4.25f, dx3 = -4.25f, dy3 = -4.25f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.18f, dy1 = 0.0f, dx2 = -4.04f, dy2 = 0.54f, dx3 = -4.21f, dy3 = 3.07f)
                curveTo(x1 = 4.76f, y1 = 8.2f, x2 = 6.25f, y2 = 9.93f, x3 = 6.25f, y3 = 12.0f)
                reflectiveCurveToRelative(dx1 = -1.5f, dy1 = 3.8f, dx2 = -3.46f, dy2 = 4.18f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.0f, y = 8.25f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.25f, y1 = 7.5f)
                verticalLineTo(y = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 9.75f, y1 = 3.59f, x2 = 9.75f, y2 = 4.0f)
                verticalLineToRelative(dy = 3.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 8.25f)
                moveToRelative(dx = 0.0f, dy = 12.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.25f, y1 = 20.0f)
                verticalLineToRelative(dy = -3.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineTo(y = 20.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 20.75f)
                moveToRelative(dx = 4.04f, dy = -5.1f)
                arcToRelative(a = 1.15f, b = 1.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.14f, dy1 = -1.36f)
                lineToRelative(dx = 0.21f, dy = -1.19f)
                lineToRelative(dx = -0.87f, dy = -0.85f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = -1.19f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.94f, dy1 = -0.79f)
                lineToRelative(dx = 1.2f, dy = -0.18f)
                lineTo(x = 13.62f, y = 9.0f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.04f, dy1 = -0.65f)
                arcTo(horizontalEllipseRadius = 1.1f, verticalEllipseRadius = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.7f, y1 = 9.0f)
                lineToRelative(dx = 0.54f, dy = 1.1f)
                lineToRelative(dx = 1.2f, dy = 0.17f)
                arcToRelative(a = 1.16f, b = 1.16f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.64f, dy1 = 1.98f)
                lineToRelative(dx = -0.87f, dy = 0.85f)
                lineToRelative(dx = 0.21f, dy = 1.2f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.46f, dy1 = 1.13f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.22f, dy1 = 0.1f)
                lineToRelative(dx = -1.07f, dy = -0.57f)
                lineToRelative(dx = -1.08f, dy = 0.56f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.55f, dy1 = 0.13f)
                moveToRelative(dx = -0.27f, dy = -4.0f)
                lineToRelative(dx = 0.51f, dy = 0.5f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.34f, dy1 = 1.03f)
                lineToRelative(dx = -0.12f, dy = 0.7f)
                lineToRelative(dx = 0.63f, dy = -0.33f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.08f, dy1 = 0.0f)
                lineToRelative(dx = 0.63f, dy = 0.33f)
                lineToRelative(dx = -0.12f, dy = -0.7f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.34f, dy1 = -1.03f)
                lineToRelative(dx = 0.51f, dy = -0.5f)
                lineToRelative(dx = -0.7f, dy = -0.1f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.88f, dy1 = -0.64f)
                lineToRelative(dx = -0.31f, dy = -0.64f)
                lineToRelative(dx = -0.31f, dy = 0.64f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.88f, dy1 = 0.64f)
                close()
            }
        }.build().also { _ticketStar = it }
    }

@Suppress("ObjectPropertyName")
private var _ticketStar: ImageVector? = null
