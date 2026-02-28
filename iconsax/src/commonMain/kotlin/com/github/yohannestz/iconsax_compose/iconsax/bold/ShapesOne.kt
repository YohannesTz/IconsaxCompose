package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShapesOne: ImageVector
    get() {
        val current = _shapesOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ShapesOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.75f, y = 7.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = 5.0f)
                verticalLineToRelative(dy = 5.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = 5.0f)
                horizontalLineToRelative(dx = 5.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = -5.0f)
                verticalLineToRelative(dy = -4.75f)
                curveTo(x1 = 17.0f, y1 = 9.35f, x2 = 14.65f, y2 = 7.0f, x3 = 11.75f, y3 = 7.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.88f, y = 6.33f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.72f, dy1 = 5.98f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.16f, dx2 = -0.66f, dy2 = -0.08f, dx3 = -0.66f, dy3 = -0.43f)
                verticalLineToRelative(dy = -0.13f)
                arcToRelative(a = 6.27f, b = 6.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.25f, dy1 = -6.25f)
                horizontalLineToRelative(dx = -0.13f)
                curveToRelative(dx1 = -0.35f, dy1 = 0.0f, dx2 = -0.6f, dy2 = -0.35f, dx3 = -0.42f, dy3 = -0.66f)
                arcToRelative(a = 5.48f, b = 5.48f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 10.18f, dy1 = 1.5f)
                close()
            }
        }.build().also { _shapesOne = it }
    }

@Suppress("ObjectPropertyName")
private var _shapesOne: ImageVector? = null
