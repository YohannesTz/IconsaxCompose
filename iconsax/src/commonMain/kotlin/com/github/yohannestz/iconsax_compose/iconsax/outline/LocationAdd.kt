package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationAdd: ImageVector
    get() {
        val current = _locationAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LocationAdd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.75f, y = 11.75f)
                horizontalLineToRelative(dx = -5.5f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 5.5f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 14.5f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -5.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 5.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 14.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.76f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.13f, dy1 = -1.67f)
                curveToRelative(dx1 = -2.95f, dy1 = -2.84f, dx2 = -6.2f, dy2 = -7.37f, dx3 = -4.98f, dy3 = -12.76f)
                curveTo(x1 = 4.0f, y1 = 3.44f, x2 = 8.27f, y2 = 1.25f, x3 = 12.0f, y3 = 1.25f)
                horizontalLineToRelative(dx = 0.01f)
                curveToRelative(dx1 = 3.73f, dy1 = 0.0f, dx2 = 8.0f, dy2 = 2.19f, dx3 = 9.11f, dy3 = 7.09f)
                curveToRelative(dx1 = 1.22f, dy1 = 5.39f, dx2 = -2.04f, dy2 = 9.91f, dx3 = -4.99f, dy3 = 12.75f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.76f)
                moveToRelative(dx = 0.0f, dy = -20.01f)
                curveToRelative(dx1 = -2.9f, dy1 = 0.0f, dx2 = -6.65f, dy2 = 1.55f, dx3 = -7.64f, dy3 = 5.91f)
                curveTo(x1 = 3.28f, y1 = 13.37f, x2 = 6.24f, y2 = 17.43f, x3 = 8.92f, y3 = 20.0f)
                arcToRelative(a = 4.43f, b = 4.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.17f, dy1 = 0.0f)
                curveToRelative(dx1 = 2.67f, dy1 = -2.57f, dx2 = 5.63f, dy2 = -6.63f, dx3 = 4.57f, dy3 = -11.34f)
                curveToRelative(dx1 = -1.0f, dy1 = -4.36f, dx2 = -4.75f, dy2 = -5.91f, dx3 = -7.66f, dy3 = -5.91f)
            }
        }.build().also { _locationAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _locationAdd: ImageVector? = null
