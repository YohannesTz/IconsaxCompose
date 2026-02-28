package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GridOne: ImageVector
    get() {
        val current = _gridOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GridOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.75f, y = 2.0f)
                verticalLineToRelative(dy = 5.8f)
                horizontalLineTo(x = 2.0f)
                curveTo(x1 = 2.0f, y1 = 4.19f, x2 = 4.15f, y2 = 2.02f, x3 = 7.75f, y3 = 2.0f)
                moveTo(x = 22.0f, y = 7.8f)
                horizontalLineToRelative(dx = -5.75f)
                verticalLineTo(y = 2.0f)
                curveTo(x1 = 19.85f, y1 = 2.02f, x2 = 22.0f, y2 = 4.19f, x3 = 22.0f, y3 = 7.8f)
                moveToRelative(dx = 0.0f, dy = 8.5f)
                curveToRelative(dx1 = -0.04f, dy1 = 3.55f, dx2 = -2.18f, dy2 = 5.68f, dx3 = -5.75f, dy3 = 5.7f)
                verticalLineToRelative(dy = -5.7f)
                close()
                moveToRelative(dx = -14.25f, dy = 0.0f)
                verticalLineTo(y = 22.0f)
                curveTo(x1 = 4.18f, y1 = 21.98f, x2 = 2.04f, y2 = 19.85f, x3 = 2.0f, y3 = 16.3f)
                close()
                moveToRelative(dx = 0.0f, dy = -7.0f)
                horizontalLineTo(x = 2.0f)
                verticalLineToRelative(dy = 5.5f)
                horizontalLineToRelative(dx = 5.75f)
                close()
                moveTo(x = 22.0f, y = 9.3f)
                horizontalLineToRelative(dx = -5.75f)
                verticalLineToRelative(dy = 5.5f)
                horizontalLineTo(x = 22.0f)
                close()
                moveToRelative(dx = -7.25f, dy = 0.0f)
                horizontalLineToRelative(dx = -5.5f)
                verticalLineToRelative(dy = 5.5f)
                horizontalLineToRelative(dx = 5.5f)
                close()
                moveToRelative(dx = 0.0f, dy = -7.3f)
                horizontalLineToRelative(dx = -5.5f)
                verticalLineToRelative(dy = 5.8f)
                horizontalLineToRelative(dx = 5.5f)
                close()
                moveToRelative(dx = 0.0f, dy = 14.3f)
                horizontalLineToRelative(dx = -5.5f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = 5.5f)
                close()
            }
        }.build().also { _gridOne = it }
    }

@Suppress("ObjectPropertyName")
private var _gridOne: ImageVector? = null
