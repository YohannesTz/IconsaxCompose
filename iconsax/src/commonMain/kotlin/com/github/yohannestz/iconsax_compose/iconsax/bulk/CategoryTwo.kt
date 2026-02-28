package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CategoryTwo: ImageVector
    get() {
        val current = _categoryTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CategoryTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.67f, y = 2.0f)
                horizontalLineToRelative(dx = -1.9f)
                curveToRelative(dx1 = -2.18f, dy1 = 0.0f, dx2 = -3.33f, dy2 = 1.15f, dx3 = -3.33f, dy3 = 3.33f)
                verticalLineToRelative(dy = 1.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.18f, dx2 = 1.15f, dy2 = 3.33f, dx3 = 3.33f, dy3 = 3.33f)
                horizontalLineToRelative(dx = 1.9f)
                curveToRelative(dx1 = 2.18f, dy1 = 0.0f, dx2 = 3.33f, dy2 = -1.15f, dx3 = 3.33f, dy3 = -3.33f)
                verticalLineToRelative(dy = -1.9f)
                curveTo(x1 = 22.0f, y1 = 3.15f, x2 = 20.85f, y2 = 2.0f, x3 = 18.67f, y3 = 2.0f)
                moveTo(x = 7.24f, y = 13.43f)
                horizontalLineToRelative(dx = -1.9f)
                curveTo(x1 = 3.15f, y1 = 13.43f, x2 = 2.0f, y2 = 14.58f, x3 = 2.0f, y3 = 16.76f)
                verticalLineToRelative(dy = 1.9f)
                curveTo(x1 = 2.0f, y1 = 20.85f, x2 = 3.15f, y2 = 22.0f, x3 = 5.33f, y3 = 22.0f)
                horizontalLineToRelative(dx = 1.9f)
                curveToRelative(dx1 = 2.18f, dy1 = 0.0f, dx2 = 3.33f, dy2 = -1.15f, dx3 = 3.33f, dy3 = -3.33f)
                verticalLineToRelative(dy = -1.9f)
                curveToRelative(dx1 = 0.01f, dy1 = -2.19f, dx2 = -1.14f, dy2 = -3.34f, dx3 = -3.32f, dy3 = -3.34f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 6.29f, y = 10.58f)
                arcToRelative(a = 4.29f, b = 4.29f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -8.58f)
                arcToRelative(a = 4.29f, b = 4.29f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 8.58f)
                moveTo(x = 17.71f, y = 22.0f)
                arcToRelative(a = 4.29f, b = 4.29f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -8.58f)
                arcToRelative(a = 4.29f, b = 4.29f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 8.58f)
            }
        }.build().also { _categoryTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _categoryTwo: ImageVector? = null
