package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Eye: ImageVector
    get() {
        val current = _eye
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Eye",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 16.33f)
                arcToRelative(a = 4.33f, b = 4.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -8.66f)
                arcToRelative(a = 4.33f, b = 4.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 8.66f)
                moveToRelative(dx = 0.0f, dy = -7.16f)
                arcToRelative(a = 2.83f, b = 2.83f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.01f, dy1 = 5.67f)
                arcToRelative(a = 2.83f, b = 2.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.67f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 21.02f)
                curveToRelative(dx1 = -3.76f, dy1 = 0.0f, dx2 = -7.31f, dy2 = -2.2f, dx3 = -9.75f, dy3 = -6.02f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.0f)
                curveToRelative(dx1 = 2.45f, dy1 = -3.82f, dx2 = 6.0f, dy2 = -6.02f, dx3 = 9.75f, dy3 = -6.02f)
                reflectiveCurveToRelative(dx1 = 7.3f, dy1 = 2.2f, dx2 = 9.74f, dy2 = 6.02f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.0f)
                curveToRelative(dx1 = -2.44f, dy1 = 3.82f, dx2 = -6.0f, dy2 = 6.02f, dx3 = -9.74f, dy3 = 6.02f)
                moveToRelative(dx = 0.0f, dy = -16.54f)
                curveToRelative(dx1 = -3.23f, dy1 = 0.0f, dx2 = -6.32f, dy2 = 1.94f, dx3 = -8.48f, dy3 = 5.33f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.38f)
                curveToRelative(dx1 = 2.16f, dy1 = 3.39f, dx2 = 5.25f, dy2 = 5.33f, dx3 = 8.48f, dy3 = 5.33f)
                reflectiveCurveToRelative(dx1 = 6.32f, dy1 = -1.94f, dx2 = 8.48f, dy2 = -5.33f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.38f)
                curveTo(x1 = 18.32f, y1 = 6.42f, x2 = 15.23f, y2 = 4.48f, x3 = 12.0f, y3 = 4.48f)
            }
        }.build().also { _eye = it }
    }

@Suppress("ObjectPropertyName")
private var _eye: ImageVector? = null
