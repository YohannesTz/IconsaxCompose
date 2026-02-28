package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProfileTwouser: ImageVector
    get() {
        val current = _profileTwouser
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ProfileTwouser",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 9.0f, y = 2.0f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.12f, dy1 = 9.49f)
                horizontalLineToRelative(dx = 0.29f)
                arcToRelative(a = 4.74f, b = 4.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.58f, dy1 = -4.74f)
                arcTo(horizontalEllipseRadius = 4.75f, verticalEllipseRadius = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.08f, y = 14.15f)
                curveToRelative(dx1 = -2.79f, dy1 = -1.86f, dx2 = -7.34f, dy2 = -1.86f, dx3 = -10.15f, dy3 = 0.0f)
                curveToRelative(dx1 = -1.27f, dy1 = 0.85f, dx2 = -1.97f, dy2 = 2.0f, dx3 = -1.97f, dy3 = 3.23f)
                reflectiveCurveToRelative(dx1 = 0.7f, dy1 = 2.37f, dx2 = 1.96f, dy2 = 3.2f)
                arcTo(horizontalEllipseRadius = 9.2f, verticalEllipseRadius = 9.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 22.0f)
                arcToRelative(a = 9.2f, b = 9.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.08f, dy1 = -1.41f)
                curveToRelative(dx1 = 1.26f, dy1 = -0.85f, dx2 = 1.96f, dy2 = -2.0f, dx3 = 1.96f, dy3 = -3.23f)
                curveToRelative(dx1 = -0.01f, dy1 = -1.23f, dx2 = -0.7f, dy2 = -2.37f, dx3 = -1.96f, dy3 = -3.21f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 19.99f, y = 7.34f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.13f, dy1 = 3.87f)
                horizontalLineToRelative(dx = -0.05f)
                quadToRelative(dx1 = -0.1f, dy1 = 0.0f, dx2 = -0.17f, dy2 = 0.02f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.53f, dy1 = -0.83f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.5f, dy1 = -3.8f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.77f, dy1 = -2.18f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.15f, dy1 = 2.92f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.99f, y = 16.59f)
                curveToRelative(dx1 = -0.08f, dy1 = 0.97f, dx2 = -0.7f, dy2 = 1.81f, dx3 = -1.74f, dy3 = 2.38f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.51f, dy1 = 0.78f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.22f, dy1 = -2.32f)
                curveToRelative(dx1 = 0.1f, dy1 = -1.24f, dx2 = -0.5f, dy2 = -2.43f, dx3 = -1.67f, dy3 = -3.38f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.3f, dy1 = -1.26f)
                curveToRelative(dx1 = 2.2f, dy1 = -0.64f, dx2 = 4.99f, dy2 = -0.21f, dx3 = 6.7f, dy3 = 1.17f)
                curveToRelative(dx1 = 0.92f, dy1 = 0.74f, dx2 = 1.39f, dy2 = 1.67f, dx3 = 1.3f, dy3 = 2.63f)
            }
        }.build().also { _profileTwouser = it }
    }

@Suppress("ObjectPropertyName")
private var _profileTwouser: ImageVector? = null
