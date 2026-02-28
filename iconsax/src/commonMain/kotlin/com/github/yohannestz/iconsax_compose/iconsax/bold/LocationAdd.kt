package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 20.62f, y = 8.7f)
                curveTo(x1 = 19.58f, y1 = 4.07f, x2 = 15.54f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                horizontalLineToRelative(dx = -0.01f)
                curveTo(x1 = 8.46f, y1 = 2.0f, x2 = 4.43f, y2 = 4.07f, x3 = 3.38f, y3 = 8.69f)
                curveToRelative(dx1 = -1.18f, dy1 = 5.16f, dx2 = 1.98f, dy2 = 9.53f, dx3 = 4.84f, dy3 = 12.29f)
                arcTo(horizontalEllipseRadius = 5.4f, verticalEllipseRadius = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 22.51f)
                arcToRelative(a = 5.4f, b = 5.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.77f, dy1 = -1.53f)
                curveToRelative(dx1 = 2.86f, dy1 = -2.76f, dx2 = 6.02f, dy2 = -7.12f, dx3 = 4.85f, dy3 = -12.28f)
                moveToRelative(dx = -5.87f, dy = 3.05f)
                horizontalLineToRelative(dx = -2.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -2.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 2.0f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.0f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _locationAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _locationAdd: ImageVector? = null
