package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Electricity: ImageVector
    get() {
        val current = _electricity
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Electricity",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.5f, y = 16.75f)
                horizontalLineToRelative(dx = -3.0f)
                arcTo(horizontalEllipseRadius = 4.6f, verticalEllipseRadius = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.75f, y1 = 12.0f)
                verticalLineTo(y = 6.92f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.47f, dx2 = 1.2f, dy2 = -2.67f, dx3 = 2.67f, dy3 = -2.67f)
                horizontalLineToRelative(dx = 7.17f)
                curveToRelative(dx1 = 1.47f, dy1 = 0.0f, dx2 = 2.67f, dy2 = 1.2f, dx3 = 2.67f, dy3 = 2.67f)
                verticalLineTo(y = 12.0f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.76f, dy1 = 4.75f)
                moveToRelative(dx = -5.08f, dy = -11.0f)
                arcToRelative(a = 1.17f, b = 1.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.17f, dy1 = 1.17f)
                verticalLineTo(y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.62f, dx2 = 1.0f, dy2 = 3.25f, dx3 = 3.25f, dy3 = 3.25f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 2.25f, dy1 = 0.0f, dx2 = 3.25f, dy2 = -1.63f, dx3 = 3.25f, dy3 = -3.25f)
                verticalLineTo(y = 6.92f)
                arcToRelative(a = 1.17f, b = 1.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.17f, dy1 = -1.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.5f, y = 5.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.75f, y1 = 5.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 10.25f, y1 = 1.59f, x2 = 10.25f, y2 = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.5f, y1 = 5.75f)
                moveToRelative(dx = 5.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 13.75f, y1 = 5.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 15.25f, y1 = 1.59f, x2 = 15.25f, y2 = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = -2.5f, dy = 17.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 22.0f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 6.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
            }
        }.build().also { _electricity = it }
    }

@Suppress("ObjectPropertyName")
private var _electricity: ImageVector? = null
