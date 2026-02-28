package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
                fill = SolidColor(Color(0xFF292D32)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 19.1f, y = 19.16f)
                arcToRelative(a = 14.0f, b = 14.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.26f, dy1 = -2.37f)
                curveToRelative(dx1 = -3.32f, dy1 = -1.26f, dx2 = -3.85f, dy2 = -5.99f, dx3 = -0.57f, dy3 = -7.8f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.05f, y1 = 7.0f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.21f, dy1 = 0.48f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.51f, dy1 = 0.36f)
                curveToRelative(dx1 = -0.6f, dy1 = 0.0f, dx2 = -1.13f, dy2 = -0.19f, dx3 = -1.69f, dy3 = -0.39f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.6f, y1 = 7.0f)
                arcToRelative(a = 5.1f, b = 5.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.09f, dy1 = 2.47f)
                curveToRelative(dx1 = -1.42f, dy1 = 2.2f, dx2 = -1.17f, dy2 = 6.32f, dx3 = 1.12f, dy3 = 9.84f)
                curveToRelative(dx1 = 0.82f, dy1 = 1.26f, dx2 = 1.92f, dy2 = 2.67f, dx3 = 3.35f, dy3 = 2.69f)
                curveToRelative(dx1 = 0.6f, dy1 = 0.01f, dx2 = 0.99f, dy2 = -0.17f, dx3 = 1.42f, dy3 = -0.36f)
                curveToRelative(dx1 = 0.49f, dy1 = -0.22f, dx2 = 1.02f, dy2 = -0.46f, dx3 = 1.95f, dy3 = -0.46f)
                curveToRelative(dx1 = 0.93f, dy1 = -0.01f, dx2 = 1.45f, dy2 = 0.24f, dx3 = 1.94f, dy3 = 0.46f)
                curveToRelative(dx1 = 0.42f, dy1 = 0.19f, dx2 = 0.8f, dy2 = 0.37f, dx3 = 1.39f, dy3 = 0.36f)
                curveToRelative(dx1 = 1.44f, dy1 = -0.02f, dx2 = 2.6f, dy2 = -1.58f, dx3 = 3.42f, dy3 = -2.84f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                pathFillType = PathFillType.EvenOdd,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 15.84f, y = 2.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.88f, dy1 = 2.95f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.79f, dy1 = 1.42f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.9f, dy1 = -2.88f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.84f, y1 = 2.0f)
            }
        }.build().also { _apple = it }
    }

@Suppress("ObjectPropertyName")
private var _apple: ImageVector? = null
