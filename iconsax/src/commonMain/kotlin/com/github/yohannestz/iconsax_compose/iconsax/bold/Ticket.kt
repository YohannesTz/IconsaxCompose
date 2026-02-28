package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ticket: ImageVector
    get() {
        val current = _ticket
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ticket",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 10.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.75f, y1 = 10.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.41f, dx2 = -1.34f, dy2 = -5.75f, dx3 = -5.75f, dy3 = -5.75f)
                horizontalLineToRelative(dx = -6.25f)
                verticalLineTo(y = 5.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.25f, y1 = 5.91f, x2 = 9.25f, y2 = 5.5f)
                verticalLineTo(y = 3.25f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 2.59f, y1 = 3.25f, x2 = 1.25f, y2 = 4.59f, x3 = 1.25f, y3 = 9.0f)
                verticalLineToRelative(dy = 0.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 10.25f)
                curveToRelative(dx1 = 0.96f, dy1 = 0.0f, dx2 = 1.75f, dy2 = 0.79f, dx3 = 1.75f, dy3 = 1.75f)
                reflectiveCurveTo(x1 = 2.96f, y1 = 13.75f, x2 = 2.0f, y2 = 13.75f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 0.75f)
                verticalLineTo(y = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.41f, dx2 = 1.34f, dy2 = 5.75f, dx3 = 5.75f, dy3 = 5.75f)
                horizontalLineToRelative(dx = 2.25f)
                verticalLineTo(y = 18.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.25f)
                horizontalLineTo(x = 17.0f)
                curveToRelative(dx1 = 4.41f, dy1 = 0.0f, dx2 = 5.75f, dy2 = -1.34f, dx3 = 5.75f, dy3 = -5.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 14.25f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.0f, dx2 = -1.75f, dy2 = -0.79f, dx3 = -1.75f, dy3 = -1.75f)
                reflectiveCurveToRelative(dx1 = 0.79f, dy1 = -1.75f, dx2 = 1.75f, dy2 = -1.75f)
                moveToRelative(dx = -11.25f, dy = 3.42f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineTo(y = 9.83f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                close()
            }
        }.build().also { _ticket = it }
    }

@Suppress("ObjectPropertyName")
private var _ticket: ImageVector? = null
