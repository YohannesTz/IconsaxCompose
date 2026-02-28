package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LampSlash: ImageVector
    get() {
        val current = _lampSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LampSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.26f, y = 22.0f)
                lineToRelative(dx = -0.19f, dy = -0.03f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.13f, dy1 = 0.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.86f, dy1 = -0.48f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.48f, dy1 = -0.86f)
                arcToRelative(a = 12.6f, b = 12.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.9f, dy1 = 0.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.48f, dy1 = 0.86f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = 0.5f)
                moveTo(x = 4.18f, y = 19.08f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineTo(x = 19.5f, y = 1.95f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineTo(x = 4.71f, y = 18.86f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.63f, y = 3.42f)
                lineTo(x = 5.49f, y = 14.56f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.52f, dy1 = -4.51f)
                arcToRelative(a = 8.03f, b = 8.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.86f, dy1 = -7.85f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.8f, dy1 = 1.22f)
                moveToRelative(dx = -0.46f, dy = 13.5f)
                verticalLineToRelative(dy = 0.7f)
                curveToRelative(dx1 = 0.01f, dy1 = 0.26f, dx2 = 0.03f, dy2 = 0.76f, dx3 = -0.36f, dy3 = 1.16f)
                quadToRelative(dx1 = -0.42f, dy1 = 0.43f, dx2 = -1.23f, dy2 = 0.43f)
                horizontalLineTo(x = 9.45f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.93f, dy2 = -0.05f, dx3 = -1.28f, dy3 = -0.4f)
                curveToRelative(dx1 = -0.33f, dy1 = -0.35f, dx2 = -0.32f, dy2 = -0.78f, dx3 = -0.31f, dy3 = -1.06f)
                verticalLineToRelative(dy = -0.83f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.25f, dy1 = -1.02f)
                lineTo(x = 17.95f, y = 4.56f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.26f, dy1 = 1.8f)
                curveToRelative(dx1 = 2.02f, dy1 = 4.06f, dx2 = 0.07f, dy2 = 8.47f, dx3 = -3.04f, dy3 = 10.56f)
            }
        }.build().also { _lampSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _lampSlash: ImageVector? = null
