package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserTick: ImageVector
    get() {
        val current = _userTick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.UserTick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 14.0f)
                curveToRelative(dx1 = -5.01f, dy1 = 0.0f, dx2 = -9.09f, dy2 = 3.36f, dx3 = -9.09f, dy3 = 7.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = 0.5f)
                horizontalLineToRelative(dx = 17.18f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = -0.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.14f, dx2 = -4.08f, dy2 = -7.5f, dx3 = -9.09f, dy3 = -7.5f)
                moveToRelative(dx = 0.0f, dy = -12.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.12f, dy1 = 1.1f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.0f, y1 = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.73f, dy1 = 2.57f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 12.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.29f, dy1 = -1.25f)
                arcTo(horizontalEllipseRadius = 4.9f, verticalEllipseRadius = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.0f, y1 = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = -5.0f)
                moveToRelative(dx = 2.59f, dy = 4.46f)
                lineToRelative(dx = -2.67f, dy = 2.46f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.64f, dy1 = 0.25f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.66f, dy1 = -0.27f)
                lineTo(x = 9.39f, y = 7.66f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.33f)
                arcToRelative(a = 0.94f, b = 0.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.33f, dy1 = 0.0f)
                lineToRelative(dx = 0.59f, dy = 0.59f)
                lineToRelative(dx = 2.01f, dy = -1.85f)
                arcToRelative(a = 0.93f, b = 0.93f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.32f, dy1 = 0.05f)
                arcToRelative(a = 0.96f, b = 0.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.05f, dy1 = 1.34f)
            }
        }.build().also { _userTick = it }
    }

@Suppress("ObjectPropertyName")
private var _userTick: ImageVector? = null
