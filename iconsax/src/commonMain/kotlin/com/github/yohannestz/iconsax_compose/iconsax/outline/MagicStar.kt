package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MagicStar: ImageVector
    get() {
        val current = _magicStar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MagicStar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.01f, y = 22.5f)
                curveToRelative(dx1 = -0.6f, dy1 = 0.0f, dx2 = -1.53f, dy2 = -0.3f, dx3 = -2.42f, dy3 = -1.75f)
                lineTo(x = 8.83f, y = 17.9f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.01f, dy1 = -0.53f)
                lineToRelative(dx = -3.34f, dy = 0.17f)
                curveToRelative(dx1 = -2.0f, dy1 = 0.1f, dx2 = -2.7f, dy2 = -0.73f, dx3 = -2.95f, dy3 = -1.23f)
                reflectiveCurveToRelative(dx1 = -0.47f, dy1 = -1.57f, dx2 = 0.83f, dy2 = -3.1f)
                lineToRelative(dx = 1.98f, dy = -2.3f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.22f, dy1 = -1.05f)
                lineTo(x = 3.55f, y = 6.63f)
                curveTo(x1 = 3.04f, y1 = 5.0f, x2 = 3.61f, y2 = 4.13f, x3 = 3.99f, y3 = 3.76f)
                reflectiveCurveToRelative(dx1 = 1.26f, dy1 = -0.93f, dx2 = 2.88f, dy2 = -0.4f)
                lineToRelative(dx = 2.95f, dy = 0.98f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -0.15f)
                lineToRelative(dx = 3.08f, dy = -2.22f)
                curveToRelative(dx1 = 1.41f, dy1 = -1.02f, dx2 = 2.43f, dy2 = -0.75f, dx3 = 2.9f, dy3 = -0.5f)
                reflectiveCurveToRelative(dx1 = 1.27f, dy1 = 0.93f, dx2 = 1.24f, dy2 = 2.67f)
                lineToRelative(dx = -0.07f, dy = 3.79f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.44f, dy1 = 0.9f)
                lineToRelative(dx = 2.48f, dy = 1.89f)
                curveToRelative(dx1 = 1.35f, dy1 = 1.03f, dx2 = 1.4f, dy2 = 2.06f, dx3 = 1.31f, dy3 = 2.59f)
                reflectiveCurveToRelative(dx1 = -0.49f, dy1 = 1.49f, dx2 = -2.11f, dy2 = 1.99f)
                lineToRelative(dx = -3.23f, dy = 1.0f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 0.79f)
                lineToRelative(dx = -0.77f, dy = 2.94f)
                curveToRelative(dx1 = -0.51f, dy1 = 1.93f, dx2 = -1.51f, dy2 = 2.36f, dx3 = -2.07f, dy3 = 2.44f)
                close()
                moveToRelative(dx = -5.16f, dy = -6.63f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.25f, dy1 = 1.24f)
                lineToRelative(dx = 1.76f, dy = 2.85f)
                curveToRelative(dx1 = 0.5f, dy1 = 0.82f, dx2 = 0.95f, dy2 = 1.07f, dx3 = 1.19f, dy3 = 1.03f)
                curveToRelative(dx1 = 0.23f, dy1 = -0.03f, dx2 = 0.59f, dy2 = -0.41f, dx3 = 0.84f, dy3 = -1.33f)
                lineToRelative(dx = 0.77f, dy = -2.94f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.75f, dy1 = -1.83f)
                lineToRelative(dx = 3.23f, dy = -1.01f)
                curveToRelative(dx1 = 0.62f, dy1 = -0.2f, dx2 = 1.02f, dy2 = -0.5f, dx3 = 1.08f, dy3 = -0.82f)
                reflectiveCurveToRelative(dx1 = -0.22f, dy1 = -0.74f, dx2 = -0.74f, dy2 = -1.14f)
                lineToRelative(dx = -2.48f, dy = -1.88f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.04f, dy1 = -2.14f)
                lineToRelative(dx = 0.07f, dy = -3.8f)
                curveToRelative(dx1 = 0.01f, dy1 = -0.66f, dx2 = -0.15f, dy2 = -1.16f, dx3 = -0.44f, dy3 = -1.31f)
                reflectiveCurveToRelative(dx1 = -0.78f, dy1 = 0.0f, dx2 = -1.33f, dy2 = 0.39f)
                lineTo(x = 11.68f, y = 5.4f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.35f, dy1 = 0.36f)
                lineTo(x = 6.38f, y = 4.79f)
                curveToRelative(dx1 = -0.62f, dy1 = -0.2f, dx2 = -1.12f, dy2 = -0.2f, dx3 = -1.35f, dy3 = 0.04f)
                curveTo(x1 = 4.8f, y1 = 5.06f, x2 = 4.78f, y2 = 5.56f, x3 = 4.97f, y3 = 6.18f)
                lineTo(x = 5.98f, y = 9.4f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = 2.48f)
                lineToRelative(dx = -1.98f, dy = 2.3f)
                curveToRelative(dx1 = -0.63f, dy1 = 0.73f, dx2 = -0.73f, dy2 = 1.24f, dx3 = -0.62f, dy3 = 1.45f)
                reflectiveCurveToRelative(dx1 = 0.58f, dy1 = 0.44f, dx2 = 1.53f, dy2 = 0.39f)
                lineToRelative(dx = 3.34f, dy = -0.17f)
                close()
                moveToRelative(dx = 14.06f, dy = 6.88f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = -3.03f, dy = -3.03f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 3.03f, dy = 3.03f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
            }
        }.build().also { _magicStar = it }
    }

@Suppress("ObjectPropertyName")
private var _magicStar: ImageVector? = null
