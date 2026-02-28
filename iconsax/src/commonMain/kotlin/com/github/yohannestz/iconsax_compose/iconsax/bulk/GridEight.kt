package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 7.81f)
                verticalLineTo(y = 12.0f)
                horizontalLineToRelative(dx = -6.25f)
                verticalLineTo(y = 2.0f)
                horizontalLineToRelative(dx = 0.44f)
                curveTo(x1 = 19.83f, y1 = 2.0f, x2 = 22.0f, y2 = 4.17f, x3 = 22.0f, y3 = 7.81f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 12.0f)
                verticalLineToRelative(dy = 4.19f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = -2.17f, dy2 = 5.81f, dx3 = -5.81f, dy3 = 5.81f)
                horizontalLineToRelative(dx = -0.44f)
                verticalLineTo(y = 12.0f)
                close()
                moveTo(x = 8.25f, y = 12.0f)
                verticalLineToRelative(dy = 10.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 22.0f, x2 = 2.0f, y2 = 19.83f, x3 = 2.0f, y3 = 16.19f)
                verticalLineTo(y = 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 7.81f, y = 2.0f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineTo(y = 12.0f)
                horizontalLineToRelative(dx = 6.25f)
                verticalLineTo(y = 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.75f, y = 2.0f)
                horizontalLineToRelative(dx = -7.5f)
                verticalLineToRelative(dy = 10.0f)
                horizontalLineToRelative(dx = 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 15.75f, y = 12.0f)
                horizontalLineToRelative(dx = -7.5f)
                verticalLineToRelative(dy = 10.0f)
                horizontalLineToRelative(dx = 7.5f)
                close()
            }
        }.build().also { _gridEight = it }
    }

@Suppress("ObjectPropertyName")
private var _gridEight: ImageVector? = null
