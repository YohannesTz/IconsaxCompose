package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HeartEdit: ImageVector
    get() {
        val current = _heartEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HeartEdit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.44f, y = 3.1f)
                arcTo(horizontalEllipseRadius = 5.6f, verticalEllipseRadius = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 5.33f)
                arcTo(horizontalEllipseRadius = 5.6f, verticalEllipseRadius = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.56f, y1 = 3.1f)
                arcTo(horizontalEllipseRadius = 5.57f, verticalEllipseRadius = 5.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 8.7f)
                quadToRelative(dx1 = 0.01f, dy1 = 1.77f, dx2 = 0.52f, dy2 = 3.3f)
                curveToRelative(dx1 = 1.58f, dy1 = 5.0f, dx2 = 6.45f, dy2 = 8.0f, dx3 = 8.86f, dy3 = 8.81f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.24f, dy1 = 0.0f)
                curveToRelative(dx1 = 2.41f, dy1 = -0.82f, dx2 = 7.28f, dy2 = -3.8f, dx3 = 8.86f, dy3 = -8.8f)
                arcTo(horizontalEllipseRadius = 11.0f, verticalEllipseRadius = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 8.68f)
                arcToRelative(a = 5.57f, b = 5.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.56f, dy1 = -5.59f)
                moveToRelative(dx = -1.6f, dy = 8.28f)
                lineToRelative(dx = -3.54f, dy = 3.54f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.59f, dy1 = 0.3f)
                lineTo(x = 9.36f, y = 15.4f)
                curveToRelative(dx1 = -0.49f, dy1 = 0.07f, dx2 = -0.83f, dy2 = -0.27f, dx3 = -0.76f, dy3 = -0.76f)
                lineToRelative(dx = 0.19f, dy = -1.35f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.3f, dy1 = -0.59f)
                lineToRelative(dx = 3.54f, dy = -3.54f)
                curveToRelative(dx1 = 0.61f, dy1 = -0.6f, dx2 = 1.32f, dy2 = -0.9f, dx3 = 2.22f, dy3 = 0.0f)
                curveToRelative(dx1 = 0.89f, dy1 = 0.9f, dx2 = 0.6f, dy2 = 1.61f, dx3 = -0.01f, dy3 = 2.22f)
            }
        }.build().also { _heartEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _heartEdit: ImageVector? = null
