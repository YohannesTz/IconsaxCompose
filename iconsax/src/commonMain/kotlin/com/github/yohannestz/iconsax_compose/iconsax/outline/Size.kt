package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Size: ImageVector
    get() {
        val current = _size
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Size",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.72f, y = 22.75f)
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
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.12f, y = 13.75f)
                horizontalLineToRelative(dx = -1.15f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.22f, y1 = 13.0f)
                verticalLineToRelative(dy = -0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.32f, dx2 = -1.18f, dy2 = -4.5f, dx3 = -4.5f, dy3 = -4.5f)
                horizontalLineToRelative(dx = -0.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.22f, y1 = 7.0f)
                verticalLineTo(y = 5.85f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.18f, dx2 = 1.42f, dy2 = -4.6f, dx3 = 4.6f, dy3 = -4.6f)
                horizontalLineToRelative(dx = 3.3f)
                curveToRelative(dx1 = 3.18f, dy1 = 0.0f, dx2 = 4.6f, dy2 = 1.42f, dx3 = 4.6f, dy3 = 4.6f)
                verticalLineToRelative(dy = 3.3f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.18f, dx2 = -1.42f, dy2 = 4.6f, dx3 = -4.6f, dy3 = 4.6f)
                moveToRelative(dx = -0.4f, dy = -1.5f)
                horizontalLineToRelative(dx = 0.4f)
                curveToRelative(dx1 = 2.35f, dy1 = 0.0f, dx2 = 3.1f, dy2 = -0.75f, dx3 = 3.1f, dy3 = -3.1f)
                verticalLineToRelative(dy = -3.3f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.35f, dx2 = -0.75f, dy2 = -3.1f, dx3 = -3.1f, dy3 = -3.1f)
                horizontalLineToRelative(dx = -3.3f)
                curveToRelative(dx1 = -2.35f, dy1 = 0.0f, dx2 = -3.1f, dy2 = 0.75f, dx3 = -3.1f, dy3 = 3.1f)
                verticalLineToRelative(dy = 0.4f)
                curveToRelative(dx1 = 4.15f, dy1 = 0.0f, dx2 = 6.0f, dy2 = 1.85f, dx3 = 6.0f, dy3 = 6.0f)
            }
        }.build().also { _size = it }
    }

@Suppress("ObjectPropertyName")
private var _size: ImageVector? = null
