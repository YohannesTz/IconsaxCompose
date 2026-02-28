package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Copy: ImageVector
    get() {
        val current = _copy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Copy",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.1f, y = 22.75f)
                horizontalLineTo(x = 6.9f)
                curveToRelative(dx1 = -3.91f, dy1 = 0.0f, dx2 = -5.65f, dy2 = -1.74f, dx3 = -5.65f, dy3 = -5.65f)
                verticalLineToRelative(dy = -4.2f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.91f, dx2 = 1.74f, dy2 = -5.65f, dx3 = 5.65f, dy3 = -5.65f)
                horizontalLineToRelative(dx = 4.2f)
                curveToRelative(dx1 = 3.91f, dy1 = 0.0f, dx2 = 5.65f, dy2 = 1.74f, dx3 = 5.65f, dy3 = 5.65f)
                verticalLineToRelative(dy = 4.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.91f, dx2 = -1.74f, dy2 = 5.65f, dx3 = -5.65f, dy3 = 5.65f)
                moveToRelative(dx = -4.2f, dy = -14.0f)
                curveToRelative(dx1 = -3.1f, dy1 = 0.0f, dx2 = -4.15f, dy2 = 1.05f, dx3 = -4.15f, dy3 = 4.15f)
                verticalLineToRelative(dy = 4.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.1f, dx2 = 1.05f, dy2 = 4.15f, dx3 = 4.15f, dy3 = 4.15f)
                horizontalLineToRelative(dx = 4.2f)
                curveToRelative(dx1 = 3.1f, dy1 = 0.0f, dx2 = 4.15f, dy2 = -1.05f, dx3 = 4.15f, dy3 = -4.15f)
                verticalLineToRelative(dy = -4.2f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.1f, dx2 = -1.05f, dy2 = -4.15f, dx3 = -4.15f, dy3 = -4.15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.1f, y = 16.75f)
                horizontalLineTo(x = 16.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.25f, y1 = 16.0f)
                verticalLineToRelative(dy = -3.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.1f, dx2 = -1.05f, dy2 = -4.15f, dx3 = -4.15f, dy3 = -4.15f)
                horizontalLineTo(x = 8.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.25f, y1 = 8.0f)
                verticalLineTo(y = 6.9f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.91f, dx2 = 1.74f, dy2 = -5.65f, dx3 = 5.65f, dy3 = -5.65f)
                horizontalLineToRelative(dx = 4.2f)
                curveToRelative(dx1 = 3.91f, dy1 = 0.0f, dx2 = 5.65f, dy2 = 1.74f, dx3 = 5.65f, dy3 = 5.65f)
                verticalLineToRelative(dy = 4.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.91f, dx2 = -1.74f, dy2 = 5.65f, dx3 = -5.65f, dy3 = 5.65f)
                moveToRelative(dx = -0.35f, dy = -1.5f)
                horizontalLineToRelative(dx = 0.35f)
                curveToRelative(dx1 = 3.1f, dy1 = 0.0f, dx2 = 4.15f, dy2 = -1.05f, dx3 = 4.15f, dy3 = -4.15f)
                verticalLineTo(y = 6.9f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.1f, dx2 = -1.05f, dy2 = -4.15f, dx3 = -4.15f, dy3 = -4.15f)
                horizontalLineToRelative(dx = -4.2f)
                curveToRelative(dx1 = -3.1f, dy1 = 0.0f, dx2 = -4.15f, dy2 = 1.05f, dx3 = -4.15f, dy3 = 4.15f)
                verticalLineToRelative(dy = 0.35f)
                horizontalLineToRelative(dx = 2.35f)
                curveToRelative(dx1 = 3.91f, dy1 = 0.0f, dx2 = 5.65f, dy2 = 1.74f, dx3 = 5.65f, dy3 = 5.65f)
                close()
            }
        }.build().also { _copy = it }
    }

@Suppress("ObjectPropertyName")
private var _copy: ImageVector? = null
