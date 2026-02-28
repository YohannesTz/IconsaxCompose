package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 16.97f, y = 13.72f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = -0.2f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.24f, dy1 = -0.55f)
                verticalLineToRelative(dy = -0.72f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.32f, dx2 = -1.18f, dy2 = -4.5f, dx3 = -4.5f, dy3 = -4.5f)
                horizontalLineTo(x = 11.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.55f, dy1 = -0.24f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.19f, dy1 = -0.57f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.22f, dy1 = -5.68f)
                arcToRelative(a = 6.24f, b = 6.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.25f, dy1 = 6.25f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.68f, dy1 = 6.22f)
                close()
                moveToRelative(dx = -5.08f, dy = -7.47f)
                curveToRelative(dx1 = 3.97f, dy1 = 0.05f, dx2 = 5.78f, dy2 = 1.85f, dx3 = 5.83f, dy3 = 5.83f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.45f, dy1 = -5.18f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -9.28f, dy1 = -0.65f)
            }
        }.build().also { _shapesOne = it }
    }

@Suppress("ObjectPropertyName")
private var _shapesOne: ImageVector? = null
