package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Trontron: ImageVector
    get() {
        val current = _trontron
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Trontron",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.66f, y = 8.04f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.21f, dy1 = 0.66f)
                lineToRelative(dx = -9.38f, dy = 11.94f)
                curveToRelative(dx1 = -0.34f, dy1 = 0.43f, dx2 = -0.74f, dy2 = 0.58f, dx3 = -1.08f, dy3 = 0.46f)
                lineTo(x = 10.0f, y = 21.0f)
                lineToRelative(dx = 1.0f, dy = -11.0f)
                lineToRelative(dx = 9.04f, dy = -1.81f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.66f, y = 8.04f)
                lineToRelative(dx = -0.62f, dy = 0.15f)
                lineTo(x = 11.0f, y = 10.0f)
                lineToRelative(dx = 5.95f, dy = -5.95f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = 0.19f)
                lineToRelative(dx = 3.13f, dy = 3.13f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = 0.67f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.95f, y = 4.05f)
                lineTo(x = 11.0f, y = 10.0f)
                lineTo(x = 3.01f, y = 2.9f)
                lineTo(x = 2.66f, y = 2.56f)
                verticalLineTo(y = 2.55f)
                quadToRelative(dx1 = 0.31f, dy1 = -0.4f, dx2 = 1.04f, dy2 = -0.32f)
                lineToRelative(dx = 12.96f, dy = 1.73f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = 0.09f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 11.0f, y = 10.0f)
                lineToRelative(dx = -1.0f, dy = 11.0f)
                lineToRelative(dx = -0.01f, dy = 0.1f)
                quadToRelative(dx1 = -0.39f, dy1 = -0.14f, dx2 = -0.63f, dy2 = -0.71f)
                lineTo(x = 2.64f, y = 3.59f)
                quadTo(x1 = 2.39f, y1 = 2.95f, x2 = 2.66f, y2 = 2.56f)
                lineTo(x = 3.01f, y = 2.9f)
                close()
            }
        }.build().also { _trontron = it }
    }

@Suppress("ObjectPropertyName")
private var _trontron: ImageVector? = null
