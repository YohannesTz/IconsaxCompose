package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RotateLeft: ImageVector
    get() {
        val current = _rotateLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RotateLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.75f, y = 22.75f)
                horizontalLineToRelative(dx = -4.5f)
                curveToRelative(dx1 = -4.15f, dy1 = 0.0f, dx2 = -6.0f, dy2 = -1.85f, dx3 = -6.0f, dy3 = -6.0f)
                verticalLineToRelative(dy = -4.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.15f, dx2 = 1.85f, dy2 = -6.0f, dx3 = 6.0f, dy3 = -6.0f)
                horizontalLineToRelative(dx = 4.5f)
                curveToRelative(dx1 = 4.15f, dy1 = 0.0f, dx2 = 6.0f, dy2 = 1.85f, dx3 = 6.0f, dy3 = 6.0f)
                verticalLineToRelative(dy = 4.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.15f, dx2 = -1.85f, dy2 = 6.0f, dx3 = -6.0f, dy3 = 6.0f)
                moveToRelative(dx = -4.5f, dy = -15.0f)
                curveToRelative(dx1 = -3.32f, dy1 = 0.0f, dx2 = -4.5f, dy2 = 1.18f, dx3 = -4.5f, dy3 = 4.5f)
                verticalLineToRelative(dy = 4.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.32f, dx2 = 1.18f, dy2 = 4.5f, dx3 = 4.5f, dy3 = 4.5f)
                horizontalLineToRelative(dx = 4.5f)
                curveToRelative(dx1 = 3.32f, dy1 = 0.0f, dx2 = 4.5f, dy2 = -1.18f, dx3 = 4.5f, dy3 = -4.5f)
                verticalLineToRelative(dy = -4.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.32f, dx2 = -1.18f, dy2 = -4.5f, dx3 = -4.5f, dy3 = -4.5f)
                close()
                moveToRelative(dx = 14.75f, dy = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.25f, y1 = 9.0f)
                arcToRelative(a = 6.26f, b = 6.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.83f, dy1 = -6.09f)
                lineToRelative(dx = 0.27f, dy = 0.45f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.26f, dy1 = 1.03f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.03f, dy1 = -0.26f)
                lineToRelative(dx = -1.05f, dy = -1.75f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.01f, dy1 = -0.75f)
                arcTo(horizontalEllipseRadius = 0.8f, verticalEllipseRadius = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 1.25f)
                arcTo(horizontalEllipseRadius = 7.76f, verticalEllipseRadius = 7.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.75f, y1 = 9.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 9.75f)
            }
        }.build().also { _rotateLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _rotateLeft: ImageVector? = null
