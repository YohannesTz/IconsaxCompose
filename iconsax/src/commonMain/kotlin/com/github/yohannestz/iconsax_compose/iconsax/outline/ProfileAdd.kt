package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 18.5f, y = 20.25f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.5f, y = 22.25f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 4.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = -4.34f, dy = -10.63f)
                horizontalLineTo(x = 11.9f)
                arcToRelative(a = 5.17f, b = 5.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.58f, dy1 = -8.84f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.67f, dy1 = -1.53f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.2f, dy1 = 10.37f)
                close()
                moveToRelative(dx = -0.17f, dy = -8.87f)
                arcTo(horizontalEllipseRadius = 3.7f, verticalEllipseRadius = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.3f, y1 = 6.43f)
                arcToRelative(a = 3.66f, b = 3.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.87f, dy1 = 3.68f)
                arcToRelative(a = 3.66f, b = 3.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.5f, dy1 = -3.68f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.7f, dy1 = -3.68f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.99f, y = 22.56f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.43f, dy1 = -1.51f)
                curveToRelative(dx1 = -1.39f, dy1 = -0.93f, dx2 = -2.15f, dy2 = -2.2f, dx3 = -2.15f, dy3 = -3.57f)
                reflectiveCurveToRelative(dx1 = 0.77f, dy1 = -2.63f, dx2 = 2.15f, dy2 = -3.55f)
                curveToRelative(dx1 = 2.99f, dy1 = -2.0f, dx2 = 7.85f, dy2 = -2.0f, dx3 = 10.84f, dy3 = 0.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = 1.04f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.04f, dy1 = 0.21f)
                curveToRelative(dx1 = -2.49f, dy1 = -1.66f, dx2 = -6.69f, dy2 = -1.66f, dx3 = -9.18f, dy3 = 0.0f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.64f, dx2 = -1.48f, dy2 = 1.45f, dx3 = -1.48f, dy3 = 2.3f)
                reflectiveCurveToRelative(dx1 = 0.52f, dy1 = 1.68f, dx2 = 1.48f, dy2 = 2.32f)
                arcToRelative(a = 8.3f, b = 8.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.59f, dy1 = 1.25f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.01f, dy1 = 1.51f)
            }
        }.build().also { _profileAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _profileAdd: ImageVector? = null
