package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProfileTick: ImageVector
    get() {
        val current = _profileTick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ProfileTick",
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
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 17.08f, y = 14.16f)
                curveToRelative(dx1 = -2.79f, dy1 = -1.86f, dx2 = -7.34f, dy2 = -1.86f, dx3 = -10.15f, dy3 = 0.0f)
                curveToRelative(dx1 = -1.27f, dy1 = 0.84f, dx2 = -1.97f, dy2 = 1.99f, dx3 = -1.97f, dy3 = 3.22f)
                reflectiveCurveToRelative(dx1 = 0.7f, dy1 = 2.37f, dx2 = 1.96f, dy2 = 3.21f)
                arcTo(horizontalEllipseRadius = 9.2f, verticalEllipseRadius = 9.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 9.2f, b = 9.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.08f, dy1 = -1.41f)
                curveToRelative(dx1 = 1.26f, dy1 = -0.85f, dx2 = 1.96f, dy2 = -1.99f, dx3 = 1.96f, dy3 = -3.23f)
                curveToRelative(dx1 = -0.01f, dy1 = -1.22f, dx2 = -0.7f, dy2 = -2.37f, dx3 = -1.96f, dy3 = -3.2f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.37f, y = 19.26f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.44f, dy1 = -0.18f)
                lineToRelative(dx = -1.26f, dy = -1.26f)
                arcToRelative(a = 0.63f, b = 0.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.88f)
                arcToRelative(a = 0.63f, b = 0.63f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.88f, dy1 = 0.0f)
                lineToRelative(dx = 0.82f, dy = 0.82f)
                lineToRelative(dx = 2.08f, dy = -2.08f)
                curveToRelative(dx1 = 0.24f, dy1 = -0.24f, dx2 = 0.64f, dy2 = -0.24f, dx3 = 0.88f, dy3 = 0.0f)
                reflectiveCurveToRelative(dx1 = 0.24f, dy1 = 0.64f, dx2 = 0.0f, dy2 = 0.88f)
                lineToRelative(dx = -2.52f, dy = 2.52f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.44f, dy1 = 0.18f)
            }
        }.build().also { _profileTick = it }
    }

@Suppress("ObjectPropertyName")
private var _profileTick: ImageVector? = null
