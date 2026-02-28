package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProfileAdd: ImageVector
    get() {
        val current = _profileAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ProfileAdd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.12f, dy1 = 9.49f)
                horizontalLineToRelative(dx = 0.29f)
                arcToRelative(a = 4.74f, b = 4.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.58f, dy1 = -4.74f)
                arcTo(horizontalEllipseRadius = 4.75f, verticalEllipseRadius = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.0f)
                moveToRelative(dx = 5.08f, dy = 12.15f)
                curveToRelative(dx1 = -2.79f, dy1 = -1.86f, dx2 = -7.34f, dy2 = -1.86f, dx3 = -10.15f, dy3 = 0.0f)
                curveToRelative(dx1 = -1.27f, dy1 = 0.85f, dx2 = -1.97f, dy2 = 2.0f, dx3 = -1.97f, dy3 = 3.23f)
                reflectiveCurveToRelative(dx1 = 0.7f, dy1 = 2.37f, dx2 = 1.96f, dy2 = 3.2f)
                arcTo(horizontalEllipseRadius = 9.2f, verticalEllipseRadius = 9.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 9.2f, b = 9.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.08f, dy1 = -1.41f)
                curveToRelative(dx1 = 1.26f, dy1 = -0.85f, dx2 = 1.96f, dy2 = -2.0f, dx3 = 1.96f, dy3 = -3.23f)
                curveToRelative(dx1 = -0.01f, dy1 = -1.23f, dx2 = -0.7f, dy2 = -2.37f, dx3 = -1.96f, dy3 = -3.21f)
                moveTo(x = 14.0f, y = 18.13f)
                horizontalLineToRelative(dx = -1.25f)
                verticalLineToRelative(dy = 1.25f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -1.25f)
                horizontalLineTo(x = 10.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 1.25f)
                verticalLineToRelative(dy = -1.25f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 1.25f)
                horizontalLineTo(x = 14.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _profileAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _profileAdd: ImageVector? = null
