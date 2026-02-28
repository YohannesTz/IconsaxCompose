package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Setting: ImageVector
    get() {
        val current = _setting
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Setting",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.63f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.88f, dy1 = -0.46f)
                lineTo(x = 4.62f, y = 19.0f)
                curveToRelative(dx1 = -2.24f, dy1 = -1.51f, dx2 = -2.38f, dy2 = -1.74f, dx3 = -2.38f, dy3 = -4.11f)
                verticalLineTo(y = 9.11f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.37f, dx2 = 0.13f, dy2 = -2.6f, dx3 = 2.33f, dy3 = -4.09f)
                lineToRelative(dx = 5.54f, dy = -3.2f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.75f, dy1 = 0.0f)
                lineTo(x = 19.38f, y = 5.0f)
                curveToRelative(dx1 = 2.24f, dy1 = 1.51f, dx2 = 2.38f, dy2 = 1.74f, dx3 = 2.38f, dy3 = 4.11f)
                verticalLineToRelative(dy = 5.77f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.37f, dx2 = -0.13f, dy2 = 2.6f, dx3 = -2.33f, dy3 = 4.09f)
                lineToRelative(dx = -5.54f, dy = 3.2f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.63f)
                moveToRelative(dx = 0.0f, dy = -19.76f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.12f, dy1 = 0.25f)
                lineTo(x = 5.38f, y = 6.3f)
                curveTo(x1 = 3.75f, y1 = 7.4f, x2 = 3.75f, y2 = 7.4f, x3 = 3.75f, y3 = 9.11f)
                verticalLineToRelative(dy = 5.77f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.71f, dx2 = 0.0f, dy2 = 1.71f, dx3 = 1.67f, dy3 = 2.84f)
                lineToRelative(dx = 5.46f, dy = 3.15f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.25f, dy1 = 0.0f)
                lineToRelative(dx = 5.5f, dy = -3.18f)
                curveToRelative(dx1 = 1.62f, dy1 = -1.1f, dx2 = 1.62f, dy2 = -1.1f, dx3 = 1.62f, dy3 = -2.81f)
                verticalLineTo(y = 9.11f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.71f, dx2 = 0.0f, dy2 = -1.71f, dx3 = -1.67f, dy3 = -2.84f)
                lineToRelative(dx = -5.46f, dy = -3.15f)
                arcTo(horizontalEllipseRadius = 2.3f, verticalEllipseRadius = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.87f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.75f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -7.5f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 7.5f)
                moveToRelative(dx = 0.0f, dy = -6.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.5f)
            }
        }.build().also { _setting = it }
    }

@Suppress("ObjectPropertyName")
private var _setting: ImageVector? = null
