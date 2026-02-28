package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TicketDiscount: ImageVector
    get() {
        val current = _ticketDiscount
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TicketDiscount",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.3f, y = 10.84f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = -0.7f)
                verticalLineTo(y = 9.21f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.1f, dx2 = -1.25f, dy2 = -5.35f, dx3 = -5.35f, dy3 = -5.35f)
                horizontalLineToRelative(dx = -9.3f)
                curveTo(x1 = 3.25f, y1 = 3.86f, x2 = 2.0f, y2 = 5.11f, x3 = 2.0f, y3 = 9.21f)
                verticalLineToRelative(dy = 0.47f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = 0.7f)
                arcToRelative(a = 1.62f, b = 1.62f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 3.25f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = 0.7f)
                verticalLineToRelative(dy = 0.47f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.1f, dx2 = 1.25f, dy2 = 5.35f, dx3 = 5.35f, dy3 = 5.35f)
                horizontalLineToRelative(dx = 9.3f)
                curveToRelative(dx1 = 4.1f, dy1 = 0.0f, dx2 = 5.35f, dy2 = -1.25f, dx3 = 5.35f, dy3 = -5.35f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = -0.7f)
                arcToRelative(a = 1.63f, b = 1.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -3.26f)
                moveTo(x = 9.0f, y = 8.88f)
                curveToRelative(dx1 = 0.55f, dy1 = 0.0f, dx2 = 1.0f, dy2 = 0.45f, dx3 = 1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                curveToRelative(dx1 = -0.55f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.45f, dx3 = -1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.44f, dy1 = -1.0f, dx2 = 1.0f, dy2 = -1.0f)
                moveToRelative(dx = 6.0f, dy = 7.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.55f, dx2 = 0.45f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 0.45f, dx2 = 1.0f, dy2 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.43f, dy1 = 1.0f, dx2 = -0.99f, dy2 = 1.0f)
                moveToRelative(dx = 0.9f, dy = -6.4f)
                lineToRelative(dx = -6.73f, dy = 6.73f)
                quadToRelative(dx1 = -0.23f, dy1 = 0.22f, dx2 = -0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 6.73f, dy = -6.73f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _ticketDiscount = it }
    }

@Suppress("ObjectPropertyName")
private var _ticketDiscount: ImageVector? = null
