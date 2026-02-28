package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 12.0f, y = 22.5f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.0f, dx2 = -0.8f, dy2 = -0.09f, dx3 = -1.12f, dy3 = -0.27f)
                lineToRelative(dx = -5.32f, dy = -3.04f)
                arcToRelative(a = 2.35f, b = 2.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.09f, dy1 = -2.4f)
                lineToRelative(dx = 1.71f, dy = -8.57f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.48f, dy1 = -1.0f)
                lineToRelative(dx = 3.6f, dy = -4.32f)
                arcToRelative(a = 2.27f, b = 2.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.46f, dy1 = 0.0f)
                lineToRelative(dx = 3.6f, dy = 4.32f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.48f, dy1 = 1.0f)
                lineToRelative(dx = 1.71f, dy = 8.57f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.09f, dy1 = 2.39f)
                lineToRelative(dx = -5.32f, dy = 3.04f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.5f)
                moveToRelative(dx = 0.0f, dy = -18.94f)
                quadToRelative(dx1 = -0.32f, dy1 = 0.0f, dx2 = -0.58f, dy2 = 0.3f)
                lineToRelative(dx = -3.6f, dy = 4.32f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.16f, dy1 = 0.33f)
                lineToRelative(dx = -1.71f, dy = 8.57f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.36f, dy1 = 0.8f)
                lineToRelative(dx = 5.32f, dy = 3.04f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.74f, dy1 = 0.0f)
                lineToRelative(dx = 5.32f, dy = -3.04f)
                curveToRelative(dx1 = 0.24f, dy1 = -0.14f, dx2 = 0.42f, dy2 = -0.53f, dx3 = 0.36f, dy3 = -0.8f)
                lineToRelative(dx = -1.71f, dy = -8.57f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.16f, dy1 = -0.33f)
                lineToRelative(dx = -3.6f, dy = -4.32f)
                quadToRelative(dx1 = -0.26f, dy1 = -0.3f, dx2 = -0.58f, dy2 = -0.3f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 21.76f)
                curveToRelative(dx1 = -0.54f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.33f, dx3 = -1.18f, dy3 = -0.83f)
                lineTo(x = 6.47f, y = 8.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.41f, dy1 = -0.51f)
                lineTo(x = 12.0f, y = 19.77f)
                lineToRelative(dx = 4.11f, dy = -11.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.41f, dy1 = 0.51f)
                lineToRelative(dx = -4.34f, dy = 12.16f)
                arcTo(horizontalEllipseRadius = 1.2f, verticalEllipseRadius = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 21.76f)
            }
        }.build().also { _eos = it }
    }

@Suppress("ObjectPropertyName")
private var _eos: ImageVector? = null
