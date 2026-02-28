package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                moveTo(x = 21.97f, y = 5.5f)
                verticalLineToRelative(dy = 4.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.5f, dy1 = 3.5f)
                horizontalLineToRelative(dx = -1.5f)
                verticalLineToRelative(dy = -0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.9f, dx2 = -2.35f, dy2 = -5.25f, dx3 = -5.25f, dy3 = -5.25f)
                horizontalLineToRelative(dx = -0.75f)
                verticalLineTo(y = 5.5f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.5f, dy1 = -3.5f)
                horizontalLineToRelative(dx = 4.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.5f, dy1 = 3.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 11.72f, y = 7.0f)
                horizontalLineTo(x = 6.97f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = 5.0f)
                verticalLineToRelative(dy = 5.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = 5.0f)
                horizontalLineToRelative(dx = 5.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = -5.0f)
                verticalLineToRelative(dy = -4.75f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.9f, dx2 = -2.35f, dy2 = -5.25f, dx3 = -5.25f, dy3 = -5.25f)
            }
        }.build().also { _size = it }
    }

@Suppress("ObjectPropertyName")
private var _size: ImageVector? = null
