package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Category: ImageVector
    get() {
        val current = _category
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Category",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.24f, y = 2.0f)
                horizontalLineToRelative(dx = -1.9f)
                curveTo(x1 = 3.15f, y1 = 2.0f, x2 = 2.0f, y2 = 3.15f, x3 = 2.0f, y3 = 5.33f)
                verticalLineToRelative(dy = 1.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.18f, dx2 = 1.15f, dy2 = 3.33f, dx3 = 3.33f, dy3 = 3.33f)
                horizontalLineToRelative(dx = 1.9f)
                curveToRelative(dx1 = 2.18f, dy1 = 0.0f, dx2 = 3.33f, dy2 = -1.15f, dx3 = 3.33f, dy3 = -3.33f)
                verticalLineToRelative(dy = -1.9f)
                curveTo(x1 = 10.57f, y1 = 3.15f, x2 = 9.42f, y2 = 2.0f, x3 = 7.24f, y3 = 2.0f)
                moveToRelative(dx = 11.43f, dy = 0.0f)
                horizontalLineToRelative(dx = -1.9f)
                curveToRelative(dx1 = -2.18f, dy1 = 0.0f, dx2 = -3.33f, dy2 = 1.15f, dx3 = -3.33f, dy3 = 3.33f)
                verticalLineToRelative(dy = 1.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.18f, dx2 = 1.15f, dy2 = 3.33f, dx3 = 3.33f, dy3 = 3.33f)
                horizontalLineToRelative(dx = 1.9f)
                curveToRelative(dx1 = 2.18f, dy1 = 0.0f, dx2 = 3.33f, dy2 = -1.15f, dx3 = 3.33f, dy3 = -3.33f)
                verticalLineToRelative(dy = -1.9f)
                curveTo(x1 = 22.0f, y1 = 3.15f, x2 = 20.85f, y2 = 2.0f, x3 = 18.67f, y3 = 2.0f)
                moveToRelative(dx = 0.0f, dy = 11.43f)
                horizontalLineToRelative(dx = -1.9f)
                curveToRelative(dx1 = -2.18f, dy1 = 0.0f, dx2 = -3.33f, dy2 = 1.15f, dx3 = -3.33f, dy3 = 3.33f)
                verticalLineToRelative(dy = 1.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.18f, dx2 = 1.15f, dy2 = 3.33f, dx3 = 3.33f, dy3 = 3.33f)
                horizontalLineToRelative(dx = 1.9f)
                curveToRelative(dx1 = 2.18f, dy1 = 0.0f, dx2 = 3.33f, dy2 = -1.15f, dx3 = 3.33f, dy3 = -3.33f)
                verticalLineToRelative(dy = -1.9f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.18f, dx2 = -1.15f, dy2 = -3.33f, dx3 = -3.33f, dy3 = -3.33f)
                moveToRelative(dx = -11.43f, dy = 0.0f)
                horizontalLineToRelative(dx = -1.9f)
                curveTo(x1 = 3.15f, y1 = 13.43f, x2 = 2.0f, y2 = 14.58f, x3 = 2.0f, y3 = 16.76f)
                verticalLineToRelative(dy = 1.9f)
                curveTo(x1 = 2.0f, y1 = 20.85f, x2 = 3.15f, y2 = 22.0f, x3 = 5.33f, y3 = 22.0f)
                horizontalLineToRelative(dx = 1.9f)
                curveToRelative(dx1 = 2.18f, dy1 = 0.0f, dx2 = 3.33f, dy2 = -1.15f, dx3 = 3.33f, dy3 = -3.33f)
                verticalLineToRelative(dy = -1.9f)
                curveToRelative(dx1 = 0.01f, dy1 = -2.19f, dx2 = -1.14f, dy2 = -3.34f, dx3 = -3.32f, dy3 = -3.34f)
            }
        }.build().also { _category = it }
    }

@Suppress("ObjectPropertyName")
private var _category: ImageVector? = null
