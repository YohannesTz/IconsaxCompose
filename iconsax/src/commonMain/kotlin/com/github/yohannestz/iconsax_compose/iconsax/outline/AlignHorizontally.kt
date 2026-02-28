package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignHorizontally: ImageVector
    get() {
        val current = _alignHorizontally
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignHorizontally",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.02f, y = 20.25f)
                horizontalLineTo(x = 6.98f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.02f, dx2 = -2.98f, dy2 = -2.85f)
                verticalLineTo(y = 6.6f)
                quadTo(x1 = 3.99f, y1 = 3.74f, x2 = 6.98f, y2 = 3.75f)
                horizontalLineToRelative(dx = 1.04f)
                quadTo(x1 = 11.01f, y1 = 3.73f, x2 = 11.0f, y2 = 6.6f)
                verticalLineToRelative(dy = 10.8f)
                quadToRelative(dx1 = 0.01f, dy1 = 2.87f, dx2 = -2.98f, dy2 = 2.85f)
                moveToRelative(dx = -1.04f, dy = -15.0f)
                curveTo(x1 = 5.71f, y1 = 5.25f, x2 = 5.5f, y2 = 5.59f, x3 = 5.5f, y3 = 6.6f)
                verticalLineToRelative(dy = 10.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.01f, dx2 = 0.21f, dy2 = 1.35f, dx3 = 1.48f, dy3 = 1.35f)
                horizontalLineToRelative(dx = 1.04f)
                curveToRelative(dx1 = 1.27f, dy1 = 0.0f, dx2 = 1.48f, dy2 = -0.34f, dx3 = 1.48f, dy3 = -1.35f)
                verticalLineTo(y = 6.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.01f, dx2 = -0.21f, dy2 = -1.35f, dx3 = -1.48f, dy3 = -1.35f)
                close()
                moveToRelative(dx = 9.54f, dy = 13.0f)
                horizontalLineToRelative(dx = -1.04f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.02f, dx2 = -2.98f, dy2 = -2.85f)
                verticalLineTo(y = 8.6f)
                quadToRelative(dx1 = -0.01f, dy1 = -2.86f, dx2 = 2.98f, dy2 = -2.85f)
                horizontalLineToRelative(dx = 1.04f)
                quadToRelative(dx1 = 3.0f, dy1 = -0.02f, dx2 = 2.98f, dy2 = 2.85f)
                verticalLineToRelative(dy = 6.8f)
                quadToRelative(dx1 = 0.01f, dy1 = 2.87f, dx2 = -2.98f, dy2 = 2.85f)
                moveToRelative(dx = -1.04f, dy = -11.0f)
                curveTo(x1 = 14.21f, y1 = 7.25f, x2 = 14.0f, y2 = 7.59f, x3 = 14.0f, y3 = 8.6f)
                verticalLineToRelative(dy = 6.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.01f, dx2 = 0.21f, dy2 = 1.35f, dx3 = 1.48f, dy3 = 1.35f)
                horizontalLineToRelative(dx = 1.04f)
                curveToRelative(dx1 = 1.27f, dy1 = 0.0f, dx2 = 1.48f, dy2 = -0.34f, dx3 = 1.48f, dy3 = -1.35f)
                verticalLineTo(y = 8.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.01f, dx2 = -0.21f, dy2 = -1.35f, dx3 = -1.48f, dy3 = -1.35f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 4.4f, y = 12.75f)
                horizontalLineTo(x = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 2.4f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = 8.6f, dy = 0.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 9.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -2.7f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineTo(x = 22.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _alignHorizontally = it }
    }

@Suppress("ObjectPropertyName")
private var _alignHorizontally: ImageVector? = null
