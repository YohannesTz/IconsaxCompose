package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignBottom: ImageVector
    get() {
        val current = _alignBottom
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignBottom",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.26f, y = 19.65f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 7.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.01f, dx2 = -0.21f, dy2 = -1.35f, dx3 = -1.48f, dy3 = -1.35f)
                horizontalLineToRelative(dx = -1.04f)
                curveToRelative(dx1 = -1.27f, dy1 = 0.0f, dx2 = -1.48f, dy2 = 0.34f, dx3 = -1.48f, dy3 = 1.35f)
                verticalLineToRelative(dy = 11.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineTo(y = 7.1f)
                quadTo(x1 = 13.0f, y1 = 4.24f, x2 = 15.99f, y2 = 4.25f)
                horizontalLineToRelative(dx = 1.04f)
                quadToRelative(dx1 = 3.0f, dy1 = -0.02f, dx2 = 2.98f, dy2 = 2.85f)
                verticalLineToRelative(dy = 11.8f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = -8.5f, dy = 0.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -6.8f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.01f, dx2 = -0.21f, dy2 = -1.35f, dx3 = -1.48f, dy3 = -1.35f)
                horizontalLineTo(x = 7.49f)
                curveToRelative(dx1 = -1.27f, dy1 = 0.0f, dx2 = -1.48f, dy2 = 0.34f, dx3 = -1.48f, dy3 = 1.35f)
                verticalLineToRelative(dy = 6.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -6.8f)
                quadTo(x1 = 4.5f, y1 = 9.23f, x2 = 7.49f, y2 = 9.25f)
                horizontalLineToRelative(dx = 1.04f)
                quadToRelative(dx1 = 3.0f, dy1 = -0.02f, dx2 = 2.98f, dy2 = 2.85f)
                verticalLineToRelative(dy = 6.8f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 19.75f)
                horizontalLineTo(x = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 20.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _alignBottom = it }
    }

@Suppress("ObjectPropertyName")
private var _alignBottom: ImageVector? = null
