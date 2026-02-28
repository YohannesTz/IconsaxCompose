package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProfileCircle: ImageVector
    get() {
        val current = _profileCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ProfileCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.12f, y = 13.53f)
                horizontalLineToRelative(dx = -0.17f)
                arcToRelative(a = 4.02f, b = 4.02f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.06f, dy1 = -8.05f)
                arcToRelative(a = 4.04f, b = 4.04f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.03f, dy1 = 4.03f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.89f, dy1 = 4.02f)
                close()
                moveTo(x = 12.0f, y = 6.97f)
                arcTo(horizontalEllipseRadius = 2.53f, verticalEllipseRadius = 2.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.47f, y1 = 9.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.43f, dy1 = 2.53f)
                horizontalLineToRelative(dx = 0.23f)
                arcToRelative(a = 2.54f, b = 2.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.4f, dy1 = -2.53f)
                arcTo(horizontalEllipseRadius = 2.53f, verticalEllipseRadius = 2.53f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 6.97f)
                moveToRelative(dx = 0.0f, dy = 15.78f)
                curveToRelative(dx1 = -2.69f, dy1 = 0.0f, dx2 = -5.26f, dy2 = -1.0f, dx3 = -7.25f, dy3 = -2.82f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.24f, dy1 = -0.63f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.1f, dy1 = -3.12f)
                curveToRelative(dx1 = 2.98f, dy1 = -1.98f, dx2 = 7.81f, dy2 = -1.98f, dx3 = 10.78f, dy3 = 0.0f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.1f, dy1 = 3.12f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.24f, dy1 = 0.63f)
                arcTo(horizontalEllipseRadius = 10.7f, verticalEllipseRadius = 10.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
                moveTo(x = 6.08f, y = 19.1f)
                arcTo(horizontalEllipseRadius = 9.2f, verticalEllipseRadius = 9.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 21.25f)
                arcToRelative(a = 9.2f, b = 9.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.92f, dy1 = -2.15f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.37f, dy1 = -1.68f)
                curveToRelative(dx1 = -2.46f, dy1 = -1.64f, dx2 = -6.63f, dy2 = -1.64f, dx3 = -9.11f, dy3 = 0.0f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.36f, dy1 = 1.68f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
        }.build().also { _profileCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _profileCircle: ImageVector? = null
