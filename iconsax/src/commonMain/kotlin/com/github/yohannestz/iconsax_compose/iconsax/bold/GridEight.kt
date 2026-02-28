package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GridEight: ImageVector
    get() {
        val current = _gridEight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GridEight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineToRelative(dy = 3.44f)
                horizontalLineToRelative(dx = -5.25f)
                verticalLineTo(y = 2.03f)
                curveTo(x1 = 20.05f, y1 = 2.23f, x2 = 22.0f, y2 = 4.36f, x3 = 22.0f, y3 = 7.81f)
                moveToRelative(dx = 0.0f, dy = 4.94f)
                verticalLineToRelative(dy = 3.44f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.45f, dx2 = -1.95f, dy2 = 5.58f, dx3 = -5.25f, dy3 = 5.78f)
                verticalLineToRelative(dy = -9.22f)
                close()
                moveToRelative(dx = -14.75f, dy = 0.0f)
                verticalLineToRelative(dy = 9.22f)
                curveTo(x1 = 3.95f, y1 = 21.77f, x2 = 2.0f, y2 = 19.64f, x3 = 2.0f, y3 = 16.19f)
                verticalLineToRelative(dy = -3.44f)
                close()
                moveToRelative(dx = 0.0f, dy = -10.72f)
                verticalLineToRelative(dy = 9.22f)
                horizontalLineTo(x = 2.0f)
                verticalLineTo(y = 7.81f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.45f, dx2 = 1.95f, dy2 = -5.58f, dx3 = 5.25f, dy3 = -5.78f)
                moveToRelative(dx = 8.0f, dy = -0.03f)
                horizontalLineToRelative(dx = -6.5f)
                verticalLineToRelative(dy = 9.25f)
                horizontalLineToRelative(dx = 6.5f)
                close()
                moveToRelative(dx = 0.0f, dy = 10.75f)
                horizontalLineToRelative(dx = -6.5f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = 6.5f)
                close()
            }
        }.build().also { _gridEight = it }
    }

@Suppress("ObjectPropertyName")
private var _gridEight: ImageVector? = null
