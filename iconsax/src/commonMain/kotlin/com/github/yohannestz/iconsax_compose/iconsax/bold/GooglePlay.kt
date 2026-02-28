package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GooglePlay: ImageVector
    get() {
        val current = _googlePlay
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GooglePlay",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 21.4f, y = 12.95f)
                lineToRelative(dx = -2.78f, dy = 1.39f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = -0.09f)
                lineToRelative(dx = -1.87f, dy = -1.87f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -0.71f)
                lineToRelative(dx = 1.9f, dy = -1.9f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.58f, dy1 = -0.09f)
                lineToRelative(dx = 2.75f, dy = 1.38f)
                arcToRelative(a = 1.05f, b = 1.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.89f)
                moveToRelative(dx = -5.1f, dy = -4.46f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.13f, dy1 = 0.8f)
                lineToRelative(dx = -1.67f, dy = 1.67f)
                lineToRelative(dx = -0.71f, dy = 0.71f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = 0.0f)
                lineTo(x = 6.2f, y = 4.53f)
                curveToRelative(dx1 = -0.4f, dy1 = -0.4f, dx2 = 0.07f, dy2 = -1.05f, dx3 = 0.58f, dy3 = -0.8f)
                close()
                moveTo(x = 2.0f, y = 20.15f)
                verticalLineTo(y = 3.48f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.85f, dy1 = -0.36f)
                lineToRelative(dx = 8.77f, dy = 8.51f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.01f, dy1 = 0.73f)
                lineToRelative(dx = -8.77f, dy = 8.16f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 20.15f)
                moveToRelative(dx = 14.27f, dy = -4.63f)
                lineToRelative(dx = -9.39f, dy = 4.7f)
                curveToRelative(dx1 = -0.51f, dy1 = 0.25f, dx2 = -0.98f, dy2 = -0.4f, dx3 = -0.58f, dy3 = -0.8f)
                lineToRelative(dx = 7.05f, dy = -7.05f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.71f, dy1 = 0.0f)
                lineToRelative(dx = 2.35f, dy = 2.35f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.14f, dy1 = 0.8f)
            }
        }.build().also { _googlePlay = it }
    }

@Suppress("ObjectPropertyName")
private var _googlePlay: ImageVector? = null
