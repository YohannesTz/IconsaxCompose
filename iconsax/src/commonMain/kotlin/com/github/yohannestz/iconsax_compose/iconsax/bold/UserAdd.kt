package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserAdd: ImageVector
    get() {
        val current = _userAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.UserAdd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.0f)
                curveToRelative(dx1 = -5.01f, dy1 = 0.0f, dx2 = -9.09f, dy2 = 3.36f, dx3 = -9.09f, dy3 = 7.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = 0.5f)
                horizontalLineToRelative(dx = 17.18f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = -0.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.14f, dx2 = -4.08f, dy2 = -7.5f, dx3 = -9.09f, dy3 = -7.5f)
                moveToRelative(dx = 3.71f, dy = -11.34f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.0f)
                arcToRelative(a = 4.98f, b = 4.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.32f, dy1 = 8.71f)
                arcTo(horizontalEllipseRadius = 4.98f, verticalEllipseRadius = 4.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.0f, y1 = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.29f, dy1 = -3.34f)
                moveToRelative(dx = -1.84f, dy = 4.26f)
                horizontalLineToRelative(dx = -0.93f)
                verticalLineToRelative(dy = 0.97f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.88f, dy1 = 0.0f)
                verticalLineTo(y = 7.92f)
                horizontalLineToRelative(dx = -0.93f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.88f)
                horizontalLineToRelative(dx = 0.93f)
                verticalLineTo(y = 5.15f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.88f, dy1 = 0.0f)
                verticalLineToRelative(dy = 0.89f)
                horizontalLineToRelative(dx = 0.93f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.88f)
            }
        }.build().also { _userAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _userAdd: ImageVector? = null
