package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Eos: ImageVector
    get() {
        val current = _eos
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Eos",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 9.28f, y = 20.31f)
                curveToRelative(dx1 = 0.17f, dy1 = 0.48f, dx2 = -0.35f, dy2 = 0.92f, dx3 = -0.79f, dy3 = 0.66f)
                lineToRelative(dx = -3.15f, dy = -1.79f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.8f, dy1 = -1.76f)
                lineToRelative(dx = 0.94f, dy = -4.67f)
                curveToRelative(dx1 = 0.11f, dy1 = -0.55f, dx2 = 0.87f, dy2 = -0.6f, dx3 = 1.06f, dy3 = -0.08f)
                close()
                moveToRelative(dx = 9.38f, dy = -1.13f)
                lineToRelative(dx = -3.16f, dy = 1.8f)
                arcToRelative(a = 0.55f, b = 0.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.79f, dy1 = -0.66f)
                lineToRelative(dx = 2.75f, dy = -7.71f)
                curveToRelative(dx1 = 0.19f, dy1 = -0.52f, dx2 = 0.95f, dy2 = -0.47f, dx3 = 1.06f, dy3 = 0.08f)
                lineToRelative(dx = 0.95f, dy = 4.73f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.81f, dy1 = 1.76f)
                moveTo(x = 17.08f, y = 7.32f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.18f, dy1 = 1.06f)
                lineToRelative(dx = -4.74f, dy = 13.25f)
                arcToRelative(a = 0.54f, b = 0.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.03f, dy1 = 0.0f)
                lineTo(x = 6.75f, y = 8.39f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.18f, dy1 = -1.06f)
                lineToRelative(dx = 3.82f, dy = -4.7f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.53f, dy1 = 0.0f)
                close()
            }
        }.build().also { _eos = it }
    }

@Suppress("ObjectPropertyName")
private var _eos: ImageVector? = null
