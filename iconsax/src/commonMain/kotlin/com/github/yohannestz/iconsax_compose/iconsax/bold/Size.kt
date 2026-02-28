package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 3.47f)
                curveToRelative(dx1 = -0.27f, dy1 = 0.03f, dx2 = -0.5f, dy2 = -0.2f, dx3 = -0.5f, dy3 = -0.47f)
                verticalLineToRelative(dy = -0.25f)
                arcToRelative(a = 6.75f, b = 6.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.75f, dy1 = -6.75f)
                horizontalLineToRelative(dx = -0.25f)
                curveToRelative(dx1 = -0.28f, dy1 = 0.0f, dx2 = -0.5f, dy2 = -0.22f, dx3 = -0.46f, dy3 = -0.5f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.46f, dy1 = -3.0f)
                horizontalLineToRelative(dx = 4.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.5f, dy1 = 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
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
