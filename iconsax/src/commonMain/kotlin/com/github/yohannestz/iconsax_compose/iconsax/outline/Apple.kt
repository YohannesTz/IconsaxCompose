package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Apple: ImageVector
    get() {
        val current = _apple
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Apple",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 9.23f, y = 22.75f)
                horizontalLineTo(x = 9.19f)
                curveToRelative(dx1 = -1.68f, dy1 = 0.0f, dx2 = -2.88f, dy2 = -1.52f, dx3 = -3.73f, dy3 = -2.83f)
                curveToRelative(dx1 = -2.17f, dy1 = -3.33f, dx2 = -2.61f, dy2 = -7.52f, dx3 = -1.04f, dy3 = -9.95f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.43f, dy1 = -2.64f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.0f, y1 = 7.8f)
                curveToRelative(dx1 = 0.48f, dy1 = 0.17f, dx2 = 0.89f, dy2 = 0.32f, dx3 = 1.32f, dy3 = 0.32f)
                curveToRelative(dx1 = 0.38f, dy1 = 0.0f, dx2 = 0.71f, dy2 = -0.13f, dx3 = 1.13f, dy3 = -0.29f)
                curveToRelative(dx1 = 0.58f, dy1 = -0.22f, dx2 = 1.29f, dy2 = -0.49f, dx3 = 2.32f, dy3 = -0.49f)
                curveToRelative(dx1 = 1.48f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 0.8f, dx3 = 4.06f, dy3 = 2.13f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.22f, dy1 = 1.12f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.66f, dy1 = 3.03f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.09f, dy1 = 2.85f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.43f, dy1 = 0.41f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.01f, dy1 = 0.6f)
                arcToRelative(a = 14.0f, b = 14.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.23f, dy1 = 2.3f)
                curveToRelative(dx1 = -0.95f, dy1 = 1.46f, dx2 = -2.15f, dy2 = 2.96f, dx3 = -3.79f, dy3 = 2.98f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.61f, dy1 = -0.4f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.48f, dy1 = -0.37f)
                curveToRelative(dx1 = -0.7f, dy1 = 0.0f, dx2 = -1.07f, dy2 = 0.17f, dx3 = -1.5f, dy3 = 0.36f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.62f, dy1 = 0.41f)
                moveTo(x = 8.85f, y = 8.83f)
                curveToRelative(dx1 = -1.18f, dy1 = 0.0f, dx2 = -2.39f, dy2 = 0.75f, dx3 = -3.17f, dy3 = 1.95f)
                curveToRelative(dx1 = -1.06f, dy1 = 1.64f, dx2 = -1.05f, dy2 = 5.11f, dx3 = 1.04f, dy3 = 8.32f)
                curveToRelative(dx1 = 0.65f, dy1 = 1.0f, dx2 = 1.52f, dy2 = 2.14f, dx3 = 2.49f, dy3 = 2.15f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -0.27f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.23f, dy1 = 0.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.97f, dy1 = 0.27f)
                curveToRelative(dx1 = 0.94f, dy1 = 0.0f, dx2 = 1.85f, dy2 = -1.23f, dx3 = 2.55f, dy3 = -2.29f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.81f, dy1 = -1.44f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.33f, dy1 = -3.8f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.65f, dy1 = -3.9f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.33f, dy1 = -0.98f)
                curveToRelative(dx1 = -0.75f, dy1 = 0.0f, dx2 = -1.25f, dy2 = 0.2f, dx3 = -1.78f, dy3 = 0.4f)
                curveToRelative(dx1 = -0.5f, dy1 = 0.18f, dx2 = -1.02f, dy2 = 0.38f, dx3 = -1.67f, dy3 = 0.38f)
                curveToRelative(dx1 = -0.69f, dy1 = 0.0f, dx2 = -1.26f, dy2 = -0.2f, dx3 = -1.82f, dy3 = -0.4f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.64f, dy1 = -0.39f)
                moveToRelative(dx = 2.97f, dy = -1.7f)
                horizontalLineToRelative(dx = -0.1f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = -0.62f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = -3.49f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.29f, dy1 = -1.77f)
                arcToRelative(a = 0.73f, b = 0.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.79f, dy1 = 0.64f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.03f, dy1 = 3.52f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.3f, dy1 = 1.72f)
                moveToRelative(dx = 2.83f, dy = -4.18f)
                arcToRelative(a = 3.46f, b = 3.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.16f, dy1 = 2.56f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.45f, dy1 = -1.02f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.71f, dy1 = -1.54f)
            }
        }.build().also { _apple = it }
    }

@Suppress("ObjectPropertyName")
private var _apple: ImageVector? = null
