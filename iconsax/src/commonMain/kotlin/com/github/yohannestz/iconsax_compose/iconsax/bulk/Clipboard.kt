package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Clipboard: ImageVector
    get() {
        val current = _clipboard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Clipboard",
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
                moveTo(x = 13.89f, y = 2.88f)
                lineTo(x = 9.2f, y = 2.14f)
                curveToRelative(dx1 = -3.91f, dy1 = -0.61f, dx2 = -5.72f, dy2 = 0.7f, dx3 = -6.34f, dy3 = 4.62f)
                lineToRelative(dx = -0.74f, dy = 4.69f)
                curveToRelative(dx1 = -0.4f, dy1 = 2.56f, dx2 = 0.02f, dy2 = 4.22f, dx3 = 1.47f, dy3 = 5.23f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.15f, dy1 = 1.1f)
                lineToRelative(dx = 4.69f, dy = 0.75f)
                curveToRelative(dx1 = 3.91f, dy1 = 0.6f, dx2 = 5.72f, dy2 = -0.71f, dx3 = 6.34f, dy3 = -4.62f)
                lineToRelative(dx = 0.73f, dy = -4.7f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.13f, dy1 = -2.06f)
                curveToRelative(dx1 = -0.13f, dy1 = -2.5f, dx2 = -1.6f, dy2 = -3.78f, dx3 = -4.74f, dy3 = -4.27f)
                moveTo(x = 8.24f, y = 9.35f)
                arcToRelative(a = 2.12f, b = 2.12f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.23f)
                arcToRelative(a = 2.12f, b = 2.12f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.23f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.5f, y = 13.47f)
                lineToRelative(dx = -1.5f, dy = 4.5f)
                curveToRelative(dx1 = -1.25f, dy1 = 3.77f, dx2 = -3.25f, dy2 = 4.77f, dx3 = -7.01f, dy3 = 3.52f)
                lineToRelative(dx = -4.51f, dy = -1.5f)
                curveToRelative(dx1 = -2.27f, dy1 = -0.75f, dx2 = -3.53f, dy2 = -1.8f, dx3 = -3.89f, dy3 = -3.31f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.15f, dy1 = 1.1f)
                lineToRelative(dx = 4.69f, dy = 0.75f)
                curveToRelative(dx1 = 3.91f, dy1 = 0.6f, dx2 = 5.72f, dy2 = -0.71f, dx3 = 6.34f, dy3 = -4.62f)
                lineToRelative(dx = 0.73f, dy = -4.7f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.13f, dy1 = -2.06f)
                curveToRelative(dx1 = 2.39f, dy1 = 1.27f, dx2 = 2.91f, dy2 = 3.19f, dx3 = 1.87f, dy3 = 6.32f)
                moveTo(x = 10.35f, y = 7.24f)
                arcToRelative(a = 2.12f, b = 2.12f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -4.23f, dy1 = -0.01f)
                arcToRelative(a = 2.12f, b = 2.12f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.23f, dy1 = 0.01f)
            }
        }.build().also { _clipboard = it }
    }

@Suppress("ObjectPropertyName")
private var _clipboard: ImageVector? = null
